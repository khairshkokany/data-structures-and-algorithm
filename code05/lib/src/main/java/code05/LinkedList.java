package code05;

import java.io.IOException;

public class LinkedList {

    private LinkedListNode head;
//    private int size;

    public LinkedList() {
    }

    public void add(String data) {

        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;

        } else {
            LinkedListNode current;
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            LinkedListNode node = new LinkedListNode(data);
            current.setNext(node);
        }
    }

    public Boolean included(String data) throws IOException {
        LinkedListNode current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            } else {

                current = current.getNext();
            }

        }
        return false;
    }


public void printList(){
        if (head == null){
            System.out.print("list is []");
        }else {
            LinkedListNode current;
            current = head;
            System.out.print("Head -> "+  head + "->" );
            while (current != null){
                current = current.getNext();
                System.out.print(current + " -> ");
            }

        }
}

    public boolean someLibraryMethod() {
        return true;
    }
}