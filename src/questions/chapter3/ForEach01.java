package questions.chapter3;

import java.util.Arrays;
import java.util.List;

public class ForEach01 {

    public ForEach01() {
        List<String> texts = Arrays.asList("a", "b", "c", "d", "e");
                
        printList(texts);
        printList_answer(texts);
    }
    
    private void printList(List<String> texts) {
        for (String text: texts) {
            System.out.println(text);
        }
    }
    
    private void printList_answer(List<String> texts) {
        texts.forEach(text -> System.out.println(text));
    }

    public static void main(String... args) {
        new ForEach01();
    }
}
