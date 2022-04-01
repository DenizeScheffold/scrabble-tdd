import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestSetup {


    public ArrayList<String> wordsToRandomlySelectForTest(){

        //"words" are chosen to give 33 points (it is one letter from each point-section). All words are worth 33 points.

        return new ArrayList<>(Arrays.asList(
               "Adbfkjq", "Egbhkxz", "Igmvkxz", "Odpfkxz", "Udpykxq", "Ldchkxq", "Ndmwkjz", "Rgpfkjz", "Sdbfkxq"
       ));
    }

    public ArrayList<String> getArrayWithOneForTest() {

        ArrayList<String> wordsArray = wordsToRandomlySelectForTest();

        Random rand = new Random();
        int randomIndex = rand.nextInt(wordsArray.size());

        ArrayList<String> wordToTest = new ArrayList();
        wordToTest.add(wordsArray.get(randomIndex));

        return wordToTest;

    }

    public String getOneTestWord() {

        ArrayList<String> wordsArray = wordsToRandomlySelectForTest();

        Random rand = new Random();
        int randomIndex = rand.nextInt(wordsArray.size());

        return wordsArray.get(randomIndex);

    }
}
