package relationships.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
    public static void main(String[] args) {

        Labtop labtop = new Labtop();
        labtop.setLid(101);
        labtop.setLname("asus");

        Student student = new Student();
        student.setRollno(1);
        student.setName("parsa");
        student.setMark(20);

        student.getLabtop().add(labtop);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Labtop.class);

        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(labtop);

        session.save(student);


        transaction.commit();

    }
}
