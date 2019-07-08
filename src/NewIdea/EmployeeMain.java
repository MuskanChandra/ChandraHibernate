package NewIdea;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmployeeMain {
 
	static SessionFactory factory = null;
	public static void main(String[] args) {
	
		factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		//Address a = new Address("chandra street","chandra city","chandra state","chandra code");
		//Employee e= new Employee("muskan", "chandra", 100000, a);
		
		Address a= new Address();
		a.setCity("Nepal");
		a.setState("Kathmandu");
		a.setStreet("Himal");
		a.setZipcode("1235 Zone");
		
		
		Employee e = new Employee();
		e.setFirstName("Chandra");
		e.setLastName("Tamang");
		e.setAddress(a);
		e.setSalary(20000);
		
		s.save(e);
		tx.commit();s.close();
	
	}

}
