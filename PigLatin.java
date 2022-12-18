package Exercise;
import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args)
    {
        String englishWord; 
        String pigLatinWord; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word ");
        englishWord = sc.next();

        pigLatinWord = englishWord.substring(1)
                + englishWord.charAt(0) + "ay";

        System.out.println("English Word: " + englishWord);
        System.out.println("Pig Latin Word: " + pigLatinWord);
    }


}
