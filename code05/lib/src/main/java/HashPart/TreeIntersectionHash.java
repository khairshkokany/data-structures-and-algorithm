//package HashPart;
//
//import BinaryTrees.BinaryTree;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class TreeIntersectionHash<K, T> {
//    HashTable<K, T> hashTable = new HashTable<>();
//    public void preOrder(Node root) {
//        if (root != null) {
//            hashTable.addHash((K) root.value, (T) root.value);
//        }
//        if (root.left != null) {
//            preOrder(root.left);
//        }
//        if (root.right != null) {
//            preOrder(root.right);
//        }
//    }
//
//    public List treeInsertion(Node Tree1, Node Tree2) {
//        List Temp = new ArrayList();
//        preOrder(Tree1.root);
//        traverse(Tree2.root, Temp);
//        return Temp;
//    }
//
//    public void traverse(Node root, List Temp) {
//        if (root != null) {
//            if (hashTable.contains((K) root.value)) {
//                Temp.add(root.value);
//            }
//            if (root.left != null) {
//                traverse(root.left, Temp);
//            }
//            if (root.right != null) {
//                traverse(root.right, Temp);
//            }
//        }
//    }
//}
//
