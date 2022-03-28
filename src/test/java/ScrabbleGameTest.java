import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ScrabbleGameTest {

ScrabbleGame game1 = new ScrabbleGame();

    @Test
    public void shouldGive1Point(){
        //A, E, I, O, U, L, N, R, S, T
        Assertions.assertEquals(1, game1.getLetterScore('A'));
    }


    @Test
    public void shouldGive2Point(){
        //D, G
        Assertions.assertEquals(2, game1.getLetterScore('G'));
    }


    @Test
    public void shouldGive3Point(){
        //B, C, M, P
        Assertions.assertEquals(3, game1.getLetterScore('P'));
    }



}
