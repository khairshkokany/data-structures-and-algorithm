import Queue.Queue;

public class App {
    public static void main(String[] args) {
        System.out.println("hello from package");


//    LinkedList linkedList = new LinkedList();
//    LinkedList linkedList1 = new LinkedList();
//    LinkedList linkedList2 = new LinkedList();
//    LinkedList linkedList3 = new LinkedList();
//
//        linkedList.add("K");
//        linkedList.add("H");
//        linkedList.add("A");
//        linkedList.add("I");
//        linkedList.add("R");
//
//        linkedList1.add("K");
//        linkedList1.add("H");
//        linkedList1.add("A");
//        linkedList1.add("I");
//        linkedList1.add("R");
//
//        linkedList2.add("K");
//        linkedList2.add("H");
//        linkedList2.add("A");
//        linkedList2.add("I");
//        linkedList2.add("R");
//


//
//        linkedList.insertBefore("H","Hello");
//        linkedList.insertAfter("khair","A");
//        linkedList.insertNthFromEnd(0);
//        linkedList.printList();
//        System.out.println();
//        System.out.println("+++++++++++++++++++++++++++++++++ zip method ++++++++++++++++");
//        System.out.println(linkedList3.zipLists(linkedList,linkedList1));
//        linkedList3.zipLists(linkedList,linkedList1);
//
//linkedList.reverse(linkedList);
//System.out.println(linkedList.included("R"));



        // ++++++++++++++++++++++QUEUE method +++++++++++++++++

        Queue queue = new Queue();
        queue.enqueue("K");
        queue.enqueue("h");
        queue.enqueue("A");
        queue.enqueue("i");
        queue.enqueue("R");

        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("the front is =>>>> " + queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



        // +++++++++++++++++++++++ Stack Method ++++++++++++++++++++++
Stacks stack = new Stacks();
        stack.push("K");
        stack.push("h");

        stack.push("A");
        stack.push("i");
        stack.push("R");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("the top is ==> " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
    }
