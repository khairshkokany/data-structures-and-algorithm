package BinaryTrees;


import java.util.ArrayList;
import java.util.List;

public class Knode<T> {
        public T value;
        public List<Knode<T>> allChildren = new ArrayList<>();

        public Knode(T value) {
            this.value = value;
        }


        public List<Knode<T>> getAllChildren() {
            return allChildren;
        }

        public void addChild(Knode<T> node) {
            this.allChildren.add(node);
        }

    }

