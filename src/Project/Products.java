package Project;

public class Products 
{
	int Product_ID;
	String Product_Name;
	String Product_Company_Name;
	String Product_Category;
	String Product_Colour;
	int Product_Quantity;
	double Product_Price;
	String Product_Date;
	
	
	public Products() {
		super();
	}
	public Products(int product_ID, String product_Name, String product_Company_Name, String product_Category,
			String product_Colour, int product_Quantity, double product_Price, String product_Date) {
		super();
		Product_ID = product_ID;
		Product_Name = product_Name;
		Product_Company_Name = product_Company_Name;
		Product_Category = product_Category;
		Product_Colour = product_Colour;
		Product_Quantity = product_Quantity;
		Product_Price = product_Price;
		Product_Date = product_Date;
	}
	public int getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(int product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Company_Name() {
		return Product_Company_Name;
	}
	public void setProduct_Company_Name(String product_Company_Name) {
		Product_Company_Name = product_Company_Name;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}
	public String getProduct_Colour() {
		return Product_Colour;
	}
	public void setProduct_Colour(String product_Colour) {
		Product_Colour = product_Colour;
	}
	public int getProduct_Quantity() {
		return Product_Quantity;
	}
	public void setProduct_Quantity(int product_Quantity) {
		Product_Quantity = product_Quantity;
	}
	public double getProduct_Price() {
		return Product_Price;
	}
	public void setProduct_Price(double product_Price) {
		Product_Price = product_Price;
	}
	public String getProduct_Date() {
		return Product_Date;
	}
	public void setProduct_Date(String product_Date) {
		Product_Date = product_Date;
	}
	
	
}
