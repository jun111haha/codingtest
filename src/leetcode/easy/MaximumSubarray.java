package leetcode.easy;

/*
* DP 문제
* current 변수 선언하여 배열인덱스 1부터 시작하는
* for 문 돌려서 인덱스 0 부터 시작하는 값과 nums[i] 값을 더한값과 nums[i] 값중
* 더큰값을 반환하여 current 에 저장.
* sum 값에는 current 값과 sum 값중 높은값 저장하여 리턴
* */
public class MaximumSubarray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }
    public static int maxSubArray(int[] nums) {
        int current = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            current = Math.max(current + nums[i], nums[i]);
            sum = Math.max(current, sum);
        }

        return sum;
    }
}
