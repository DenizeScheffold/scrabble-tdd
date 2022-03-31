import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;

public class SetupScrabbleGame {

    public void gameSetUp(ArrayList<Character> lettersOnHand) {

        selectRandomLetters(lettersOnHand);

        StringBuilder builder = new StringBuilder();

        for (char letter : lettersOnHand) {
            builder.append(letter).append(",");
        }

        String commaseparatedlistOfChar = builder.toString();

        System.out.println("Your turn to play! The letters you have in hand are: " + commaseparatedlistOfChar);

    }

    public ArrayList<Character>  selectRandomLetters(ArrayList<Character> lettersOnHand) {

        int numberLettersOnHand = lettersOnHand.size();
        int lettersToGive = 10 - numberLettersOnHand;

            Random rnd = new Random();
            //letters with 1 point is represented *2 or *3 in the array
            // to increase the chance to be picked at random.

            String characters = "AAABBCDEEEFGHIIIJKLLMNNOPQRRRSSSTTTUVXYZ";

            for (int i = 0; i < lettersToGive; i++) {
                char letterSelected = characters.charAt(rnd.nextInt(characters.length()));
                lettersOnHand.add(letterSelected);
            }
            return lettersOnHand;
        }


    }

