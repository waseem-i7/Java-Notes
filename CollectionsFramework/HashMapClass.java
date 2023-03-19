package JavaNotes.CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"waseem");
        map.put(4,"Idrisi");
        map.put(9,"MWI");
        System.out.println(map.get(2));
        System.out.println(map.size());;
        System.out.println(map.containsKey(8));
        System.out.println(map.containsValue("waseem"));

        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println("Key is "+e.getKey() + " Value is "+e.getValue());
        }

        for (Integer  e : map.keySet()){
            System.out.println(e);;
        }

        for (String e : map.values()){
            System.out.println(e);
        }
    }
}
