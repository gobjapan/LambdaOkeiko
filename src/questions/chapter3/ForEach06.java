package questions.chapter3;

import java.util.stream.IntStream;

public class ForEach06 {

    public ForEach06() {
        printEvens();
        printEvens_answer();
    }
    
    private void printEvens_answer() {
        IntStream.range(0, 20)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
    
    private void printEvens() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String... args) {
        new ForEach06();
    }
}
