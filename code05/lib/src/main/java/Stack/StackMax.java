package Stack;

public class StackMax {

//    StackGen<Integer> mainStack = new StackGen<>();

    public void getMax(StackGen <Integer> stackGen) throws Exception {


        int max = stackGen.peek();

        while (!stackGen.isEmpty()) {
            if (max< stackGen.peek()) {
                max = stackGen.peek();

            }

            stackGen.pop();

        }
        System.out.println("this is the max num  " + max);
    }
}
