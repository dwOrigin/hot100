package linkedList;

public class isPalindrome {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next = new ListNode();
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public boolean isPalindromes(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next.next!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode sec=reverse(slow.next);
        ListNode first=head;
        while (sec!=null){
            if (first.val!=sec.val)return false;
            first=first.next;
            sec=sec.next;
        }
        return true;
    }
}
