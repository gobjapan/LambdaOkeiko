package questions.chapter2;

import java.util.Comparator;

public class Lambda01 {

    public Lambda01() {
        test();
        answer();
    }
    
    private void test() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return Integer.compare(x, y);
            }
        };
        
        System.out.println(comparator.compare(20, 10));
        System.out.println(comparator.compare(20, 20));
        System.out.println(comparator.compare(5, 20));
    }
    
    private void answer() {
        //Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> comparator = Integer::compare;
        
        System.out.println(comparator.compare(20, 10));
        System.out.println(comparator.compare(20, 20));
        System.out.println(comparator.compare(5, 20));
    }

    public static void main(String... args) {
        new Lambda01();
    }
}
