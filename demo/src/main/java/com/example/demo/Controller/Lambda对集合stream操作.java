package com.example.demo.Controller;
import java.util.*;

public class Lambda对集合stream操作 {
    public static void main(String[] args) {
        //stream操作
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        //filter过滤
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println); //遍历输出带有a的
        //sort排序  排序只创建了一个排列好后的Stream，而不会影响原有的数据源
        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        //map映射，将其转换为大写字母
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
        //count计数
        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))  //startsWith()是否指定的前缀
                        .count();
        System.out.println(startsWithB);    // 3

        Map<Integer, String> map = new HashMap<>();

        //对map的value进行操作
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        //Merge做的事情是如果键名不存在则插入，否则则对原键对应的值做合并操作并重新插入到map中。
        map.forEach((id, val) -> System.out.println(val));
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9concat


//        Match 匹配
//        boolean anyStartsWithA =
//                stringCollection
//                        .stream()
//                        .anyMatch((s) -> s.startsWith("a"));
//
//        System.out.println(anyStartsWithA);      // true
//
//        boolean allStartsWithA =
//                stringCollection
//                        .stream()
//                        .allMatch((s) -> s.startsWith("a"));
//
//        System.out.println(allStartsWithA);      // false
//
//        boolean noneStartsWithZ =
//                stringCollection
//                        .stream()
//                        .noneMatch((s) -> s.startsWith("z"));
//
//        System.out.println(noneStartsWithZ);      // true
    }

}
