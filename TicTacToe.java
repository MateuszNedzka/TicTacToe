package TicTacToe;

import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {

        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Board board = new Board();
        WinConditionals winConditionalsX = new WinConditionals("X");
        WinConditionals winConditionalsO = new WinConditionals("O");

        for (int i = 0; i <= 9; i++){
            board.showBoard();
            playerX.playerMove();
            winConditionalsX.checkColsIfWin();
            winConditionalsX.checkRowsIfWin();
            winConditionalsX.checkDiagonalsIfWin();
            board.showBoard();
            playerO.playerMove();
            winConditionalsO.checkColsIfWin();
            winConditionalsO.checkRowsIfWin();
            winConditionalsO.checkDiagonalsIfWin();
        }
  }

}
