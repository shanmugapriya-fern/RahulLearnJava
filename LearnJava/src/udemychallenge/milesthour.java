package udemychallenge;

public class milesthour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tomilesperhour(10.25);
	}
	public static void tomilesperhour(double kilometersperhour) {
		printconversion(kilometersperhour);
	}
public static void printconversion(double kilometersperhour) {
	
	double miles;
	miles= (kilometersperhour*0.6213712);
	System.out.println(Math.round(miles));
}
}

