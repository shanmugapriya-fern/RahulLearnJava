package udemychallenge;

public class Arithmeticipp {
	public static void main(String[] args) {
Arithmeticipp.firstnum=32.7;
	}
	private static double firstnum;
	private double secondnum;
	
	public double getfirstnum() {
		return firstnum;
		
	}
	public double getsecondnum() {
		return secondnum;
	}
	public void setfirstnum(double value) {
		this.firstnum=value;
		
	}
	public  void setsecondnum(double value) {
		this.secondnum=value;
	}
	public double getaddition() {
		double add=this.firstnum+this.secondnum;
		return add;
	}
	public double getsubraction() {
		double sub=this.firstnum-this.secondnum;
		return sub;
	}
	public double getmultiply() {
		double multiply=this.firstnum*this.secondnum;
		return multiply;
	}
	public double getdivision() {
		double div=this.firstnum/this.secondnum;
		return div;
	}

}


