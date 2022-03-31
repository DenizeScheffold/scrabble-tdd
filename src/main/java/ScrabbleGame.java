import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ScrabbleGame {


    public void wordInput() {

        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String wordInput;

        System.out.println("Your turn to play! You can play one or more words. " +
                "After every word, press Enter. When you´re done with placing your words press Enter.");

        while (true) {
            System.out.println("Place your next word, or press Space + Enter if your done");
            wordInput = scanner.nextLine();
            if (wordInput == "") {
                break;
            }
            if (isValidCharacter(wordInput)) {
                words.add(wordInput);
            }
        }

        setWordScore(words);

    }

    public boolean isValidCharacter(String word) {

        if (word.matches("^[a-zA-Z]*$")) {
            return true;
        } else {
            System.out.println("Make sure to play only English letters. This word will not be played");
        }
        return false;
    }

    public int setWordScore(ArrayList<String> words) {
        int sum = 0;
        StringBuilder wordsTogether = new StringBuilder();

        for (String word : words) {
            wordsTogether.append(word);
        }

        for (int i = 0; i < wordsTogether.length(); i++) {
            char letterToReturn = wordsTogether.charAt(i);
            sum += calculateLetterScore(letterToReturn);
        }

        printTotalScore(sum, words);
        return sum;
    }


    public int calculateLetterScore(char letterToCheck) {
        char letterInUpperCase = Character.toUpperCase(letterToCheck);
        Map<Character, Integer> map = setScoreMap();
        for (char key : map.keySet()) {
            if (key == letterInUpperCase) {
                return map.get(key);
            }
        }
        return 0;
    }


    public Map<Character, Integer> setScoreMap() {
//since it is stream return statement can be first. This is instead of  **  Map<Character, Integer> map = Stream.of(new Object[][]{  **

        return Stream.of(new Object[][]{
                {'A', 1},
                {'E', 1},
                {'I', 1},
                {'O', 1},
                {'U', 1},
                {'L', 1},
                {'N', 1},
                {'R', 1},
                {'S', 1},
                {'T', 1},
                {'D', 2},
                {'G', 2},
                {'B', 3},
                {'C', 3},
                {'M', 3},
                {'P', 3},
                {'F', 4},
                {'H', 4},
                {'V', 4},
                {'W', 4},
                {'Y', 4},
                {'K', 5},
                {'J', 8},
                {'X', 8},
                {'Q', 10},
                {'Z', 10}


        }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));
    }


    public boolean printTotalScore(int totalScore, ArrayList<String> words) {

        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            builder.append(word).append(",");
        }

        String commaseparatedlist = builder.toString();
        if (!(commaseparatedlist.isEmpty() || totalScore == 0)) {
            System.out.println("The word(s) ´" + commaseparatedlist + "´ gave a total score of " + totalScore + " points. Well done!");
            return true;
        }
        return false;
    }

}