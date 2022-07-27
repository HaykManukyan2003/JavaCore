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
        boolean isRemoved = removeFromMap(hashMap, 36);
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
        if (memberMap.containsKey(numberToRemove)) {
            memberMap.remove(numberToRemove);
            return true;
        }
        return false;
    }

    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    static void printAllMembers(Map<Integer, String> memberMap) {
        Iterator<Integer> integerIterator = memberMap.keySet().iterator();
        Iterator<String> stringIterator = memberMap.values().iterator();
        while (integerIterator.hasNext() && stringIterator.hasNext()) {
            System.out.print(integerIterator.next() + " - ");
            System.out.println(stringIterator.next());
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
