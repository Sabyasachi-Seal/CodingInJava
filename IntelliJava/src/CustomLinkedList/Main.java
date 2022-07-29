package CustomLinkedList;

public class Main {
    public static void main(String[] args){
        LL newlist = new LL();
        for (int i = 0; i < 5; i++) {
            newlist.insertFirst(i);
        }
        newlist.display();
    }
}
