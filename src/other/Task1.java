package other;

/* Дан массив целых чиел.Посчитать кол-во цифер "2" в записях чисел массива
 *
 * [1,22] Result: 2
 * [1,12,24,252] Result: 4
 * */

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1, 22};
        System.out.println(method2(nums));
        System.out.println(method(nums));
    }

    //через String
    public static int method(int[] nums) {

        int k = 0;
        char charAt = '2';

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            String s = Integer.toString(num);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == charAt) {
                    k++;
                }
            }
        }

        return k;
    }


    //без String
    public static int method2(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            while (num > 0) {
                if (num % 10 == 2) {
                    k++;
                }
                num = num / 10;
            }

        }
        return k;
    }

}
