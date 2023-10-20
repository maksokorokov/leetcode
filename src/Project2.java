
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        System.out.println(Type.EXCEL.toString());
        Map<Integer, String> integerStringMap = Map.of(1, "val1", 2, "val2");
        if (integerStringMap.get(3) == null){
            System.out.println("404");
        }
    }
}

enum Type{
    EXCEL,CSV
}