package LeetCode.easy;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {

        for(int i= 0; i<nums.length; i++){
          for(int j= i+1; j< nums.length; j++){
              int result = nums[i] + nums[j];
              if(result == target){
                  return new int[]{i,j};

              }
           }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int [] list1 = {3,2,4};
        int target = 6;

        int [] result = twoSum(list1, target);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
