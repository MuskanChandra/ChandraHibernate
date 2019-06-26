package Project;

public class Bike
{
	int bikeID;
	String XR;
	double price;
	
	
	public Bike() {
		super();
	}
	public Bike(int bikeID, String xR, double price) {
		super();
		this.bikeID = bikeID;
		XR = xR;
		this.price = price;
	}
	public int getBikeID() {
		return bikeID;
	}
	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}
	public String getXR() {
		return XR;
	}
	public void setXR(String xR) {
		XR = xR;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
