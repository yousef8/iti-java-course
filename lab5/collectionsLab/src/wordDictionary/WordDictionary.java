package wordDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class WordDictionary {
    private final HashMap<Character, TreeSet<String>> dictionary;

    public WordDictionary() {
        dictionary = new HashMap<>(26);
    }

    public void insert(ArrayList<String> words){

        for (String s : words) {
            String word = s.trim();
            Character key = Character.toLowerCase(word.charAt(0));

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
        key = Character.toLowerCase(key);
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
}
