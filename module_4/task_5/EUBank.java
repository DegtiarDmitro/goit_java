package module_4.task_5;


/**
 * Created by dimas on 05.06.17.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return currency == Currency.EUR ? 2200 : currency == Currency.USD ? 2000 : 0;
    }

    @Override
    int getLimitOfFunding() {
        return currency == Currency.EUR ? 20000 : currency == Currency.USD ? 10000 : 0;
    }

    @Override
    int getMonthlyRate() {

        return currency == Currency.EUR ? 1 : 0;
    }

    @Override
    int getCommission(int summ) {

        if(currency == Currency.USD){
            return (int) (summ < 1000 ? summ * .05 : summ * .07);
        }else if(currency == Currency.EUR){
            return (int) (summ < 1000 ? summ * .02 : summ * .04);
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee;
    }
}
