

import code05.LinkedListNode;

public class Stacks {
    private LinkedListNode top;

    public Stacks(){

    }


    public void push(String data) {
        if (isEmpty()){
            LinkedListNode listNode = new LinkedListNode(data);
            top = listNode;
        }else {
            LinkedListNode listNode = new LinkedListNode(data);
            listNode.setNext(top);
            top = listNode;

        }
    }
    public String pop(){
        if (isEmpty()){
            return "no one is here thank you ..! ";

        }else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public String peek(){
        if (isEmpty()){
            return "no one is here ..!! ";
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
