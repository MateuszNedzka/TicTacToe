package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Board board = new Board();
        WinConditionals winConditionals = new WinConditionals();

        board.showBoard();
        playerX.playerMove();
        winConditionals.checkColsIfWin();
        winConditionals.checkRowsIfWin();
        winConditionals.checkDiagonalsIfWin();
        board.showBoard();
        playerO.playerMove();
        winConditionals.checkColsIfWin();
        winConditionals.checkRowsIfWin();
        winConditionals.checkDiagonalsIfWin();
        board.showBoard();
    }
}
