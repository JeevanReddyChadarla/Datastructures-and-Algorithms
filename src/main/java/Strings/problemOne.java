package Strings;

public class problemOne {
	
//	Check if a string "b" is a substring of another string "a" ?
//	eg: a="devang"			eg: a="devang"
//		b="dev"					b="dvg"
//		ans = true;				ans=false
//	Method 1:
//	public static boolean checkSubString(String a, String b) {
//		boolean ans=false;
//		ans = a.contains(b);
//		System.out.println(ans);
//		return ans;
//	}
//Method 2:
	public static boolean checkSubString(String a, String b) {
		boolean ans=false;
		if(a.indexOf(b)!=-1) {
			ans=true;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		String a = "devang";
		String b = "evan";
		checkSubString(a, b);
	}

}
