package Arrays.SlidingWindows;

import java.util.HashMap;

public class leetcode242 {
	// Valid anagram
	
	public static boolean isValidAnagram(String str, String s) {
		int len1=str.length(), len2=s.length();
		int start1=0, start2=0;
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		if(len1!=len2) {
			return false;
		}
		while(start1<len1 && start2<len2) {
			map.put(str.charAt(start1),map.getOrDefault(str.charAt(start1), 0)+1);
			map.put(s.charAt(start2), map.getOrDefault(s.charAt(start2), 0)-1);
			start1++;
			start2++;
		}
		for(int i:map.values()) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str="anagram";
		String s="nagaram";
		System.out.println(isValidAnagram(str, s));
	}

}
