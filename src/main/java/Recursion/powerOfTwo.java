package Recursion;

public class powerOfTwo {
// given an int n, return true if it is power of 2 else false
	public static boolean returnIsPower(int n) {
		boolean b=true;
		if(n%2==0 && n!=2) {
			return returnIsPower(n/2);
		}
		if(n%2==1) {
			return false;
		}
		return b;
	}
	public static void main(String[] args) {
		boolean b=returnIsPower(16);
		System.out.println(b);
	}

}
