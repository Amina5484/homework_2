import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        //creating object for all the classes.
        student student1 = new student("Amina Mohammed",832, new int[]{94, 78, 89});
        student student2= new student("hikma mohamed",987,new int[]{90,56,78});
        teacher teacher1 = new teacher("Ayel", "OODB");
        college college = new college("computing and informatics College");
        student1.setName("Amina Mohammed");
        teacher1.setSubject("OODB");
        // Adding student and teacher to the collage.
        college.addStudent(student1);
        college.addTeacher(teacher1);
//display the system.

    }
}

