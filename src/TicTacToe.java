package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Board board = new Board();
        Print print = new Print();
        Player playerX = new Player("X", board, print);
        Player playerO = new Player("O", board, print);

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