package commonfollowers;
import java.util.*;

/*Q8 — Common Followers Between Users
Problem:
Given pairs (userId, followerId) indicating that followerId follows userId, return for every unordered pair of users the list of common followers.
Sample Input:
follows = [
        ["U1", "A"], ["U1", "B"], ["U2", "B"],
        ["U2", "C"], ["U3", "A"], ["U1", "C"]
        ]

Sample Output:
        {
        "U1,U2": ["B","C"],
        "U1,U3": ["A"],
        "U2,U3": []
        }
Copilot said:*/




public class CommonFollowers {

    public static Map<String, List<String>> commonFollowers(List<List<String>> follows) {

//         follower -> set of users they follow
        Map<String, Set<String>> followerToUsers = new HashMap<>();
        Set<String> allUsers = new HashSet<>();

        for (List<String> edge : follows) {
            String user = edge.get(0);
            String follower = edge.get(1);

            followerToUsers.computeIfAbsent(user, k -> new HashSet<>()).add(follower);
            allUsers.add(user);
        }

        // (u1,u2) -> followers list
        Map<String, List<String>> pairToFollowers = new HashMap<>();

//        for (Map.Entry<String, Set<String>> entry : followerToUsers.entrySet()) {
//            String follower = entry.getKey();
//            List<String> users = new ArrayList<>(entry.getValue());
//            Collections.sort(users);
//
//            for (int i = 0; i < users.size(); i++) {
//                for (int j = i + 1; j < users.size(); j++) {
//                    String u1 = users.get(i);
//                    String u2 = users.get(j);
//                    String key = u1 + "," + u2;
//
//                    pairToFollowers.computeIfAbsent(key, k -> new ArrayList<>()).add(follower);
//                }
//            }
//        }

        // Ensure empty lists for missing pairs
        List<String> userList = new ArrayList<>(allUsers);
        Collections.sort(userList);

        Map<String, List<String>> result = new LinkedHashMap<>();
        for (int i = 0; i < userList.size(); i++) {
            for (int j = i + 1; j < userList.size(); j++) {
                String key = userList.get(i) + "," + userList.get(j);

                Set<String> follower_1= followerToUsers.getOrDefault(userList.get(i),Collections.emptySet());
                Set<String> follower_2= followerToUsers.getOrDefault(userList.get(j),Collections.emptySet());

                List<String> followers = new ArrayList<>();
                for(String follower: follower_1) {
                    if(follower_2.contains(follower)) {
                        followers.add(follower);
                    }
                }
                Collections.sort(followers);
                result.put(key, followers);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        List<List<String>> follows = Arrays.asList(
                Arrays.asList("U1", "A"), Arrays.asList("U1", "B"), Arrays.asList("U2", "B"),
                Arrays.asList("U2", "C"), Arrays.asList("U3", "A"), Arrays.asList("U1", "C")
        );

        System.out.println(commonFollowers(follows));
    }
}

