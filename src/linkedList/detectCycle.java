package linkedList;

import java.util.HashSet;

public class detectCycle {
    public ListNode detectCycles(ListNode head){
        HashSet<ListNode>hashSet=new HashSet<>();
        ListNode cyc=head;
        while (cyc!=null){
            if (hashSet.contains(cyc))return cyc;
            else hashSet.add(cyc);
            cyc=cyc.next;
        }
        return null;
    }
}
