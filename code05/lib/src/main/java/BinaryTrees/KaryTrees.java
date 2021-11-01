//package BinaryTrees;
//
//import java.util.LinkedList;
//import Queue.Queue;
//
//
//
//public class KaryTrees<T> {
//
//    public Knode<T> root;
//    public int K;
//
//
//    public KaryTrees(int maxChildrenNum) {
//        if(maxChildrenNum <= 1){
//            maxChildrenNum = 2;
//        }
//        this.K = maxChildrenNum;
//    }
//
//
//
//    public void add(T value){
//        Knode<T> newNode = new Knode<>(value);
//        if(this.root == null){
//            this.root = newNode;
//            return;
//        }
//
//        Queue<Knode<T>> queueNodes = new LinkedList<>();
//        queueNodes.add(root);
//        while(!queueNodes.isEmpty()){
//            Knode<T> current = queueNodes.poll();
//            if(current.allChildren.size() < this.K){
//                current.addChild(newNode);
//                return;
//            }
//            else {
//                queueNodes.addAll(current.allChildren);
//            }
//        }
//    }
//    public static KaryTrees<String> fizzBuzzTree(KaryTrees<Integer> tree){
//        KaryTrees<String> newTree = new KaryTrees<>(tree.K);
//        Queue<Knode<Integer>> newQueue = new LinkedList<>();
//        if(tree.root != null){
//            newQueue.add(tree.root);
//            while(!newQueue.isEmpty()){
//                Knode<Integer> current = newQueue.poll();
//                String currentValue;
//                if(((Knode<Integer>) current).value % 3 == 0 && current.value % 5 == 0)
//                    currentValue = "FizzBuzz";
//                else if((int)current.value % 3 == 0){
//                    currentValue="Fizz";
//                }
//                else if((int)current.value % 5 == 0){
//                    currentValue="Buzz";
//                }
//                else{
//                    currentValue=current.value.toString();
//                }
//                newTree.add(currentValue);
//                if(! current.allChildren.isEmpty()){
//                    newQueue.addAll(current.allChildren);
//                }
//            }
//        }
//        return newTree;
//    }
//
//
//}
