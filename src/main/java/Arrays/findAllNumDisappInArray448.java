package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllNumDisappInArray448 {
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<Integer>();
        int arr[]=new int[n];
        Arrays.sort(nums);
        for(int i=1;i<n+1;i++){
            arr[i-1]=i;
        }
        for(int i=0;i<n;i++){
            if(!binarySearch(nums,i+1)){
                list.add(i+1);
            }
        }
        System.out.println(list);
        return list;
    }
    public static boolean binarySearch(int arr[],int k){
        int start=0, end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<k){
                start=mid+1;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
//		boolean b=binarySearch(5, 3);
//		System.out.println(b);
		int arr[]= {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(arr);
	}

}
