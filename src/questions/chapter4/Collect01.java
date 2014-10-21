package questions.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect01 {

    public Collect01() {
        List<String> texts = Arrays.asList("a", "b", "c", "d", "e");
                
        List<String> copiedTexts = copyList(texts);
        System.out.println(copiedTexts);
        
        System.out.println(copyList_answer(texts));
    }
    
    private List<String> copyList_answer(List<String> src) {
        return src.stream().collect(Collectors.toList());
    }

    
    private List<String> copyList(List<String> src) {
        List<String> dest = new ArrayList<>();
        
        for (String element: src) {
            dest.add(element);
        }
        
        return dest;
    }

    public static void main(String... args) {
        new Collect01();
    }
}
