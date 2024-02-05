package Hashing;

public class leetcode389 {
	
	public static char findTheDifference(String s, String t) {
		String a=s+t; // abcdabcde
		char schar[]=a.toCharArray();
		int ans=schar[0];
		int start=1, end=a.length()-1;
		while(start<=end) {
			ans=schar[start]^ans;
			start++;
		}
		return (char)ans;
	}
	public static void main(String[] args) {
		String s = "", t = "a";
		System.out.println(findTheDifference(s, t));
	}

}
