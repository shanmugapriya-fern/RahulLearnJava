package udemychallenge;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; int sum=0;int large=0;
		Scanner name= new Scanner(System.in);
		for(int i=1;i<=n;i++) {
			//Scanner name= new Scanner(System.in);
			System.out.println("Enter the number #"+i);
			//int num=name.nextInt();
			String str=name.nextLine();
		//	sum=sum+num;
			//large=sum;
			System.out.println(str);
		//	if(num<=sum) {
				//System.out.println(sum);
				//System.out.println(large);
			}
		}
		
		//System.out.println(sum);
	}


