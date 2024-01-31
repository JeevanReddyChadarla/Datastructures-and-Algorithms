package List;

import List.leetcode92.ListNode;

public class IMP_reverseLinkedList {
	
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val = val;
		}
	}
	public static ListNode leet25(ListNode head, int k) {
		ListNode curr=head, next = null, prev=null;
		int count=0;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		return prev;
	}
	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		
		headA.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		ListNode ans = leet25(headA, 2);
		while(ans!=null) {
			System.out.println(ans.val);
			ans=ans.next;
		}
		
	}

}
