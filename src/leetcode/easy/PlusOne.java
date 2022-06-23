package leetcode.easy;


import java.util.Arrays;
/*
Input: digits = [4,3,2,1]
Output: [4,3,2,2]

Input: digits = [9]
Output: [1,0]
* */
public class PlusOne {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};

        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n - 1; i>=0; i--){
            digits[i]++;

            if(digits[i] < 10){
                return digits;
            }

            digits[i] = 0;
        }

        int [] answer = new int[n + 1];
        answer[0] = 1;

        return answer;
    }
}
