import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScrabbleGame {


    public int getWordScore(String wordInput) {
        int sum = 0;

        String word = wordInput.toUpperCase();

        for(int i =0; i<word.length(); i++){
            char letterToReturn = word.charAt(i);
           sum += getLetterScore(letterToReturn);
        }
        return sum;
    }

    public Map<Character, Integer> setScoreMap() {

        Map<Character, Integer> map = Stream.of(new Object[][]{
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

        return map;
    }

    public int getLetterScore(char letter) {

        Map<Character, Integer> map = setScoreMap();
        for (char c : map.keySet()) {
            if (c == letter) {
                return map.get(c);
            }
        }
        return 0;
    }


}
