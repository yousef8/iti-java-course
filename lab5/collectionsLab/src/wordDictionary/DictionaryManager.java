package wordDictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryManager {
    private final WordDictionary dictionary = new WordDictionary();
    private void menu() {
        System.out.println("###############################");
        System.out.println("##########   Menu   ###########");
        System.out.println("###############################");
        System.out.println("[I]  insert");
        System.out.println("[P]  print");
        System.out.println("[S]  Search");
        System.out.println("[GW] Get Words");
        System.out.println("[RW] Remove word");
        System.out.println("[RK] Remove Key");
        System.out.println("[Q]  Quit");
    }

    private void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Words [space separated] _> ");
        String input = sc.nextLine();
        String[] res = input.split(" ");
        dictionary.insert(new ArrayList<>(Arrays.asList(res)));
    }

    private void print() {
        dictionary.printDictionary();
    }

    private void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Regex Pattern _> ");
        String input = sc.nextLine();
        ArrayList<String> matchedWords = dictionary.search(input);
        System.out.println("Matched Words");
        for (String word : matchedWords){
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private void getWords() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Character that words start with _> ");
        String input = sc.nextLine();
        ArrayList<String> keyWords = dictionary.getWords(input.charAt(0));
        System.out.println("Words Starting with " + input.charAt(0));
        for (String word : keyWords){
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private void removeWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word to Delete _> ");
        String input = sc.nextLine();
        if (dictionary.removeWord(input)) {
            System.out.println(input + " Found and deleted");
        }
        else {
            System.out.println(input + " Doesn't exist");
        }
    }

    private void removeKey() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Character that words start with _> ");
        String input = sc.nextLine();
        ArrayList<String> removedWords = dictionary.removeAllKey(input.charAt(0));
        System.out.println("You just removed index [" + input.charAt(0) + "] and all of it's words : ");
        for (String word : removedWords){
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true){
            menu();
            System.out.print("Choice _> ");
            String choice = sc.nextLine();

            switch (choice.toLowerCase()) {
                case "i":
                    insert();
                    break;

                case "p":
                    print();
                    break;

                case "s":
                    search();
                    break;

                case "gw":
                    getWords();
                    break;

                case "rw":
                    removeWord();
                    break;

                case "rk":
                    removeKey();
                    break;

                case "q":
                    return;

                default:
                    System.out.println("wrong Input");
                    break;
            }
            System.out.println();
        }
    }
}
