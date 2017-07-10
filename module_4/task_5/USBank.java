package module_4.task_5;


/**
 * Created by dimas on 05.06.17.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return currency == Currency.EUR ? 1200 : currency == Currency.USD ? 1000 : 0;
    }

    @Override
    int getLimitOfFunding() {
        return currency == Currency.EUR ? 10000 : currency == Currency.USD ? Integer.MAX_VALUE : 0;
    }

    @Override
    int getMonthlyRate() {

        return currency == Currency.USD ? 1 : currency == Currency.EUR ? 2 : 0;
    }

    @Override
    int getCommission(int summ) {

        if(currency == Currency.USD){
            return (int) (summ < 1000 ? summ * .05 : summ * .07);
        }else if(currency == Currency.EUR){
            return (int) (summ < 1000 ? summ * .06 : summ * .08);
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee;
    }
}
