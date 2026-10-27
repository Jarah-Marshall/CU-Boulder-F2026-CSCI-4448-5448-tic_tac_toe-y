package TicTacToe.Grid;

import TicTacToe.SymbolType;

import java.util.Optional;

public class Square {

    private SymbolType symbolType;

    public boolean isEmpty(){
        return symbolType == null;
    }

    public void placeSymbol(SymbolType symbol){
        if(symbol == null || !isEmpty()){
            return;
        }
        this.symbolType = symbol;
    }

    public Optional<SymbolType> getSymbol(){
        return Optional.ofNullable(symbolType);
    }
}
