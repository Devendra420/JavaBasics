package cframework;

import java.util.*;

public class MPA {
    public static void main(String[] args){
        System.out.println("Collection Framework.");
        Map<String,Object> mapData = new HashMap<>();
        mapData.put("Key1","value1");
        mapData.put("Key2","value2");
        mapData.put("Key3","value3");
        System.out.println(mapData.get("Key1"));
        mapData.put("Key1","Value unknown.");
        System.out.println(mapData.get("Key1"));
        mapData.containsKey("Key1");
        mapData.forEach((key,value)->{
            System.out.printf("Value for key %s is %s%n",key,value);
        });
        mapData.remove("Key2");
        mapData.keySet().forEach((key)->{
            System.out.println(mapData.get(key));
        });
//        System.out.println(mapData.get("Key2"));
        Map<String,Object> newMap = new HashMap<>();
        newMap.put("Key4","value4");
        newMap.putAll(mapData);
        System.out.println(newMap.get("Key3"));
        Map<String, Object> treeMap = new TreeMap<>();
        treeMap.put("MapKey1", "1");
        treeMap.put("MapKey2", "2");
        treeMap.forEach((key,value)->{

        System.out.println(treeMap.get(key));
        });
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Value4");
        queue.add("Value2");
        queue.add("Value3");
            System.out.println(queue.poll());

            queue.remove("Value2");


    }
}
