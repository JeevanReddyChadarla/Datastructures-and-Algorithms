package Arrays;

public class canPlaceFlower605 {

	public static int canPlaceFlowers(int[] flowerbed, int n) {
		int len=flowerbed.length,count=0, end=flowerbed.length-1;
        boolean ans=false;
        if(len==1 && flowerbed[len-1]==0){
            System.out.println("line 9");
            count++;
        }
        else{
        for(int i=0;i<len-1;i++){
            if(flowerbed[0]==0 && flowerbed[1]==0){
                flowerbed[0]=1;
                count++;
            }else if(flowerbed[end]==0 && flowerbed[end-1]==0) {
            	flowerbed[end]=1;
            	count++;
            }
            else if(flowerbed[i]==0 && flowerbed[i-1]+flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
        }
        }
        ans=count>=n?true:false;
        System.out.println(count);
        return count;
	}
	public static void main(String[] args) {
		int arr[]= {0,0};
		canPlaceFlowers(arr, 1);

	}

}
