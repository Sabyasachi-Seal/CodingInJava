package CustomLinkedList;

import java.sql.SQLOutput;

public class DLL {
    private int size;
    private Node head;
    public  DLL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node newnode = new Node();
        newnode.val = val;
        newnode.next = head;
        newnode.prev = null;
        head = newnode;
        size++;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newnode = new Node();
        newnode.val = val;
        newnode.next = null;
        newnode.prev = temp;
        temp.next = newnode;
    }

    public int size(){
        return size;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    private class Node{
        int val;
        Node prev;
        Node next;
        public Node(){
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
