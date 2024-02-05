package udemychallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car=new Car();
		 car.describeCar();
		 car.setColor("brown");
		 car.setMake(" null ");
System.out.println("model is"+car.getModel());
System.out.println("make is"+car.getMake());
System.out.println("color is"+car.getColor());


// arithmeticipp

Arithmeticipp calc=new Arithmeticipp();
Arithmeticipp usb=new Arithmeticipp();
//calc.firstnum=0;    //
usb.setsecondnum(32.3);
usb.setfirstnum(27.3);
calc.setfirstnum(21.3);
//Arithmeticipp.firstnum=32.7;// if we remove private from the
calc.setsecondnum(31.3);
System.out.println("First number is  "+ calc.getfirstnum()+"First number in usb is "+usb.getfirstnum());
System.out.println("second number is  "+ calc.getsecondnum()+"second number in usb is "+usb.getsecondnum());
System.out.println(" addition is  "+ calc.getaddition()+" addition is  "+ usb.getaddition());
System.out.println("Subraction is  "+ calc.getsubraction()+"Subraction is  "+usb.getsubraction());
System.out.println("Multiply is  "+ calc.getmultiply()+"Multiply is  "+usb.getmultiply());
System.out.println("Division is  "+ calc.getdivision()+"Division is  "+ usb.getdivision());

//customer

Customer customer=new Customer("ravi","subbu");
System.out.println(customer.creditlimit=321);
System.out.println("Customer email is"+customer.getEmail());

//staticmethod- can access directly by cname.mname  or create a instance and access the method
staticmethod.sumdigit(1, 3);
//staticmethod stat =new staticmethod();
//stat.sumdigit(3, 4);
Staticvariable.name="soffy";

	}

} 
