package Recursion;

public class problem1 {
	// print 1 to n without using loop using recursion
	
	public static int printElements(int n) {
		int k=n;
		if(k==1) {
			return n;
		}
		System.out.println(k);
		return printElements(n-1);
	}

	public static void main(String[] args) {
		int k=printElements(5);
		System.out.println(k);
	}

}
