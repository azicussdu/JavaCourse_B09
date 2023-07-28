package week11.day4;

import java.util.*;

public class Collections_3 {
    public static void main(String[] args) {

        /*
        User enters 10 pairs of Team_name - Football_player.
         */
//        Scanner in = new Scanner(System.in);
//        Map<String, HashSet<String>> teamPlayersMap = new HashMap<>();
//
//        for(int i=1; i<=4; i++){
//            System.out.print("enter team - player: ");
//            String team = in.next();
//            String player = in.next();
//
//            if(teamPlayersMap.containsKey(team)){
//                HashSet<String> set = teamPlayersMap.get(team);
//                set.add(player);
//            }
//            else {
//                teamPlayersMap.put(team, new HashSet<>());
//                HashSet<String> set = teamPlayersMap.get(team);
//                set.add(player);
//            }
//        }
//
////        System.out.println(teamPlayersMap);
//        // the team Barcelona has players: Pedri, Gavi, Araujo
//        // the team Real has players: Modric, Bellingham
//        Set<String> keys = teamPlayersMap.keySet();
//
//        for(String key : keys){
//            System.out.println("the team " + key + " has players: " + teamPlayersMap.get(key));
//        }



        /*
        User enters 10 pairs of Name-Age. So if a map already contains this name
        - then the value for this name can be changed only if newAge > oldAge.
         */
//        Scanner in = new Scanner(System.in);
//        Map<String, Integer> nameAgeMap = new HashMap<>();
//
//        for(int i=1; i<=10; i++){
//            System.out.print("enter name age: ");
//            String name = in.next();
//            Integer age = in.nextInt();
//
//            if(nameAgeMap.containsKey(name)){
//                if(age > nameAgeMap.get(name))
//                    nameAgeMap.replace(name, age);
//            }else {
//                nameAgeMap.put(name, age);
//            }
//        }
//
//        System.out.println(nameAgeMap);

        //-------------------------------------------

//        Map stores pair of values (key - value)

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("John", 20);
//        map.put("Terry", 20);
//        map.put("Mary", 21);
//        map.put("Simona", 24);
//        map.put("Arnold", 26);
//        System.out.println("HashMap: " + map);

//        Map<String, Integer> map2 = new HashMap<>();
//        map2.putAll(map);
//        System.out.println(map2);

//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.putAll(map);
//
//        System.out.println("TreeMap: " + treeMap);

//        Collection<Integer> allValues = map.values();
//        System.out.println(allValues);

//        map.replace("John", 20, 40);
//        System.out.println(map);

//        map.remove("John", 40);
//        System.out.println(map);

//        Map<String, Integer> map2 = new HashMap<>();
//        map2.putAll(map);
//        System.out.println(map2);

//        System.out.println(map);

//        Set<String> keys = map.keySet();
//        System.out.println(keys);

//        for(String key : keys){ // keys = {John, Terry, Mary}
//            System.out.println(key + " is " + map.get(key) + " years old");
//        }

//        Map<Integer, String> map = new HashMap<>();
//        map.putIfAbsent(10, "John");
//        map.putIfAbsent(10, "Mary");
//        map.putIfAbsent(11, "Terry");
//
//        System.out.println(map.containsValue("John"));
//        System.out.println("value for 11 is: " + map.get(11));
//
//        System.out.println(map);
    }
}
