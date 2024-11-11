package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public List<String> getData() {
        List<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Lucy", "Denis", "Tom"));

        return list;
    }
}
