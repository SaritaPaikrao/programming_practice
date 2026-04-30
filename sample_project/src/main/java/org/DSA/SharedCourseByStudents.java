package org.DSA;

import java.util.*;
import java.util.stream.Collectors;

public class SharedCourseByStudents {
    public static void main(String[] args) {

        List<String[]> enrollments1 = Arrays.asList(
                new String[]{"58", "Linear Algebra"},
                new String[]{"94", "Art History"},
                new String[]{"94", "Operating Systems"},
                new String[]{"17", "Software Design"},
                new String[]{"58", "Mechanics"},
                new String[]{"58", "Economics"},
                new String[]{"17", "Linear Algebra"},
                new String[]{"17", "Political Science"},
                new String[]{"94", "Economics"},
                new String[]{"25", "Economics"},
                new String[]{"58", "Software Design"}
        );

        Map<String,List<String>> outPut = sharedCourse(enrollments1);
        outPut.forEach((k, v) -> System.out.println(k+ " -> "+v));
    }

    private static Map<String, List<String>> sharedCourse(List<String[]> enrollments1) {
        Map<String, Set<String>> courseByStud = new HashMap<>();
        for(String[] pair:enrollments1){
            String id = pair[0];
            String course = pair[1];

            courseByStud.computeIfAbsent(id, key -> new HashSet<>()).add(course);
        }
        System.out.println(courseByStud);

       int n = courseByStud.keySet().size();
       List<String> students = new ArrayList<>(courseByStud.keySet());
       Map<String, List<String>> result =  new LinkedHashMap<>();
       for(int i = 0; i< students.size(); i++){
                String student = students.get(i);
                Set<String> setA = courseByStud.get(student);

           for (int j = i+1; j < n; j++) {
            String stud = students.get(j);
            Set<String> setB = courseByStud.get(stud);
            //intersect

               Set<String> smaller = (setA.size() <= setB.size() ? setA :setB);
               Set<String> larger = (smaller.size() == setA.size()) ? setB : setA;

               List<String> sharedCourse = new ArrayList<>();
               for(String course: smaller){
                   if (larger.contains(course)){
                       sharedCourse.add(course);
                   }
               }
               String studCommon = student+", "+stud;
               result.put(studCommon,sharedCourse);
           }
       }
    return result;
    }
}
