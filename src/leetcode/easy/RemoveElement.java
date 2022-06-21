package leetcode.easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(arr, val));
    }

    public static int removeElement(int[] nums, int val) {
        int idx = 0;
        if(nums.length < 1) return idx;

        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            if(temp != val){
                //해당값 찾아서 없애주는 작업
                nums[idx] = temp;
                idx ++;
            }else{
                continue;
            }
        }
        return idx;
    }
}