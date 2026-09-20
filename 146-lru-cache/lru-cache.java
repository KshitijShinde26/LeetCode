class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> map;
    private Node head;
    private Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);

        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;

        return node.value;
    }
    
    public void put(int key, int value) {
         // If key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);
            node.value = value;

            // Remove from current position
            node.prev.next = node.next;
            node.next.prev = node.prev;

            // Move to front
            node.next = head.next;
            node.prev = head;

            head.next.prev = node;
            head.next = node;

            return;
        }

        // Create new node
        Node node = new Node(key, value);

        map.put(key, node);

        // Add to front
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;

        // If capacity exceeded
        if (map.size() > capacity) {

            // Least Recently Used node
            Node lru = tail.prev;

            // Remove from linked list
            lru.prev.next = tail;
            tail.prev = lru.prev;

            // Remove from HashMap
            map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */