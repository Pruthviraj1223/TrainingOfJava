package com.company.oop;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/pruthviraj/IdeaProjects/TrainingOfJava/src/parallelStreamText");

        List<String> text = Files.readAllLines(file.toPath());

        text.parallelStream().forEachOrdered(System.out::println);

        //GFG


    }
}
