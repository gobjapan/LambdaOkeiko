package questions.chapter3;

import java.util.Arrays;
import java.util.List;

public class ForEach04 {

    public ForEach04() {
        List<String> texts = Arrays.asList("Java", "JavaScript", "Ruby", "Pearl", "PHP", "Scala", "Groovy");
                
        printList(texts);
        printList_answer(texts);
    }
    
    private void printList_answer(List<String> texts) {
        texts.stream()
                .map(text -> text.toLowerCase())
                .filter(text -> text.startsWith("j"))
                .forEach(System.out::println);
    }
    
    private void printList(List<String> texts) {
        for (String text: texts) {
            String lowerText = text.toLowerCase();
            
            if (lowerText.startsWith("j")) {
                System.out.println(lowerText);
            }
        }
    }

    public static void main(String... args) {
        new ForEach04();
    }
}
