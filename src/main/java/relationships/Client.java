package relationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        Labtop labtop = new Labtop();
        labtop.setLid(101);
        labtop.setLname("asus");

        Labtop labtop1 = new Labtop();
        labtop1.setLid(102);
        labtop1.setLname("hp");


        Student student = new Student();
        student.setRollno(1);
        student.setName("parsa");
        student.setMark(20);

        student.getLabtops().add(labtop);
        student.getLabtops().add(labtop1);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Labtop.class);

        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);

        session.save(labtop);
        session.save(labtop1);

        transaction.commit();

    }
}
