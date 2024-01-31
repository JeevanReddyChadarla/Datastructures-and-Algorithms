package List;

import java.util.Stack;

public class leetcode206 {
	
	public static class Node{
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}
	
	public static Node returnReverseList(Node head) {
		Node temp=head;
		Stack<Node>stack=new Stack<Node>();
		while(temp!=null) {
			stack.push(temp);
			temp=temp.next;
		}
		Node ans=stack.pop();
		System.out.println(ans.data);
		while(!stack.isEmpty()) {
			ans.next=ans;
			ans=stack.pop();
			System.out.println(ans.data);
		}
		return ans;
	}

	public static void main(String[] args) {
		Node headA = new Node(1);
		Node b = new Node(9);
		Node c = new Node(5);
		Node d = new Node(2);
		Node e = new Node(4);
		
		headA.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		returnReverseList(headA);
	}
}
