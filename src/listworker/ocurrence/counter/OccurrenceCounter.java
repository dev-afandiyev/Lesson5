package listworker.ocurrence.counter;

import java.util.Collections;
import java.util.List;

public class OccurrenceCounter {

    private List<String> wordList;
    private String targetWord;
    int occurrence;

    public void getCountOccurrence() {
        wordList = List.of("apple", "banana", "apple", "cherry", "apple", "banana");
        targetWord = "apple";
        occurrence = countOccurrence(wordList, targetWord);

        System.out.println("Occurrences of '" + targetWord + "': " + occurrence);
    }

    private int countOccurrence(List<String> wordList, String targetWord) {
        return Collections.frequency(wordList, targetWord);
    }

}
