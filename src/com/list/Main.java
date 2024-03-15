package com.list;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String placeName, int distance) {
    public String toString() {
        return String.format("%s, %d", placeName, distance);
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList<Place> list = new LinkedList<>();
        addPlace(list, new Place("Virginia", 267));
        addPlace(list, new Place("Virginia", 267));
        list.addFirst(new Place("Sydney", 0));
        addPlace(list, new Place("Brisbane", 917));
        addPlace(list, new Place("Perth", 3923));
        addPlace(list, new Place("Alice Springs", 2771));
        addPlace(list, new Place("Darwin", 3972));
        addPlace(list, new Place("Melbourne", 877));

        System.out.println(list);

        var iterator = list.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            System.out.println("Please enter a value:");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Originating : " + iterator.previous());
                forward = false;
            }

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go FOrward");
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case "B":
                    System.out.println("User wants to go Backward");
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    System.out.println("User wants to see Menu");
                    printMenu();
                    break;
                case "L":
                    System.out.println("User wants List places");
                    System.out.println(list);
                    break;

                default:
                    quitLoop = true;
                    System.out.println("Exiting !!!!");
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Place " + place + " exists");
            return;
        }
        int matchIndex = 0;
        for (var listPlaces : list) {
            if (place.distance() < listPlaces.distance()) {
                list.add(matchIndex, place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Select :
                F --> Forward
                B --> Backwward
                L --> List
                M --> Menu
                Q --> Quit """);
    }

}
