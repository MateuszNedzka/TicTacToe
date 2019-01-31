package cTicTacToe;

import java.util.Scanner;

public class Player {

    private int wspolrzednaX;
    private int wspolrzednaY;

    Board board = new Board();
    Scanner input = new Scanner(System.in);

    public void playerOMove() {
        System.out.println("Player O wpisz wspolrzedna X planszy");
        wspolrzednaX = input.nextInt();
        System.out.println("Player O wpisz wspolrzedna Y planszy");
        wspolrzednaY = input.nextInt();
        board.updateBoard(wspolrzednaX, wspolrzednaY, "O");
    }

    public void playerXMove() {
        System.out.println("Player X wpisz wspolrzedna X planszy");
        wspolrzednaX = input.nextInt();
        System.out.println("Player X wpisz wspolrzedna Y planszy");
        wspolrzednaY = input.nextInt();
        board.updateBoard(wspolrzednaX, wspolrzednaY, "X");
    }
}

