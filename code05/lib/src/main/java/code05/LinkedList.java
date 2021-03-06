package code05;

import java.io.IOException;

public class LinkedList {

    private LinkedListNode head;
    private int length;
    private int size;

    public LinkedList()  {
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

    public void insert(String data) {


            if (head == null) {
                head = new LinkedListNode(data);

            } else {
                LinkedListNode newNode = new LinkedListNode(data);
                newNode.setNext(head);
                head = newNode;

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

    public void insertBefores(String reference, String data)
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
        for (int i = 0; i < lengthOfList - value; i++) {
            searchNode = searchNode.getNext();
        }
        System.out.println(value+"th node from the end is "+searchNode.getData());

        return searchNode;
    }

    public  String zipLists(LinkedList linkedList , LinkedList linkedList1){

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
        return mergedList.toString();
    }

    public LinkedList reverse(LinkedList linkedList)
    {

        LinkedListNode prev = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
        return linkedList;
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
    public String dataToString() {
        String linkedList = " Head -> ";
        LinkedListNode node = head;
        while (node != null) {
            linkedList += node.getData() + " ->  ";
            node = node.getNext();
        }


        return linkedList + "Null";


    }

    @Override
    public String toString() {
        return dataToString();
    }

    public boolean someLibraryMethod() {
        return true;
    }
}