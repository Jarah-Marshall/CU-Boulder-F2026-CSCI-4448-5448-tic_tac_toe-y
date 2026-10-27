package TicTacToe.Grid;

import TicTacToe.SymbolType;

import java.util.List;
import java.util.Optional;

public class Line {
    private final List<Square> squares;

    public Line(List<Square> squares){
        this.squares = squares;
    }

    public Optional<SymbolType> determineWinner(){
        Optional<SymbolType> symbol = squares.getFirst().getSymbol();
        if(squares.getFirst().isEmpty()){
            return Optional.empty();
        }
        for(int i = 1; i < squares.size(); i ++){
            if(!squares.get(i).getSymbol().equals(symbol)){
                return Optional.empty();
            }
        }
        return symbol;
    }
}
