package leetcode.easy;

import java.util.ArrayList;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,0,0,0};
        int n = 3;
        int [] arr2 = {2,5,6};
        int m = 3;
        merge(arr1, n, arr2, m);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (p1 < m && p2 < n){
            if(nums1[p1] < nums2[p2]){
                list.add(nums1[p1++]);
            }else{
                list.add(nums2[p2++]);
            }
        }
        while (p1 < m){
            list.add(nums1[p1++]);
        }

        while (p2 < n){
            list.add(nums2[p2++]);
        }

        System.out.println(list);

    }
}
