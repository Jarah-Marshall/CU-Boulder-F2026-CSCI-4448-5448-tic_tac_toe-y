package TicTacToe.strategy;

import TicTacToe.Grid.Grid;
import TicTacToe.Grid.Square;

import java.util.List;

public class RiggedStrategy implements IStrategy{

    @Override
    public Square doMove(Grid grid){
        List<Square> availableSquares = grid.getAvailableSquares();
        if(availableSquares.isEmpty()){
            throw new IllegalStateException("No Squares Available");
        }
        return availableSquares.getFirst();
    }
}
