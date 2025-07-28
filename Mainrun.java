package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainrun {
    public static void main(String[] args) {
        List<children>childrenList = new ArrayList<>();
        childrenList.add(new children("A", 10));
        childrenList.add(new children("B", 16));
        childrenList.add(new children("C", 12));

        Collections.sort(childrenList, new Comparator_Code());
        System.out.println(childrenList);
    }
}
