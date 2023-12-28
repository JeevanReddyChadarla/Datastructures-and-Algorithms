package Arrays;

public class firstMissingPositive41 {

		public static int integerReplacement(int n) {
	        int count=0;
	        
	        while(n>1){
	            if(n%2==1){
	            n=n+1;
	            count++;
	        }
	            n=n/2;
	            count++;
	        }
	        System.out.println(count);
	        return count;
	}
	public static void main(String[] args) {
		integerReplacement(11);
	}

}
