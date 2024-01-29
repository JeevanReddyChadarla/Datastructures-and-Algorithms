package List;

public class threeLengthOfLL {
	
	public static class Node {
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}
	
	// Find the length of the linked list - 1. iteration 2. recursion

	// 1. Iteration method
//	public static int len(Node head) {
//		int length=0;
//		Node temp=head;
//		while(temp!=null) {
//			length++;
//			temp=temp.next;
//		}
//		System.out.println(length);
//		return length;
//	}
	
	// 2. Recursion
	public static int leng=0;
	public static Node recLen(Node head) {
		Node temp=head;
		if(temp==null) {
			return null;
		}
		leng++;
		return recLen(temp.next);
		
	}
	public static void main(String[] args) {
		Node a = new Node(50);
		Node b = new Node(12);
		Node c = new Node(86);
		Node d = new Node(65);
		Node e = new Node(94);
		Node f = new Node(73);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
//		len(a);
		recLen(a);
		System.out.println(leng);
		
	}

}
