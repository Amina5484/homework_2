//construct
public class teacher {
    private String name;
    private String subject;
//getter for teacher
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
    //setter for teacher.
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}
