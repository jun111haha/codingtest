package leetcode.easy;
public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 1 ; i<nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int [] list = {0,0,1,1,1,2,2,3,3,4};

        int test = removeDuplicates(list);
        System.out.println(test);
    }
}
