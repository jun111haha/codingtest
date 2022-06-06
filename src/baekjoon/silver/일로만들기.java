package baekjoon.silver;

import java.util.Scanner;

/*
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

* https://do-rang.tistory.com/9 동적계획법 알고리즘 설명
* */

public class 일로만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(bottomUp(x));
        //System.out.println(topDown(x));
    }

    //dp[1]=0으로 고정되어있기 때문에 반복문은 2부터 n까지 수행하게되며 마찬가지로
    //dp배열은 n이 1까지 만들기 위해 사용되는 연산의 횟수들 중 최소값을 갖게된다.
    static int bottomUp(int num){
        int [] dp = new int[num+1];

        dp[0] = dp[1] = 0;
        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i - 1] + 1; //-1
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2] +1);

            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3] +1);
        }
        return dp[num];
    }

    //큰 문제를 작은 문제로 나누어서 풀이한 후 큰 문제의 정답을 알아내는 방법이다.
    //즉 n이 6인경우를 구할 때 d[6]을 알기 위해서는 작은 결과값인 d[5], d[4], d[2]의 결과 값 중 최소값을 찾아서 +1해주면 된다.
    //d[5]는 d[4]+1 , d[4]는 d[3], d[2]의 최소값 +1, d[3]은 d[2], d[1]의 최소값 +1 이런식으로 재귀함수를 통해 가장 작은 결과값부터 시작하여 원하는 결과값 까지 도달한다.
    static int topDown(int num){
        int [] dp = new int[num +1];

        if(num==1) return 0;

        if(dp[num] > 0) return dp[num];

        dp[num] = topDown(num -1) +1;

        if(num % 2 == 0){
            int temp = topDown(num/2) +1;
            if(dp[num] > temp) dp[num] = temp;
        }

        if(num % 3 == 0){
            int temp = topDown(num/3) +1;
            if(dp[num] > temp) dp[num] = temp;
        }

        return dp[num];
    }
}
