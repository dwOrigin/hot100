package linkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class copyRandomList {
    public Node copyRandomLists(Node head){
       Node res = new Node(-1);
       Node index=res;
        Map<Node,Node>map=new HashMap<>();
        while (head!=null){
            Node node= map.getOrDefault(head,new Node(head.val));
            map.put(head,node);
            if (head.random!=null){
                node.random=map.getOrDefault(head.random,new Node(head.random.val));
                map.put(head.random,node.random);
            }
            index.next=node;
            index=index.next;
            head=head.next;
        }
        return res.next;
    }

}
