package TicTacToe.Player;

import TicTacToe.Grid.Cell;
import TicTacToe.Grid.Grid;
import TicTacToe.SymbolType;
import TicTacToe.strategy.IStrategy;

public class Player {

    private final SymbolType symbolType;
    private final IStrategy strategy;

    public Player(SymbolType symbolType, IStrategy strategy){
        this.symbolType = symbolType;
        this.strategy = strategy;
    }

    public SymbolType getSymbol(){
        return symbolType;
    }

    public Cell doMove(Grid grid){
        return this.strategy.doMove(grid);
    }
}
