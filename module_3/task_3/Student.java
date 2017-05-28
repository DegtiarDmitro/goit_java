package module_3.task_3;


/*
Класс Student с полями:
 String firstName,
 String lastName,
 int group,
 Course[] coursesTaken,
 int age.
С 2 конструкторами с аргументами
 firstName, lastName, group;
 lastName, coursesTaken.
* */


import java.util.Arrays;

/**
 * Created by dimas on 28.05.17.
 */
public class Student {

    private String firstName = null;
    private String lastName = null;
    private int group = 0;
    private Course[] coursesTaken = null;
    private int age = 0;

    public Student(String firstName, String lastName, int group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken){
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", coursesTaken=" + Arrays.toString(coursesTaken) +
                ", age=" + age +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public int getAge() {
        return age;
    }
}
