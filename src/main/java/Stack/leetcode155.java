package Stack;

import java.util.Stack;

public class leetcode155 {
	
	public static Stack<Integer>stack=new Stack<>();
    public static int min=Integer.MAX_VALUE;
    public leetcode155() {
		// TODO Auto-generated constructor stub
	}
    
    public static void push(int val) {
        stack.push(val);
    }
    
    public static void pop() {
        stack.pop();
    }
    
    public static int top() {
        return stack.peek();
    }
    
    public static int getMin() {
        min=stack.peek();
        for(int i:stack){
            min=Math.min(min,i);
        }
        System.out.println(min);
        return min;
    }

	public static void main(String[] args) {
		leetcode155.push(-1);
//		leetcode155.push(-5);
//		leetcode155.pop();
		leetcode155.top();
		leetcode155.getMin();

	}

}
