package linkedList;

public class addTwoNumbers {
    public ListNode addtwonumber(ListNode l1,ListNode l2){
        int flag=0;
        ListNode res = new ListNode(-1);
        ListNode begin= res;
        int num;
        while (l1!=null&&l2!=null){
            num=l1.val+l2.val+flag;
            if (num>=10)flag=1;
            else flag=0;
            begin.val=(num%10);
            l1=l1.next;
            l2=l2.next;
            begin=begin.next;
            if (l1==null||l2==null)break;
        }
        while (l1!=null){
            num=l1.val+flag;
            if (num>=10)flag=1;
            else flag=0;
            begin.val=(num%10);
            l1=l1.next;
            begin=begin.next;
        }
        while (l2!=null){
            num=l2.val+flag;
            if (num>=10)flag=1;
            else flag=0;
            begin.val=(num%10);
            l2=l2.next;
            begin=begin.next;
        }
        if (flag==1){
            begin.next=new ListNode(1);
        }
        return res.next;
    }


}
