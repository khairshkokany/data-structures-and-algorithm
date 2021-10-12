package Stack;

import Animal.NodeGenerix;
import code05.LinkedListNode;

public class StackGen<T> {
    private NodeGenerix <T>  top;




    public void push(T data) {
        if (isEmpty()){
            NodeGenerix <T> nodeGenerix = new NodeGenerix<T>(data);
            top = nodeGenerix;
        }else {
            NodeGenerix <T> nodeGenerix = new NodeGenerix<T>(data);
            nodeGenerix.setNext(top);
            top = nodeGenerix;

        }
    }
    public T pop() throws Exception {
        if (isEmpty()){
            throw new Exception("no one is here thank you ..! ") ;

        }else {
            T data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public T peek() throws Exception {
        if (isEmpty()){
         throw new Exception("no one is here ..!! ");
        }else {
            return top.getData();

        }    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
