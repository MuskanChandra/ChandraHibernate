package Project;

public class Cycle 
{
int Cycle_ID;
String Cycle_Name;
String Cycle_Category;
String Cycle_Colour;
String Cycle_Type;
double price;


public Cycle() {
	super();
}
public Cycle(int cycle_ID, String cycle_Name, String cycle_Category, String cycle_Colour, String cycle_Type,
		double price) {
	super();
	Cycle_ID = cycle_ID;
	Cycle_Name = cycle_Name;
	Cycle_Category = cycle_Category;
	Cycle_Colour = cycle_Colour;
	Cycle_Type = cycle_Type;
	this.price = price;
}
public int getCycle_ID() {
	return Cycle_ID;
}
public void setCycle_ID(int cycle_ID) {
	Cycle_ID = cycle_ID;
}
public String getCycle_Name() {
	return Cycle_Name;
}
public void setCycle_Name(String cycle_Name) {
	Cycle_Name = cycle_Name;
}
public String getCycle_Category() {
	return Cycle_Category;
}
public void setCycle_Category(String cycle_Category) {
	Cycle_Category = cycle_Category;
}
public String getCycle_Colour() {
	return Cycle_Colour;
}
public void setCycle_Colour(String cycle_Colour) {
	Cycle_Colour = cycle_Colour;
}
public String getCycle_Type() {
	return Cycle_Type;
}
public void setCycle_Type(String cycle_Type) {
	Cycle_Type = cycle_Type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
