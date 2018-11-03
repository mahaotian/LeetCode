package edu.neu.leetcode.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SubdomainVisitCount {
    private static final String REGEX_SPACE = "\\s+";
    private static final String REGEX_DOT = "\\.";

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> count = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] splited = cpdomain.split(REGEX_SPACE);
            Integer num = Integer.valueOf(splited[0]);
            String domain = splited[1];
            String[] allDomain = domain.split(REGEX_DOT);
            StringBuilder currentDomain = new StringBuilder();
            for (int i = allDomain.length - 1; i >= 0; i--) {
                if (i != allDomain.length - 1)
                    currentDomain.insert(0, '.');
                currentDomain.insert(0, allDomain[i]);
                if (count.containsKey(currentDomain.toString())) {
                    int size = count.get(currentDomain.toString());
                    count.remove(currentDomain.toString());
                    count.put(currentDomain.toString(), num + size);
                } else {
                    count.put(currentDomain.toString(), num);
                }
            }
        }
        return count.entrySet().stream().map((entry) -> {
            return entry.getValue() + " " + entry.getKey();
        }).collect(Collectors.toList());
    }
}
