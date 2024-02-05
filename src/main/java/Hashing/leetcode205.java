package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class leetcode205 {
	
	// create map1 - and add the elements to it from s1
	// create map2 - and add the elements to it from s2
	
	public static boolean isIsometric(String s, String t) {
		HashMap<Character, Integer> map1=new LinkedHashMap<Character, Integer>();
		HashMap<Character, Integer> map2=new LinkedHashMap<Character, Integer>();
		int Sindex=0, Tindex=0;
		if(s.length()!=t.length()) {
			return false;
		}
		for(int i=0;i<s.length();i++) {
			Sindex = map1.getOrDefault(s.charAt(i),-1);
			Tindex = map2.getOrDefault(t.charAt(i),-1);
			
			if(Sindex!=Tindex) {
				return false;
			}
			
			map1.put(s.charAt(i), i);
			map2.put(t.charAt(i), i);
		}
		return true;
	}

	public static void main(String[] args) {
		String s="papra";
		String t="title";
		System.out.println(isIsometric(s, t));

	}

}
