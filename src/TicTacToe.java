package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Board board = new Board();
        Player playerX = new Player("X", board);
        Player playerO = new Player("O", board);

        for (int i = 0; i <= 9; i++){
            board.showBoard();
            playerX.playerMove();
            board.checkAllWinConditions(playerX.getCharacter());
            board.showBoard();
            playerO.playerMove();
            board.checkAllWinConditions(playerO.getCharacter());
        }
    }
}
