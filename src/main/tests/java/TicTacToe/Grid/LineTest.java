package TicTacToe.Grid;

import TicTacToe.SymbolType;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class LineTest {
    @Test
    public void testThreeMatchingSymbolsInALine(){
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        square1.placeSymbol(SymbolType.X);
        square2.placeSymbol(SymbolType.X);
        square3.placeSymbol(SymbolType.X);
        Line line = new Line(List.of(square1, square2, square3));
        assertEquals(Optional.of(SymbolType.X), line.determineWinner());
    }

    @Test
    public void testNonMatchingSymbolsInALine(){
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        square1.placeSymbol(SymbolType.X);
        square2.placeSymbol(SymbolType.O);
        Line line = new Line(List.of(square1, square2, square3));
        assertEquals(Optional.empty(), line.determineWinner());
    }

    @Test
    public void testTwoMatchingSymbolsInALine(){
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        square1.placeSymbol(SymbolType.X);
        square2.placeSymbol(SymbolType.X);
        Line line = new Line(List.of(square1, square2, square3));
        assertEquals(Optional.empty(), line.determineWinner());
    }

    @Test

    public void testEmptyLine(){
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        Line line = new Line(List.of(square1, square2, square3));
        assertEquals(Optional.empty(), line.determineWinner());
    }
}
