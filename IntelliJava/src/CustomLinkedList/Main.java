package CustomLinkedList;

public class Main {
    public static void main(String[] args){
        LL newlist = new LL();
        for (int i = 1; i <= 10; i++) {
            newlist.insertLast(i);
        }
        newlist.display();
        newlist.insertIndex(99, 1);
        newlist.display();
        newlist.deleteValue(5);
        newlist.display();
        newlist.deleteNode(newlist.getNode(2));
//        newlist.deleteFirst();
        newlist.display();
        System.out.println(newlist.size);
    }
}
