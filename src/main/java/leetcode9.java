import java.util.Arrays;

public class leetcode9 {
	
	public static boolean isPalindrome(int x) {
        int leng=0;
        int temp=x;
        int k=0;
        if(x<0){
            return false;
        }
        while(temp>0){
            temp=temp/10;
            leng++;
        }
        int arr[]=new int[leng];
        while(x>0){
            arr[k]=x%10;
            x=x/10;
            k++;
        }
        int start=0, end=arr.length-1;
        System.out.println(Arrays.toString(arr));
        while(start<=end){
            if(arr[start]==arr[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		int x=121;
		isPalindrome(x);

	}

}
