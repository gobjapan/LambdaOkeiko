package questions.chapter4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect07 {

    public Collect07() {
        List<String> texts = Arrays.asList(
                "Peter Piper picked",
                "a peck of pickled peppers",
                "A peck of pickled peppers",
                "Peter Piper picked.",
                "If Peter Piper picked",
                "a peck of pickled peppers,",
                "Where's the peck of pickled peppers",
                "Peter Piper picked?");
                
        Map<String, Long> wordCounters = countWord(texts);
        System.out.println(wordCounters);
        
        System.out.println(countWord_answer(texts)); 
    }
    
    private Map<String, Long> countWord_answer(List<String> texts) {
        Map<String, Long> wordCounters = new HashMap<>();
        
        for (String text: texts) {
            // 文字列から単語を切り出す
            // 正規表現を使って、単語間にあるスペースなどを使用して切り出す
            String[] words = text.split(" |\\.|\\,|\\?");

            for (String word: words) {
                word = word.toLowerCase();
                
                Long count = wordCounters.getOrDefault(word, 0L);
                count++;
                wordCounters.put(word, count);
            }
        }
        
        return texts.stream()
                .flatMap(text -> Arrays.stream(text.toLowerCase().split(" |\\.|\\,|\\?")))
                //.map(text -> text.toLowerCase())
                //.map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                    word -> word, Collectors.counting()));
    }

    
    private Map<String, Long> countWord(List<String> texts) {
        Map<String, Long> wordCounters = new HashMap<>();
        
        for (String text: texts) {
            // 文字列から単語を切り出す
            // 正規表現を使って、単語間にあるスペースなどを使用して切り出す
            String[] words = text.split(" |\\.|\\,|\\?");

            for (String word: words) {
                word = word.toLowerCase();
                
                Long count = wordCounters.getOrDefault(word, 0L);
                count++;
                wordCounters.put(word, count);
            }
        }
        
        return wordCounters;
    }

    public static void main(String... args) {
        new Collect07();
    }
}
