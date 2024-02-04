package Sorting_algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode179 {
//	Approach:
//
//		(1) Convert ALL Numbers/Integers to String
//		(2) Sort in Decreasing Order as per Criteria: Comparator Based Sorting
//		(3) Append in Solution
	
	public static String largestNumber(int[] nums) 
    {        
        int i = 0;
        int n = nums.length;
        String[] s_num = new String[n];
        
        for (i=0; i<n; i++) {
        	s_num[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                System.out.println(str2.compareTo(str1));
                int a = str2.compareTo(str1); 
                return a;// REVERSE Order Here
            }
        };      
        Arrays.sort(s_num, comp);
        
        if (s_num[0].charAt(0) == '0')
            return "0";
        
        StringBuilder ans = new StringBuilder();
        for (String s: s_num) // O(N)
            ans.append(s);
        
        return ans.toString();
    }

	public static void main(String[] args) {
		int arr[]= {3,30,34,5,9};
		System.out.println(largestNumber(arr));
		
	}

}
