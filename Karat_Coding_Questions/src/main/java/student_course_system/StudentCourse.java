package student_course_system;

import java.util.*;

public class StudentCourse {
    public static Map<String, List<String>> findPairs(List<List<String>> enrollments){
        Map<String, Set<String>> studentCourses = new HashMap<>();
        for(List<String> pairs: enrollments){
            String studentId = pairs.get(0);
            String course = pairs.get(1);
            studentCourses.computeIfAbsent(studentId, k -> new HashSet<>()).add(course);
        }

        List<String> students = new ArrayList<>(studentCourses.keySet());
        students.sort(Comparator.comparingInt(Integer :: parseInt));

        Map<String, List<String>> result = new LinkedHashMap<>();
        for(int i = 0; i < students.size(); i++){
            for (int j = i+1; j < students.size(); j++){
                String s1 = students.get(i);
                String s2 = students.get(j);

                Set<String> c1 = studentCourses.get(s1);
                Set<String> c2 = studentCourses.get(s2);

                Set<String> shared = new HashSet<>();
                if(c1.size() <= c2.size()){
                    for(String c : c1){
                        if(c2.contains(c)){
                            shared.add(c);
                        }
                    }
                }else{
                    for (String c : c2){

                        if(c1.contains(c)){
                            shared.add(c);
                        }
                    }
                }

                List<String> sharedList = new ArrayList<>(shared);
                Collections.sort(sharedList);

                result.put(s1 +", "+ s2, sharedList);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<List<String>> enrollments1 = Arrays.asList(
                Arrays.asList("58", "Linear Algebra"),
                Arrays.asList("94", "Art History"),
                Arrays.asList("94", "Operating Systems"),
                Arrays.asList("17", "Software Design"),
                Arrays.asList("58", "Mechanics"),
                Arrays.asList("58", "Economics"),
                Arrays.asList("17", "Linear Algebra"),
                Arrays.asList("17", "Political Science"),
                Arrays.asList("94", "Economics"),
                Arrays.asList("25", "Economics"),
                Arrays.asList("58", "Software Design")
        );

        Map<String, List<String>> ans = findPairs(enrollments1);
        ans.forEach((k, v) -> System.out.println(k + " -> " + v));


    }

}
