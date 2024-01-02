package linkedList;

public class reverseKgroup {
    public ListNode reverseKGroup(ListNode head,int k){
        int len=0;
        ListNode prev=new ListNode(-1);
        ListNode res=prev;
        prev.next=head;
        ListNode curr=prev.next;
        while (curr!=null){
            len++;
            curr=curr.next;
        }
        ListNode next;
        curr=prev.next;
        for (int i =0;i<len/k;i++){
            for (int j=0;j<k-1;j++){
                next=curr.next;
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
            }
            prev=curr;
            curr=curr.next;
        }
        return res.next;
    }

}
