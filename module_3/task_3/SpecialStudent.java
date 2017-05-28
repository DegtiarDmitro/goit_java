package module_3.task_3;

/*
* Class SpecialStudent унаследован от CollegeStudent.
Дополнительные поля long secretKey, String email.
Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
*
* */


/**
 * Created by dimas on 28.05.17.
 */
public class SpecialStudent extends CollegeStudent{
    private long secretKey = 0;
    private String email = null;

    public SpecialStudent(String firstName, String lastName, int group){
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken){
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey){
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    @Override
    public String toString() {
        return "SpecialStudent{" +
                "secretKey=" + secretKey +
                ", email='" + email + '\'' +
                '}';
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }
}
