package linkedList;

public class sortlist {
    public static ListNode sortListss(ListNode head){
        return merge(head);
    }
    public static ListNode merge(ListNode head){
        if (head==null||head.next==null)return head;

        ListNode prev=new ListNode();
        prev.next=head;
        ListNode slow=head;
        ListNode fast=head.next.next;

        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right= merge(slow);
        slow.next=null;//用于标记一段数据结束
        ListNode left= merge(head);

        return mergeSort(left,right);
    }
    public static ListNode mergeSort(ListNode left, ListNode right){
        ListNode prev=new ListNode(-1);
        ListNode begin=prev;
            while (left!=null&&right!=null){
                if (left.val<=right.val) {
                    begin.next = left;
                    left=left.next;
                }
                else {
                    begin.next=right;
                    right=right.next;
                }
                begin=begin.next;
            }
            if (left!=null)begin.next=left;
            if (right!=null)begin.next=right;

            return prev.next;
    }

    public static void main(String[] args) {
        int [] nums={4,3,1,2};
        ListNode prev= new ListNode(-1);
        ListNode begin=prev;
        for (int i= 0;i<nums.length;i++){
            prev.next=new ListNode(nums[i]);
            prev=prev.next;
        }
        sortListss(begin.next);
    }
}
