package Arrays.SlidingWindows;

import java.util.HashMap;

public class leetcode76 {
	public static int minWindow(String s, String t) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char sch[]=s.toCharArray();
		String ans="";
		int i=0, j=0, count=Integer.MAX_VALUE,flag=0;
		char a='x';
		while(j<sch.length) {
			if(check(map,t)) {
				count=Math.min(j-i+1, count);
				map.put(sch[i],map.getOrDefault(sch[i], 0)-1);
				if(map.get(sch[i])<=0) {
					map.remove(sch[i]);
				}
				a=sch[i];
				i++;
			}else {
				map.put(sch[j], map.getOrDefault(sch[j], 0)+1);
				j++;				
				if(j==sch.length && flag==0) {
					j--;
					flag=1;
				}
			}
		}
		for(int y=0;y<map.size();y++) {
			ans+=map.get(y);
		}
		System.out.println(count);
		System.out.println(map);
		return count;
	}
	public static boolean check(HashMap<Character, Integer> map, String t) {
		char tarr[]=t.toCharArray();
		for(int i=0;i<tarr.length;i++) {
			if(!map.containsKey(tarr[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s="ADOBECODEBANC", t="ABC";
		minWindow(s, t);
	}

}
