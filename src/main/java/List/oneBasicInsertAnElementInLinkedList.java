package List;

import List.basicTraverse.Node;

public class oneBasicInsertAnElementInLinkedList {
	
	public static class Node {
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}

	public static Node insert(Node head, int val, int index) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			System.out.println(temp.data);
			count++;
			if(count==index) {
				temp.data=val;
				temp.next=head.next;
			}else {
			temp=temp.next;
			head=head.next;
			}
		}
		return temp;
	}
	public static Node printNode(Node head) {
		Node temp=head;
		if(head==null) {
			return null;
		}
		System.out.println(head.data);
		return printNode(head.next);
	}
	
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(30);
		Node c = new Node(5);
		Node d = new Node(42);
		Node e = new Node(95);
		Node f = new Node(34);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
//		System.out.println(a.next); // 5acf9800
//		System.out.println(b); // 5acf9800 Since b=a.next
//		System.out.println(c.next);
//		System.out.println(a.data);
		Node temp=a.next; // since dont know the head
		
//		while(temp!=null) {
//			System.out.println(temp.data);
//			temp=temp.next;
//		}
//		Node ans=insert(a,50,3);
//		while(ans!=null) {
//			System.out.println(ans.data);
//			ans=ans.next;
//		}
//		insert(temp,50,3);
		printNode(a);
	}

}
