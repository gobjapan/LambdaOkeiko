package questions.chapter2;

import java.util.function.Function;

public class Lambda04 {

    public Lambda04() {
        test();
        answer();
    }
    
    private void test() {
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String x) {
                return Integer.valueOf(x);
            }
        };
        
        System.out.println(function.apply("0"));
        System.out.println(function.apply("10"));
        System.out.println(function.apply("-10"));
    }
    
    private void answer() {
        //Function<String, Integer> function = x -> Integer.valueOf(x);
        Function<String, Integer> function = Integer::valueOf;
        
        System.out.println(function.apply("0"));
        System.out.println(function.apply("10"));
        System.out.println(function.apply("-10"));
    }

    public static void main(String... args) {
        new Lambda04();
    }
}
