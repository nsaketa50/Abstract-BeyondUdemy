package kgTeacher;

import java.util.ArrayList;
import java.util.List;

class SwappingList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(21);
        list.add(9);
        list.add(27);

        System.out.println(list);
        swapping(list, 1, 4);
        System.out.println(list);
    }

    public static void swapping(List<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, b);
        list.set(b, temp);
    }
}