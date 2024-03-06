package board;

import chess.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import piece.Piece;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    @DisplayName("8*8 크기의 보드를 생성한다.")
    @Test
    void test1() {

        List<List<Piece>> chessBoard = Board.getBOARD();

        assertThat(chessBoard.size()).isEqualTo(8);
        assertThat(chessBoard.get(0).size()).isEqualTo(8);
    }

    @DisplayName("보드에 pawn를 넣는다.")
    @Test
    void test2() {
        List<List<Piece>> chessBoard = Board.getBOARD();
        List<Piece> pawnPieces = chessBoard.get(1);
        List<Piece> pawnPieces2 = chessBoard.get(6);

        for (int i = 0; i < pawnPieces.size(); i++) {
            assertThat(pawnPieces.get(i).getColor()).isEqualTo("black");
            assertThat(pawnPieces.get(i).getLogo()).isEqualTo("P");
            assertThat(pawnPieces2.get(i).getColor()).isEqualTo("white");
            assertThat(pawnPieces2.get(i).getLogo()).isEqualTo("p");
        }
    }

}
