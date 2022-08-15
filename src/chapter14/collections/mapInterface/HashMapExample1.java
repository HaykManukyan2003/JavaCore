package chapter14.collections.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Hayk Manukyan");
        map1.put(2000, "Vahagn Manukyan");
        map1.put(3000, "Hikaru Nakamura");
        map1.put(4500, "Hikaru Nakamura");
        map1.put(null, "Magnus Carlsen");
        map1.put(7600, null);
        map1.putIfAbsent(2000, "Vahagn Manukyan");
        map1.putIfAbsent(8000, "bro");

        System.out.println(map1);

        System.out.println(map1.get(1000));
        map1.remove(3000);

        System.out.println(map1);
        System.out.println(map1.containsValue("Magnus Carlsen"));
        System.out.println(map1.containsKey(400));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Grishuk");
        map2.put("Morozevich", "Aleksandr");
    }
}
