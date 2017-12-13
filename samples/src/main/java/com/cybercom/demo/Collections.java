package com.cybercom.demo;

import java.util.*;

public class Collections {

    private static void lists() {
        List<String> list = Arrays.asList("a", "b", "c");

//        List<String> list = List.of("a", "b", "c");

//        List<Cat> list = List.of(
//                new Cat("Whiskers", 2),
//                new Cat("Pus", 4),
//                new Cat("Scsi", 7),
//                new Cat("Garfield", 12));

        list.stream()
                .forEach(System.out::println);


    }

    private static void maps() {

        Map<String, Cat> map = new HashMap<>();
        map.put("Duke", new Cat("Whiskers", 2));
        map.put("Ivar", new Cat("Scsi", 8));

        //        Map<String, Cat> map = Map.of(
//                "Duke", new Cat("Whiskers", 2),
//                "Ivar", new Cat("Scsi", 8));

        map.entrySet().stream()
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        lists();
        maps();

    }
}
