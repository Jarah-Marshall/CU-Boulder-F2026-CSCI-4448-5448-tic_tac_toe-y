package TicTacToe.strategy;

import TicTacToe.Grid.Grid;
import TicTacToe.Grid.Square;

public interface IStrategy {
    Square doMove(Grid grid);
}
