package List;

public class fourAddElementAtTheEndOfLL {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public static class addElementToLinkedList{
		Node head=null;
		Node tail=null;
		void add(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
			}else {
				tail.next=temp;
			}
			tail=temp;
		}
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Node a = new Node(-8);
		Node b = new Node(1);
		Node c = new Node(4);
		Node d = new Node(3);
		Node e = new Node(7);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		addElementToLinkedList list = new addElementToLinkedList();
		list.add(-8);
		list.add(30);
		list.add(90);
		
		list.display();
		
	}

}
