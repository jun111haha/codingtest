package leetcode.easy;

import java.math.BigInteger;

/*

Input: a = "11", b = "1"
Output: "100"

Input: a = "1010", b = "1011"
Output: "10101"
* */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        /*
        * 2 진수를 10진수로 변환
        * 둘이 더해서 다시 2진수로 변환하여 return
        * */
        BigInteger bigInteger1 = new BigInteger(a, 2);
        BigInteger bigInteger2 = new BigInteger(b, 2);

        BigInteger sum = bigInteger1.add(bigInteger2);
        String answer = sum.toString(2);

        return answer;
    }
}
