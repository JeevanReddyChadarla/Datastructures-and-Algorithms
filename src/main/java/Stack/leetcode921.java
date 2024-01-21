package Stack;

import java.util.HashSet;
import java.util.Stack;

public class leetcode921 {

	// OPTIMIZED APPROACH - TWO POINTERS
			// public static int correctParanthesis(String s){
			// 	int start=0, end=s.length()-1;
			// 	int openBrackets=0, closedBrackets=0;
			// 	while(start<=end){
			// 		if(s.charAt(start)=='('){
			// 			closedBrackets++;
			// 		}else if(closedBrackets>0){
			// 			closedBrackets--;
			// 		}else{
			// 			openBrackets++;
			// 		}
			// 		start++;
			// 	}
			// 	System.out.println(openBrackets+closedBrackets);
			// 	return openBrackets+closedBrackets;
			// }
	
	// STACK BASED SOLUTION
	public static int correctParanthesis(String s) {
		Stack<Character>stack = new Stack<>();
		int start=0, end=s.length()-1, count=0;
		if(s.length()<=1){
			return s.length();
		}
		while(start<=end){
			if(s.charAt(start)=='('){
				stack.push('(');
			}else if(s.charAt(start)==')'){
				if(!stack.isEmpty()){
					stack.pop();
				}else{
					count++;
				}
			}
			start++;
		}
		System.out.println(count+stack.size());
		return count + stack.size();
	}

	public static void main(String[] args) {
		String str="))()(" ;
		correctParanthesis(str);
	}

}
