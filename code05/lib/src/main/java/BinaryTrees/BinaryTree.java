package BinaryTrees;

public class BinaryTree <T extends Comparable <T>> {

    public BinaryTreesNode<T> root;


    public void add(T data){
        if (isEmpty()){
            root = new BinaryTreesNode<>(data);
        }else {
                addPrivate(data,root);
        }
    }

    private void addPrivate(T data , BinaryTreesNode<T> root) {
        BinaryTreesNode<T> binaryTreesNode = new BinaryTreesNode<>(data);
        if (data.compareTo(root.value()) < 0) {
            if (root.getLeftNode() == null ) {
                root.setLeftNode(binaryTreesNode);
            }else {
                addPrivate(data , root.getLeftNode());
            }
        }else if (data.compareTo(root.value()) > 0 ) {
            if (root.getRightNode() == null) {
                root.setRightNode(binaryTreesNode);
            }else {
                addPrivate(data,root.getRightNode());
            }
        }
    }

    public boolean contains (T data) {

        return containsPrivate(data,root);
    }
    private boolean containsPrivate(T data , BinaryTreesNode<T> root) {
        if (root == null) {
                return false;
                                 }
    if (data.compareTo(root.value()) < 0){
        return containsPrivate(data,root.getLeftNode());
    }else if (data.compareTo(root.value()) > 0) {
        return containsPrivate(data,root.getRightNode());
    }else {

        return true;
    }

    }


    public int sumOdd(BinaryTreesNode<T> node)
    {
        int sum = 0;
        if(node != null)
        {
            if(((Integer) node.value() % 2) != 0)
                sum += (Integer) node.value();
            sum+=sumOdd(node.getLeftNode());
            sum+=sumOdd(node.getRightNode());
        }
        return sum;
    }





    public int maximumValue() {
        return maximumValue(root);
    }

    private int maximumValue(BinaryTreesNode node) {
        if (node.getRightNode() != null) {
            return maximumValue(node.getRightNode());
        }
        return (int) node.value();

    }




    public boolean isEmpty() {
        return root == null;
    }

}
