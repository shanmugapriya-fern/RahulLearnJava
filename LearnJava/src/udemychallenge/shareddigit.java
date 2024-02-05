package udemychallenge;

public class shareddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean result=shareddigit(23,14);
System.out.println(result);
	}
public static boolean shareddigit(int firstnum,int secondnum) {
	if((firstnum>=10 && firstnum<=99) &&(secondnum>=10 && secondnum<=99)) {
		int firstnumtwo=firstnum%10;
		System.out.println(firstnumtwo);
		int secondnumtwo=secondnum%10;
		System.out.println(secondnumtwo);
		int firstnumberone=firstnum/10;
		System.out.println(firstnumberone);
		int secondnumone=secondnum/10;
		System.out.println(secondnumone);
		if(firstnumberone==secondnumone||firstnumberone== secondnumtwo||firstnumtwo==secondnumone||firstnumtwo==secondnumtwo) {
			return true;
		}
		return false;
	}
	return false;
}
}
