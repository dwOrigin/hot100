package linkedList;

public class mergeTwoList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if (list1==null)return list2;
        if (list2==null)return list1;
        ListNode begin=new ListNode(-1);
        ListNode res=begin;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                res.next=list1;
                list1=list1.next;
            } else {
                res.next=list2;
                list2=list2.next;
            }
            res=res.next;
        }
       if (list1!=null) {
           res.next = list1;
       }
       else{
            res.next=list2;
        }
        return begin.next;
    }

    public static void main(String[] args) {
        int[]num1={1,2,4};
        int[]nums2={1,3,4};
        ListNode list1=new ListNode();
        ListNode L1=new ListNode();
        for (int i=0;i<num1.length;i++){
            list1.val=num1[i];
            if (i==0)L1=list1;
            list1.next=new ListNode();
            list1=list1.next;
        }
        ListNode list2=new ListNode();
        ListNode L2=new ListNode();
        for (int i=0;i<nums2.length;i++){
            list2.val=nums2[i];
            if (i==0)L2=list2;
            list2.next=new ListNode();
            list2=list2.next;

        }
        mergeTwoLists(L1,L2);
    }
}
