package Comparator;

import java.util.Comparator;

public class Comparator_Code implements Comparator<children> {


    @Override
    public int compare(children a, children b) {
        return b.name.compareTo(a.name);
    }
}
