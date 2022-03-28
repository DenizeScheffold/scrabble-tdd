import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ScrabbleGameTest {


    @Test
    public final void shouldGive1Point(){
        //A, E, I, O, U, L, N, R, S, T
        Assertions.assertEquals(1, ScrabbleGame.getLettterScore());
    }

    @Test
    public final void shouldGive2Points(){
    // D, G
        Assertions.assertEquals(2, ScrabbleGame.getLettterScore());
}

    @Test
    public final void shouldGive3Points(){
        //B, C, M, P

        Assertions.assertEquals(3, ScrabbleGame.getLettterScore());
    }

    @Test
    public final void shouldGive4Points(){
        //F, H, V, W, Y
        Assertions.assertEquals(4, ScrabbleGame.getLettterScore());
    }

    @Test
    public final void shouldGive5Points(){
        //K
        Assertions.assertEquals(5, ScrabbleGame.getLettterScore());
    }

    @Test
    public final void shouldGive8Points(){
        //J, X
        Assertions.assertEquals(8, ScrabbleGame.getLettterScore());
    }

    @Test
    public final void shouldGive10Points(){
        //Q, Z
        Assertions.assertEquals(10, ScrabbleGame.getLettterScore());
    }

    @Test
    public final void shouldGiveCorrectScore(){
        Assertions.assertEquals(15, ScrabbleGame.getWordScore());
    }
}
