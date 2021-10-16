package BinaryTrees;

public class BinaryTreesNode <T> {

    private T data;
    private BinaryTreesNode<T> leftNode;
    private BinaryTreesNode<T> rightNode;

    public BinaryTreesNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreesNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreesNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreesNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreesNode<T> rightNode) {
        this.rightNode = rightNode;
    }


}
