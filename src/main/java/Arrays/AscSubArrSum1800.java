package Arrays;

public class AscSubArrSum1800 {
    public static int maxAscendingSum(int[] nums) {
        int start=0, end=nums.length-1, sum=nums[0], ans=0;
        while(start<end){
            if(nums[start]>nums[start+1]){
                sum=nums[start+1];
            }
            else{
                sum+=nums[start+1];
            }
            ans=Math.max(sum,ans);
            start++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,5,10,50}; 
        int pre[]={10,30,60,65,75,125};
        int suf[]={125,115,95,65,60,50};
        maxAscendingSum(arr);
    }
}
