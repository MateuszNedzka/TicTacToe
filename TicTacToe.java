package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Board board = new Board();

        boolean keepPlaying = true;

        board.showBoard();
        for (int i = 1; i <= 9; i++) {
            if (keepPlaying) {
                playerX.playerMove();
                board.checkIfWin();
                board.showBoard();
                playerO.playerMove();
                board.checkIfWin();
                board.showBoard();
            } else {
                break;
            }
        }
    }
}
