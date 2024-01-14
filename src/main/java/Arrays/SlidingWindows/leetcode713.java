package Arrays.SlidingWindows;

public class leetcode713 {
	
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int start=0, end=nums.length-1, count=-1;
        int i=0,j=0,prod=1;
//        while(start<=end){
//            if(nums[start]<k){
//                count++;
//            }
//            start++;
//        }
        while(j<=end && i<=end){
        	count=nums[j]<k?count+1:count;
            prod*=nums[j];
            if(prod<k){
                count++;
            }else{
                prod=prod/nums[i];
            	i++;           
            }
            j++;
        }
        System.out.println(count);
        count=count==-1?0:count;
        return count;
    }

	public static void main(String[] args) {
		int arr[]= {10,5,2,6};
		numSubarrayProductLessThanK(arr, 100);

	}

}
