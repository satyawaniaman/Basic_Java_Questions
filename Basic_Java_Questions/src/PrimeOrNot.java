
public class PrimeOrNot {
	
	static boolean primeCheck(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		if(n%2==0) {
			return false;
		}
		for(int i=3;i<=Math.sqrt(i);i+=2) {
			if(i%n==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n=22;
		System.out.println(primeCheck(n));
	}

}
