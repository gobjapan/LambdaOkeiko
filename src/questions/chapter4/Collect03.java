package questions.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect03 {

    public Collect03() {
        int[] numbers = {0, 1, 2, 3, 4, 5};
                
        List<Integer> evens = expressEvens(numbers);
        System.out.println(evens);
        
        System.out.println(expressEvens_answer(numbers));
    }
    
    private List<Integer> expressEvens_answer(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    
    private List<Integer> expressEvens(int[] numbers) {
        List<Integer> evens = new ArrayList<>();
        
        for (int x: numbers) {
            if (x % 2 == 0) {
                evens.add(x);
            }
        }
        
        return evens;
    }

    public static void main(String... args) {
        new Collect03();
    }
}
