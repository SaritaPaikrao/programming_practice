package org.DSA;

import org.w3c.dom.ls.LSInput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRobotParts {
    private static String[] get_robots(String[] allParts, String requiredParts1) {
        Set<String> required = Arrays.stream(requiredParts1.split(",")).collect(Collectors.toSet());

        Map<String, Set<String>> robotParts = new HashMap<>();
        for(String str : allParts) {
            String[] strAry = str.split("_");
            if (!robotParts.containsKey(strAry[0])) {
                robotParts.put(strAry[0], new HashSet<String>());
            }
            robotParts.get(strAry[0]).add(strAry[1]);
            //robotParts.computeIfAbsent(strAry[0], e-> new HashSet<>()).add(strAry[1]);
        }
        System.out.println(robotParts);
        List<String> buildable = new ArrayList<>();
        for (Map.Entry<String, Set<String>> map : robotParts.entrySet()){
            if (map.getValue().containsAll(required)) {
               buildable.add(map.getKey());
            }
        }
        System.out.println(buildable);
        return null;
    }
    public static void main(String[] argv) {

        String required_parts_1 = "sensors,case,speaker,wheels";
        String required_parts_2 = "sensors,case,speaker,wheels,claw";
        String required_parts_3 = "sensors,case,screws";

        String[] all_parts = {
                "Rosie_claw",
                "Rosie_sensors",
                "Dustie_case",
                "Optimus_sensors",
                "Rust_sensors",
                "Rosie_case",
                "Rust_case",
                "Optimus_speaker",
                "Rosie_wheels",
                "Rosie_speaker",
                "Dustie_case",
                "Dustie_arms",
                "Rust_claw",
                "Dustie_case",
                "Dustie_speaker",
                "Optimus_case",
                "Optimus_wheels",
                "Rust_legs",
                "Optimus_sensors"};
        String[] strAyr = get_robots(all_parts, required_parts_1);

    }


}
