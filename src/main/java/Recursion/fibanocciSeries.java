package Recursion;

public class fibanocciSeries {
	// fibanocci series using recursion
	// 0,1,1,2,3,5,8,13,21,34,55,89
	
	public static int fib(int n) {
		
		return fib(n-2)+fib(n-1);
	}

	public static void main(String[] args) {
		int k=5;
		System.out.println((fib(5)));
	}

}
