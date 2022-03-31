import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ScrabblePointsSetup {


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

}
