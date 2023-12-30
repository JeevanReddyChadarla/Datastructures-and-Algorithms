package Arrays;

import java.util.Arrays;

public class thirdMaxNum414 {
	
	public static int thirdMax(int arr[]) {
		int first=0, sec=0, thir=0;
		int start=0, end=arr.length-1;
		while(start<=end) {
			if(arr[start]>first) {
				thir=sec;
				sec=first;
				first=arr[start];
			}else if(arr[start]>sec && arr[start]<first) {
				thir=sec;
				sec=arr[start];
			}else if(arr[start]>thir && arr[start]<sec && arr[start]<first) {
				thir=arr[start];
			}
			
			start++;
		}
		System.out.println(first+" "+sec+" "+thir);
		return thir;
	}

	public static void main(String[] args) {
		int arr[]= {2,2,3,1};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		thirdMax(arr);

	}

}
