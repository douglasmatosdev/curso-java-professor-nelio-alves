package org.chess.pieces;

import org.boardgame.Board;
import org.chess.ChessPiece;
import org.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
