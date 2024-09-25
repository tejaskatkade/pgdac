import java.util.HashMap;
import java.util.Map;

public class HashMapExample{

    public static void print(Map<Integer,String> map ){
        for(Map.Entry<Integer,String> entryMap : map.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key : "+key+"  Value : "+value); 
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(null, "Test");
        map.put(0, "null");
        map.put(1, "A");
        map.put(2, "B");

        print(map);
        // Key : null  Value : Test
        // Key : 0  Value : null
        // Key : 1  Value : A
        // Key : 2  Value : B


        // If the specified key is not already associated with a value (or is mapped to null) 
        // associates it with the given value and returns null, 
        // else returns the current value.

        map.putIfAbsent(null, "test");  // not get stores as previously there is value
        map.putIfAbsent(0, "ZERO");     // as the value is null so the this get stores(over write)
        map.putIfAbsent(1, "A");        // no changes
        map.putIfAbsent(2, "B");        // no changes

        print(map);

        // Key : null  Value : Test
        // Key : 0  Value : null
        // Key : 1  Value : A
        // Key : 2  Value : B


        // boolean java.util.Map.isEmpty()
        System.out.println("isEmpty : "+ map.isEmpty());        // isEmpty : false

        // int java.util.Map.size()
        System.out.println("Size : "+ map.size());              // Size : 4

        // boolean java.util.Map.containsKey(Object key)
        System.out.println("Contains Key : "+map.containsKey(2));       // Contains Key : true

        // Map.get(Object key) : String
        System.out.println("Get : "+map.get(1));                        // Get : A

        //String java.util.Map.getOrDefault(Object key, String defaultValue)
        System.out.println("Get or Default : "+map.getOrDefault(9, "Default value"));// Get or Default : Default value
        
        //String java.util.Map.remove(Object key)
        System.out.println("Remove particular value : "+map.remove(null));      // Remove particular value : Test

        System.out.println("Map data");
        print(map);

        // Map data
        // Key : 0  Value : null
        // Key : 1  Value : A
        // Key : 2  Value : B

        //_________________________________________________________________________

        // Set<Integer> java.util.Map.keySet()

        System.out.println("Keys : "+ map.keySet());
        // Keys : [0, 1, 2]


        for(Integer i : map.keySet()){
            System.out.println("Key : "+ i);
        }
        // Key : 0
        // Key : 1
        // Key : 2
        
        //Collection<String> java.util.Map.values()
        System.out.println("Values : "+map.values());
       // Values : [null, A, B]

        for(String str : map.values()){
            System.out.println("value : "+ str);
        }

        
        // value : null
        // value : A
        // value : B

    }


}