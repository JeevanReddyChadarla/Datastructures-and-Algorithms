package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfTwoArrays349 {
//	https://leetcode.com/problems/intersection-of-two-arrays/description/
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer>ansSet=new HashSet<Integer>();
		
        for(int i=0;i<nums1.length;i++){
            ansSet.add(nums1[i]);
        }
        for(int j=0; j<nums2.length;j++){
            if(!ansSet.contains(nums2[j])){
                ansSet.remove(nums2[j]);
            }else {
            	continue;
            }
        }
        int[] intArray = new int[ansSet.size()];
        int i=0;
        for(int n:ansSet){
            intArray[i++]=n;
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

	public static void main(String[] args) {
		int arr[] = {1,2,2,1};
		int ar[]= {2,2};
		intersection(arr, ar);

	}

}
