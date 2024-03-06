package chess;

import piece.Pawn;
import piece.Piece;
import piece.Pieces;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static List<List<Piece>> BOARD = intialize();

    private static List<List<Piece>> intialize() {
        List<List<Piece>> board = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if (i == 1) {
                add(Pieces.BLACKPAWN, board);
                continue;
            }
            if (i == 6) {
                add(Pieces.WHITEPAWN, board);
                continue;
            }
            add(Pieces.NONE, board);
        }
        return board;
    }

    private static void add(Pieces pices, List<List<Piece>> board) {
        List<Piece> row = new ArrayList<>();

        for (int j = 0; j < 8; j++) {
            row.add(new Pawn(pices));
        }

        board.add(row);
    }

    public static List<List<Piece>> getBOARD() {
        return BOARD;
    }

    public void printLogo() {
        BOARD.forEach(i -> {
            i.forEach(j -> System.out.print(j.getLogo()));
            System.out.println();
        });
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.printLogo();
    }
}
