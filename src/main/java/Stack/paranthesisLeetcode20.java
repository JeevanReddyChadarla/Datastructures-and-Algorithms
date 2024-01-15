package Stack;

import java.util.HashSet;
import java.util.Stack;

public class paranthesisLeetcode20 {
	// Same kind of opening brackets and closing brackets
	// order of opening brackets = reverse order of closing brackets
//	e.g: {[()]} 
//	opening order - curly brackets, square brackets, round brackets
//	closing order (reverse order) - round brackets, square brackets, curly brackets
//	hence using stack
	
//	Approach :
//		when there is an open bracket, push repective closing bracket in stack 
	public static boolean checkParanthesis(String str) {
		if(str.length()==0) {
			return true;
		}
		if(str.length()%2==1) {
			return false;
		}
		int start=0, end=str.length()-1;
		HashSet<Character>set=new HashSet<Character>();
		set.add('{');
		set.add('(');
		set.add('[');
		Stack<Character>stack=new Stack<Character>();
		while(start<=end) {
			if(set.contains(str.charAt(start))) {
				if(str.charAt(start)=='{') {
					stack.push('}');
				}else if(str.charAt(start)=='(') {
					stack.push(')');
				}else {
					stack.push(']');
				}
			}else {
				if(stack.isEmpty() && start!=end) {
					return false;
				}
				else if(stack.pop()!=str.charAt(start)){
					return false;
				} 
			}
			start++;
		}
		return stack.size()==0;
	}
	
	public static void main(String[] args) {
		String s=")[";
		System.out.println(checkParanthesis(s));
	}

}
