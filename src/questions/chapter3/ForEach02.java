package questions.chapter3;

import java.util.Arrays;
import java.util.List;

public class ForEach02 {

    public ForEach02() {
        List<String> texts = Arrays.asList("a", "b", "c", "d", "e");
                
        printList(texts);
        printList_answer(texts);
    }
    
    private void printList_answer(List<String> texts) {
        texts.stream()
            .filter(text -> text.startsWith("a"))
            .forEach(System.out::println);
            //.forEach(text -> System.out.println(text));
    }
    
    private void printList(List<String> texts) {
        for (String text: texts) {
            if (text.startsWith("a")) {
                System.out.println(text);
            }
        }
    }

    public static void main(String... args) {
        new ForEach02();
    }
}
