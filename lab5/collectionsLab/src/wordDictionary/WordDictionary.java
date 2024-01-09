package wordDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public ArrayList<String> removeAllKey(char key){
        key = sanitizeKey(key);

        if (! dictionary.containsKey(key)){
            return new ArrayList<>();
        }

        return new ArrayList<>(dictionary.remove(key));
    }

    public ArrayList<String> search(String regx) {
        ArrayList<String> wordsMatched = new ArrayList<>();
        Pattern pattern = Pattern.compile(regx);

        dictionary.forEach((key, words) -> {
            for(String word : words) {
                Matcher matcher = pattern.matcher(word);

                if (matcher.find()){
                    wordsMatched.add(word);
                }
            }
        });

        return wordsMatched;
    }
}
