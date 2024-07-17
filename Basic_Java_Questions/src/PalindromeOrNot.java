
public class PalindromeOrNot {
	static boolean palindromecheck(int n) {
		if(n<1) {
			return false;
		}
		int reverse=0;
		int originalnum=n;
		while(n>0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n/=10;
		}
		return originalnum==reverse;
		
	}
	public static void main(String[] args) {
		int n=121;
		System.out.println(palindromecheck(n));
	}

}
