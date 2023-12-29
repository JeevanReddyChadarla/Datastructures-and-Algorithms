package Arrays;

import java.util.Arrays;

public class productOfArrayExceptItself238 {
//	Approach:
//	input arr[]= {1,2,3,4};
//	find preffix product = {1,2,6,24}
//	find suffix product = {24,24,12,4}
//	ans[i]=pref[i-1]*suff[i+1] ={24,12,8,6}
//	handle edge conditions at i=0 and i=end
	public static int[] returnProd(int arr[]) {
		int pref[]=new int[arr.length];
		int suff[]=new int[arr.length];
		int temp=1, tem=1;
		for(int i=0;i<arr.length;i++) {
			temp*=arr[i];
			pref[i]=temp;
		}
		for(int i=arr.length-1;i>=0;i--) {
			tem*=arr[i];
			suff[i]=tem;
		}
		System.out.println(Arrays.toString(suff));
		System.out.println(Arrays.toString(pref));
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				arr[i]=suff[1];
			}else if(i==arr.length-1) {
				arr[i]=pref[arr.length-2];
			}else {
				arr[i]=pref[i-1]*suff[i+1];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		System.out.println(Arrays.toString(returnProd(arr)));

	}

}
