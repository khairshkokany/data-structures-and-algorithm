package HashPart;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable <K , V> {

    private ArrayList<HashNode<K, V>> bucketArray;

    private int numBuckets;

    private int size ;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets =10 ;
        size = 0 ;

        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);

        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }
    public int HashString(String key){
        return Integer.parseInt(key)%size;
    }

    public int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        int index = hashCode % numBuckets;


        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void addHash(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) { // checks for duplicates
                head.value = value;
                return;
            }

            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);


        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    addHash(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }




    public V getHash(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }


        return null;
    }
    public boolean contains(K key) {
        return getHash(key) != null;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                ", numBuckets=" + numBuckets +
                ", size=" + size +
                '}';
    }
}

