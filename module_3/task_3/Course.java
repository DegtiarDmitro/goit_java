package module_3.task_3;

import java.util.Date;




/**
 * Created by dimas on 28.05.17.
 */
public class Course {

    private Date startDate = null;
    private String name = null;
    private int hoursDuration = 0;
    private String teacherName = null;

    public Course(Date startDate, String name){
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String name, String teacherName){
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "startDate=" + startDate +
                ", name='" + name + '\'' +
                ", hoursDuration=" + hoursDuration +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
