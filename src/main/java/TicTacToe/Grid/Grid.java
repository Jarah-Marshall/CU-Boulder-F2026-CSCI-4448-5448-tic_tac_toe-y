package TicTacToe.Grid;

import TicTacToe.SymbolType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Grid {
    private static final int NUMBER_OF_ROWS_AND_COLUMNS = 3;
    private static final int STARTING_SQUARE = 0;
    private static final int NUMBER_OF_SQUARES = NUMBER_OF_ROWS_AND_COLUMNS * NUMBER_OF_ROWS_AND_COLUMNS;
    private static final int COLUMN_SPACING = NUMBER_OF_ROWS_AND_COLUMNS;
    private static final int ROW_SPACING = 1;
    private static final int RIGHT_DIAGONAL_SPACING = COLUMN_SPACING + ROW_SPACING;
    private static final int LEFT_DIAGONAL_SPACING = COLUMN_SPACING - ROW_SPACING;

    private final List<Square> squares = new ArrayList<>();
    private final List<Line> lines = new ArrayList<>();

    public Grid(){
        for(int i = 0; i < NUMBER_OF_SQUARES; i++){
            squares.add(new Square());
        }

        for(int j = 0; j < NUMBER_OF_ROWS_AND_COLUMNS; j++){
            addLine(j * NUMBER_OF_ROWS_AND_COLUMNS, ROW_SPACING);
            addLine(j, COLUMN_SPACING);
        }
        addLine(STARTING_SQUARE, RIGHT_DIAGONAL_SPACING);
        addLine(NUMBER_OF_ROWS_AND_COLUMNS-1, LEFT_DIAGONAL_SPACING);
    }

    private void addLine(int startingSquare, int spacing){
        List<Square> squaresInLine = new ArrayList<>();
        for(int i = 0; i < NUMBER_OF_ROWS_AND_COLUMNS; i++){
            squaresInLine.add(squares.get(startingSquare + spacing * i));
        }
        lines.add(new Line(squaresInLine));
    }

    public List<Square> getAvailableSquares(){
        List<Square> availableSquares = new ArrayList<>();
        for(Square square : squares){
            if(square.isEmpty()) {
                availableSquares.add(square);
            }
        }
        return availableSquares;
    }

    public Optional<SymbolType> getWinner(){
        Optional<SymbolType> symbol;
        for(Line line : lines){
            symbol = line.determineWinner();
            if(symbol.isPresent()){
                return symbol;
            }
        }
        return Optional.empty();
    }

    public boolean isFull(){
        return getAvailableSquares().isEmpty();
    }
}
