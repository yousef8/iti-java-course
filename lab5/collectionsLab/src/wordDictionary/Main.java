package wordDictionary;

import java.util.ArrayList;

public class Main {

    public void test() {
        WordDictionary dic = new WordDictionary();
        ArrayList<String> words = new ArrayList<>();
        words.add("   yousef   ");
        words.add("   Yousef   ");
        words.add("   @yousef   ");
        words.add("   omar   ");
        words.add("   muhammed   ");
        words.add("   mohammed   ");

        System.out.println("----------Test Insertion and Printing--------------------");
        dic.insert(words);

        dic.printDictionary();

        System.out.println("\n---------------Test getWords()-------------------------");
        ArrayList<String> res = dic.getWords('y');

        System.out.println("y words : " + res.size() + " words");
        for(String s : res) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("\n----------------Test removeWord()------------------------");

        if (dic.removeWord("fathi")){
            System.out.println("You just deleted fathi");
        }

        if (dic.removeWord("@omar")){
            System.out.println("You just deleted @omar");
        }

        if (dic.removeWord("mohammed")){
            System.out.println("You just deleted mohammed");
        }
        dic.printDictionary();

        System.out.println("\n----------------Test removeAllKey()------------------------");

        res = dic.removeAllKey('e');
        System.out.println("Remove [" + res.size() + "] words that start with 'e'");

        res = dic.removeAllKey('Y');
        System.out.println("Remove [" + res.size() + "] words that start with 'Y' and they are : ");
        for (String s : res){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("\n----------------Test search()------------------------");
        System.out.println("current dictionary : ");
        dic.printDictionary();

        ArrayList<String> matchedWords = dic.search(".*");
        System.out.println("Strings matches '.*' : ");
        for(String word : matchedWords){
            System.out.print(word + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        DictionaryManager dm = new DictionaryManager();
        dm.run();
        System.out.println("GoodBye");
    }
}
