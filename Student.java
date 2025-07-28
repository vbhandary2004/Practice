package Comparable;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int rollNO;
    String name;

    Student(int roll,String name){
        this.rollNO= roll;
        this.name=name;
    }

    @Override
    public int compareTo(Student s) {
        return s.name.compareTo(this.name); // for descending sorting
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNO=" + rollNO +
                '}';
    }
}
