package com.tictactoe.com.tictactoe.models;

import com.tictactoe.com.tictactoe.strategy.winningstrategy.WinningStrategey;

import java.util.List;

public class Game {
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Game(Board board, List<Player> players, Player winner, List<Move> moves, GameState gameState, int nextMovePlayerIndex, List<WinningStrategey> winningStrategeys) {
        this.board = board;
        this.players = players;
        this.winner = winner;
        this.moves = moves;
        this.gameState = gameState;
        this.nextMovePlayerIndex = nextMovePlayerIndex;
        this.winningStrategeys = winningStrategeys;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategey> getWinningStrategeys() {
        return winningStrategeys;
    }

    public void setWinningStrategeys(List<WinningStrategey> winningStrategeys) {
        this.winningStrategeys = winningStrategeys;
    }

    private Board board;
    private List<Player> players;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    private int nextMovePlayerIndex;
    private  List<WinningStrategey> winningStrategeys;

}
