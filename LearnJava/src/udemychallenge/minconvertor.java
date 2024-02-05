package udemychallenge;

 class minconvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String totalhours=getduaration(12005);
		//System.out.println(totalhours);
	}
	public static String getduaration(int seconds) {
		int minutes=seconds/60;
		int second=seconds%60;
		return getduaration(minutes,second);
	}
	public static String getduaration(int minutes,int seconds) {
		int hours=minutes/60;
		int remainingminutes=minutes%60;
		int second=seconds%60;
		return hours+":"+remainingminutes+":"+second;
		
	}
	
	public class main{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String totalhours=minconvertor.getduaration(12005);
			System.out.println(totalhours);
		}
		
	}

}
