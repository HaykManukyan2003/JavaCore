package collection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        FootballTeamMember player1 = new FootballTeamMember(10, "Del Piero");
        FootballTeamMember player2 = new FootballTeamMember(1, "GG Buffon");
        FootballTeamMember player3 = new FootballTeamMember(16, "Daniele De Rossi");
        List<FootballTeamMember> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Map<Integer, String> footballTeam = createFootballTeam(players);
        System.out.println(footballTeam);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "gg");
        hashMap.put(5, "dd");
        hashMap.put(7, "hh");

        printAllMembers(hashMap);
        printAllMemberNames(hashMap);
        boolean isRemoved = removeFromMap(hashMap, 34);
        System.out.println(isRemoved);

    }

    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> hashMap = new HashMap<>();
        for (FootballTeamMember teamMember : members) {
            hashMap.put(teamMember.getNumber(), teamMember.getName());
        }
        return hashMap;
    }

    static boolean removeFromMap(Map<Integer, String> memberMap, Integer numberToRemove) {
        String value = memberMap.remove(numberToRemove);
        return value != null;
    }

    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer, String> entry : memberMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static class FootballTeamMember {

        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
