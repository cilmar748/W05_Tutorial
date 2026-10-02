package lab.poker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BonusIndependenceTest {
    private boolean bonus(String hand) {
        return new BonusPolicy().qualifies(Hands.of(hand));
    }

    // Add an independence test here.
    // student member 2 (2nd)
    @Test void cChangesDecision() {
    assertFalse(bonus("2C 5D 8H JS KC"));
    assertTrue(bonus("7C 7D 7H 9S 9C"));
}

}
