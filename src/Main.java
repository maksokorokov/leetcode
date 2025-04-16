import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{10, 9, 9, 5, 2, 1}, new int[]{8, 7, 4, 3, 3, 0})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{}, new int[]{5})));

        int[] arr = {3,5,8};

        /**
         * firstArr и secondArr - целочисленные масcивы, отсортированы по убыванию
         * @return целочисленный массив содержащий элементы  firstArr и secondArr
         * и отсортированный по убыванию
         */

    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {

        int [] result = new int[arr1.length + arr2.length];

        int i = 0; int j = 0; int k = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] > arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }
            else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length){
            result[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }

        return result;
    }

    private static int[] mergeArrays2(int[] firstArr, int[] secondArr) {

        return IntStream.concat(Arrays.stream(firstArr),Arrays.stream(secondArr))
                .boxed()
                .sorted((a,b) -> Integer.compare(b,a))
                .mapToInt(Integer::intValue)
                .toArray();

    }

}