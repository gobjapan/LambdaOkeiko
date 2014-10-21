package questions.chapter3;

import java.util.Arrays;
import java.util.List;

public class ForEach03 {

    public ForEach03() {
        List<String> texts = Arrays.asList("Java", "jAva", "jaVa", "JAVA", "javA");
                
        printList(texts);
        printList_answer(texts);
    }
    
    private void printList_answer(List<String> texts) {
        texts.stream()
            .map(text -> text.toLowerCase())
            .forEach(System.out::println);
    }
    
    private void printList(List<String> texts) {
        for (String text: texts) {
            String lowerText = text.toLowerCase();

            System.out.println(lowerText);
        }
    }

    public static void main(String... args) {
        new ForEach03();
    }
}
