package Comparator;

public class children {
    String name;
    int age;

    children(String name, int age){
        this.name= name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "children{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
