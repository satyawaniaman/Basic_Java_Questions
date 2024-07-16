
public class Fibonacii {
	static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		int first=0;
		int second=1;
		for (int i = 2; i < n; i++) {
			int current=first+second;
			first=second;
			second=current;
		}
		return second;
	}
	static void fibonacciSeries(int n) {
		if(n<=0) {
			System.out.println("series start from 1");
		}
		int first=0, second=1;
		System.out.print(first);
		 
		for (int i = 1; i < n; i++) {
			System.out.print(" "+second);
			int current=first+second;
			first=second;
			second=current;
			}
		
		
	}
	public static void main(String[] args) {
		int n=10;
		fibonacciSeries(n);
		
	}

}
