class Node{
    int key,value;
    Node next;
    Node prev;
    Node (int key,int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }

}

class LRUCache {
    Node head= new Node(-1,-1);
    Node tail= new Node(-1,-1);
    Map<Integer, Node> map=new HashMap<>();
    int limit;
    public LRUCache(int capacity) {
        limit =capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        else{
            Node updateNode=map.get(key);
            int newvalue= updateNode.value;
            deleteNode(updateNode);
            addNode(updateNode);
            
            return newvalue;
        }
    }
    
    public void addNode(Node newNode){
        Node oldhead=head.next;
        head.next=newNode;
        newNode.next=oldhead;
        newNode.prev=head;
        oldhead.prev=newNode;
    }

    public void deleteNode(Node oldNode){
        oldNode.prev.next=oldNode.next;
        oldNode.next.prev=oldNode.prev;
    } 

    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            Node oldNode=map.get(key);
            deleteNode(oldNode);
        }
        else if(map.size()>=limit){
            int tempkey=tail.prev.key;
            deleteNode(tail.prev);
            map.remove(tempkey);
        }

        Node newNode= new Node(key, value);
        addNode(newNode);
        map.put(key, newNode);
        
    }
}
