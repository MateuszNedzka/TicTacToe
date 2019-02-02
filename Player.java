package TicTacToe;

import java.util.Scanner;

public class Player {

    Board board = new Board();
    Scanner input = new Scanner(System.in);

    private int coordinateX;
    private int coordinateY;
    private String setCircleOrCross;

    public Player(String setCircleOrCross) {
        this.setCircleOrCross = setCircleOrCross;
    }

    public void playerMove() {
        System.out.println("Player " + setCircleOrCross + " please write coordinate x of board");
        coordinateX = input.nextInt();
        System.out.println("Player " + setCircleOrCross + " please write coordinate y of board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, setCircleOrCross);
    }
}