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


/*  
What is Hashing?

Hashing is a technique to store and search data very fast using a hash function.

In Java, hashing is mainly used in Collections Framework.

✅ Main Hashing-Based Data Structures in Java
1️⃣ HashMap (Most Important 🔥)

Stores data in key → value pairs.

Example:
HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.put("banana", 20);

System.out.println(map.get("apple")); // 10

Use When:

✔ You need key-value mapping
✔ Fast lookup by key

2️⃣ HashSet

Stores only unique values.

Example:
HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(10); // duplicate, ignored

System.out.println(set); // [10, 20]

Use When:

✔ You need unique elements
✔ No duplicates allowed

3️⃣ LinkedHashMap

Like HashMap but maintains insertion order.

Example:
LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
map.put("A", 1);
map.put("B", 2);

Difference:

HashMap → no order ❌

LinkedHashMap → insertion order ✅

4️⃣ LinkedHashSet

Like HashSet but maintains insertion order.

Example:
LinkedHashSet<Integer> set = new LinkedHashSet<>();
set.add(10);
set.add(20);

5️⃣ Hashtable (Old but important ⚠️)

Similar to HashMap but:

Thread-safe ✅

Slower ❌

No null key/value ❌

Example:
Hashtable<String, Integer> table = new Hashtable<>();
table.put("A", 1);

📊 Hashing Structures Summary Table
Data Structure	Stores	Order	Duplicates
HashMap	Key + Value	❌ No	Keys ❌, Values ✅
HashSet	Values only	❌ No	❌ No
LinkedHashMap	Key + Value	✅ Yes	Keys ❌
LinkedHashSet	Values only	✅ Yes	❌ No
Hashtable	Key + Value	❌ No	Keys ❌
*/
