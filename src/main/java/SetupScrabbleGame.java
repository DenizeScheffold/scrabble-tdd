import java.util.Random;

public class SetupScrabbleGame {

    public void gameSetUp() {

        int lettersOnHand = 5;
        int lettersToGive = 10 - lettersOnHand;


        Random rnd = new Random();
        //letters with 1 point is represented twice in the array
        // to increase the chance to be picked at random.
        String characters = "AABBCDEEFGHIIJKLLMNNOPQRRSSTTUVXYZ";
        for(int i = 0; i < lettersToGive; i++) {
            char letterSelected = characters.charAt(rnd.nextInt(characters.length()));

        }



        System.out.println("Your turn to play! The letters you have in hand are: ");


    }
}
