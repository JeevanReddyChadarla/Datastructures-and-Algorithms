package List;

import java.util.LinkedList;

public class leetcode876 {
	
	public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        LinkedList<Integer>list=new LinkedList<>();
        int leng=0, start=0,count=0;
        while(temp.next!=null){
            leng++;
            temp=temp.next;
        }
        start=leng%2==1?(leng+1)/2:(leng/2)+1;
        System.out.println(start);
        while(temp.next!=null){
            count++;
            if(start<=count){
                list.add(temp.val);
            }
            temp=temp.next;
        }
         System.out.println(list);
        return temp;
    }

	public static void main(String[] args) {
		ListNode head = [1,2,3,4,5];

	}

}
