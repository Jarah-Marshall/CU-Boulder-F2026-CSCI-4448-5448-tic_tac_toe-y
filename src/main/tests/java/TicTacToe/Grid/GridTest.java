package TicTacToe.Grid;

import TicTacToe.SymbolType;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    @Test
    public void testAllSquaresAvailable(){
        Grid grid = new Grid();
        List<Square> availableSquares = grid.getAvailableSquares();
        assertFalse(availableSquares.isEmpty());
    }

    @Test
    public void testGetWinner(){
        Grid grid = new Grid();
        List<Square> availableSquares = grid.getAvailableSquares();
        assertEquals(Optional.empty(), grid.getWinner());
        availableSquares.get(0).placeSymbol(SymbolType.X);
        availableSquares.get(1).placeSymbol(SymbolType.X);
        availableSquares.get(2).placeSymbol(SymbolType.X);
        assertEquals(Optional.of(SymbolType.X), grid.getWinner());
    }

    @Test
    public void testFullBoardAndWinner(){
        Grid grid = new Grid();
        List<Square> availableSquares = grid.getAvailableSquares();
        availableSquares.get(0).placeSymbol(SymbolType.X);
        availableSquares.get(1).placeSymbol(SymbolType.X);
        availableSquares.get(2).placeSymbol(SymbolType.X);
        availableSquares.get(3).placeSymbol(SymbolType.X);
        availableSquares.get(4).placeSymbol(SymbolType.X);
        availableSquares.get(5).placeSymbol(SymbolType.X);
        availableSquares.get(6).placeSymbol(SymbolType.X);
        availableSquares.get(7).placeSymbol(SymbolType.X);
        availableSquares.get(8).placeSymbol(SymbolType.X);
        assertTrue(grid.isFull());
        assertEquals(Optional.of(SymbolType.X), grid.getWinner());
    }

    @Test
    public void testFullBoardAndNoWinner(){
        Grid grid = new Grid();
        List<Square> availableSquares = grid.getAvailableSquares();
        availableSquares.get(0).placeSymbol(SymbolType.X);
        availableSquares.get(1).placeSymbol(SymbolType.O);
        availableSquares.get(2).placeSymbol(SymbolType.O);
        availableSquares.get(3).placeSymbol(SymbolType.O);
        availableSquares.get(4).placeSymbol(SymbolType.X);
        availableSquares.get(5).placeSymbol(SymbolType.X);
        availableSquares.get(6).placeSymbol(SymbolType.X);
        availableSquares.get(7).placeSymbol(SymbolType.O);
        availableSquares.get(8).placeSymbol(SymbolType.O);
        assertTrue(grid.isFull());
        assertEquals(Optional.empty(), grid.getWinner());
    }
}
