package Sorting_algorithms;

import java.util.Arrays;

public class leetcode75 {
	
//	public static int[] sortColors(int arr[]) {
//		int zerocount=0, onecount=0, twocount=0;
//		int len=arr.length;
//		for(int i=0;i<len;i++) {
//			if(arr[i]==0) {
//				zerocount++;
//			}else if(arr[i]==1) {
//				onecount++;
//			}else {
//				twocount++;
//			}
//		}
//		int j=0;
//		for(j=0;j<zerocount;j++) {
//			arr[j]=0;
//		}
//		for(j=zerocount;j<zerocount+onecount;j++) {
//			arr[j]=1;
//		}
//		for(j=zerocount+onecount;j<len;j++) {
//			arr[j]=2;
//		}
//		System.out.println(Arrays.toString(arr));
//		return arr;
//	}
//	
	//Optimized approach - DUTCH NATIONAL FLAG ALGORITHM
	// if found zero -> move it to left end
	// if found two -> move it to right end
	// this makes one to stay in middle
	public static int[] optimizedSortColor(int arr[]) {
		int start=0,i=0;
		int end=arr.length-1;
		while(i<=end) {
			if(arr[i]==0) {
				int temp=arr[start];
				arr[start]=0;
				arr[i]=temp;
				i++;
				start++;
			}else if(arr[i]==2) {
				int temp=arr[end];
				arr[end]=2;
				arr[i]=temp;
				end--;
			}else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {2,2,1,0,1,0,2};
		optimizedSortColor(arr);
	}

}
