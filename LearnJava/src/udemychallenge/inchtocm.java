package udemychallenge;

public class inchtocm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int cm=	(int) converttocentimeters(5,3);
		System.out.println(( cm));

	}
	public static double converttocentimeters(int height) {
		// convert inches to centimeter 1 inch = 2.54 cm
		double cm=height*2.54;
		return cm;
	}
	public static double converttocentimeters(int height,int inch) {
		//height in feet and inch eg:8feet 2 inches
		double inches=height*12+inch;
		return inches;
	}

}
