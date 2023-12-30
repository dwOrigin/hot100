package linkedList;

import java.util.Queue;
import java.util.Stack;

public class reverseList {
    public static ListNode reverseLists(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next= new ListNode();
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6};
        ListNode a=new ListNode(nums[0]);
        ListNode t= a;
        for(int i=1;i<nums.length;i++){
            a.next=new ListNode(nums[i]);
            a=a.next;
        }
        ListNode res=reverseLists(t);
        System.out.println(res.val);
    }

}
