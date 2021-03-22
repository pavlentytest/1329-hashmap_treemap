package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	        // Maps - словарь
            // ключ - значение

        // Hashtable
        // пары - ключ-значение
        // неупорядочено
        // null нельзя, потокобезопасная

        Hashtable<String,Integer> phones = new Hashtable<>();
        phones.put("Ivan",345345);
        phones.put("Petr",7688);
        phones.put("Ivan",345345);
        phones.put("Alex",664004);
        phones.put("Olga",1226224);

        Enumeration keys = phones.keys();
        while(keys.hasMoreElements()) {
            String name = (String)keys.nextElement();
            System.out.println(name + "; "+phones.get(name));
        }

        // HashMap
        // nullы можно
        // потоконебезопасное

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("key4","value4");
        map2.put("key5","value5");
        map2.put("key6","value6");

        map1.putAll(map2);

        Set<Map.Entry<String,String>> set = map1.entrySet();
        for(Map.Entry<String,String> s: set) {
            System.out.println(s.getKey() + "; "+s.getValue());
        }
        map1.remove("key5");
        boolean flag = map1.containsKey("key6");

        // TreeMap
        // Сортируется - по ключам (Natural ordering)

        TreeMap<Integer,String> days = new TreeMap<>();
        days.put(3,"Monday");
        days.put(5,"Tuesday");
        days.put(1,"Wednesday");
        days.put(5,"Friday");
        days.put(7,"Friday");

        System.out.println(days.keySet());
        System.out.println(days.values());

        System.out.println(days.firstKey());
        System.out.println(days.get(days.firstKey()));



    }
}
