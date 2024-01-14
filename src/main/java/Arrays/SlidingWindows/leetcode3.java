package Arrays.SlidingWindows;

import java.util.Arrays;
import java.util.HashSet;

public class leetcode3 {

	public static int lengthOfLongestSubstring(String s) {
        // sliding window
        char ch[]=s.toCharArray();
        HashSet<Character>set=new HashSet<>();
        int start=0, end=ch.length-1, i=0, ans=0;
        while(start<=end && i<=end){
            if(!set.contains(ch[i])) {
            	set.add(ch[i]);
            	ans=Math.max(i-start+1, ans);
            	i++;
            }else {
            	set.remove(ch[start]);
            	start++;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		String str="aabaabcbb";
		lengthOfLongestSubstring(str);

	}

}
