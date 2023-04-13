package Next_DLP;

import java.util.Stack;

public class Question2 {
    public static void main(String[] args){
        System.out.println(checkBalance("{[(()])()}"));
        System.out.println(checkBalance("{[(())]()}"));
    }

    public static boolean checkBalance(String str){
        char[] brackets = {'(', ')', '{', '}', '[', ']'};
        char[] c = str.toCharArray();
        if(c[0] == ')' || c[0] == '}' || c[0] == ']')
            return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < c.length; i++){
            if((c[i] == ')' || c[i] == '}' || c[i] == ']') && stack.isEmpty())
                return false;

            if(c[i] == '(' || c[i] == '{' || c[i] == '[')
                stack.push(c[i]);
            else{
                if(c[i] == ']' && stack.pop() != '['){
                    return false;
                }
                if(c[i] == '}' && stack.pop() != '{')
                    return false;
                if(c[i] == ')' && stack.pop() != '(')
                    return false;
            }
        }
        return true;
    }
}
