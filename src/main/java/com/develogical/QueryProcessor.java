package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if(query.toLowerCase().contains("name")){
            return "Chanel and Daniella";
        }

        if(query.toLowerCase().contains("largest")){
            List<Integer> numbers = new ArrayList<Integer>();

            String segments[] = query.substring(query.lastIndexOf(":") + 1).replace('?',' ').split(",");
            for(String num: segments){
                numbers.add(Integer.parseInt(num.trim()));
            }

            Collections.sort(numbers);

            return String.valueOf(numbers.get(numbers.size() - 1));
        }

        return "";
    }

    public int findSquare(int i) {
        return i*i;
    }
}
