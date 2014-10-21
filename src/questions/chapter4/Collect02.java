package questions.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect02 {

    public Collect02() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5);
                
        List<Integer> evens = expressEvens(numbers);
        System.out.println(evens);
        
        System.out.println(expressEvens_answer(numbers));
    }
    
    private List<Integer> expressEvens_answer(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }
    
    private List<Integer> expressEvens(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        
        for (int x: numbers) {
            if (x % 2 == 0) {
                evens.add(x);
            }
        }
        
        return evens;
    }

    public static void main(String... args) {
        new Collect02();
    }
}
