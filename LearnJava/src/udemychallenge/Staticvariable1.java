package udemychallenge;

public class Staticvariable1 {
	private static String name;
	
	 
	 public Staticvariable1 (String name) {
		 System.out.println("name of--->"+name);
		 Staticvariable1.name=name;// we use this also
	 }
	 public void printname() {
		 System.out.println("name printname-1--->"+Staticvariable1.name);
		 System.out.println("name printname-2--->"+name);// upper line and this line will give the same answer
	 }
	 public static void main(String[] args) {
		 Staticvariable1 rex=new Staticvariable1("rex");
		 Staticvariable1 fluffy=new Staticvariable1("fluffy");
		 Staticvariable1 arrav=new Staticvariable1("arrav");
		rex.printname();
		fluffy.printname();
		 arrav.printname();
	 }	
			 

}
