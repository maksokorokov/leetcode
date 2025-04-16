package tasks_from_interview.it_one;

import java.io.IOException;

//что будет выведено на консоль?
public class Task1 {

    public static void main(String[] args) {

        try {
            doSomething();
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("d");
            System.out.println(e.getMessage());
        }

    }

    private static void doSomething() throws Exception {
        try {
            throw new Exception("a");
        } finally {
            if (true){
                throw new IOException("b");
            }
            System.out.println("c");
        }
    }

}
//b