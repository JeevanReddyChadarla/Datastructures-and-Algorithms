package Arrays.SlidingWindows;

import java.util.HashMap;
import java.util.HashSet;

public class lintcode928 {
	
	public static int funct(String s) {
		char ch[]=s.toCharArray();
		int ans=0, i=0,j=0, res=0;
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		while(j<ch.length) {
			if(map.containsKey(ch[j])) {
				map.put(ch[j],map.getOrDefault(ch[j], 0)+1);
			}else {
				map.put(ch[j], 1);
			}
			if(map.size()>2) {
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
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		String str="ccc"; // ababa
		funct(str);
	}

}
