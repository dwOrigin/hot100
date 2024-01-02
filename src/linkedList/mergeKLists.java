package linkedList;

public class mergeKLists {
    public ListNode mergeklists(ListNode[] lists){
    return mergeK(lists,0, lists.length-1);
    }
    public ListNode mergeK(ListNode[]lists,int left,int right){
        if (left==right)return lists[left];
        if (left>right)return null;
        int middle=(left+right)/2;
        ListNode l=mergeK(lists,left,middle);
        ListNode r=mergeK(lists,middle+1,right);
        return mergeSort(l,r);
    }
    public ListNode mergeSort(ListNode list1,ListNode list2){
        ListNode prev= new ListNode(-1);
        ListNode begin= prev;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                begin.next=list1;
                list1=list1.next;
            }else {
                begin.next=list2;
                list2=list2.next;
            }
            begin=begin.next;
        }
        if (list1!=null)begin.next=list1;
        else begin.next=list2;
        return prev.next;
    }

}
