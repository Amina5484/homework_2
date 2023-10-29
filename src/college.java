import java.util.ArrayList;
//construct
public class college {
    private String name;
    private ArrayList<student> students;
    private ArrayList<teacher> teachers;
    public college(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    //getter for college
    public String getName() {
        return name;
    }

    public ArrayList<student> getStudents() {

        return students;
    }

    public ArrayList<teacher> getTeachers() {

        return teachers;
    }
    //setter for coolege

    public void setName(String name) {

        this.name = name;
    }

    public void setStudents(ArrayList<student> students) {

        this.students = students;
    }

    public void setTeachers(ArrayList<teacher> teachers) {

        this.teachers = teachers;
    }
    public void addStudent(student student) {
        students.add(student);
    }

    public void addTeacher(teacher teacher) {
        teachers.add(teacher);
    }

}
