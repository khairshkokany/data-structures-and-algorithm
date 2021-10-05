package code05;

import java.io.IOException;

public class LinkedList {

    private LinkedListNode head;
    private int length;
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
    public LinkedListNode insertNthFromEnd(int value)
    {
        int lengthOfList = 0;
        LinkedListNode searchNode = head;
        while (searchNode.getNext() != null)
        {
            searchNode = searchNode.getNext();
            lengthOfList++;
        }
        if (lengthOfList < value) {
            System.out.println("list is empty");;
        }
        searchNode = head;
        for (int i = 1; i < lengthOfList - value + 1; i++) {
            searchNode = searchNode.getNext();
        }
        System.out.println(value+"th node from the end is "+searchNode.getData());

        return searchNode;
    }

    public  LinkedList zipLists(LinkedList linkedList , LinkedList linkedList1){

        LinkedListNode list1Node = linkedList.head;
        LinkedListNode list2Node = linkedList1.head;
        System.out.println(list2Node);
        LinkedList mergedList = new LinkedList();
        int lenthSizeBig = linkedList.length + linkedList1.length;

        while (lenthSizeBig > 0) {
            if (list1Node != null){
                mergedList.add(list1Node.getData());
                list1Node = list1Node.getNext();
            }
            if (list2Node != null){
                mergedList.add(list2Node.getData());
                list2Node = list2Node.getNext();
            }
            lenthSizeBig--;
        }
        return mergedList;
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

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    public boolean someLibraryMethod() {
        return true;
    }
}