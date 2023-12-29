package Recursion;

public class sumOfDigits {
//Given a number n, find the sum of digits using recursion
	public static int sumofDig(int n) {
		int sum=0;
		if(n==0) {
			return sum;
		}
		sum=n%10;
		return sum+sumofDig(n/10);
	}
	
	public static void main(String[] args) {
		int k=sumofDig(123);
		System.out.println(k);
	}

}
