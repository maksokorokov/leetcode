package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

//возвращать true , если в массиве числа встречаются два и более раза
//false, если все числа уникальные
public class Task217 {

    public static void main(String[] args) {

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean b = containsDuplicate(nums);
        System.out.println(b);

    }


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i< nums.length; i++){
            if (i > 0 && set.contains(nums[i])){
                return true;
            }
            if(i == nums.length - 1 && set.contains(nums[nums.length-1])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

//
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> uniques = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (uniques.contains(nums[i])) {
//                return true;
//            }
//            uniques.add(nums[i]);
//        }
//        return false;
//    }
}

