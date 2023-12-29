package Recursion;

public class checkPalindrome {
	// Given a string, check if it palindrome or not
	public static boolean checkPlaindrome(String str, int start, int end) {
//		boolean b=true;
		
			if(start<end+1) {
				return checkPlaindrome(str, start+1, end-1);
			}
			if(start==end) {
				return true;
			}
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}			
		System.out.println(str.charAt(start)+"  "+str.charAt(end)+"  "+str.length());
		return true;
	}
	

	public static void main(String[] args) {
		String str=new String("jekmej");
		boolean ans=checkPlaindrome(str, 0, str.length()-1);
		System.out.println("Answer  "+ans);
	}

}
