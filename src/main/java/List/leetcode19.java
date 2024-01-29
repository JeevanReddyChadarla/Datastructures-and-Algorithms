package List;

public class leetcode19 {
	
	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) 
		 { 
			 this.val = val; 
		 }
		 ListNode(int val, ListNode next) 
		 { 
			 this.val = val; 
			 this.next = next; 
		 }
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=head;
        int count = 0;
        while(count<n){
            count++;
            fast=fast.next;
        }
        while(fast!=null){
        	temp=temp.next;
            slow=slow.next;
            fast=fast.next;
        }
            temp.val=slow.next.val;
            temp.next=slow.next.next;
            temp=head;
        while(temp!=null) {
        	System.out.println(temp.val);
        	temp=temp.next;
        }
    return slow;
    }
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(5);
		
		head.next=a;
		a.next=b;
		b.next=c;
		c.next=d;
		
		removeNthFromEnd(head, 2);
		
	}

}
