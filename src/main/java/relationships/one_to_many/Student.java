package relationships.one_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int rollno;

    private String name;
    private int mark;


    @OneToMany(mappedBy = "student")
    private List<Labtop> labtop = new ArrayList<>();

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    public List<Labtop> getLabtop() {
        return labtop;
    }

    public void setLabtop(List<Labtop> labtop) {
        this.labtop = labtop;
    }
}
