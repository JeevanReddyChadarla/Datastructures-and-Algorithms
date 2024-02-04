package Sorting_algorithms;

import java.util.Arrays;

public class selectionSort {
    
    // Selection sort - find the least number and send to beginning
	// Approach -  
	// 1. iterate through the loop (j)
	// 2. find the smallest element in the array
	// 3. put in i-th position
    public static int[] selectionSrt(int arr[]){
    	int indexOfLowestELement=-1;
        for(int i=0;i<arr.length-1;i++){// arr.len-1 because not needed to compare the last element alone(nothing to compare) 
            for(int j=i+1;j<arr.length;j++){// iterate to find the lowest element in the array
            	indexOfLowestELement=i; 
                if(arr[indexOfLowestELement]>arr[j]){
                    indexOfLowestELement=j;// assign indexoflowestelement to the actual lowest element
                }
            // swapping the lowest element with i-th position
            int temp=arr[i];
            arr[i]=arr[indexOfLowestELement];
            arr[indexOfLowestELement]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {8,4,2,3,6,9,1,0,5,6,8};
        selectionSrt(arr);
    }
}
