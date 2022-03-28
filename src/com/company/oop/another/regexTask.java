package com.company.oop.another;

import java.io.*;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface practice{
    int a =5;
}

public class regexTask implements practice {

    public static void main(String[] args) throws IOException {

        String data = "";
        data = new String(Files.readAllBytes(Paths.get("/home/pruthviraj/Downloads/event-tracker-logs")));

        String output = data.replaceAll("\\n", "");
        System.out.println(output);
        Pattern p = Pattern.compile("\\d+\\-+\\w+\\-+\\d+\\s+\\d+\\s+\\d+\\:+\\d+\\:+\\d+\\.+\\d+\\s+\\w+\\s+[\\[]\\w+\\]+\\s+");

          Pattern metName = Pattern.compile("(\\\"metric.name\\\")\\s\\:\\s\\\"(\\w+)\\s(\\w+)|(\\\"error.code\\\")\\s\\:\\s\\\"(\\w+)|(\\\"id\\\")\\s\\:\\s(\\w+)|(\\\"event.timestamp\\\")\\s\\:\\s(\\w+)");
//        Pattern errCode = Pattern.compile("(\\\"error.code\\\")\\s\\:\\s\\\"(\\w+)");
//        Pattern status = Pattern.compile("(\\\"status\\\")\\s\\:\\s\\\"(\\w+)");
//        Pattern id = Pattern.compile("(\\\"id\\\")\\s\\:\\s(\\w+)");
//        Pattern time = Pattern.compile("(\\\"event.timestamp\\\")\\s\\:\\s(\\w+)");

        String[] arr = p.split(output);

    //  (?i)event.id\s+(\d+)
        // //  (\bmetric.name\b.*)
        //(status)\"\s\:\s\"(\w+)\s(\w+)
        // (\"id\")\s\:\s\"(\w+)
        // (\"error.code\")\"\s\:\s\"(\w+)
        // (\"event.timestamp\")\s\:\s(\w+)
        // (\"metric.name\")\s\:\s\"(\w+)\s(\w+)
        // (\"error.code\")\s\:\s\"(\w+)

        for(String line:arr){
            System.out.println(line);
        }

        System.out.println(arr.length);
        for(String line:arr) {
            Matcher matcher = metName.matcher(line);

            while(matcher.find()){
                System.out.println(matcher.group());
            }
            System.out.println("-----------------------------------");
        }
    }
}
