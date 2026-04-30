package gym_membership;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Membership {
    /*
            Data for managing a gym membership, and methods which staff can
            use to perform any queries or updates.
        */
    public List<Member> members;
    public Map<Integer, List<Workout>> workOutMap;
    public Membership() {
        members = new ArrayList<>();
        workOutMap = new HashMap<>();
    }


    public void addMember(Member member) {
        members.add(member);
    }

    public void updateMembership(int memberId, MembershipStatus membershipStatus) {
        for (Member member : members) {
            if (member.memberId == memberId) {
                member.membershipStatus = membershipStatus;
                break;
            }
        }
    }

    public MembershipStatistics getMembershipStatistics() {
        int totalMembers = members.size();
        int totalPaidMembers = 0;
        for (Member member : members) {
            if (member.membershipStatus == MembershipStatus.GOLD  || member.membershipStatus == MembershipStatus.SILVER) {
                totalPaidMembers++;
            }
        }
        double conversionRate = (totalPaidMembers / (double) totalMembers) * 100.0;
        return new MembershipStatistics(totalMembers, totalPaidMembers, conversionRate);
    }


    public void addWorkout(int memberId, Workout testWorkout1) {
        boolean exists = false;
        for (Member m : members) {
            if (m.memberId == memberId) {
                workOutMap.putIfAbsent(memberId, new ArrayList<>());
                workOutMap.get(memberId).add(testWorkout1);
                break;

            }
        }
       // if (!exists) return;

    }

    public Map<Integer, Double> getAverageWorkoutDurations() {
        Map<Integer, Double> averageWorkOut = new HashMap<>();

        for (Map.Entry<Integer, List<Workout>> map : workOutMap.entrySet()) {
            int total = 0;
            List<Workout> workOutList = map.getValue();
            for (Workout workout : workOutList) {
                total = total + workout.getDuration();
            }
             double avg = (double) total / workOutList.size();
            averageWorkOut.putIfAbsent(map.getKey(), avg);
        }
        return averageWorkOut;
    }
}
