package TicTacToe;

import java.util.Scanner;

public class Player {

    private int coordinateX;
    private int coordinateY;

    Board board = new Board();
    Scanner input = new Scanner(System.in);

    private String setCircleOrCross(String CircleOrCross) {
        return CircleOrCross;
    }

    public void playerOMove() {
        System.out.println("Player " + setCircleOrCross("O") + " please write coordinate x of board");
        coordinateX = input.nextInt();
        System.out.println("Player " + setCircleOrCross("O") + " please write coordinate y of board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, setCircleOrCross("O"));
    }

    public void playerXMove() {
        System.out.println("Player " + setCircleOrCross("X") + " please write coordinate x of board");
        coordinateX = input.nextInt();
        System.out.println("Player " + setCircleOrCross("X") + " please write coordinate y of board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, setCircleOrCross("X"));
    }
}

