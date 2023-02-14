package com.pp.sun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharInGivenString {
    public static void main(String[] args) {
        String str = "gahsadyuashjddhvuwqb";

      
      
   //-------------------------------------------First Approch-----------------------------------------------------
        Map<Object, Long> characterIntegerHashMap = Arrays.asList(str.split("")).stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        e -> e,
                                        Collectors.counting()
                                )
                );

        System.out.println(characterIntegerHashMap);
/*
        ----------------------------------second appraoch----------------------------------------------------------------
*/

        HashMap<String, Integer> data = new HashMap<>();

        for (String e : str.split("")) {

            data.put(e, (data.get(e) == null) ? 1 : data.get(e) + 1);
        }
        System.out.println(data);



    }
}
//This code is contributed by Shivam Miglani
