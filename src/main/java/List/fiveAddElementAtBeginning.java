package List;

import List.fourAddElementAtTheEndOfLL.Node;

public class fiveAddElementAtBeginning {
	
	public static class Node{
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}
	
	public static class AddAtBeginning{
		Node head=null;
		void addAtHead(int val, Node n) {
			Node temp=new Node(val);
			temp.next=n;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		void insertAtAnyIndex(int val, int index, Node head) {
			Node temp = head;
			Node insert = new Node(val);
			int count=0;
			while(temp!=null) {
				System.out.println(temp.data);
				if(count==index) {
					insert.next=temp.next;
					temp = insert;
				}else {
					temp=temp.next;
				}
				count++;
			}
		}
		void deleteAtIndex(int index, Node head) {
			Node temp=head;
			int count=0;
			while(temp!=null) {
				System.out.println(temp.data);
				if(count==index) {
					temp=temp.next;
				}
				temp=temp.next;
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		Node a = new Node(-8);
		Node b = new Node(1);
		Node c = new Node(4);
		Node d = new Node(3);
		Node e = new Node(7);
		Node f = null;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		AddAtBeginning add = new AddAtBeginning();
//		add.addAtHead(25, a); // 25 -8 1 4 3 7
		
//		add.insertAtAnyIndex(88, 4, a);
		add.deleteAtIndex(2, a);
	}

}
