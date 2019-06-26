package Project;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class BikeMain {

	static 	SessionFactory Factory=null;
	public static void main(String[] args)
	{
		Factory = new Configuration().configure().buildSessionFactory();
		
	
	saveBike();
	}
	private static void saveBike() {
		
		Session session = Factory.openSession();
		Transaction tx = null;
		
		try {
		tx = session.beginTransaction();
			Bike b = new Bike();
			b.XR = "150XR";
			b.price = 400000;
			session.save(b);
			tx.commit();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
