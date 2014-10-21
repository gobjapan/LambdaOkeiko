package questions.chapter4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect06 {

    public Collect06() {
        List<String> words = Arrays.asList("Java", "JavaScript", "Pearl", "Ruby", "PHP");
                
        Map<String, Long> groups = groupWords(words);
        System.out.println(groups);
        
        System.out.println(groupWords_answer(words));
    }
    
    private Map<String, Long> groupWords_answer(List<String> words) {
        Map<String, Long> groups = new HashMap<>();
        
        for (String word: words) {
            String key = word.substring(0, 1);
            Long count = groups.getOrDefault(key, 0L);
            count++;
            groups.put(key, count);
        }
        
        return words.stream()
                .collect(Collectors.groupingBy(word -> 
                        word.substring(0, 1), Collectors.counting()));
    }

    
    private Map<String, Long> groupWords(List<String> words) {
        Map<String, Long> groups = new HashMap<>();
        
        for (String word: words) {
            String key = word.substring(0, 1);
            Long count = groups.getOrDefault(key, 0L);
            count++;
            groups.put(key, count);
        }
        
        return groups;
    }

    public static void main(String... args) {
        new Collect06();
    }
}
