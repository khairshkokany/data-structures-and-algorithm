package code05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello from package");


    LinkedList linkedList = new LinkedList();
    LinkedList linkedList1 = new LinkedList();
    LinkedList linkedList2 = new LinkedList();
    LinkedList linkedList3 = new LinkedList();

        linkedList.add("K");
        linkedList.add("H");
        linkedList.add("A");
        linkedList.add("I");
        linkedList.add("R");

        linkedList1.add("K");
        linkedList1.add("H");
        linkedList1.add("A");
        linkedList1.add("I");
        linkedList1.add("R");

        linkedList2.add("K");
        linkedList2.add("H");
        linkedList2.add("A");
        linkedList2.add("I");
        linkedList2.add("R");




        linkedList.insertBefore("H","Hello");
        linkedList.insertAfter("khair","A");
        linkedList.insertNthFromEnd(0);
        linkedList.printList();
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++ zip method ++++++++++++++++");
        System.out.println(linkedList3.zipLists(linkedList,linkedList1));
//        linkedList3.zipLists(linkedList,linkedList1);



//        System.out.println(linkedList.included("R"));

    }
}
