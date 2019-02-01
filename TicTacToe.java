package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Player player = new Player();
        Board board = new Board();

        boolean keepPlaying = true;

        for (int i = 1; i <= 9; i++) {
            if (keepPlaying) {
                board.showBoard();
                player.playerOMove();
                board.checkIfWin();
                board.showBoard();
                player.playerXMove();
                board.checkIfWin();
                board.showBoard();
            } else {
                break;
            }
        }
    }
}
