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
        size++;
    }
    public void deleteFirst(){
        if(head == null) return;
        head = head.next;
        head.prev = null;
        size --;
    }
    public void deleteIndex(int ind){
        if(ind == 0){
            deleteFirst();
            return;
        }
        if(ind == size){
            deleteLast();
            return;
        }
        Node currnode = getNode(ind-1);
        currnode.next = currnode.next.next;
        currnode.next.prev = currnode;
    }
    public void deleteLast(){
        if(head == null) return;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        size--;
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

    public void displayReverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.val + " <- ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }

    public void insertNode(int index, int val){
        if(index == 0){
            insertFirst(val);
        }
        else if(index<0 || index>size-1){
            System.out.println("Invalid Index");
        }
        else{
            Node currnode = getNode(index-1);
            Node newnode = new Node();
            newnode.val = val;
            newnode.next = currnode.next;
            newnode.prev = currnode;
            currnode.next = newnode;
            if(newnode.next != null) newnode.next.prev = newnode;
            size++;
        }
    }

    public Node getNode(int ind){
        if(ind<0 || ind>size-1){
            System.out.println("Invalid Index");
            return null;
        }
        else{
            Node temp = head;
            while(ind > 0){
                temp = temp.next;
                ind--;
            }
            return temp;
        }
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
