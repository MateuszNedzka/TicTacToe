package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        boolean gameInProgress = true;

        Board board = new Board();
        Print print = new Print();
        Player playerX = new Player("X", board, print);
        Player playerO = new Player("O", board, print);

        while (gameInProgress) {
            while (gameInProgress) {
                board.showBoard();
                playerX.playerMove();
                if (board.checkAllWinConditions(playerX.getCharacter())) {
                    gameInProgress = false;
                    board.showBoard();
                }
                else {
                    board.showBoard();
                    playerO.playerMove();
                    if (board.checkAllWinConditions(playerO.getCharacter())) {
                        gameInProgress = false;
                        board.showBoard();
                    }
                }
            }
        }
    }
}
