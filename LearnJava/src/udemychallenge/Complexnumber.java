package udemychallenge;

public class Complexnumber {
	
	 private double real;
	    private double imaginary;
	    
	    public Complexnumber(double real, double imaginary){
	        this.real = real;
	        this.imaginary = imaginary;
	    }
	    
	    public double getReal(){
	        return real;
	    }
	    
	    public double getImaginary(){
	        return imaginary;
	    }
	    
	    public void add(double real, double imaginary){
	        this.real += real;
	        this.imaginary += imaginary;
	    }
	    
	    public void add(Complexnumber complexNumber){
	        this.real += complexNumber.real;
	        this.imaginary += complexNumber.imaginary;
	    }
	    
	    public void subtract(double real, double imaginary){
	        this.real -= real;
	        this.imaginary -= imaginary;
	    }
	    
	    public void subtract(Complexnumber complexNumber){
	        this.real -= complexNumber.real;
	        this.imaginary -= complexNumber.imaginary;
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complexnumber one = new Complexnumber(1.0, 1.0);
        Complexnumber number = new Complexnumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
	}

}
