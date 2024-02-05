package udemychallenge;


 class Staticvariable {  //directly using static variable 
	
	static  String name="princy";
	public static void getnum( String name1) {
		Staticvariable.name=name1;
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		//Staticvariable ref =new Staticvariable();
		System.out.println(name);// don't need to create a instance (new) in order to access the static variable .
		
	}

}
 
				
 
