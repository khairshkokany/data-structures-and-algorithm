package Stack;

public class StackBrackets {

    public static boolean bracketsMethod(String data) throws Exception {
        StackGen<Character> stackGen = new StackGen<>();

        if (data.length()==0) {
            return false;
        }

        int i;
        for (i = 0 ; i < data.length(); i++){
            if (data.charAt(i) == '{' || data.charAt(i) == '(' || data.charAt(i)=='['){
                stackGen.push((data.charAt(i)));
            }else if (data.charAt(i) == '}' && stackGen.peek() == '{'){
                stackGen.pop();
            }else if (data.charAt(i) == ']' && stackGen.peek() == '['){
                stackGen.pop();
            }else if (data.charAt(i) == ')' && stackGen.peek() == '('){
                stackGen.pop();
            }
        }


        return stackGen.isEmpty();
    }
}
