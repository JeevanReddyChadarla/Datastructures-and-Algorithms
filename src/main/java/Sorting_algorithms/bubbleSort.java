package Sorting_algorithms;

import java.util.Arrays;

public class bubbleSort {
	// bubble sort - if adjacent element is not in ascending order then swap
	// TC : O(N^2)
	public static int[] bubbSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static void main(String[] args) {
		int arr[]={5,1,4,2,8};
		bubbSort(arr);
	}

}
