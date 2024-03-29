package questions.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect05 {

    public Collect05() {
        List<String> words = Arrays.asList("Java", "JavaScript", "Pearl", "Ruby", "PHP");
                
        Map<String, List<String>> groups = groupWords(words);
        System.out.println(groups);
        
        System.out.println(groupWords_answer(words));
    }
    
    private Map<String, List<String>> groupWords_answer(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(word -> word.substring(0, 1)));
    }
    
    private Map<String, List<String>> groupWords(List<String> words) {
        Map<String, List<String>> groups = new HashMap<>();
        
        for (String word: words) {
            String key = word.substring(0, 1);
            List<String> group = groups.get(key);
            if (group == null) {
                group = new ArrayList<>();
                group.add(word);
                groups.put(key, group);
            } else {
                group.add(word);
            }
        }
        
        return groups;
    }

    public static void main(String... args) {
        new Collect05();
    }
}
