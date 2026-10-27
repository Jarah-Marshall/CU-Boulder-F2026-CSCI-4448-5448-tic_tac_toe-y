package TicTacToe.Player;

import TicTacToe.Grid.Grid;
import TicTacToe.Grid.Square;
import TicTacToe.SymbolType;
import TicTacToe.strategy.IStrategy;
import TicTacToe.strategy.RiggedStrategy;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testRiggedStrategy(){
        IStrategy riggedStrategy = new RiggedStrategy();
        Grid grid = new Grid();
        Player riggedPlayer = new Player(SymbolType.X, riggedStrategy);
        assertEquals(9, grid.getAvailableSquares().size());
        Square chosenSquare = riggedPlayer.doMove(grid);
        assertSame(grid.getAvailableSquares().getFirst(), chosenSquare);
    }
}
