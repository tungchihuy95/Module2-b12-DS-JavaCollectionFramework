package tt_studentlist_age;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        //tao HashMap de luu danh sach sinh vien
        //taoj HashMap hay LinkedHashMap... thi van phai tu Map
        //2 tham so: ten, tuoi.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tung", 25);
        hashMap.put("Huy", 23);
        hashMap.put("Chien", 24);
        hashMap.put("Quynh", 27);
        hashMap.put("Tuyet", 20);
        System.out.println("Display entry in HashMap: ");
        System.out.println(hashMap + "\n");


        //tao TreeMap de luu key theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key: ");
        System.out.println(treeMap);


        //tao Linkedhashmap trong main luu danh sach sinh vien va hien thi du lieu
        Map<String , Integer> linkedHashMap =  new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("Tung", 39);
        linkedHashMap.put("Huy", 25);
        linkedHashMap.put("Chien", 48);
        linkedHashMap.put("Quynh", 90);
        linkedHashMap.put("Tuyet", 57);

        System.out.println("\n The age for " + "Tung is " + linkedHashMap.get("Tung"));



        }


    }

