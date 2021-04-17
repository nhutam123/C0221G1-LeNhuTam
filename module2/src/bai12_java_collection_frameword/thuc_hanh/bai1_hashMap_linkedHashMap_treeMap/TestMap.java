package bai12_java_collection_frameword.thuc_hanh.bai1_hashMap_linkedHashMap_treeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap =new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("display entries in hashMap");
        System.out.println(hashMap+"\n");
        //giới thiệu treeMap
        Map<String,Integer> treeMap =new TreeMap<>(hashMap);
        System.out.println("display entries in ascending order of key");
        System.out.println(treeMap);
        //tạo linkedHashMap
        Map<String,Integer> linkedHashMap=new LinkedHashMap(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        linkedHashMap.get("Lewis");
        linkedHashMap.get("Anderson");
        linkedHashMap.get("Anderson");
        System.out.println(linkedHashMap);
    }

}
