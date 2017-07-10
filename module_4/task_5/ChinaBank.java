package module_4.task_5;


/**
 * Created by dimas on 05.06.17.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return currency == Currency.EUR ? 150 : currency == Currency.USD ? 100 : 0;
    }

    @Override
    int getLimitOfFunding() {
        return currency == Currency.EUR ? 5000 : currency == Currency.USD ? 10000 : 0;
    }

    @Override
    int getMonthlyRate() {

        return currency == Currency.USD ? 1 : 0;
    }

    @Override
    int getCommission(int summ) {

        if(currency == Currency.USD){
            return (int) (summ < 1000 ? summ * .03 : summ * .05);
        }else if(currency == Currency.EUR){
            return (int) (summ < 1000 ? summ * .1 : summ * .11);
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee;
    }
}
