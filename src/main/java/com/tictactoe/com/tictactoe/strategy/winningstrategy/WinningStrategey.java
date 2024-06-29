package com.tictactoe.com.tictactoe.strategy.winningstrategy;

import com.tictactoe.com.tictactoe.models.Board;
import com.tictactoe.com.tictactoe.models.Cell;
import com.tictactoe.com.tictactoe.models.Player;

public interface WinningStrategey {
    boolean checkWinner(Board board, Player player, Cell cell);
}
