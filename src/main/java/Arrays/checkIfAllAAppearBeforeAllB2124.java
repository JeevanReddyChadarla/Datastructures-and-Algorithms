package Arrays;

import java.util.Arrays;

public class checkIfAllAAppearBeforeAllB2124 {
	
	public static boolean check(String str) {
		char ch[]=str.toCharArray();
		boolean ans=true;
		int start=0, end=ch.length-1;
		str.contains("a");
		while(start<end) {
			if(ch[start]>ch[start+1]) {
				return false;
			}
			start++;
		}
		return ans;	
		
	}

	public static void main(String[] args) {
		boolean b= check("abb");
		System.out.println(b);
	}

}
