/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code05;

import Animal.AnimalQueue;
import Animal.Cat;
import Animal.Dog;
import BinaryTrees.BinaryTree;
import BinaryTrees.BinaryTreesNode;
import Queue.Queue;
import Stack.StackBrackets;
import Stack.Stacks;
import Queue.PsudoCode;

import org.junit.jupiter.api.Test;

import java.io.IOException;


import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Stacks stack = new Stacks();
    Queue queue = new Queue();
    StackBrackets stackBrackets = new StackBrackets();
    BinaryTree <Integer> binaryTree = new BinaryTree<>();

    @Test void someLibraryMethodReturnsTrue() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test
    public Void included() throws IOException {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.add("khair");


        assertTrue(classUnderTest.included("khair"),"this is true ");
        return null;
    }
    @Test void printList(){

        LinkedList classUnderTest = new LinkedList();

        classUnderTest.add("K");
        classUnderTest.add("H");
        classUnderTest.add("A");
        classUnderTest.add("I");
        classUnderTest.add("R");
        assertEquals("Head -> {H}  ->{K}   -> {A}   -> {I}   -> {R}   -> null -> ",classUnderTest.toString(),"app should return ==> Head -> {K}  ->{H}   -> {A}   -> {I}   -> {R}   -> null -> ");

    }

    @Test
    public void returnAfter() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.add("K");
        classUnderTest.add("H");
        classUnderTest.add("A");
        classUnderTest.add("I");
        classUnderTest.add("R");
        classUnderTest.insertAfter("C","R");
        assertEquals("Head  ->{K} -> {H}   -> {A}   -> {I} -> {C}  -> {R}   -> null -> ", classUnderTest.toString(),"");
    }

    @Test
    public void returnBefore() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.add("K");
        classUnderTest.add("H");
        classUnderTest.add("A");
        classUnderTest.add("I");
        classUnderTest.add("R");
        classUnderTest.insertAfter("C","R");
        assertEquals("Head  ->{K} -> {H}   -> {A}   -> {I}   -> {R} -> {C}   -> null -> ", classUnderTest.toString(),"");
    }
    @Test

    public void returnNodeFromTheLast() {
        LinkedList list = new LinkedList();
        list.add("K");
        list.add("H");
        list.add("A");
        list.add("I");
        list.add("R");


        assertEquals("I", list.insertNthFromEnd(1).getData());
    }

    @Test public void zipTest() {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        linkedList.add("K");
        linkedList.add("H");
        linkedList.add("A");
        linkedList.add("I");
        linkedList.add("R");

        linkedList1.add("K");
        linkedList1.add("H");
        linkedList1.add("A");
        linkedList1.add("I");
        linkedList1.add("R");
        String test = linkedList2.zipLists(linkedList,linkedList1).toString();;
        assertEquals(test,linkedList2.zipLists(linkedList,linkedList1).toString());

    }
    @Test
    public void stackData(){
        stack.push("K");
        stack.push("H");
        stack.push("A");
        assertEquals("[K, H, A]" , stack.toString());
    }

    @Test
    public void stackPush(){
        stack.push("K");
        stack.push("H");
        stack.push("A");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void stackPop() {
        stack.push("K");
        stack.push("H");
        stack.push("A");

        stack.pop();

        assertEquals("[K, H]" , stack.toString());
    }


    @Test
    public void stackEmpty() {
        stack.push("K");
        stack.push("H");
        stack.push("A");

        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void stackPeek() {
        stack.push("K");
        stack.push("H");
        stack.push("A");

        assertEquals("A",stack.peek());
    }

    @Test
    public void queueData(){
        queue.enqueue("K");
        queue.enqueue("H");
        queue.enqueue("A");
        assertEquals("Queue{front={K}  , rear={A}  }" , queue.toString());
    }

    @Test
    public void queuePush(){
        queue.enqueue("K");
        queue.enqueue("H");
        queue.enqueue("A");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void queuePop() {
        queue.enqueue("K");
        queue.enqueue("H");
        queue.enqueue("A");

        queue.dequeue();

        assertEquals("Queue{front={H}  , rear={A}  }" , queue.toString());
    }


    @Test
    public void queueEmpty() {
        queue.enqueue("K");
        queue.enqueue("H");
        queue.enqueue("A");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());

    }

    @Test
    public void queuePeek() {
        queue.enqueue("K");
        queue.enqueue("H");
        queue.enqueue("A");

        assertEquals("K",queue.peek());
    }

    @Test
    public void psudoQueue() {
        PsudoCode psudoCode = new PsudoCode();
        psudoCode.enqueue("KHAIR");
        psudoCode.enqueue("Shkokany");

        assertEquals("KHAIR",psudoCode.deQueue());

    }

    @Test
    public void animalQueue() throws Exception {
        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.enQueue(new Dog("dog"));
        animalQueue.enQueue(new Cat("CAT"));

        assertEquals("DOG{firstName='dog'}",animalQueue.dequeue("dog").toString());
        assertEquals("CAT{firstName='CAT'}",animalQueue.dequeue("cat").toString());
    }
    @Test

    public void testBracketsValidate() throws Exception {
        assertFalse(StackBrackets.bracketsMethod("{(})"));
        assertTrue(StackBrackets.bracketsMethod("{()}"));
    }

    @Test
    public void testEmptyTree() {

        binaryTree.add(10);
        assertFalse(binaryTree.isEmpty());
    }
    @Test
    public void testContains() {
        binaryTree.add(20);
        assertTrue(binaryTree.contains(20));
    }
    @Test
    public void testAddingRightAndLeft() {
        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(10);
        binaryTree.add(20);
        binaryTree.add(30);
        binaryTree.add(5);
        assertEquals(true,binaryTree.contains(5),"adding in left node ");
        assertEquals(true,binaryTree.contains(30),"adding in right node ");
    }
}



