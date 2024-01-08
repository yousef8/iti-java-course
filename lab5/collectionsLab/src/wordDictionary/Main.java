package wordDictionary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WordDictionary dic = new WordDictionary();

        ArrayList<String> words = new ArrayList<>();
        words.add("   yousef   ");
        words.add("   Yousef   ");
        words.add("   @yousef   ");
        words.add("   omar   ");
        words.add("   muhammed   ");
        words.add("   mohammed   ");

        dic.insert(words);

        dic.printDictionary();

        ArrayList<String> res = dic.getWords('y');

        System.out.println("y words : " + res.size());
        for(String s : res) {
            System.out.print(s + " ");
        }
        System.out.println();

        if (dic.removeWord("fathi")){
            System.out.println("You just deleted fathi");
        }

        if (dic.removeWord("@omar")){
            System.out.println("You just deleted @omar");
        }

        if (dic.removeWord("mohammed")){
            System.out.println("You just deleted mohammed");
        }

        res = dic.removeAllKey('e');

        System.out.println(res.size());

        res = dic.removeAllKey('Y');

        System.out.println(res.size());
    }
}
