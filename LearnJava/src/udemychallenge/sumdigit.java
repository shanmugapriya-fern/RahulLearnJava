package udemychallenge;

public class sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=sumdigits(145);System.out.println(sum);
	}
	
	public static int sumdigits(int number) {
		int sum=0;
		while(number>0) {
			System.out.println(number);
			int rem=number%10;
			 sum=sum+rem;
			number=number/10;
			
		}
		return sum;
	}

}
