package first_sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // if our configuration file name was hibernate we can call  configure()
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

//        for (int i = 0; i < 50; i++) {
//            Employee employee = new Employee();
//            employee.setId(i);
//            employee.setFirstName("parsa " + i);
//            employee.setLastName("mihandoost " + i);
//            session.save(employee);
//        }


        Query q = session.createQuery("from Employee where id = 3");
        List<Employee> employees = q.list();

        for (Employee employee : employees) {
            System.out.println(employee.getFirstName());
        }

        transaction.commit();
    }
}
