package List;

public class leetcode141 {

	public static class Node{
		int val;
		Node next;
		Node(int x) {
		val = x;
		next = null;
	}
	}
	
	public static boolean isLinkedCycled(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Node headA = new Node(1);
		Node b = new Node(9);
		Node c = new Node(1);
		Node d = new Node(2);
		Node e = new Node(4);
		
		headA.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
//		e.next=c;
		System.out.println(isLinkedCycled(headA));
	}

}
