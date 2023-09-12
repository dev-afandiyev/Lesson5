package listworker;

import listworker.converter.ArrayToListConverter;
import listworker.ocurrence.Occurrence;
import listworker.unique.UniqueNumberFinder;

public class ListWorker {

    private ArrayToListConverter converter = new ArrayToListConverter();
    private Occurrence occurrence = new Occurrence();
    private UniqueNumberFinder finder = new UniqueNumberFinder();

    public void getWorkerResult() {
        converter.getList();
        occurrence.getResults();
        finder.getUnique();
    }

}
