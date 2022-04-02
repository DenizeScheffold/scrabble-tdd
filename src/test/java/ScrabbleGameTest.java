import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;

public class ScrabbleGameTest {
    ScrabbleGame game1;
    TestSetup wordToCheck;


    @BeforeAll
    public static void letsTest() {
        System.out.print(colorize("Tests are running...\n", YELLOW_TEXT()));
    }

    @BeforeEach
    public void setUp() {
        game1 = new ScrabbleGame();
        wordToCheck = new TestSetup();
    }

    @AfterAll
    public static void allTestsAreDone() {
        System.out.print(colorize("All tests are done - check your result!", YELLOW_TEXT()));
    }


    @Test
    public void shouldGive1Point() {
        //A, E, I, O, U, L, N, R, S, T
        assertEquals(1, game1.calculateLetterScore('A'));
    }

    @Test
    public void shouldGive2Point() {
        //D, G
        assertEquals(2, game1.calculateLetterScore('G'));
    }

    @Test
    public void shouldGive3Point() {
        //B, C, M, P
        assertEquals(3, game1.calculateLetterScore('P'));
    }

    @Test
    public void shouldGive4Points() {
        //F, H, V, W, Y
        assertEquals(4, game1.calculateLetterScore('F'));
    }

    @Test
    public void shouldGive5Points() {
        //K
        assertEquals(5, game1.calculateLetterScore('K'));
    }

    @Test
    public void shouldGive8Points() {
        //J, X
        assertEquals(8, game1.calculateLetterScore('X'));
    }

    @Test
    public void shouldGive10Points() {
        //Q, Z
        assertEquals(10, game1.calculateLetterScore('Q'));
    }

    @DisplayName("Word is chosen from arraylist in class TestSetup.")
    @Test
    public void shouldGiveCorrectScore() {

        assertEquals(33, game1.setWordScore(wordToCheck.getArrayWithOneForTest()));
    }


    @Test
    public void shouldMakeWordToUpperCase() {

        assertEquals(33, game1.setWordScore(wordToCheck.getArrayWithOneForTest()));
    }

    @DisplayName("Game should only accept english letters. Boolean should be false to pass since the letter 'ö' should not be accepted in game")
    @Test
    public void shouldOnlyAcceptEnglishLetters() {

        assertFalse(game1.isValidCharacter("ö"));
    }


    @Test
    public void shouldAcceptMoreWordsThanOne() {

        ArrayList<String> wordsInTestArray = wordToCheck.getArrayWithOneForTest();
        wordsInTestArray.add("ab");
        assertEquals(37, game1.setWordScore(wordsInTestArray));
    }


    @Test
    public void shouldPrintOutTotalScore() {

        assertTrue(game1.isPrintTotalScore(33, wordToCheck.getArrayWithOneForTest()));
    }
}
