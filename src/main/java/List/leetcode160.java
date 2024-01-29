package List;

public class leetcode160 {
	// Intersection of two linked list
	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
		 val = x;
		 next = null;
		}
	}
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0;
        int countB=0;
        
        ListNode tempB=headB;
        ListNode tempA=headA;

        while(tempA!=null){
            countA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            countB++;
            tempB=tempB.next;
        }
        int diff=countA-countB;
        tempA=headA;
        tempB=headB;
        if(countA<countB){
            diff=countB-countA;
            for(int i=0;i<diff;i++) {
            	tempB=tempB.next;
            }
        }else {
        	diff=countA-countB;
        	for(int i=0;i<diff;i++) {
        		tempA=tempA.next;
        	}
        }
        while(tempA!=tempB) {
        	tempA=tempA.next;
        	tempB=tempB.next;
        }
    return tempA;
    }

	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode b = new ListNode(9);
		ListNode c = new ListNode(1);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(4);
		
		ListNode headB = new ListNode(3);
//		ListNode f = new ListNode(6);
		
		headA.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		headB.next=d;
		d.next=b;
		ListNode ans = getIntersectionNode(headA, headB);
//		while(headA!=null) {
//			System.out.println(headA.val);
//			headA=headA.next;
//		}
//		System.out.println("HEAD B");
		while(ans!=null) {
			System.out.println(ans.val);
			ans=ans.next;
		}
		
	}

}
