package Arrays.SlidingWindows;

public class leetcode713 {
	
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k<=1){
            return 0;
        }
        int end=nums.length-1, count=0, i=0,j=0,prod=1;
        while(j<=end){
        	prod*=nums[j];
        	while(prod>=k) {
        		prod=prod/nums[i];
        		i++;
        	}
        	count+=1+j-i;
        	j++;
        }
        System.out.println(count);
        return count;
	}

	public static void main(String[] args) {
		int arr[]= {10,5,2,6};
		numSubarrayProductLessThanK(arr, 100);

	}

}
