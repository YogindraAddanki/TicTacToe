package com.tictactoe.com.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Board(int dimension)
    {
        this.dimension = dimension;
        board = new ArrayList<>();

        for(int i=0;i<dimension;i++)
        {
            board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++)
            {
                board.get(i).add(new Cell(i,j));
            }
        }
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    private  int size;
    private List<List<Cell>> board;


}
