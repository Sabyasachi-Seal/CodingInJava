package CustomLinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;
    public CLL(){
        this.size = 0;
    }
    public void insertLast(int val){
        if(head == null){
            Node newnode = new Node(val);
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        Node newnode = new Node(val);
        tail.next = newnode;
        tail = newnode;
        tail.next = head;
        size++;
    }

    public void delete(int val){
        if(head == null) return;
        Node temp = head;
        if(temp.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if(temp.next.val == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp != head);
    }
    public void display(){
        if(head == null) return;
        Node temp = head;
        System.out.print("Start -> ");
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println("Null");
    }
    private class Node{
        private int val;
        private Node next;
        public Node(){}
        public Node(int val){
            this.val = val;
        }
        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
