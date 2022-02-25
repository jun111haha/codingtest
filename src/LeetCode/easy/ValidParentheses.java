package LeetCode.easy;

import java.util.Stack;
/*
* 스택 사용해서 구현
* 스택에 저장해놓고 스택이 비어있거나 pop 했을때 !=c 이면 false 처리 하였음.
* */
public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] list = s.toCharArray();

        for(char c : list){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

       boolean test =  isValid("(}");
        System.out.println(test);

    }
}
