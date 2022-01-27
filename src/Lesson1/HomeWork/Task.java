package Lesson1.HomeWork;

import java.util.*;

import static java.util.Arrays.asList;

public class Task {
    public static void main(String[] args) {
        System.out.println("Task 1");
        changeList();
        System.out.println("Task 2");
        arrayInArrayList();
        System.out.println("Task 3");

        Box<Orange> orange = new Box<>();
        Box<Apple> apple = new Box<>();


        orange.addFruit(new Orange(13));
        apple.addFruit(new Apple(7));


        System.out.println(orange.compare(apple));
        

    }

    private static void arrayInArrayList() {
        String[] array = {"a", "b", "c", "d"};
        asList(array);
        System.out.println(Arrays.toString(array));
    }

    private static void changeList() {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("my");
        list.add("friend");
        list.add("its me");

        System.out.println(list);
        Collections.swap(list,0,3);
        System.out.println(list);
    }


}

