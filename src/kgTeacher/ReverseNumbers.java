package kgTeacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReverseNumbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(43);
        list.add(98);
        list.add(9);
        list.add(41);
        System.out.println(list);
        callReverse(list);
        System.out.println(callReverse(list));
    }

    public static List<Integer> callReverse(List<Integer> list) {
        List<Integer> tempStore = new ArrayList<>(list);
        Collections.reverse(tempStore);
        return tempStore;
    }
}
