package LeetCode.easy;

/*
* 회문(palindrome) : 앞에서 읽으나 뒤에서 읽으나 똑같은 문자열
* */

public class isPalindrome {
    public static boolean isPalindrome(int x) {

        String x1 = Integer.toString(x);

        int to = 0;
        int form = x1.length() - 1;

        while (to < form){
            if(x1.charAt(to) != x1.charAt(form)){
                return false;
            }
            to += 1;
            form -= 1;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean result = isPalindrome(121);

    }
}
