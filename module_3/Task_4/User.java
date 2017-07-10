package module_3.Task_4;

/*
Создайте класс UserDao со следующими полями:
 String name,
 int balance,
 int monthsOfEmployment,
 String companyName,
 int salary,
 String currency.
Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
Напишите методы:
 void paySalary() - добавляет заработную плату к балансу пользователя
 withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 companyNameLenght - вычисляет длину имя компании
 monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
* */

/**
 * Created by dimas on 28.05.17.
 */
public class User {

    private String name = null;
    private int balance = 0;
    private int monthsOfEmployment = 0;
    private String companyName = null;
    private int salary = 0;
    private String currency = null;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency){
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public void paySalary(){
        balance += salary;
    }

    public boolean withdraw(int summ){
        if(balance >= summ){
            balance -= summ;
            return true;
        }
        return false;
    }

    public int companyNameLenght(){
        return companyName.length();
    }


    public void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", currency='" + currency + '\'' +
                '}';
    }

    public static void main(String[] args) {

        User user1 = new User("Vasiliy", 200, 5, "LukOil", 250, "uds");
        System.out.println(user1);

    }

}
