package org.example;


import javax.sound.midi.Patch;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample8 {
    public static void main(String[] args) {
        String path = "C://Users/10746735/OneDrive - LTIMindtree/Desktop/sample.txt";

        System.out.println(path);
        try{
            BufferedReader bufferedReader =  new BufferedReader(new FileReader(path));

            String line;
            String str = "" ;
            while ((line = bufferedReader.readLine()) != null) {

                str = line;
            }
            System.out.println(str);
            Set<String> duplicate = new HashSet<>();


            Map<String,Long> countMap = new HashMap<>();
            countMap = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(countMap.entrySet().stream().filter(e -> e.getValue() >1).map(e->e.getKey()).collect(Collectors.toSet()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
/*        String str = "SaritaPaikrAop";
        Set<String> duplicate = new HashSet<>();

        Map<String,Long> countMap = new HashMap<>();
        countMap = Stream.of(str.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap.entrySet().stream().filter(e -> e.getValue() >1).map(e->e.getKey()).collect(Collectors.toSet()));*/




    }
}
