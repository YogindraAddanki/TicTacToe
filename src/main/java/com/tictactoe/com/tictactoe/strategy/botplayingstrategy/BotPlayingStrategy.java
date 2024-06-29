package com.tictactoe.com.tictactoe.strategy.botplayingstrategy;

import com.tictactoe.com.tictactoe.models.Board;
import com.tictactoe.com.tictactoe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
