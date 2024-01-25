package List;

import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Node;

public class basicTraverse {
//	head: 1 -> 2 -> 3 -> 4 -> 5:null
	public static void traverseAndPrint(ListNode head){
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp+" ");
			temp = temp.next;
		}
	}
	
// Amazon - find the length of linkedlist (using node)
// Adobe - find the key in the linkedlist (using node)
// Microsoft - print the kth node from the linkedlist
// Amazon, microsoft, adobe, flipkart, paypal - find the kth node from the end
	
	public static boolean findKey(ListNode head, int key) {
		ListNode temp=head;
		while(temp.next!=null) {
			if(temp.data==key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static int printKthNode(Node head, int k) {
		Node temp = head;
		int count=0;
		while(temp.next!=null) {
			count++;
			if(count==k) {
				System.out.println(temp.data);
				return temp.data;
			}
			temp=temp.next();
		}
		return 0;
	}
	
	public static int findKthNodeFromTheEnd(Node head, int k) {
				//		int len=0;
				//		int count=0;
				//		Node temp = head;
				//		while(temp.next!=null) { // O(N)
				//			len++;
				//			temp=temp.next();
				//		}
				//		while(temp.next!=null) { // O(N)
				//			count++;
				//			if(len-count+1==k) {
				//				return temp.data;
				//			}
				//			temp=temp.next();
				//		}
				////		TOTAL TC: O(N) + O(N) = O(2*N)
//		OPTIMIZED APPROACH - using two nodes in O(N)
		Node slow=head;
		Node fast=head;
		while(k!=0) { // O(K)
			fast=fast.next();
			k--;
		}
		while(fast!=null) {// O(N-k)
			slow=slow.next();
			fast=fast.next();
		}
		return slow.data;
//		TC : O(K)+O(N-K) = O(N)
	}

	public static void main(String[] args) {
		traverseAndPrint();

	}

}
