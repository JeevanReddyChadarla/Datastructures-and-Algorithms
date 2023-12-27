package Arrays.PrefixSum;

import java.util.Arrays;

public class maxScoreAfterSplittingAString {
	
	public static void maxScore(String s) {
        char ch[] = s.toCharArray();
        int suff[]=new int[ch.length];
        int start=0, end=ch.length-1, ans=Integer.MIN_VALUE, count=0, i=end, temp=0, j=0;
        
        while(i>=0){
            temp+=ch[i]-48;
            suff[i]=temp;
            i--;
        }
        while(start<end){
            count=ch[start]-48==0?count+1:count;// fishy
            ans=Math.max(ans, count+suff[start+1]);
            start++;
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(suff));
        System.out.println(ans);
	}

	public static void main(String[] args) {
		maxScore("011101");

	}

}
