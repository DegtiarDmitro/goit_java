package module_3.task_3;

import java.util.Date;

/**
 * Created by dimas on 28.05.17.
 */
public class Solution {
    public static void main(String[] args) {


        Course course1 = new Course(new Date(), "Mathematics");
        Course course2 = new Course(25, "Algorithms", "Petronko");
        Course course3 = new Course(new Date(), "History");
        Course course4 = new Course(40, "Philosophy", "Sidorov");
        Course course5 = new Course(new Date(), "Mechanics");

        Student student1 = new Student("Ivan", "Petrov", 1);
        Student student2 = new Student("Sergey", "Petrov", 1);

        CollegeStudent student3 = new CollegeStudent("Petr", "Smirnov", 2);
        Course [] coursesSet1 = {course1, course2};
        CollegeStudent student4 = new CollegeStudent("Ivanov", coursesSet1);
        CollegeStudent student5 = new CollegeStudent("Vitaliy", "Koval", 3, "Politex", 5, 4);

        SpecialStudent student6 = new SpecialStudent("Igor", "Pavlov", 5);
        Course [] coursesSet2 = {course3, course4, course5};
        SpecialStudent student7 = new SpecialStudent("Semenov", coursesSet1);
        SpecialStudent student8 = new SpecialStudent("Valeriy", "Karpenko", 5, 99L);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);
        System.out.println(course5);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);


    }
}
