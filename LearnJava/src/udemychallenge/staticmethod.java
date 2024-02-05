package udemychallenge;

public class staticmethod {// we can call the static method from another class by classname.methodname
	                          // if u call the static method from the same class then u simply use method name to call
  int c=98;
	static int d=34;
	public static void sumdigit(int a, int b) {
	System.out.println("sum of digits is ----->"+a * b);
	
	//divnum(); we couldn't call instance method from static method
	//staticmethod stat= new staticmethod();
	//System.out.println(stat.c);
	
	}
	public void divnum() { // static method can be accessed in instance method
		sumdigit(23,32);
	}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumdigit(1, 3); // 
       //divnum(); without creating instance we couldn't call instance method
	}

}
