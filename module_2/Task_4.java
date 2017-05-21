package module_2;

/**
 * Created by dimas on 21.05.17.
 */
public class Task_4 {


    /*
        Input



        String ownerName = Oww
        double withdrawal = 100;

        Output
        Oww 600
     */


    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


        Task_4 bank = new Task_4();
        bank.fundBalance(balances, ownerNames, "Jack", 400);
        System.out.println(balances[2]);

    }

    public void fundBalance(int[] balances, String[] ownerNames, String ownerName, double withdrawal) {


        for (int i = 0; i < ownerNames.length; ++i) {
            if (ownerNames[i].equals(ownerName)) {
                balances[i] += withdrawal;
                System.out.println(ownerName + " " + balances[i]);
                break;
            }
        }
    }



}
