package linkedList;

public class swapPairs {
    public static ListNode swapPairss(ListNode head){
       ListNode res=new ListNode(-1);
       res.next=head;
       ListNode begin=res;
       while (begin.next.next!=null&&begin.next!=null){
        ListNode node1=begin.next;
        ListNode node2=begin.next.next;
        begin.next=node2;
        node1.next=node2.next;
        node2.next=node1;
        begin=node1;
       }
    return res.next;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        ListNode res=new ListNode(-1);
        ListNode begin=res;
        for (int i=0;i<nums.length;i++){
            res.next=new ListNode(nums[i]);
            res=res.next;
        }
        swapPairss(begin.next);
    }
}
