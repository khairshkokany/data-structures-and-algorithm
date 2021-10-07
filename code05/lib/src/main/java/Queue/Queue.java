package Queue;

import code05.LinkedListNode;

public class Queue {

    private LinkedListNode front;
    private LinkedListNode rear;

    public void enqueue(String data) {

        if (isEmpty()) {
            LinkedListNode linkedListNode = new LinkedListNode(data);
            front = linkedListNode;
            rear = linkedListNode;

        } else {
            LinkedListNode linkedListNode = new LinkedListNode(data);
            rear.setNext(linkedListNode);
            rear = linkedListNode;
        }
    }
    public String dequeue(){
if (isEmpty()) {
    return "Queue is Empty";

}else {
    String data = front.getData();
    front = front.getNext();
    return data;
}

    }

    public String peek(){
        return front.getData();
    }

    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
