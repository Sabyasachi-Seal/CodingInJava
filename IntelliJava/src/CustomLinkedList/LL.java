package CustomLinkedList;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class LL {
    private Node head;
    private Node tail;
    protected int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        if(tail == null) tail = head;
        size++;
    }

    public void insertLast(int val){
        if(tail == null) insertFirst(val);
        else {
            Node newnode = new Node(val);
            tail.next = newnode;
            tail = newnode;
            size++;
        }
    }

    public void insertIndex(int val, int index){
        if(index > size) {
            System.out.println("Enter valid Index");
            return;
        }
        Node temp = head;
        while(index > 0){
            temp =  temp.next;
            index--;
        }
        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    public void insertRec(int ind, int val){
        head = insertRec(ind, val, head);
    }

    private Node insertRec(int ind, int val, Node curr){
        if(ind == 0){
            Node newnode = new Node(val);
            newnode.next = curr;
            size++;
            return newnode;
        }
        curr.next = insertRec(ind-1, val, curr.next);
        return curr;
    }

    public void deleteValue(int val){
        Node temp = head;
        while(temp!=null && temp.next.val != val){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Cant find item " +val);
            return;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void deleteNode(Node ele){
        ele.val = ele.next.val;
        ele.next = ele.next.next;
        size--;
    }

    public void deleteLast(){
        Node prelast = getNode(size-2);
        prelast.next = null;
        size--;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public Node getNode(int ind){
        if(ind >= size){
            System.out.println("Underflow");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < ind; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // LL nodes;
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

}
