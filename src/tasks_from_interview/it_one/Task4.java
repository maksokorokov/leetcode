package tasks_from_interview.it_one;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = {9, 4, -1, 9, 6, 7, 1, 4, 5, 1, 0, -1};
        int[] arr2 = {9, 4, 4, 9};

        System.out.println(findDuplicates(arr2,1));
    }

    public static Integer findUniqe(int[] arr) {

        Map<Integer, Integer> elements = new LinkedHashMap<>();
        //добавляем цифру и скок раз она встретилась
        for (Integer el : arr) {
            elements.put(el, elements.getOrDefault(el, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : elements.entrySet() ) {
            if (entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
            return null;
    }

    public static Integer findUniqe2(int[] arr) {

        Map<Integer, Integer> elements = new HashMap<>();
        //добавляем цифру и скок раз она встретилась
        for (Integer el : arr) {
            elements.put(el, elements.getOrDefault(el, 0) + 1);
        }
        for (int num : arr){
            if (elements.get(num).equals(1)){
                return num;
            }
        }
        return null;
    }

    public static Integer findUnique3(int[] arr) {
        Map<Integer, Long> elementCounts = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return Arrays.stream(arr)
                .boxed()
                .filter(num -> elementCounts.get(num) == 1)
                .findFirst()
                .orElse(null);
    }


    public static Set<Integer> findDuplicates(int[] arr, int n){

        Map<Integer, Integer> elements = new HashMap<>();
        //добавляем цифру и скок раз она встретилась
        for (Integer el : arr) {
            elements.put(el, elements.getOrDefault(el, 0) + 1);
        }

        Set<Integer> returnNum = new HashSet<>();
        for (int num : arr){
            if (elements.get(num).equals(n)){
                returnNum.add(num);
            }
        }

        if (!returnNum.isEmpty()){
            return returnNum;
        } else return null;
    }

}