package module_4.task_5;

/**
 * Created by dimas on 05.06.17.
 */
public class Main {



    public static void main(String[] args) {
        Bank chinaBank = new ChinaBank(1, "China", Currency.USD, 15, 600, 8, 2000000);
        Bank franceBank = new EUBank(2, "France", Currency.EUR, 25, 1000, 9, 4000000);
        Bank washingtonBank = new USBank(3, "Canada", Currency.USD, 17, 800, 10, 3000000);

        User user1 = new User(1,"Semen",12000, 35, "Yahoo", 1300, washingtonBank);
        User user2 = new User(2,"Peter",22000, 65, "Yahoo", 2300, washingtonBank);
        User user3 = new User(3,"Sonya",8000, 15, "Yahoo", 900, franceBank);
        User user4 = new User(4,"Ivan",11000, 30, "Yahoo", 1400, franceBank);
        User user5 = new User(5,"Pavel",15000, 39, "Yahoo", 1300, chinaBank);
        User user6 = new User(6,"Eugen",11000, 25, "Yahoo", 1000, chinaBank);


        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(user5, 50);
        bankSystem.transferMoney(user6, user5, 80);
        System.out.println(user5);
        System.out.println(user6);
    }
}
