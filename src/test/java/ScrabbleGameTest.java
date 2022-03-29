import org.junit.jupiter.api.*;

public class ScrabbleGameTest {

    ScrabbleGame game1 = new ScrabbleGame();

    @AfterAll
    public static void allTestsAreDone() {
        System.out.println("All tests are done!");
    }

    @Test
    public void shouldGive1Point() {
        //A, E, I, O, U, L, N, R, S, T
        Assertions.assertEquals(1, game1.getLetterScore('A'));
    }


    @Test
    public void shouldGive2Point() {
        //D, G
        Assertions.assertEquals(2, game1.getLetterScore('G'));
    }


    @Test
    public void shouldGive3Point() {
        //B, C, M, P
        Assertions.assertEquals(3, game1.getLetterScore('P'));
    }


    @Test
    public void shouldGive4Points() {
        //F, H, V, W, Y
        Assertions.assertEquals(4, game1.getLetterScore('F'));
    }

    @Test
    public void shouldGive5Points() {
        //K
        Assertions.assertEquals(5, game1.getLetterScore('K'));
    }

    @Test
    public void shouldGive8Points() {
        //J, X
        Assertions.assertEquals(8, game1.getLetterScore('X'));
    }

    @Test
    public void shouldGive10Points() {
        //Q, Z
        Assertions.assertEquals(10, game1.getLetterScore('Q'));
    }

    @Test
    public void shouldGiveCorrectScore() {
        Assertions.assertEquals(4, game1.getWordScore("ab"));
    }

    @Test
    public void shouldMakeWordToUpperCase() {
        Assertions.assertEquals(7, game1.getWordScore("abC"));
    }

    @DisplayName("All characters except English letters should give 9 points")
    @Test
    public void shouldOnlyGivePointsForEnglishLetters() {
        Assertions.assertEquals(0, game1.getWordScore("Ö/9"));
    }


    @Test
    public void shouldPrintOutTotalScore(){
    Assertions.assertTrue(game1.printTotalScore(7, "abC"));
    }
}
