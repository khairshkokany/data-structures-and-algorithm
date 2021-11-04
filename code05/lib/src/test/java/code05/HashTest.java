package code05;

import HashPart.HashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashTest {

    HashTable<String, Integer> hashTable = new HashTable<>();

    @Test
    public void addingTestWithContains(){
        hashTable.addHash("KHAIR",300);
        assertTrue(hashTable.contains("KHAIR"));
    }

    @Test
    public void getTest(){
        hashTable.addHash("KHAIR",300);
        assertEquals(300,hashTable.getHash("KHAIR"));
    }

    @Test
    public void testNull(){
        hashTable.addHash("KHAIR",300);
        assertNull(hashTable.getHash("notTest"));
    }

    @Test
    public void handleCollision(){
        hashTable.addHash("KHAIR",300);
        hashTable.addHash("ELDEEN", 400);
        hashTable.addHash("ZAKARIA", 200);
        hashTable.addHash("SHKOKANY", 100);
        hashTable.addHash("MY", 600);

        assertEquals(5,hashTable.getSize());
    }

    @Test
    public void retrieveFromCollision(){
        hashTable.addHash("ELDEEN", 400);
        hashTable.addHash("ZAKARIA", 200);
        hashTable.addHash("SHKOKANY", 100);
        hashTable.addHash("MY", 600);
        hashTable.addHash("MAJOR", 700);
        hashTable.addHash("IS", 90000);
        hashTable.addHash("MECHANICAL", 800);
        hashTable.addHash("ENGINEER", 1000);
        hashTable.addHash("THANK", 1500);
        hashTable.addHash("YOU", 10000);


        assertEquals(1500,hashTable.getHash("THANK"));
    }
}
