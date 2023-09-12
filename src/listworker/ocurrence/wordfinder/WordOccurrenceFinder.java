package listworker.ocurrence.wordfinder;

import listworker.ocurrence.wordfinder.model.WordOccurrenceModel;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurrenceFinder {

    private Map<String, Long> wordCount;
    private List<String> wordList;
    private List<WordOccurrenceModel> wordOccurrences;

    public void getWordOccurrence() {
        wordList = List.of("bird", "fox", "bird", "cat", "bird", "dog");
        wordOccurrences = findOccurrence(wordList);

        wordOccurrences.forEach(occurrence ->
                System.out.println(
                        "{name: \"" + occurrence.getName() + "\", occurrence: " + occurrence.getOccurrence() + "}"
                )
        );
    }

    private List<WordOccurrenceModel> findOccurrence(List<String> wordList) {
        wordCount = wordList
                .stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        return wordCount
                .entrySet()
                .stream()
                .map(entry -> new WordOccurrenceModel(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

}
