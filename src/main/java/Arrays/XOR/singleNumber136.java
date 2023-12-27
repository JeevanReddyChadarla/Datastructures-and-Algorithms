package Arrays.XOR;

import java.util.HashSet;

public class singleNumber136 {

//	public static int singleNumber(int[] nums) {
//	HashSet<Integer>set=new HashSet<Integer>();
//    int start=0, end=nums.length-1;
//    while(start<=end){
//        if(set.contains(nums[start])){
//            set.remove(nums[start]);
//        }
//        set.add(nums[start]);
//        start++;
//    }
//    return set.iterator().next();
//}
	// MOST OPTMISED SOLUTION
	public static int singleNumber(int nums[]) {
		int ans=nums[0], temp=0;
		for(int i=1;i<nums.length;i++) {
			temp=nums[i];
			ans=ans^temp;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,1,4,2};
		singleNumber(arr);

	}

}
