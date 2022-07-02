package leetcode.easy;
/*
* dp 기법으로 문제풀이
* */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));

    }

    public static int climbStairs(int n) {
        if(n == 1) return 1;
        int [] dy = new int[n];
        dy[0] = 1;
        dy[1] = 2;

        for(int i=2; i<n; i++){
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n - 1];
    }
}
