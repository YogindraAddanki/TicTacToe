package com.tictactoe.com.tictactoe.models;

public class Move {
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Move(Player player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    private Player player;
    private  Cell cell;

}
