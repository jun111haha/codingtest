package leetcode.easy;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        double num = Math.sqrt(x);
        int n = (int) num;

        return n;
    }
}
