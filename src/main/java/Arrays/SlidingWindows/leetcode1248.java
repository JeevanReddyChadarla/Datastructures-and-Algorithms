package Arrays.SlidingWindows;

import java.util.HashMap;

public class leetcode1248 {

	public static int num(int nums[], int k) {
		int i=0, j=0, end=nums.length-1, ans=0, count=0;
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		while(j<=end) {//1 1 2 1 1
			map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
			if(nums[j]%2==1) {
				count++;
			}
			if(count==k) {
				ans++;
				map.put(nums[i], map.getOrDefault(nums[i], 0)-1);
				if(nums[i]%2==1) {
					count--;
				}
				if(map.get(nums[i])<=0) {
					map.remove(nums[i]);
				}
				i++;
			}
			j++;
		}
		System.out.println(ans);
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {2,2,2,1,2,2,1,2,2,2};
		num(arr, 2);
	}

}
