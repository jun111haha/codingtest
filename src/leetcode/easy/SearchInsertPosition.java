package leetcode.easy;

/*
* 이진탐색을 통해 검색
* 찾는 인덱스가 없는경우
* 해당 들어갈위치를 반환
* */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int val = 2;
        System.out.println(searchInsert(arr, val));

    }
    public static int searchInsert(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            mid = (right + left) / 2;
            if(target == nums[mid]){
                return mid;
            }

            if(target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        if(left > right) return right +1;
        return -1;
    }
}
