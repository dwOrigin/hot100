package linkedList;

public class removeNthFromEnd {
    public static ListNode removenthfromend(ListNode head, int n){
        int len=0;
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode begin=res.next;
        while (begin!=null){
            len++;
            begin=begin.next;
        }
        begin=res;//这个地方不使用res.next。否则对于只有单值的数组来说，如果采用以head开头的话，会出现错误，头节点的目的也就没有意义了
        for (int i=0;i<len-n;i++)
           begin=begin.next;
        begin.next=begin.next.next;
        return res.next;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
        int n=2;
        ListNode a=new ListNode(nums[0]);
        ListNode aa=a;
        for (int i=1;i<nums.length;i++){
            aa.next=new ListNode(nums[i]);
            aa=aa.next;
        }
        removenthfromend(a,n);
    }
}
