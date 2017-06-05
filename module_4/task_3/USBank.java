package module_4.task_3;


/**
 * Created by dimas on 05.06.17.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.EUR){
            return 1200;
        }else if(getCurrency() == Currency.USD){
            return 1000;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {

        if(getCurrency() == Currency.EUR){
            return 10000;
        }else if(getCurrency() == Currency.USD){
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {

        if(getCurrency() == Currency.EUR){
            return 2;
        }else if(getCurrency() == Currency.USD){
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {

        if(getCurrency() == Currency.EUR){
            if(summ < 1000){
                return 6;
            }else if(summ >= 1000){
                return 8;
            }
        }else if(getCurrency() == Currency.USD){
            if(summ < 1000){
                return 5;
            }else if(summ >= 1000){
                return 7;
            }
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
