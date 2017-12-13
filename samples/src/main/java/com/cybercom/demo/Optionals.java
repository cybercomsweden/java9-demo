package com.cybercom.demo;

import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        optionalStreams();
    }

    private static void optionalStreams() {

        List<Optional<String>> optionalList = List.of(Optional.of("a"), Optional.empty(), Optional.of("b"));

        optionalList.stream()
                .flatMap(Optional::stream)
                .forEach(System.out::println);

    }

}
