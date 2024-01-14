package Arrays.SlidingWindows;

public class leetcode1004 {
	
	public static int longestOnes(int nums[], int k) {
		int i=0, j=0;
		while(j<=nums.length-1){
            if(nums[j]==0){
                k--;
            }if(k<0) {
            	if(nums[i]==0){
                    k++;
                }
                i++;
            }
                j++;
        }
		System.out.println(j-i);
		return j-i;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,1,1,0,0,0,1,1,1,1,0};
		longestOnes(arr, 2);

	}

}
