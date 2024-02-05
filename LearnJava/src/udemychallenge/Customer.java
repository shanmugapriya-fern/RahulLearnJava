package udemychallenge;

public class Customer {

	private  String name;
	  static int creditlimit;
	private String email;
	
	public Customer(String name,int creditlimit,String email) {
	
		System.out.println(this.name=name);
		System.out.println(this.creditlimit=creditlimit);
		System.out.println(this.email=email);
		
	}
    public Customer(String name,String email) {
    	
		this(name,234,email);
		
	}
    public Customer() {
		this("arun","yyyy"); //This is not a static value// here we couldn't give the name of the parameters here  eg:name email
	}                      // whatever the value is passed from the constructor ll be displayed here
	
	public String getName() {
		return name;
	}
	public int getCreditlimit() {
		return creditlimit;
	}
	public String getEmail() {
		return email;
	}
	
	
}
