package module_3.task_3;
/*
* CollegeStudent унаследован от Student.
Дополнительные поля: String collegeName, int rating, long id.
Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
* */


/**
 * Created by dimas on 28.05.17.
 */
public class CollegeStudent extends Student {

    private String collegeName = null;
    private int rating = 0;
    private long id = 0;


    public CollegeStudent(String firstName, String lastName, int group){
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken){
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id){
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "collegeName='" + collegeName + '\'' +
                ", rating=" + rating +
                ", id=" + id +
                '}';
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }
}
