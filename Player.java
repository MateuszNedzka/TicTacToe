package TicTacToe;

import java.util.Scanner;

public class Player {

    private int coordinateX;
    private int coordinateY;

    Board board = new Board();
    Scanner input = new Scanner(System.in);

    public void playerOMove() {
        System.out.println("Player O please write coordinate x  board");
        coordinateX = input.nextInt();
        System.out.println("Player O please write coordinate y  board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, "O");
    }

    public void playerXMove() {
        System.out.println("Player X please write coordinate x  board");
        coordinateX = input.nextInt();
        System.out.println("Player X please write coordinate y  board");
        coordinateY = input.nextInt();
        board.updateBoard(coordinateX, coordinateY, "X");
    }
}

