package List;

public class leetcode876 {
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null) {
        	slow=slow.next;
        	fast=fast.next.next;
        }
        System.out.println(slow.val);
        return slow;
    }

	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode b = new ListNode(9);
		ListNode c = new ListNode(5);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(4);
		
		headA.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		middleNode(headA);

	}

}
