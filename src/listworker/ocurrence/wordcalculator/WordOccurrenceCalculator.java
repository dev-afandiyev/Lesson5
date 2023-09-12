package listworker.ocurrence.wordcalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurrenceCalculator {

    private List<String> wordList;
    private Map<String, Long> wordCount;

    public void getCalcOccurrence() {
        wordList = List.of("bird", "fox", "bird", "cat", "bird", "dog");
        calcOccurrence(wordList);
    }

    private void calcOccurrence(List<String> wordList) {
      wordCount = wordList
                .stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }

}
