package TicTacToe.Grid;

import TicTacToe.SymbolType;
import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void testSquareIsEmptyByDefault(){
        Square square = new Square();
        assertTrue(square.isEmpty());
    }

    @Test
    public void testPlaceSymbol(){
        Square square = new Square();
        assertTrue(square.isEmpty());
        square.placeSymbol(SymbolType.X);
        assertEquals(Optional.of(SymbolType.X),square.getSymbol());
    }

    @Test
    public void testTwoPlacementsOnSameSquare(){
        Square square = new Square();
        assertTrue(square.isEmpty());
        square.placeSymbol(SymbolType.X);
        assertEquals(Optional.of(SymbolType.X),square.getSymbol());
        square.placeSymbol(SymbolType.O);
        assertEquals(Optional.of(SymbolType.X),square.getSymbol());
    }
}
