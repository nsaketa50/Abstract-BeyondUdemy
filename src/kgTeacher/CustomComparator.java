package kgTeacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program that sorts a list of String objects in descending order using a custom Comparator.
class CustomComparator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("cream");
        list.add("icecream");
        list.add("mango");
        list.add("cream");
        System.out.println(list);
        comparator(list);
        System.out.println(list);
        System.out.println(Collections.frequency(list, "cream"));
    }

    public static void comparator(List<String> list) {
        Collections.sort(list);
    }
}
