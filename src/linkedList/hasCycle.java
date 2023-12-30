package linkedList;

public class hasCycle {
    public boolean hasCycles(ListNode head){
        if (head==null||head.next==null)return false;
        ListNode sec= head;
        ListNode first=head;
        while (sec!=null){
            sec=sec.next.next;
            first=first.next;
            if (first==sec)return true;
        }
        return false;
    }
}
