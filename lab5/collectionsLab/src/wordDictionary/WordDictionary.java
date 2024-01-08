package wordDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class WordDictionary {
    private final HashMap<Character, TreeSet<String>> dictionary;

    private String sanitizeWord(String word) {
        return word.trim();
    }

    private char sanitizeKey(char key) {
        return Character.toLowerCase(key);
    }
    private char extractKey(String word){
        return sanitizeKey(sanitizeWord(word).charAt(0));
    }

    public WordDictionary() {
        dictionary = new HashMap<>(26);
    }

    public void insert(ArrayList<String> words){

        for (String word : words) {
            word = sanitizeWord(word);
            char key = extractKey(word);

            if (!Character.isAlphabetic(key)) {
                continue;
            }

            if (!dictionary.containsKey(key)) {
                dictionary.put(key, new TreeSet<>());
            }

            TreeSet<String> values = dictionary.get(key);
            values.add(word);
        }

    }

    public ArrayList<String> getWords(char key){
        key = sanitizeKey(key);
        if ( ! dictionary.containsKey(key)){
            return new ArrayList<>();
        }

        return new ArrayList<>(dictionary.get(key));
    }

    public void printDictionary() {
        dictionary.forEach((key, values) -> {
           System.out.print(key + " => { ");
           values.forEach((word) -> System.out.print(word + " "));

           System.out.println("}");
        });
    }

    public Boolean removeWord(String word){
        word = sanitizeWord(word);
        Character key = extractKey(word);

        if ( ! dictionary.containsKey(key)){
            return false;
        }

        TreeSet<String> words = dictionary.get(key);

        return words.remove(word);
    }
}
