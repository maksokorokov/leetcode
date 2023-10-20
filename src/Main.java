import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4, 5};

        method(arr);
    }

    //найти первый не повторяющийся элемент
    public static int method(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Integer integerKey = Integer.valueOf(arr[i]);

            if (list.contains(integerKey)){
                list.remove(integerKey);
                continue;
            }
            list.add(integerKey);

        }
        return 2;
    }

}