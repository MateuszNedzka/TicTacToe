package cTicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Player player = new Player();
        Board board = new Board();

        for (int i = 1; i <= 9; i++) {
            board.showBoard();
            player.playerOMove();
            board.checkRowsIfWin();
            board.checkColsIfWin();
            board.checkDiagonalsIfWin();
            board.showBoard();
            player.playerXMove();
            board.checkRowsIfWin();
            board.checkColsIfWin();
            board.checkDiagonalsIfWin();
            board.showBoard();
        }
    }
}
