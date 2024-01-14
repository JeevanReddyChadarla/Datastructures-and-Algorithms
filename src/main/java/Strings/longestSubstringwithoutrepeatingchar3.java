package Strings;

import java.util.HashSet;

public class longestSubstringwithoutrepeatingchar3 {
	
	public static int lengthOfLongestSubstring(String s) {
		int count=0, ans=1;
        HashSet<Character>set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
            	set.clear();
                count=0;
            }
            else if(!set.contains(s.charAt(i))){
                count++;
                set.add(s.charAt(i));
                ans=Math.max(ans,count);
            }
        }
        System.out.println(ans);
        return ans;
    }

	public static void main(String[] args) {
		String str="pwwkew";
		lengthOfLongestSubstring(str);
	}

}
