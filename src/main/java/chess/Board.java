package chess;

import piece.Pawn;
import piece.Piece;
import piece.Pieces;

import java.util.ArrayList;
import java.util.List;


public class Board {

    public static final int COUNT_OF_PIECES = 8;
    public static final int ROW_OF_BLACKPAWN = 1;
    public static final int ROW_OF_WHITEPAWN = 6;

    public static final String BLACK = "black";

    public static final String WHITE = "white";
    private static List<List<Piece>> board = new ArrayList<>();

    static {
        intialize();
    }

    private static void intialize() {
        for (int i = 0; i < COUNT_OF_PIECES; i++) {
            if (i == ROW_OF_BLACKPAWN) {
                add(BLACK, Pieces.BLACKPAWN);

            } else if (i == ROW_OF_WHITEPAWN) {
                add(WHITE, Pieces.WHITEPAWN);

            } else {
                add(WHITE, Pieces.NONE);
            }
        }
    }

    private static void add(String color, Pieces piece) {
        List<Piece> row = new ArrayList<>();
        for (int j = 0; j < COUNT_OF_PIECES; j++) {
            row.add(new Pawn(color, piece));
        }

        board.add(row);
    }

    public static List<List<Piece>> getBoard() {
        return board;
    }

    public void printLogo() {
        board.forEach(i -> {
            i.forEach(j -> System.out.print(j.getLogo()));
            System.out.println();
        });
    }
}
