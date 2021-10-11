package Animal;

import Queue.Queue;

public class AnimalQueue {

    private QueueGen<Dog> dogQueue;
    private QueueGen <Cat> catQueue;

    public AnimalQueue() {
        this.dogQueue = new QueueGen<Dog>();
        this.catQueue = new QueueGen<Cat>();
            }

            public void enQueue(Animal animal){
                if (animal instanceof Dog) {
                    dogQueue.enqueue((Dog) animal);
                }else if (animal instanceof Cat){

                    catQueue.enqueue((Cat) animal);
              }
                else {
                    System.out.println("Meaaaaaaaaaaao , HAW HAW HAW ");
                }

                }
           public Animal dequeue(String pref) throws Exception {
               if(pref.equals("cat") && !catQueue.isEmpty()){
               return catQueue.dequeue();
               }else if (pref.equals("dog") && !dogQueue.isEmpty()){
                   return dogQueue.dequeue();
               }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalQueue{" +
                "dogQueue=" + dogQueue +
                ", catQueue=" + catQueue +
                '}';
    }
}

