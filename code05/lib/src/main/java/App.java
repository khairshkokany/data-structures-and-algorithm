//import Animal.Animal;
import BinaryTrees.*;
import HashPart.HashTable;
import HashPart.Hashmap;
import HashPart.Node;

import HashPart.TreeIntersectionHash;
import InsertionSort.QuickSort;
import code05.LinkedList;

//import Queue.PsudoCode;
//import Animal.Dog;
//import Animal.Cat;
//import Animal.AnimalQueue;
//import Stack.StackBrackets;
//import Stack.StackGen;
//import Stack.StackMax;
//import org.checkerframework.checker.units.qual.C;

import java.util.Arrays;
import java.util.Queue;


public class App {
    public static void main(String[] args) throws Exception
    {
//        System.out.println("hello from package");
//        LinkedList linkedList1 = new LinkedList();
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
//
//        System.out.println(linkedList1);
//        System.out.println();
//        System.out.println();

//
//        linkedList2.add("K");
//        linkedList2.add("H");
//        linkedList2.add("A");
//        linkedList2.add("I");
//        linkedList2.add("R");
//


//
//        linkedList1.insertBefores("H","Hello");
//        System.out.println("hello from khair ");
//        linkedList1.insertAfter("khair","A");
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

//        Queue queue = new Queue();
//        queue.enqueue("K");
//        queue.enqueue("h");
//        queue.enqueue("A");
//        queue.enqueue("i");
//        queue.enqueue("R");
//
//        System.out.println(queue);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println("the front is =>>>> " + queue.peek());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//
//
//        // +++++++++++++++++++++++ Stack Method ++++++++++++++++++++++
//Stack.Stacks stack = new Stack.Stacks();
//        stack.push("K");
//        stack.push("h");
//
//        stack.push("A");
//        stack.push("i");
//        stack.push("R");
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println("the top is ==> " + stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        PsudoCode psudoCode = new PsudoCode();
//
//        psudoCode.enqueue("KHAIR");
//        psudoCode.enqueue("EL-deen");
//        psudoCode.enqueue("Shkokany");
//
//        System.out.println(psudoCode.deQueue());
//        System.out.println(psudoCode.deQueue());
//        System.out.println(psudoCode.deQueue());

//   AnimalQueue animalQueue = new AnimalQueue();
//
//   animalQueue.enQueue(new Dog("dog"));
//   animalQueue.enQueue(new Cat("cat"));
//   animalQueue.enQueue(new Dog("DOG"));
//   animalQueue.enQueue(new Dog("DOG"));
//
//
//
//        System.out.println(animalQueue.dequeue("dog"));
//        System.out.println(animalQueue.dequeue("cat"));
//        System.out.println(animalQueue.dequeue("dog"));
//        System.out.println(animalQueue.dequeue("CAT"));
//        System.out.println(animalQueue.dequeue("dog"));

//        StackBrackets stackBrackets = new StackBrackets();
//
//
//        System.out.println(stackBrackets.bracketsMethod("[(hello)]"));


//      StackGen stackGen = new StackGen();
//      stackGen.push(5);
//      stackGen.push(10);
//      stackGen.push(12);
//      stackGen.push(13);
//      stackGen.push(14);
//      StackMax stackMax = new StackMax();
//      stackMax.getMax(stackGen);
//
//        BinaryTree<Integer> binaryTree = new BinaryTree<>();
////
//            binaryTree.add(50);
//            binaryTree.add(60);
//            binaryTree.add(70);
//            binaryTree.add(13);
//            binaryTree.add(17);
//            binaryTree.add(9);
//
//        System.out.println(binaryTree.sumOdd(binaryTree.root));
//        System.out.println(binaryTree.contains(60));
//        System.out.println(binaryTree.contains(70));
//        System.out.println(binaryTree.contains(80));
//        System.out.println(binaryTree.contains(20));
//        System.out.println(binaryTree.maximumValue());


//        TreeBreadthFirst treeBreadthFirst = new TreeBreadthFirst();
//        treeBreadthFirst.root = new BinaryTreesNode(2);
//
//        treeBreadthFirst.root.leftNode = new BinaryTreesNode(7);
//        treeBreadthFirst.root.rightNode = new BinaryTreesNode(5);
//        treeBreadthFirst.root.leftNode.rightNode = new BinaryTreesNode(6);
//        treeBreadthFirst.root.rightNode.rightNode = new BinaryTreesNode(9);
//        treeBreadthFirst.root.rightNode.rightNode.leftNode = new BinaryTreesNode(4);
//        treeBreadthFirst.root.leftNode.rightNode.rightNode = new BinaryTreesNode(11);
//        treeBreadthFirst.root.leftNode.rightNode.leftNode = new BinaryTreesNode(5);
//
//        System.out.println("Level order traversal of binary tree is ");
//       treeBreadthFirst.printLevelOrder();
//        System.out.println();
//        System.out.println(treeBreadthFirst.height(treeBreadthFirst.root));

//        KaryTrees<Integer> karyTree=new KaryTrees<>(3);
//        karyTree.add(5);
//        karyTree.add(12);
//        karyTree.add(10);
//        System.out.println(KaryTrees.fizzBuzzTree(karyTree).root.allChildren.get(0).value);

      //  MergeSort mergeSort = new MergeSort();
       // InsertionSort insertionSort = new InsertionSort();
//
//        QuickSort quickSort = new QuickSort();
//
//        int[] arr = {8 , 4 , 23 , 42 , 16 , 15 };
//
//         QuickSort.quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(QuickSort.quickSort(arr, 0, arr.length - 1)));
//        mergeSort.mergeSort(arr);

//        System.out.println(Arrays.toString(arr));
//
//        LinkedList linkedList = new LinkedList();
//        LinkedList linkedList1 = new LinkedList();
//        LinkedList linkedList2 = new LinkedList();
////
//        linkedList.add("k");
//        linkedList.add("h");
//        linkedList.add("a");
//        linkedList.add("i");
//        linkedList.add("r");
////
//        linkedList1.add("jamal");
//        linkedList1.add("eldeeen");
//        linkedList1.add("wari");
//        linkedList1.add("heba");
//        linkedList1.add("nawal");


//
////        System.out.println(linkedList);
//
//        linkedList.insertNthFromEnd(2);

//
//        System.out.println( (linkedList2.zipLists(linkedList1 , linkedList)));
//        System.out.println(linkedList2.dataToString());
//        System.out.println("we are here so you can go !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(linkedList1.reverse(linkedList1));
//        System.out.println(linkedList1);


//        HashTable<String, Integer> hashTable = new HashTable<>();
//        hashTable.addHash("KHAIR", 300);
//        hashTable.addHash("ELDEEN", 400);
//        hashTable.addHash("ZAKARIA", 200);
//        hashTable.addHash("SHKOKANY", 100);
//        hashTable.addHash("MY", 600);
//        hashTable.addHash("MAJOR", 700);
//        hashTable.addHash("IS", 90000);
//        hashTable.addHash("MECHANICAL", 800);
//        hashTable.addHash("ENGINEER", 1000);
//        hashTable.addHash("THANK", 1500);
//        hashTable.addHash("YOU", 10000);
//
//        System.out.println(hashTable);
//        System.out.println("The size is => " + hashTable.getSize());
//        System.out.println("The KHAIR allowance is => " + hashTable.getHash("KHAIR"));
//        System.out.println("FIND KHAIR => " + hashTable.contains("KHAIR"));
//        System.out.println(hashTable.getBucketIndex("KHAIR"));



//        LinkedList linkedList = new LinkedList();
//        LinkedList linkedList1 = new LinkedList();
//        LinkedList linkedList2 = new LinkedList();
//        linkedList.add("khair");
//        linkedList.add("eldeen");
//        linkedList.add("shkokany");
//        linkedList1.add("my");
//        linkedList1.add("age");
//        linkedList1.add("23");
//
//        System.out.println(linkedList2.zipLists(linkedList,linkedList1));

//        System.out.println(Hashmap.RepeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));


        Node Tree1 = new Node();
        Tree1.root = new Node(150);
        Tree1.root.left = new Node(100);
        Tree1.root.left.left = new Node(75);
        Tree1.root.left.right = new Node(160);
        Tree1.root.left.right.left = new Node(125);
        Tree1.root.left.right.right = new Node(175);
        Tree1.root.right = new Node(250);
        Tree1.root.right.left = new Node(200);
        Tree1.root.right.right = new Node(350);
        Tree1.root.right.right.left = new Node(300);
        Tree1.root.right.right.right = new Node(500);

        Node Tree2 = new Node();
        Tree2.root = new Node(42);
        Tree2.root.left = new Node(100);
        Tree2.root.left.left = new Node(15);
        Tree2.root.left.right = new Node(160);
        Tree2.root.left.right.left = new Node(125);
        Tree2.root.left.right.right = new Node(175);
        Tree2.root.right = new Node(600);
        Tree2.root.right.left = new Node(200);
        Tree2.root.right.right = new Node(350);
        Tree2.root.right.right.left = new Node(4);
        Tree2.root.right.right.right = new Node(500);


        TreeIntersectionHash treeIntersectionHash = new TreeIntersectionHash();
        System.out.println(treeIntersectionHash.treeInsertion(Tree1, Tree2));




    }





}

