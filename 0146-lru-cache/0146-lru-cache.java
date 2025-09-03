class Node
{
    int k, v;
    Node next,prev;
    Node(int a,int b)
    {
        k=a;
        v=b;
        prev=next=null;
    }
}
class LRUCache {
    Node head,tail;
    HashMap<Integer,Node> hm;
    int mc;
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        head=new Node(-1,-1);tail=new Node(-1,-1);
        mc=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key))
        {
            Node tmp=hm.get(key);
            remove(tmp);
            insert(tmp);
            return tmp.v;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key))
        remove(hm.get(key));
        if(hm.size()>=mc)
        remove(tail.prev);
        insert(new Node(key,value));
    }
    public void insert(Node node)
    {
        hm.put(node.k,node);
        Node temp=head.next;
        head.next=node;
        node.next=temp;
        temp.prev=node;
        node.prev=head;
    }
    public void remove(Node node)
    {
        hm.remove(node.k);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */