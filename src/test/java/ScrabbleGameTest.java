import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;

public class ScrabbleGameTest {
    ScrabbleGame game1;


    @BeforeAll
    public static void letsTest(){
        System.out.print(colorize("Tests are running...\n", YELLOW_TEXT()));
    }

    @BeforeEach
    public void setUp() {
        game1 = new ScrabbleGame();
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


    @Test
    public void shouldGiveCorrectScore() {
        ArrayList<String> words = new ArrayList<>();
        words.add("ab");

        int bonus = game1.saveBonusForTest()
    }

    @Test
    public void shouldMakeWordToUpperCase() {
        ArrayList<String> words = new ArrayList<>();
        words.add("abC");

        assertEquals(7,  game1.setWordScore(words));
    }

    @DisplayName("Only words with English letters should be accepted")
    @Test
    public void shouldOnlyAcceptEnglishLetters(){
        assertFalse(game1.isValidCharacter("tårna"));
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

    @DisplayName("Test should give one in this Array double score")
    @RepeatedTest(3)
    public void shouldRandomSelectTilesToGiveDoubleScore(){
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");

        assertEquals(11,game1.setWordScore(words));
    }

}
