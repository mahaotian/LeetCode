package edu.neu.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {
    private static final HashMap<Character, Integer> KEYBOARD_MAP = new HashMap<>();

    static {
        KEYBOARD_MAP.put('q', 1);
        KEYBOARD_MAP.put('w', 1);
        KEYBOARD_MAP.put('e', 1);
        KEYBOARD_MAP.put('r', 1);
        KEYBOARD_MAP.put('t', 1);
        KEYBOARD_MAP.put('y', 1);
        KEYBOARD_MAP.put('u', 1);
        KEYBOARD_MAP.put('i', 1);
        KEYBOARD_MAP.put('o', 1);
        KEYBOARD_MAP.put('p', 1);

        KEYBOARD_MAP.put('a', 2);
        KEYBOARD_MAP.put('s', 2);
        KEYBOARD_MAP.put('d', 2);
        KEYBOARD_MAP.put('f', 2);
        KEYBOARD_MAP.put('g', 2);
        KEYBOARD_MAP.put('h', 2);
        KEYBOARD_MAP.put('j', 2);
        KEYBOARD_MAP.put('k', 2);
        KEYBOARD_MAP.put('l', 2);

        KEYBOARD_MAP.put('z', 3);
        KEYBOARD_MAP.put('x', 3);
        KEYBOARD_MAP.put('c', 3);
        KEYBOARD_MAP.put('v', 3);
        KEYBOARD_MAP.put('b', 3);
        KEYBOARD_MAP.put('n', 3);
        KEYBOARD_MAP.put('m', 3);
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            int key = KEYBOARD_MAP.get(lowerCaseWord.charAt(0));
            boolean sameRow = true;
            for (int i = 0; i < word.length(); i++) {
                if (key != KEYBOARD_MAP.get(lowerCaseWord.charAt(i))) {
                    sameRow = false;
                    break;
                }
            }
            if (sameRow) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
