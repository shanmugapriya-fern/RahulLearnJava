package udemychallenge;

public class Arraybasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {134,32,154,37};
		int min=array[2];
		int max=array[2];
		
		for(int i=0;i<array.length;i++) {
			
			if(max <= array[i]) {
				max=array[i];
				
			}
			if( array[i]<=min) {
				min=array[i];
				
				
			}
				
			
		}
		System.out.println("min is"+min);	
		
		System.out.println("max is"+max);	
		

	}

}
