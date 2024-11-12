package app;

import java.util.List;

public class DataHandler {

    public String formOutput(List<String> list, int index) {
        try {
            String name = list.get(index);
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }

    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (String name : list) {
            counter++;
            sb.append(String.format("%d) %s%n",
                    counter, name));
        }
        return "\nNames:\n" + sb;
    }
}
