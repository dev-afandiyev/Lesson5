package listworker.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {

    private Integer[] array = {1, 2, 3, 4, 5};
    private List<Integer> list;

    public void getList() {
        list = toList(array);

        System.out.println("List: " + list);
    }

    private List<Integer> toList(Integer[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
