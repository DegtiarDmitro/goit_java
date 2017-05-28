package module_2;

/**
 * Created by dimas on 21.05.17.
 */
public class Task_3 {


    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        Task_3 bank = new Task_3();
        bank.withdrawMoney(balances, ownerNames, "Jack", 400);
    }


    public void withdrawMoney(int[] balances, String[] ownerNames, String ownerName, double withdrawal){


        for(int i = 0; i < ownerNames.length; ++i){
            if(ownerNames[i].equals(ownerName)){

                int balance = balances[i];
                double commision = withdrawal * .05;

                if(balance > commision + withdrawal){
                    System.out.println(ownerName + " " + withdrawal + " " + Math.round(balance - withdrawal - commision));
                }else {
                    System.out.println("Oww NO");
                }
                break;
            }
        }


    }




}
