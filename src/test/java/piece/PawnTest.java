package piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {


    @DisplayName("하얀색, 검은색 폰을 생성한다.")
    @Test
    void test1() {

        Pawn whitePawn = new Pawn(Pieces.WHITEPAWN);
        assertThat(whitePawn.getColor()).isEqualTo("white");

        Pawn blackPawn = new Pawn(Pieces.BLACKPAWN);
        assertThat(blackPawn.getColor()).isEqualTo("black");
    }

}
