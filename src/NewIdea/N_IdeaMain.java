package NewIdea;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class N_IdeaMain {
	static SessionFactory factory = null;
	public static void main(String[] args) 
	{
		factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		N_Idea NI = new N_Idea();
		NI.F_Name = "Bhupal";
		NI.L_Name = "Gurung";
		NI.Address = "Kathmandu";
		NI.DOB = "1998";
		NI.P_Name = "Sabina Gurung";
		s.save(NI);
		tx.commit();
		
	}

}
