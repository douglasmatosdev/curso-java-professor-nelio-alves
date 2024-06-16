package org.chess;

import org.boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}
