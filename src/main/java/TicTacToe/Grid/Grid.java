package TicTacToe.Grid;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private static final int GRID_SIZE = 9;
    private final List<Cell> cells = new ArrayList<>();

    public Grid(){
        for(int i = 0; i < GRID_SIZE; i++){
            cells.add(new Cell());
        }
    }
}
