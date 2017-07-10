package module_4.task_5;

/**
 * Created by dimas on 05.06.17.
 */
public class BankSystemImpl implements BankSystem {
    /**
     * снятие денег
     * @param user
     * @param amount
     */
    @Override
    public void withdrawOfUser(User user, int amount) {
        double curUserBalance = user.getBalance();
        Bank userBank =  user.getBank();
        int bankCommission = userBank.getCommission(amount);
        if(curUserBalance >= (amount + bankCommission)){
            int withdrawalLim = userBank.getLimitOfWithdrawal();
            if(amount <= withdrawalLim){
                amount = amount <= withdrawalLim ? amount : withdrawalLim;
                int curBankCommission = userBank.getCommission(amount);
                user.setBalance(curUserBalance - amount - curBankCommission);
                userBank.setTotalCapital(userBank.getTotalCapital() + curBankCommission);
            }else {
                System.out.println("Exceeded the withdrawal limit");
            }
        }else {
            System.out.println("Not enough money on the account");
        }
    }

    /**
     * пополнение счета
     * @param user
     * @param amount
     */
    @Override
    public void fundUser(User user, int amount) {

        Bank userBank = user.getBank();
        int fundingLim = userBank.getLimitOfFunding();
        if(amount <= fundingLim){
            int curBankCommission = userBank.getCommission(amount);
            user.setBalance(user.getBalance() + amount - curBankCommission);
            userBank.setTotalCapital(userBank.getTotalCapital() + curBankCommission);
        }else {
            System.out.println("Exceeded the limit for funding of the account");
        }
    }

    /**
     * перевод денег
     * @param fromUser
     * @param toUser
     * @param amount
     */
    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }


    /**
     * выплата з-п
     * @param user
     */
    @Override
    public void paySalary(User user) {
        int salary = user.getSalary();
        fundUser(user, salary);
    }
}
