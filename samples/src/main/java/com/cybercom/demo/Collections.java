package com.cybercom.demo;

import java.util.List;
import java.util.Optional;

public class Collections {

    private static void collections() {
//        List<String> list = Arrays.asList(new String[] {"a", "b", "c"});
        List<String> list = List.of("a", "b", "c");
//        List<Cat> list = Arrays.asList(new Cat[]{new Cat("Whiskers", 2), new Cat("Pussi", 4), new Cat("Scsi", 7), new Cat("Garfield", 12)});
        list.stream()
                .forEach(System.out::println);


    }

    private static void optionals() {
        List<Optional<String>> optionalList = List.of(Optional.of("a"), Optional.empty(), Optional.of("b"));

        optionalList.stream()
                .flatMap(Optional::stream)
                .forEach(System.out::println);

//<editor-fold defaultstate="collapsed" desc="optionals">
//        optionalList.stream()
//                .flatMap(Optional::stream)
//                .forEach(System.out::println);
//</editor-fold>

    }


    public static void main(String[] args) {

        collections();
//        optionals();

    }
}
