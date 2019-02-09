package TicTacToe;

import java.util.Scanner;

public class Player {

    private Board board;
    private Scanner input;
    private String playerCharacter;

    public Player(String playerCharacter, Board board) {
        this.board = board;
        this.input = new Scanner(System.in);
        this.playerCharacter = playerCharacter;
    }

    public void playerMove() {
        int coordinateX;
        int coordinateY;

        System.out.println("Player " + playerCharacter + " please write coordinate x of board");
        coordinateX = input.nextInt();
        System.out.println("Player " + playerCharacter + " please write coordinate y of board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, playerCharacter);
    }

    public String getCharacter() {
        return playerCharacter;
    }
}