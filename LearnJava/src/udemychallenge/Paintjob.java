package udemychallenge;

public class Paintjob {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBucketCount(3.4,2.2,1.5,2);
		Staticvariable.getnum("vara");
	}
	public static int getBucketCount(double width,double height,double areaperbucket ,double extrabuckets) {
		int area= (int) ((int)(width*height)/extrabuckets);
		System.out.println(area);
		return area;
	}

}
