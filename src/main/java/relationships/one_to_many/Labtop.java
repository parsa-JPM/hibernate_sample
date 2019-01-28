package relationships.one_to_many;


import javax.persistence.*;

@Entity
public class Labtop {
    @Id
    private int lid;
    private String lname;

    @ManyToOne
    private Student student;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
