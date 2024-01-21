package Amazon;

import java.util.Arrays;
import java.util.Stack;

// PROBLEM : https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
        
// EXAMPLE 1:
        // Input: 
        // N = 4, arr[] = [1 3 2 4]
        // Output:
        // 3 4 4 -1
        // Explanation:
        // In the array, the next larger element 
        // to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
        // since it doesn't exist, it is -1.
// EXAMPLE 2:
        // Input: 
        // N = 5, arr[] [6 8 0 1 3]
        // Output:
        // 8 -1 1 3 -1
        // Explanation:
        // In the array, the next larger element to 
        // 6 is 8, for 8 there is no larger elements 
        // hence it is -1, for 0 it is 1 , for 1 it 
        // is 3 and then for 3 there is no larger 
        // element on right and hence -1.
// Approach : 
//         iterate from right to left
//         while stack is not empty and stack top element is less than current value in array
//             stack remove the element
//         if stack is empty then no eleemnt right of it is the greater, so print -1
//         else assign the top element to array

//         push each element into the Stack

public class nextGreaterElement {

    public static int[] nextGreaterEle(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        System.out.println(Arrays.toString(nextGreaterEle(arr)));
    }
    
}
