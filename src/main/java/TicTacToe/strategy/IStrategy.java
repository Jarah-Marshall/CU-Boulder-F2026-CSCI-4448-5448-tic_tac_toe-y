package TicTacToe.strategy;

import TicTacToe.Grid.Cell;
import TicTacToe.Grid.Grid;
import TicTacToe.Player.Player;

public interface IStrategy {
    Cell doMove(Grid grid);
}
