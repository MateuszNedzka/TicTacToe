package TicTacToe;

import java.util.Scanner;

public class Player {

    Board board = new Board();
    Scanner input = new Scanner(System.in);

    private String playerSign;

    public Player(String setCircleOrCross) {
        this.playerSign = setCircleOrCross;
    }

    public void playerMove() {
        int coordinateX;
        int coordinateY;

        System.out.println("Player " + playerSign + " please write coordinate x of board");
        coordinateX = input.nextInt();
        System.out.println("Player " + playerSign + " please write coordinate y of board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, playerSign);
    }
}