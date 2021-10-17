import Animal.Animal;
import BinaryTrees.BinaryTree;
import Queue.PsudoCode;
import Animal.Dog;
import Animal.Cat;
import Animal.AnimalQueue;
import Stack.StackBrackets;
import Stack.StackGen;
import Stack.StackMax;
import org.checkerframework.checker.units.qual.C;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hello from package");


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
//        linkedList2.add("K");
//        linkedList2.add("H");
//        linkedList2.add("A");
//        linkedList2.add("I");
//        linkedList2.add("R");
//


//
//        linkedList.insertBefore("H","Hello");
//        linkedList.insertAfter("khair","A");
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

            BinaryTree<Integer> binaryTree = new BinaryTree<>();

            binaryTree.add(50);
            binaryTree.add(60);
            binaryTree.add(70);
            binaryTree.add(80);
            binaryTree.add(90);
            binaryTree.add(10);
        System.out.println(binaryTree.contains(60));
        System.out.println(binaryTree.contains(70));
        System.out.println(binaryTree.contains(80));
        System.out.println(binaryTree.contains(20));
        System.out.println(binaryTree.maximumValue());
    }
    }

