package Arrays;

public class romanToNumber13 {
	
//	public static int returnNumb(char c) {
//		int value=0;
//		switch (c) {
//		case 'I':
//			value=1;
//			break;
//		case 'V':
//			value=5;
//			break;
//		case 'X':
//			value=10;
//			break;
//		case 'L':
//			value=50;
//			break;
//		case 'C':
//			value=100;
//			break;
//		case 'D':
//			value=500;
//			break;
//		case 'M':
//			value=1000;
//			break;
//		default:
//			value=0;
//			break;
//		}
////		System.out.println(value);
//		return value;
//	}
	
	public static int romanToInt(String s) {
		String str="IVXLCDM"; // Optimized way, instead of using a switch case
		int strInt[] = {1,5,10,50,100,500,1000};
        char ch[] = s.toCharArray();
        int ans=strInt[str.indexOf(ch[0])];
        int start=1, end=ch.length-1;
        while(start<=end) {
        	int currentValue=strInt[str.indexOf(ch[start])];
        	int previousValue=strInt[str.indexOf(ch[start-1])];
        	if(currentValue>previousValue) {
        		ans+=currentValue-2*previousValue;
        	}else {
        		ans+=strInt[str.indexOf(ch[start])];
        	}
        	start++;
        }
        System.out.println(ans);
		return ans;
    }

	public static void main(String[] args) {
//		returnNumb('L');
		romanToInt("MCMXCIV");
	}

}
