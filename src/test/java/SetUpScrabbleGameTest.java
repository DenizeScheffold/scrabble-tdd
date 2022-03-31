import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;



public class SetUpScrabbleGameTest {
    SetupScrabbleGame game1;



    @BeforeEach
    public void setUp() {
        game1 = new SetupScrabbleGame();
    }


    @Test
    public void shouldBe10CharactersInArrayAfterAdding(){
        ArrayList<Character> lettersOnHand = new ArrayList<>();
        lettersOnHand.add('A');
        lettersOnHand.add('Q');
        assertEquals(10, game1.selectRandomLetters(lettersOnHand).size());
        for(char letter : lettersOnHand) {
            System.out.println(letter);
        }
    }

}
