package udemychallenge;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printfactors(6);
		gcd(12, 32);
		
		int number=123;
	
		switch(number) {
		case 1:
			System.out.println("one");
		}
	}

	public static void printfactors(int number) {
		for (int i = 1; i <= number; i++) {           // 1 * 2 = 2
			                                          

			if (number % i == 0) {         
				System.out.println(i);
			}

		}

	}

	public static void gcd(int fnum, int secnum) {
		int gcdf = 0;
		for (int i = 1; i <= fnum; i++) {

			if (fnum % i == 0 && secnum % i == 0) {
				gcdf = i;
			}

		}
		System.out.println("gcd is" + gcdf);
	}
}
