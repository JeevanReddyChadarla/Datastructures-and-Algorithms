package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Stack;

public class leetcode496{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int ans[]=new int[nums1.length];
        // Arrays.fill(ans,-1);
        // HashMap<Integer,Integer>map=new LinkedHashMap<>();
        // for(int i=0;i<nums2.length;i++){
        //     map.put(nums2[i],i);
        // } 
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=map.get(nums1[i])+1;j<map.size();j++){
        //         if(nums1[i]<nums2[j]){
        //             ans[i]=nums2[j];
        //             break;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(ans));
        // return ans;

        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
	public static void main(String[] args) {
		int arr[]={4,1,2}, arr2[]={1,3,4,2,5};
        nextGreaterElement(arr, arr2);
		
	}

}
