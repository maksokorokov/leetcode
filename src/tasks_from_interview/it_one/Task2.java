package tasks_from_interview.it_one;


import java.util.*;

/* написать метод, возращающий первую непустую уникальную строку из списка
 * Например для списка {"","a0","b+","c","j","b+","a0","a0"} метод вернет "с"
 * */
public class Task2 {


    public static void main(String[] args) {
        List<String> list = List.of("", "a0", "b+", "c", "j", "b+", "a0", "a0");
        System.out.println(method(list));
    }
    /* напи
    сать метод, возращающий первую непустую уникальную строку из списка
     * Например для списка {"","a0","b+","c","j","b+","a0","a0"} метод вернет "с"
     * */
    public static String method(List<String> list) {
        Map<String, Integer> elements = new LinkedHashMap<>();

        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(s -> {
                    Integer i = elements.get(s);

                    if (i == null) {
                        elements.put(s, 1);
                    } else {
                        elements.put(s, i + 1);
                    }
                });
        Optional<String> first = list.stream()
                .filter(s -> !s.isEmpty())
                .filter(s -> elements.get(s).equals(1))
                .findFirst();

        return first.get();
    }


}
