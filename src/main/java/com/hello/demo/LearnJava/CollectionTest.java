package com.hello.demo.LearnJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class CollectionTest {
    public static void main(String[] args) {
        Collection person = new ArrayList();
        person.add("Rosaline");
        person.add("Trudy");
        person.add("Bred");
        // System.out.println(person);

        // person.forEach(new Consumer() {
        //     @Override
        //     public void accept(Object o) {
        //         System.out.println(o);
        //     }
        // });
        person.forEach(o -> System.out.println(o));

        //用Iterator 遍历
        Iterator it = person.iterator();
        while(it.hasNext()) {
            String p = (String)it.next();
            System.out.println(p);
        }


        System.out.println("================================HashSet=====================");
        Set people = new HashSet();
        people.add("Jay Chou");
        people.add("Cai Kangyong");  
        people.add("He Jiong");
        people.add("YiYang Qianxi");

        System.out.println(people);
        people.forEach(p -> System.out.println(p));

        System.out.println("================================LinkedHashSet=====================");

        Set nums = new LinkedHashSet();
        nums.add(5);
        nums.add(3);
        nums.add(10);
        nums.add(1);
        System.out.println(nums);

        System.out.println("================================TreeSet=====================");
        TreeSet treeNumbs = new TreeSet();
        treeNumbs.add(5);
        treeNumbs.add(1);
        treeNumbs.add(9);
        treeNumbs.add(7);
        treeNumbs.add(3);
        treeNumbs.add(-1);
        System.out.println(treeNumbs);
        System.out.println(treeNumbs.first());
        System.out.println(treeNumbs.lower(4));
        System.out.println(treeNumbs.subSet(1, 7));


        System.out.println("=================================");
        HashMap<Integer, String> myMaps = new HashMap();
        myMaps.put(1, "Rosaline");
        myMaps.put(2, "Zeng");
        myMaps.put(3, "Vivi");
        myMaps.put(4, "Claire");

        System.out.println(myMaps);

        for (Integer key : myMaps.keySet()) {
            System.out.println(key + " : " + myMaps.get(key));
        }

        for (String str: myMaps.values()) {
            System.out.println("value is: " + str);
        }

        myMaps.forEach((k,v) -> System.out.println(k + " === " + v));

        System.out.println("=================================");

        //Map 如何使用Stream 流
        Stream<Integer> keyStream = myMaps.keySet().stream();
        Stream<String> valueStream = myMaps.values().stream();
        Stream<Map.Entry<Integer,String>> entryStream = myMaps.entrySet().stream();

        keyStream.filter((s -> s < 3)).forEach(System.out::println);
        valueStream.filter(s -> s.startsWith("Z")).forEach(s -> System.out.println(s));
        entryStream.filter(s -> s.getKey() < 3).filter(s -> s.getValue().startsWith("R")).forEach(System.out::println);
    }
}
