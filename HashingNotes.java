import java.util.*;
public class HashingNotes {

    public static void main (String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sam", 100);
        map.put("Ram", 50);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Ragul" , 45);
        map2.put("vino", 24);

        System.out.println(map.get("Sam")); 
        System.out.println(map.getOrDefault("vibish", 17));
        System.out.println(map.hashCode());
        System.out.println(map.equals(map2));
        System.out.println(map.put("Vishal", 60));
        System.out.println(map.containsKey("Vishal"));
        System.out.println(map.size());
        System.out.println(map2.size());
        System.out.println(map.remove("Vishal"));
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet()); 


    }
    
}
