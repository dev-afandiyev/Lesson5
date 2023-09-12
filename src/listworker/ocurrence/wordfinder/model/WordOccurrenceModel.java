package listworker.ocurrence.wordfinder.model;

public class WordOccurrenceModel {

    private String name;
    private long occurrence;

    public WordOccurrenceModel(String name, long occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public String getName() {
        return name;
    }

    public long getOccurrence() {
        return occurrence;
    }

}
