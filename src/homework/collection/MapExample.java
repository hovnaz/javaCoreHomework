package homework.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    static List<FootballTeamMember> listOfPlayer = new ArrayList<>();
    public static void main(String[] args) {
        FootballTeamMember player1 = new FootballTeamMember(10,"Henrik Mxitaryan");
        FootballTeamMember player2 = new FootballTeamMember(11,"Henrik Mxitaryan");
        FootballTeamMember player3 = new FootballTeamMember(7,"Henrik Mxitaryan");
        listOfPlayer.add(player1);
        listOfPlayer.add(player2);
        listOfPlayer.add(player3);
        Map<Integer, String> playerMap = createFootballTeam(listOfPlayer);
        removeFromMap(playerMap, 10);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        HashMap<Integer, String> map = new HashMap<>();
        for (FootballTeamMember member : members) {
            map.put(member.getNumber(), member.getName());
        }
        return map;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        return  memberMap.remove(removedNumber) != null;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
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

        @Override
        public String toString() {
            return "FootballTeamMember{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}