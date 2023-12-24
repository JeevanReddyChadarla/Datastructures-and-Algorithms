package Arrays;

import java.util.HashSet;

public class validParanthesis20 {
	
	public static boolean isValid(String s) {
		boolean b=false;
//		char x='(';char x1=')';char x2='{';char x3='}';char x4='[';char x5=']';
//		40,41,123,125,91,93
		
		String str="(){}[]";
		int strValues[] = {40,40,123,123,91,91};
		char ch[] = s.toCharArray();//{'(',')','[',']','{','}'}
		int start=0, end=ch.length-1, left=end/2, right=left+1;
		while(end%2==1 && left>=0 && right<=end) {
			if(strValues[str.indexOf(ch[left])]==strValues[str.indexOf(ch[right])]) {
				left--;
				right++;
				b=true;
			}else {
				b=false;
				break;
			}
			
		}
		System.out.println(b);
		return b;
    }

	public static void main(String[] args) {
		isValid("[]{}");

	}

}
