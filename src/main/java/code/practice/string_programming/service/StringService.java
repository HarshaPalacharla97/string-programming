package code.practice.string_programming.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Service
public class StringService {

    public void stringReverse(String string) {
        string = string.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        System.out.println("Reversed String :: " + sb);
    }

    public void stringVowel(String string) {
        char ch = ' ';
        List<Character> vowelChar = new ArrayList<>();
        vowelChar.addAll(List.of('a', 'e', 'i', 'o', 'u'));
        string = string.toLowerCase();
        Map<Character, Integer> vowelMap = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            vowelMap.put(ch, vowelMap.getOrDefault(ch, 0) + 1);
        }
        List<Character> vowelList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            if (vowelChar.contains(entry.getKey())) {
                vowelList.add(entry.getKey());
            }
        }
        System.out.println("Vowels in a string :: " + vowelList);
    }

    public void stringDuplicateCharRemoval(String string) {
        string = string.toLowerCase();
        Map<Character, Integer> uniqueCharMap = new LinkedHashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        char ch = ' ';
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            uniqueCharMap.put(ch, uniqueCharMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : uniqueCharMap.entrySet()) {
            if (entry.getValue() == 1) {
                stringBuilder.append(entry.getKey());
            }
        }
        System.out.println("Refined String with no duplicates :: " + stringBuilder);
    }

    public void charFrequencyString(String string) {
        string = string.toLowerCase();
        Map<Character, List<Integer>> charFrequencyMap = new LinkedHashMap<>();
        char ch = ' ';
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (!charFrequencyMap.containsKey(ch)) {
                charFrequencyMap.put(ch, new ArrayList<>());
            }
            charFrequencyMap.get(ch).add(i + 1);
        }
        for (Map.Entry<Character, List<Integer>> entry : charFrequencyMap.entrySet()) {
            System.out.println("Character :: " + entry.getKey() + " , Frequency :: " + entry.getValue());
        }
    }

    public void anagramString(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        if (string1.length() != string2.length()) {
            System.out.println("The Given Strings don't make a Anagram");
            return;
        }
        Map<Character, Integer> firstMap = mapInsertion(string1);
        Map<Character, Integer> secondMap = mapInsertion(string2);
        if (firstMap.equals(secondMap)) {
            System.out.println("The Given Strings make a Anagram");
        } else {
            System.out.println("The Given Strings don't make a Anagram");
        }
    }

    private Map<Character, Integer> mapInsertion(String string) {
        char ch;
        Map<Character, Integer> insertMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            insertMap.put(ch, insertMap.getOrDefault(ch, 0) + 1);
        }
        return insertMap;
    }

    public void stringPalindrome(String string) {
        string = string.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        if (string.contentEquals(stringBuilder)) {
            System.out.println("Palindrome!!!");
        } else {
            System.out.println("Not a Palindrome!!!");
        }
    }
}
