package Queue;

public class PsudoCode {

    Stacks stack1 = new Stacks();
    Stacks stack2 = new Stacks();


    public void enqueue(String data) {

        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }

        stack1.push(data);

        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());

        }
    }
    public String deQueue()
    {
        if (stack1.isEmpty())
        {
            return "no one here !";

        }

        String x = stack1.peek();
        stack1.pop();
        return x;
    }
}
