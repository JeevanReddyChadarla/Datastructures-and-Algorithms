package Arrays;

import java.util.Arrays;

public class checkArraySortedAndRotated1752 {
	
	public static int[] check(int[] nums) {
        int size=nums.length*2, j=0, count=0;
        boolean ans=false;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
        	j=j==nums.length?0:j;
        	arr[i]=nums[j];
            j++;
        }
        for(int i=0;i<size-1;i++) {
        	if(arr[i]>arr[i+1]) {
        		count++;
        	}
        }
        if(count<=2) {
        	ans=true;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
        return arr;
    }

	public static void main(String[] args) {
		int nums[]= {1,2,3};
		check(nums);

	}

}
