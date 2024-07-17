import java.util.Scanner;

public class ArmstrongOrNot {
	static boolean armstrong(int num) {
		int n=0,originalnum,digit,result=0;
		originalnum=num;
		while(originalnum!=0) {
			originalnum/=10;
			n++;
		}
		originalnum=num;
		while(originalnum!=0) {
			digit=originalnum%10;
			result+=Math.pow(digit, n);
			originalnum/=10;
		}
		return result==num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = sc.nextInt();
        sc.close();
        
        if (armstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
	}

}
