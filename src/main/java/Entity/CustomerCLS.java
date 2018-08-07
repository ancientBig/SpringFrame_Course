package Entity;

public class CustomerCLS {
	
	
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	@Override
	public String toString() {
		return "CustomerCLS [Fname=" + Fname + ", customer_id=" + customer_id + ", Lname=" + Lname + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", passWord=" + passWord + ", e_mail=" + e_mail + "]";
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	private String Fname;
	
	private int customer_id;
	
	private String Lname;
	
	private String address;
	
	private String phoneNumber;
	
	private String passWord;
	
	private String e_mail;
	
	
	public static CustomerCLS create(String name,String lname,String pas,String phone,String address,String mail) {
		// TODO Auto-generated constructor stub
		CustomerCLS newCustom = new CustomerCLS(name,lname,address,phone,pas,mail);
		
		return newCustom;
		
	}
	
	public String greeting()
	{
		return "Hi from customer";
	}

	public CustomerCLS(String fname, String lname, String address, String phoneNumber, String passWord, String e_mail) {
		super();
		Fname = fname;
		Lname = lname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.passWord = passWord;
		this.e_mail = e_mail;
	}

	public CustomerCLS() {
		super();
	}
	
	

}
