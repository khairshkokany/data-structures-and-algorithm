package code05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello from package");


    LinkedList linkedList = new LinkedList();
        linkedList.add("K");
        linkedList.add("H");
        linkedList.add("A");
        linkedList.add("I");
        linkedList.add("R");


        linkedList.insertBefore("H","Hello");
        linkedList.insertAfter("khair","A");




//        System.out.println(linkedList.included("R"));
        linkedList.printList();

    }
}
