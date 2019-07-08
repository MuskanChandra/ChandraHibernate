package Project;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Product_Main {
	
	static SessionFactory Factory = null;
	public static void main(String[] args)
	{
		Factory = new Configuration().configure().buildSessionFactory();
		
		SaveProductItmes();
	}
	
	// -----------------------------------Data Insert in Localhost-------------------------------
	
	public static void SaveProductItmes()
	{
		Session session = Factory.openSession();
		Transaction trans = null;
		
		try {
			trans = session.beginTransaction();
				Products P = new Products();
				P.Product_ID = 3;
				P.Product_Company_Name = "Dijestive";
				P.Product_Category = "Dry Food";
				P.Product_Colour = "Mix Colour";
				P.Product_Quantity = 150;
				P.Product_Price = 150000;
				P.Product_Date = "Apr-10, 2019";
				session.save(P);
				trans.commit();
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
				
			}
	}
	
	
	// ----------------------------------- Data Show in Display-------------------------------
	public static void ListProducts()
	{
		Session session = Factory.openSession();
	      Transaction trans = null;

		try
			{
				trans=session.beginTransaction();						
			    @SuppressWarnings("unchecked")
		     	List<Products> Pro = session.createQuery("FROM Products").list();
			    for (Products p : Pro)
					{
			    	System.out.println(p.Product_Name + p.Product_Company_Name + p.Product_Category);
					}
				trans.commit();
			}
		catch (Exception e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				trans.rollback();
			}
		finally
		{
			session.close();
		}
	}

}
