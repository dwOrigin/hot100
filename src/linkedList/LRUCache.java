package linkedList;

import java.security.PublicKey;
import java.util.HashMap;

public class LRUCache {
    public class DNodes{
        int key;
        int value;
        DNodes prev;
        DNodes next;
        public DNodes(int key,int value){
            this.key=key;
            this.value=value;
        }
        public DNodes(){}
    }
    int size;
    int capacity;
    HashMap<Integer,DNodes>map=new HashMap<>();
    DNodes head;
    DNodes tail;
    public LRUCache(int capacity){
        this.size=0;
        this.capacity=capacity;
        head=new DNodes();
        tail=new DNodes();
        head.next=tail;
        tail.prev=head;

    }
    public int get (int key){
        DNodes tem=map.get(key);
    if (tem==null)return -1;
    else {
        tem=moveToHead(tem);
        return tem.value;
    }

    }
    public void put(int key,int value){
      DNodes tem= map.get(key);
      if (tem!=null){
          tem.value=value;
          map.put(key,tem);
          moveToHead(tem);
      }else {
          tem=new DNodes(key,value);
          tem=moveToHead(tem);
          map.put(key,tem);
          size++;
          if (size>capacity){
              deleteTail();
          }
      }
    }
    public DNodes moveToHead(DNodes tem){
        //tem所在的位置
        tem.prev.next=tem.next;
        tem.next.prev=tem.prev;
        //移动到头节点处
        tem.next=head.next;
        head.next.prev=tem;
        head.next=tem;
        tem.prev=head;
        return tem;
    }
    public void deleteTail(){
        DNodes tem=tail.prev;
        tail.prev=tem.prev;
        tem.prev.next=tail;
        map.remove(tem.key);
        size--;
    }
}
