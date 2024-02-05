package udemychallenge;

public class Rankposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int highposition =	calculatehighscoreposition(99);
	System.out.println(highposition);
	displayhighscoreposition("Tim",highposition);
	}
	public static void displayhighscoreposition(String name,int position) {
		System.out.println("Tim managed to get"+name+position +"the  position");
	}
	public static int calculatehighscoreposition (int score) {
		if(score>=1000) {
			return 1;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}
		return 4;
	}
}
