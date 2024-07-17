
public class PowerOfInteger {
	static int power(int base,int exponent) {
		int result=1;
		for (int i = 0; i < Math.abs(exponent); i++) {
			result*=base;
		}
		if(exponent<0) {
			result=1/result;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(power(2,3));

	}

}
