package Arrays.SlidingWindows;

import java.util.HashMap;

public class leetcode76 {
	public static String minWindow(String s, String t) {
		if(t.length()>s.length()) {
			return "";
		}
		if(t==s) {
			return t;
		}
		int i=0, j=0, ans=Integer.MAX_VALUE;
		String x="";
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		while(j<=s.length()-1) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			if(check(s.substring(i, j+1),t)) {
				ans=Math.min(j-i+1, ans);
				map.put(s.charAt(i), map.get(s.charAt(i))-1);
				if(map.get(s.charAt(i))==0) {
					map.remove(s.charAt(i));
				}
				i++;
			}else {
				j++;
			}
		}
		System.out.println(ans);
		System.out.println(s.substring(i-1,ans+i-1));
		return s.substring(i-1,ans+i-1);
	}
	public static boolean check(String str, String t) {
		char arr[]=t.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(!str.contains(String.valueOf(arr[i]))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="ADOBECODEBANCZOP";
		String t="ABC";
		minWindow(s, t);
	}

}
