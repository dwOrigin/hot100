package linkedList;

import java.util.Queue;
import java.util.Stack;

public class reverseList {
    public static ListNode reverseLists(ListNode head){
        ListNode reverse;
        Stack<ListNode>stack=new Stack<>();
        while (head!=null){
            reverse=head.next;
            head.next=null;
            stack.add(head);
            head=reverse;
        }
      reverse= new ListNode();
        ListNode RES=reverse;
        while (!stack.isEmpty()){
            reverse.next=stack.pop();
            reverse=reverse.next;
        }
        return RES.next;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6};
        ListNode a=new ListNode(nums[0]);
        ListNode t= a;
        for(int i=1;i<nums.length;i++){
            a.next=new ListNode(nums[i]);
            a=a.next;
        }
    }

}
