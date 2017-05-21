package module_2;

/**
 * Created by dimas on 21.05.17.
 */
public class Task_2 {

    public static void main(String[] args) {

        Task_2 bank = new Task_2();
        bank.moneyWithdraw(100, 99);
    }



    public void moneyWithdraw(float balance, float withdrawel){

        float commision = withdrawel * .05f;

        if(balance > (commision + withdrawel)){
            System.out.println("OK " + commision + " " + withdrawel);
        }else {
            System.out.println("NO");
        }


    }
}
