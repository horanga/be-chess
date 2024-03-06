package org.example.chess;

import org.example.piece.Pawn;
import org.example.piece.Piece;
import org.example.piece.Pieces;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Piece>> BOARD = generateBoard();
    private List<Piece> rowOfBoard = new ArrayList<>();


    private List<List<Piece>> generateBoard() {
        List<List<Piece>> board = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            List<Piece> row = new ArrayList<>();
            if (i == 1) {
                for (int j = 0; j < 8; j++) {
                    row.add(new Pawn(Pieces.WHITEPAWN));
                }
            }

            if (i == 6) {
                for (int j = 0; j < 8; j++) {
                    row.add(new Pawn(Pieces.BLACKPAWN));
                }
            }
            for (int j = 0; j < 8; j++) {
                row.add(new Piece());
            }

            board.add(row);
        }
        return board;


    }

    public List<List<Piece>> getBOARD() {
        return BOARD;
    }


    public void add(Piece piece) {
        rowOfBoard.add(piece);
    }

    public Piece findPiece(int number) {
        return rowOfBoard.get(number);
    }

}
