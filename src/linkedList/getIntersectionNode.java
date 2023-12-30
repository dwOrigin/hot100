package linkedList;

public class getIntersectionNode {
    public ListNode getInterSectionNode(ListNode headA,ListNode headB){
        //运用相关的循环模式，将一个链表的数据传递到另外一个数组中去，
        ListNode pa=headA;
        ListNode pb=headB;
        while (pa!=null||pb!=null){
            if (pa!=null)pa=pa.next;
            else pa=headB;
            if (pb!=null)pb=pb.next;
            else pb=headA;

        }
        return pa;
    }

    public static void main(String[] args) {

    }
}
