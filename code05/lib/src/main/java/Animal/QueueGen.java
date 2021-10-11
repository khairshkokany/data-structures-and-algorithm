package Animal;

import code05.LinkedListNode;

public class QueueGen <T> {

        private NodeGenerix<T> front;
        private NodeGenerix<T> rear;

    public QueueGen() {
    }

    public void enqueue(T data) {

            if (isEmpty()) {
                NodeGenerix<T> nodeGenerix = new NodeGenerix<T>(data);
                front = nodeGenerix ;
                rear = nodeGenerix;

            } else {
                NodeGenerix<T> nodeGenerix = new NodeGenerix<T>(data);
                rear.setNext(nodeGenerix);
                rear = nodeGenerix;
            }
        }
    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("no one here ");
        } else {
            T data = front.getData();
            front = front.getNext();
            return data;
        }
    }

        public T peek(){
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
