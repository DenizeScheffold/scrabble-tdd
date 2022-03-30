import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class ScrabbleGameTest {
    ScrabbleGame game1;


    @BeforeEach
    public void setUp() {
        game1 = new ScrabbleGame();
    }

    @AfterAll
    public static void allTestsAreDone() {
        System.out.println("All tests are done!");
    }


    @Test
    public void shouldGive1Point() {
        //A, E, I, O, U, L, N, R, S, T
        assertEquals(1, game1.setLetterScore('A'));
    }

    @Test
    public void shouldGive2Point() {
        //D, G
        assertEquals(2, game1.setLetterScore('G'));
    }

    @Test
    public void shouldGive3Point() {
        //B, C, M, P
        assertEquals(3, game1.setLetterScore('P'));
    }

    @Test
    public void shouldGive4Points() {
        //F, H, V, W, Y
        assertEquals(4, game1.setLetterScore('F'));
    }

    @Test
    public void shouldGive5Points() {
        //K
        assertEquals(5, game1.setLetterScore('K'));
    }

    @Test
    public void shouldGive8Points() {
        //J, X
        assertEquals(8, game1.setLetterScore('X'));
    }

    @Test
    public void shouldGive10Points() {
        //Q, Z
        assertEquals(10, game1.setLetterScore('Q'));
    }


    @Test
    public void shouldGiveCorrectScore() {
        ArrayList<String> words = new ArrayList<>();
        words.add("ab");
        assertEquals(4, game1.setWordScore(words));
    }

    @Test
    public void shouldMakeWordToUpperCase() {
        ArrayList<String> words = new ArrayList<>();
        words.add("abC");
        assertEquals(7, game1.setWordScore(words));
    }

    @DisplayName("All characters except English letters should give 0 points")
    @Test
    public void shouldOnlyGivePointsForEnglishLetters() {
        ArrayList<String> words = new ArrayList<>();
        words.add("Ö");
        words.add("9/");
        assertEquals(0, game1.setWordScore(words));
    }


    @Test
    public void shouldPrintOutTotalScore() {

        ArrayList<String> words = new ArrayList<>();
        words.add("ab");
        words.add("cb");
        assertTrue(game1.printTotalScore(10, words));
    }

    @Test
    public void shouldAcceptMoreWordsThanOne() {
        ArrayList<String> words = new ArrayList<>();
        words.add("ab");
        words.add("cb");
        assertEquals(10, game1.setWordScore(words));
    }


}
