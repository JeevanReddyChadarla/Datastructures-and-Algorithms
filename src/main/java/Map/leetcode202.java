package Map;

import java.util.HashMap;

public class leetcode202 {
	
	public static int lengthOfLongestSubstringTwoDistinct(String s) {
	       char ch[]=s.toCharArray();
			int ans=0, i=0,j=0, res=0;
			HashMap<Character, Integer>map=new HashMap<Character, Integer>();
			while(j<ch.length) {
				map.put(ch[j],map.getOrDefault(ch[j], 0)+1);
				while(map.size()>2) {
					map.put(ch[i],map.getOrDefault(ch[i], 0)-1);
					if(map.get(ch[i])<=0) {
						map.remove(ch[i]);
					}
					i++;
				}
				j++;
				for(int z:map.values()) {
					ans+=z;
				}
				res=Math.max(ans, res);
				ans=0;
			}
			return res;
		}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstringTwoDistinct("eedeaa"));

	}

}
