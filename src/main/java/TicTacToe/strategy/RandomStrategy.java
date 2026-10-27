package TicTacToe.strategy;

import TicTacToe.Grid.Square;
import TicTacToe.Grid.Grid;

import java.util.List;
import java.util.Random;

public class RandomStrategy implements IStrategy{
    private final Random random;

    public RandomStrategy(Random random){
        this.random = random;
    }

    @Override
    public Square doMove(Grid grid){
        List<Square> availableSquares = grid.getAvailableSquares();
        if(availableSquares.isEmpty()){
            throw new IllegalStateException("No Squares Available");
        }
        return availableSquares.get(random.nextInt(availableSquares.size()));
    }
}
