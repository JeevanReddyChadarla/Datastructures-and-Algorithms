package List;

public class leetcode92 {
	
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val = val;
		}
	}
	
	public static ListNode leet92(ListNode head, int left, int right) {
		ListNode r=head;
		ListNode l=head;
		while(r.next!=null) {
			right--;
			if(right==1) {
				break;
			}
			r=r.next;	
		}
		while(l.next!=null) {
			left--;
			if(left==1) {
				break;
			}
			l=l.next;
		}
		ListNode templ = l.next;
		l.next=r.next;
		
		r.next=templ;
		
//		System.out.println(r.val);
//		System.out.println(l.val);
		return l;
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
		ListNode ans = leet92(headA, 2, 4);
		while(ans!=null) {
			System.out.println(ans.val);
			ans=ans.next;
		}
	}
}
