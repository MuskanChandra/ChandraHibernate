package NewIdea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class N_Idea 
{
	@Id
	@GeneratedValue
	@Column(name = "S_ID")
	int S_ID;
	@Column(name = "F_Name")
	String F_Name;
	@Column(name = "L_Name")
	String L_Name;
	@Column(name = "Address")
	String Address;
	@Column(name = "DOB")
	String DOB;
	@Column(name = "P_Name")
	String P_Name;
	
	public int getS_ID() {
		return S_ID;
	}
	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}
	public String getF_Name() {
		return F_Name;
	}
	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}
	public String getL_Name() {
		return L_Name;
	}
	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getP_Name() {
		return P_Name;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	
	
}
