import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

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
        assertEquals(1, game1.getLetterScore('A'));
    }


    @Test
    public void shouldGive2Point() {
        //D, G
        assertEquals(2, game1.getLetterScore('G'));
    }


    @Test
    public void shouldGive3Point() {
        //B, C, M, P
        assertEquals(3, game1.getLetterScore('P'));
    }


    @Test
    public void shouldGive4Points() {
        //F, H, V, W, Y
        assertEquals(4, game1.getLetterScore('F'));
    }

    @Test
    public void shouldGive5Points() {
        //K
        assertEquals(5, game1.getLetterScore('K'));
    }

    @Test
    public void shouldGive8Points() {
        //J, X
        assertEquals(8, game1.getLetterScore('X'));
    }

    @Test
    public void shouldGive10Points() {
        //Q, Z
        assertEquals(10, game1.getLetterScore('Q'));
    }

    @Test
    public void shouldGiveCorrectScore() {
        assertEquals(4, game1.getWordScore("ab"));
    }

    @Test
    public void shouldMakeWordToUpperCase() {
        assertEquals(7, game1.getWordScore("abC"));
    }

    @DisplayName("All characters except English letters should give 9 points")
    @Test
    public void shouldOnlyGivePointsForEnglishLetters() {
        assertEquals(0, game1.getWordScore("Ö/9"));
    }


    @Test
    public void shouldPrintOutTotalScore() {
        assertTrue(game1.printTotalScore(7, "abC"));
    }

    @Test
    public void shouldGiveFeedback() {

    }
}
