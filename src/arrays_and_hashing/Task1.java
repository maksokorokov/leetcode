package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
* */
public class Task1 {

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;
        String s = Arrays.toString(twoSum2(nums, target));
        System.out.println(s);




    }

    // плохое решение
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (num + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }


    //    лучшее решение
    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {

            int i1 = target - nums[i];
            if (map.get(i1) != null){
                return new int[] {i,map.get(i1)};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}
