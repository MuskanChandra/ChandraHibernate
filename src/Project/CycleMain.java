package Project;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;



public class CycleMain {
	
	static SessionFactory factory = null;
	
	public static void main(String[] args) 
	{
		
		factory = new Configuration().configure().buildSessionFactory();
		 
		saveCycle();
		// UpdateCycle();
		// ListCycle();
		// DeleteCycle();
	}
	private static void saveCycle()
	{
		Session session = factory.openSession();
		Transaction tx = null;
		
		try 
		{
			tx = session.beginTransaction();
			Cycle c = new Cycle();
			c.Cycle_ID = 3;
			c.Cycle_Name = "Bridge Cycle";
			c.Cycle_Category = "Mountain";
			c.Cycle_Colour = "White & blue";
			c.Cycle_Type = "8th ger with Special";
			c.price = 50000;
			session.save(c);
			tx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

	// ------------------------------------For List of Data-----------------------------------
	
	private static void ListCycle() 
	{
		Session session = factory.openSession();
	      Transaction tx = null;

		try
			{
				tx=session.beginTransaction();						
			    @SuppressWarnings("unchecked")
		     	List<Cycle> cats = session.createQuery("FROM Cycle").list();
			    for (Cycle category : cats)
					{
						System.out.println(category.Cycle_Name);
					}
				tx.commit();
			}
		catch (Exception e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				tx.rollback();
			}
		finally
		{
			session.close();
		}
	}
	
	// ---------------------------------For Update Data--------------------------------
	
	/*
	private static void UpdateCycle() 
	{
		Session session = factory.openSession();
	      Transaction tx = null;

		try
			{
				tx=session.beginTransaction();						
			    Query q=session.createQuery("update Cycle set Cycle_Name=:n where Cycle_ID=:i");
			    q.setParameter("n", "hot weather");
			    q.setParameter("i", 1);
			    int result=q.executeUpdate();
			    System.out.println(result);
				tx.commit();
			}
		catch (Exception e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				tx.rollback();
			}
		finally
		{
			session.close();
		}
	}
	
	*/
	// ---------------------------------For Delete Data--------------------------------
	
	
	/*
		private static void DeleteCycle() 
		{
			Session session = factory.openSession();
		      Transaction tx = null;

			try
				{
					tx=session.beginTransaction();						
				    Query q=session.createQuery("Delete from Cycle where Cycle_ID=:data");
				    q.setParameter("data", 2);
				    q.executeUpdate();
					tx.commit();
				}
			catch (Exception e )
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					tx.rollback();
				}
			finally
			{
				session.close();
			}
		}
		*/

}
