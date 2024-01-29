package List;

public class twoReverseALinkedlist {
	
	public static class Node {
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}

	public static void reverseLinkedList(Node head) {
		Node temp=head;
		if(temp==null) {
			return ;
		}
		reverseLinkedList(temp.next);
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		Node a = new Node(20);
		Node b = new Node(40);
		Node c = new Node(10);
		Node d = new Node(90);
		
		a.next=b;
		b.next=c;
		c.next=d;
		reverseLinkedList(a);

	}

}
