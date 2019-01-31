package cTicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Player player = new Player();
        Board board = new Board();
        for (int i = 1; i < 10; i++) {
            board.showBoard();
            player.playerOMove();
            board.showBoard();
            player.playerXMove();
            board.showBoard();
        }
    }
}
