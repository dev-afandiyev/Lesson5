package listworker.ocurrence;

import listworker.ocurrence.counter.OccurrenceCounter;
import listworker.ocurrence.wordcalculator.WordOccurrenceCalculator;
import listworker.ocurrence.wordfinder.WordOccurrenceFinder;

public class Occurrence {

    private OccurrenceCounter counter = new OccurrenceCounter();
    private WordOccurrenceCalculator calculator = new WordOccurrenceCalculator();
    private WordOccurrenceFinder finder = new WordOccurrenceFinder();


    public void getResults() {
        counter.getCountOccurrence();
        calculator.getCalcOccurrence();
        finder.getWordOccurrence();
    }

}
