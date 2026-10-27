# CU-Boulder-F2026-CSCI-4448-5448-tic_tac_toe-y


## Strategy Pattern
The Player class holds a strategy and Player's constructor injects an
instance of IStrategy. The RiggedStrategy will grab the first available square for the player 
while the RandomStrategy grabs a random available square for the player. There's room to add strategies 
that are much more calculated in decision-making in future versions. TicTacToe asks the player for their
move, the player will hand the grid to its strategy which will return a square; allowing TicTacToe to place
a symbol.

## Observer Pattern
The TicTacToe class will be the subject of the Observer. Like the EventListener in Polymorphia, TicTacToe
will hold a list of TicTacToeListener objects. These objects will be notified when a player takes their turn, 
the square they have chosen, and whether they have won or not. After the TicTacToe class places a symbol, 
it will notify all registered listeners and check for a winner. TestObserver will record and ConsoleObserver 
will print the results to the console.

## Facade Pattern
The Grid class is the facade, TicTacToe is only worried about whether a player has won or not and the Grid
answers this without exposing the lines. getAvailableSquares(), getWinner() and isFull() are the only methods 
that TicTacToe will talk to. This works nicely because TicTacToe will only be interacting with one class, Grid, 
instead of Line and Square directly. Square is only partially exposed so the strategies can choose a square for
the Player.