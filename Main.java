package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student(1, "Vigu"));
        students.add(new Student(2, "Prathik"));

        students.sort((a, b)->a.name.compareTo(b.name)); // ascending order A--Z
        students.sort(null); // Collections.sort(students) // this will call compareTo method
        System.out.println(students);

    }
}
