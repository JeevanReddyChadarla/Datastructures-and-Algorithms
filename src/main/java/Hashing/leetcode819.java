package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode819 {
	
	public static String mostCommonWord(String paragraph, String[] banned) {
		String words[]=paragraph.replaceAll("\\W+"," ").toLowerCase().split("\\s+");
        int ans=0;
        String an="";
        HashMap<String, Integer>map=new HashMap<String, Integer>();
        HashSet<String>set=new HashSet<String>();
        for(int i=0;i<banned.length;i++) {
        	set.add(banned[i].toLowerCase());
        }
        for(int i=0;i<words.length;i++) {
        	map.put(words[i], map.getOrDefault(words[i], 0)+1);
        	if(!set.contains(words[i])) {
	        	ans=Math.max(map.get(words[i]),ans);
	        	if(map.get(words[i])==ans) {
	        		an=words[i];
	        	}
        	}
        }
        System.out.println(map);
        System.out.println(ans + "	" + an);
        return an;
	}

	public static void main(String[] args) {
		String str="a";//"Bob hit a ball, the hit BALL flew far after it was hit." ;//"hello jeevan jeevan is good hello. i did not get hello reply from jeevan and he did, a great job";//"Bob hit a ball the hit ball flew far after it was hit";
		String banned[]= {};
		mostCommonWord(str, banned);
	}

}
