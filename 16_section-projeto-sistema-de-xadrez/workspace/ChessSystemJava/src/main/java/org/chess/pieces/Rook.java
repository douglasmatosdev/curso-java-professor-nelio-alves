package org.chess.pieces;

import org.boardgame.Board;
import org.chess.ChessPiece;
import org.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
