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

    public void insertAfter(String newData, String currentData) {
        LinkedListNode newNode = new LinkedListNode(newData);

        LinkedListNode current = head;

        while (current != null) {
            if (current.getData().equals(currentData)) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                break;
            } else {
                current = current.getNext();
            }
        }
    }

    public void insertBefore(String reference, String data)
    {
        LinkedListNode current = head;
        LinkedListNode prev = current;

        while( current != null )
        {
            if( current.getData().equals(reference) )
            {
                LinkedListNode n = new LinkedListNode(data);
                n.setNext (current);
                prev.setNext(n);
                break;
            }
            prev = current;
            current = current.getNext();
        }
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