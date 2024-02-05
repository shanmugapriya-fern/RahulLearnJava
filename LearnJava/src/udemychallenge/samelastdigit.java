package udemychallenge;

public class samelastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 boolean result=	hassamedigit(235,567,654);
	System.out.println(result);
	}
	public static boolean hassamedigit(int firstnum,int secondnum,int thirdnum) {
		if(firstnum>=10 && firstnum<=1000 && (secondnum>=10 && secondnum<=1000 )&&(thirdnum>=10 && thirdnum<=1000 )) {
		int firstnumlast=firstnum%10;
		int secondnumlast=secondnum%10;
		int thirdnumlast=thirdnum%10;
		if(firstnumlast==secondnumlast || firstnumlast==thirdnumlast) {
			return true;
		}
		return false;
	}
return false;
}
}
