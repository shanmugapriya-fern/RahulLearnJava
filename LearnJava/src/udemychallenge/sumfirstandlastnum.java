package udemychallenge;

public class sumfirstandlastnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=sumfirstandlastdigit(12774);
System.out.println(sum);
	}
	public static int sumfirstandlastdigit(int number) {
		getevendigitsum(234565);
		int rem=number%10;
		int value=0;
		while(number>0) {
			value=number%10;
			number=number/10;
		}
		value=value+rem;
		
		return value;
	}
	
	public static int getevendigitsum(int number) {
		int value=0, sum=0;
		while(number>0) {
			value=number%10;
			if(value%2==0)
			sum=sum+value;	
		//	System.out.println("sum is"+sum);	
			number=number/10;
		}
		System.out.println("sum is"+sum);
		return sum;
	}

}
