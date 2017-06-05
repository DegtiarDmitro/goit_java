package module_4.task_3;


/**
 * Created by dimas on 05.06.17.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.EUR){
            return 100;
        }else if(getCurrency() == Currency.USD){
            return 150;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {

        if(getCurrency() == Currency.EUR){
            return 5000;
        }else if(getCurrency() == Currency.USD){
            return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {

        if(getCurrency() == Currency.EUR){
            return 0;
        }else if(getCurrency() == Currency.USD){
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {

        if(getCurrency() == Currency.USD){
            if(summ < 1000){
                return 3;
            }else if(summ >= 1000){
                return 5;
            }
        }else if(getCurrency() == Currency.EUR){
            if(summ < 1000){
                return 10;
            }else if(summ >= 1000){
                return 11;
            }
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
