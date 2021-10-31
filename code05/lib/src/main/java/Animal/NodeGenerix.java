package Animal;

public class NodeGenerix <T> {

    private T data;
    private NodeGenerix <T> next;



    public NodeGenerix(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeGenerix<T> getNext() {
        return next;
    }

    public void setNext(NodeGenerix<T> next) {
        this.next = next;
    }
}
