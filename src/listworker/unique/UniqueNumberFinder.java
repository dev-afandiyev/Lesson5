package listworker.unique;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumberFinder {

    private List<Integer> numbers;
    private List<Integer> uniqueNumbers;

    public void getUnique() {
        numbers = List.of(1, 2, 2, 3, 4, 4, 5, 5);
        uniqueNumbers = findUnique(numbers);

        System.out.println("Unique numbers: " + uniqueNumbers);
    }

    private List<Integer> findUnique(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
