package Recursion;

public class factorial {
	
	public static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		int k=fact(5);
		System.out.println(k);

	}

}
