package Lesson1.HomeWork;


import java.util.ArrayList;
import java.util.Arrays;


public class Box<T extends Fruit> {

    private final ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    @SafeVarargs
    public Box(T... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : list) {
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

    public void pourOver(Box<T> other) {
        other.list.addAll(list);
        list.clear();
    }

    public void addFruit(T fruit) {
        list.add(fruit);
    }
}



