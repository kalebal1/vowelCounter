package vowelCounter;

import java.util.Scanner;
public class Main{
    public static void main(final String[] args) {
        final Scanner reader = new Scanner(System.in);
        System.out.println("enter a word:");
        final String word = reader.next();
        reader.close();
        System.out.println(countVowels(word));
    }

    static String vowels = "aeiou";

    public static String countVowels(final String word) {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vowelCount++;
            }
        }
        return "there are " + vowelCount + " vowels in " + word;
    }

    private static boolean isVowel(final Character letter) {
        int i = 0;
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': i++;
        }
        if(i == 1){ return true; }
        else { return false; }
        }
    }

