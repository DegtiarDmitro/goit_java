package module_4.task_3;


/**
 * Created by dimas on 05.06.17.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.EUR){
            return 2200;
        }else if(getCurrency() == Currency.USD){
            return 2000;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {

        if(getCurrency() == Currency.EUR){
            return 20000;
        }else if(getCurrency() == Currency.USD){
            return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {

        if(getCurrency() == Currency.EUR){
            return 1;
        }else if(getCurrency() == Currency.USD){
            return 0;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {

        if(getCurrency() == Currency.USD){
            if(summ < 1000){
                return 5;
            }else if(summ >= 1000){
                return 7;
            }
        }else if(getCurrency() == Currency.EUR){
            if(summ < 1000){
                return 2;
            }else if(summ >= 1000){
                return 4;
            }
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
