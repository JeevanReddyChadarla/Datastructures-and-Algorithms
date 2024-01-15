package Arrays.SlidingWindows;

public class leetcode220 {
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int i=0,j=1,end=nums.length-1;
        while(j<=end){
            if(i!=j)
            {
                if(Math.abs(i-j)<=indexDiff){
                    if(Math.abs(nums[i]-nums[j])<=valueDiff){
                        return true;
                    }else{
                        j++;
                        if(j>end) {
                        	i++;
                        	j=i+1;
                        }
                    }
                }
                else{
                    i++;
                    j=i+1;
                } 
            }

        }
        System.out.println("hi");
        return false;
    }

	public static void main(String[] args) {
		int arr[]= {7,1,3};
		containsNearbyAlmostDuplicate(arr, 2, 3);

	}

}
