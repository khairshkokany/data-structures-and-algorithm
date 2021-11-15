//package code05;
//
//import HashPart.HashTable;
//import HashPart.Hashmap;
//import HashPart.Node;
//import HashPart.TreeIntersectionHash;
//import org.junit.jupiter.api.Test;
//
//import java.util.HashMap;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class HashTest {
//
//    HashTable<String, Integer> hashTable = new HashTable<>();
//
//    @Test
//    public void addingTestWithContains(){
//        hashTable.addHash("KHAIR",300);
//        assertTrue(hashTable.contains("KHAIR"));
//    }
//
//    @Test
//    public void getTest(){
//        hashTable.addHash("KHAIR",300);
//        assertEquals(300,hashTable.getHash("KHAIR"));
//    }
//
//    @Test
//    public void testNull(){
//        hashTable.addHash("KHAIR",300);
//        assertNull(hashTable.getHash("notTest"));
//    }
//
//    @Test
//    public void handleCollision(){
//        hashTable.addHash("KHAIR",300);
//        hashTable.addHash("ELDEEN", 400);
//        hashTable.addHash("ZAKARIA", 200);
//        hashTable.addHash("SHKOKANY", 100);
//        hashTable.addHash("MY", 600);
//
//        assertEquals(5,hashTable.getSize());
//    }
//
//    @Test
//    public void retrieveFromCollision(){
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
//
//        assertEquals(1500,hashTable.getHash("THANK"));
//    }
//
//    @Test
//    public void testHashmap() {
//        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
//        assertEquals("summer" ,Hashmap.RepeatedWord(test));
//    }
//
//    @Test
//    public void testTreeIns() {
//
//        Node Tree1 = new Node();
//        Tree1.root = new Node(150);
//        Tree1.root.left = new Node(100);
//        Tree1.root.left.left = new Node(75);
//        Tree1.root.left.right = new Node(160);
//        Tree1.root.left.right.left = new Node(125);
//        Tree1.root.left.right.right = new Node(175);
//        Tree1.root.right = new Node(250);
//        Tree1.root.right.left = new Node(200);
//        Tree1.root.right.right = new Node(350);
//        Tree1.root.right.right.left = new Node(300);
//        Tree1.root.right.right.right = new Node(500);
//
//        Node Tree2 = new Node();
//        Tree2.root = new Node(42);
//        Tree2.root.left = new Node(100);
//        Tree2.root.left.left = new Node(15);
//        Tree2.root.left.right = new Node(160);
//        Tree2.root.left.right.left = new Node(125);
//        Tree2.root.left.right.right = new Node(175);
//        Tree2.root.right = new Node(600);
//        Tree2.root.right.left = new Node(200);
//        Tree2.root.right.right = new Node(350);
//        Tree2.root.right.right.left = new Node(4);
//        Tree2.root.right.right.right = new Node(500);
//
//TreeIntersectionHash treeIntersectionHash = new TreeIntersectionHash();
//        assertEquals("[100, 160, 125, 175, 200, 350, 500]" , treeIntersectionHash.treeInsertion(Tree1 , Tree2).toString());
//    }
//@Test
//    public void testLeftJoin() {
//    HashMap hashMap1 = new HashMap();
//    hashMap1.put("fond", "enamored");
//    hashMap1.put("wrath", "anger");
//    hashMap1.put("diligent", "employed");
//    hashMap1.put("outfit", "garb");
//    hashMap1.put("guide", "usher");
//
//    HashMap hashMap2 = new HashMap();
//
//    hashMap2.put("fond", "averse");
//    hashMap2.put("wrath", "delight");
//    hashMap2.put("diligent", "idle");
//    hashMap2.put("guide", "follow");
//    hashMap2.put("flow", "jam");
//
//
//   assertEquals("[diligent: employed, idle, outfit: garb, null, wrath: anger, delight, guide: usher, follow, fond: enamored, averse]" , Hashmap.leftJoin(hashMap1 , hashMap2).toString());
//}
//}
