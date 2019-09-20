package com.scala.chapter07;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        String name = "AADDSSSWWWGGGDDDVVVVBBFRRRRREFVMKSDJKFNSLKL";

        Map<String, Integer> stringMap = new HashMap<String, Integer>();

        String[] split = name.split("");

        for (String s : split) {
            if (stringMap.containsKey(s)){
                Integer count = stringMap.get(s);
                stringMap.put(s, count+1);
            }else {
                stringMap.put(s,1);
            }
        }
        System.out.println(stringMap);
    }
}
