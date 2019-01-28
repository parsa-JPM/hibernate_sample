package first_sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirstName("parsa");
        employee.setLastName("mihandoost");

        // if our configuration file name was hibernate we can call  configure()
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        System.out.println("Successfully save");
        transaction.commit();
    }
}
