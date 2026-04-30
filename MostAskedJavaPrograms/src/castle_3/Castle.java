package castle_3;

import java.util.*;
/*
You said:




You are with your friends in a castle, where there are multiple rooms named after flowers. Some of the rooms contain treasures - we call them the treasure rooms.

Each room contains a single instruction that tells you which room to go to next.

*** instructions_1 and treasure_rooms_1 ***

lily* --------- daisy sunflower
| | |
v v v
jasmin --> tulip* violet* ----> rose* -->
^ | ^ ^ |
| | | | |
------ iris ---------

denotes a treasure room, e.g., rose is a treasure room, but jasmin isn't.
This is given as a list of pairs of (source_room, destination_room)

instructions_1 = [
["jasmin", "tulip"],
["lily", "tulip"],
["tulip", "tulip"],
["rose", "rose"],
["violet", "rose"],
["sunflower", "violet"],
["daisy", "violet"],
["iris", "violet"]
]

treasure_rooms_1 = ["lily", "tulip", "violet", "rose"]

Write a function that takes two parameters as input:

a list of instructions represented as pairs of (source_room, destination_room), and
a list containing the treasure rooms,
*** instructions_1 and treasure_rooms_1 ***

lily* --------- daisy sunflower
| | |
v v v
jasmin --> tulip* violet* ----> rose* -->
^ | ^ ^ |
| | | | |
------ iris ---------

denotes a treasure room, e.g., rose is a treasure room, but jasmin isn't.
This is given as a list of pairs of (source_room, destination_room)

instructions_1 = [
["jasmin", "tulip"],
["lily", "tulip"],
["tulip", "tulip"],
["rose", "rose"],
["violet", "rose"],
["sunflower", "violet"],
["daisy", "violet"],
["iris", "violet"]
]

treasure_rooms_1 = ["lily", "tulip", "violet", "rose"]

Write a function that takes two parameters as input:

a list of instructions represented as pairs of (source_room, destination_room), and
a list containing the treasure rooms,
and returns a collection of all the rooms that satisfy the following two conditions:

at least two other rooms have instructions pointing to this room
this room's instruction immediately points to a treasure room
filter_rooms(instructions_1, treasure_rooms_1) => ["tulip", "violet"]

tulip can be accessed from rooms lily and jasmin. Tulip's instruction points to a treasure room (tulip itself)
violet can be accessed from daisy, sunflower and iris. Violet's instruction points to a treasure room (rose)
Additional inputs

treasure_rooms_2 = ["lily", "jasmin", "violet"]

filter_rooms(instructions_1, treasure_rooms_2) => []

none of the rooms reachable from tulip or violet are treasure rooms
*** instructions_2 and treasure_rooms_3 ***

lily --------- --------
| | |
v v |
jasmin --> tulip ---> violet*--^

instructions_2 = [
["jasmin", "tulip"],
["lily", "tulip"],
["tulip", "violet"],
["violet", "violet"]
]

treasure_rooms_3 = ["violet"]

filter_rooms(instructions_2, treasure_rooms_3) => ["tulip"]

tulip can be accessed from rooms lily and jasmin. Tulip's instruction points to a treasure room (violet)
All the test cases:
filter_rooms(instructions_1, treasure_rooms_1) => ["tulip", "violet"]
filter_rooms(instructions_1, treasure_rooms_2) => []
filter_rooms(instructions_2, treasure_rooms_3) => ["tulip"]

Complexity Analysis variables:
T: number of treasure rooms
I: number of instructions given*/
public class Castle {

    /*
    * Average / Typical
    O(t)+O(n)+O(k)+O(mlog⁡m)O(t) + O(n) + O(k) + O(m \log m)O(t)+O(n)+O(k)+O(mlogm)
    Since k ≤ n:
    O(t+n+mlog⁡m)O(t + n + m\log m)O(t+n+mlogm)
    Worst-case
    If m is big (≈ n):
    O(t+nlog⁡n)\boxed{O(t + n \log n)}O(t+nlogn)​

    If you remove sorting, then time becomes:

    O(t+n)\boxed{O(t + n)}O(t+n)​

    ✅ Final Space Complexity
    Data structures:

    treasure set → O(t)
    next map → O(k) ≤ O(n)
    inOther map → O(r) ≤ O(n)
    ans list → O(m) ≤ O(n)

    So overall auxiliary space:
    O(t+n)\boxed{O(t + n)}O(t+n)
    */
    public static List<String> filter_rooms(List<List<String>> instructions, List<String> treasureRooms) {

        Set<String> treasure = new HashSet<>(treasureRooms);
        Map<String, String> next = new HashMap<>();

        // count only "other rooms" pointing to a destination (ignore self-loop count)
        Map<String, Integer> inOther = new HashMap<>();

        for (List<String> inst : instructions) {
            String from = inst.get(0);
            String to = inst.get(1);

            next.put(from, to);

            // self loop hai to "other rooms" count me add mat karo
            if (!from.equals(to)) {
                inOther.put(to, inOther.getOrDefault(to, 0) + 1);
            }

            // ensure keys exist (optional)
            inOther.putIfAbsent(from, inOther.getOrDefault(from, 0));
        }

        List<String> ans = new ArrayList<>();

        for (String room : next.keySet()) {
            if (inOther.getOrDefault(room, 0) >= 2) {
                String to = next.get(room);
                if (treasure.contains(to)) {
                    ans.add(room);
                }
            }
        }

        Collections.sort(ans); // optional
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> instructions_1 = Arrays.asList(
                Arrays.asList("jasmin", "tulip"),
                Arrays.asList("lily", "tulip"),
                Arrays.asList("tulip", "tulip"),
                Arrays.asList("rose", "rose"),
                Arrays.asList("violet", "rose"),
                Arrays.asList("sunflower", "violet"),
                Arrays.asList("daisy", "violet"),
                Arrays.asList("iris", "violet")
        );

        List<String> treasure_rooms_1 = Arrays.asList("lily", "tulip", "violet", "rose");

        System.out.println(filter_rooms(instructions_1, treasure_rooms_1)); // [tulip, violet]
    }
}
