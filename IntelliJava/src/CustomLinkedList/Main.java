package CustomLinkedList;

public class Main {
    public static void main(String[] args){
//        LL newlist = new LL();
//        for (int i = 1; i <= 10; i++) {
//            newlist.insertLast(i);
//        }
//        newlist.display();
//        newlist.insertIndex(99, 1);
//        newlist.display();
//        newlist.deleteValue(5);
//        newlist.display();
//        newlist.deleteNode(newlist.getNode(2));
//        newlist.display();
//        newlist.deleteLast();
//        newlist.display();
//        System.out.println(newlist.size);
//        DLL doubleLL = new DLL();
//        doubleLL.insertFirst(50);
//        for (int i = 0; i < 20; i++) {
//            doubleLL.insertLast(i+1);
//        }
//        doubleLL.insertNode(2, 55);
//        doubleLL.display();
//        doubleLL.deleteIndex(1);
//        doubleLL.display();
//        doubleLL.displayReverse();

//        CLL cll = new CLL();
//        for(int i=0;  i<20; i++){
//            cll.insertLast(i+1);
//        }
//        cll.display();
//        cll.delete(12);
//        cll.display();
        LL list = new LL();
        list.insertFirst(20);
        for (int i = 0; i < 10; i++) {
            list.insertFirst(i+1);
        }
        list.insertRec(0, 60);
        list.display();
    }
}
