package Map;

import java.util.Arrays;

public class singleNumberiii360 {
	public static int[] singlNumb(int nums[]) {
		int ans=0;
		int arr[]=new int[2];
		int start=1, end=nums.length-1, temp=nums[0],x=0;
		while(start<=end) {
			temp=temp^nums[start];
			ans=Math.max(ans, temp);
			if((temp==ans) && (start!=end)) {
				x=nums[start];
			}
			start++;
		}
		arr[0]=temp;
		arr[1]=temp-x;
		System.out.println(temp+"   "+x);
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,5};
//		singlNumb(arr);
		System.out.println(1^2^1^3^2^5);
	}

}
