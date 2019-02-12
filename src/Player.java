package TicTacToe;

import java.util.Scanner;

public class Player {

    private Board board;
    private Scanner input;
    private Print print;
    private String playerCharacter;

    public Player(String playerCharacter, Board board, Print print) {
        this.board = board;
        this.print = print;
        this.input = new Scanner(System.in);
        this.playerCharacter = playerCharacter;
    }

    public void playerMove() {
        int coordinateX;
        int coordinateY;
        boolean outOfBoard = true;

        while (outOfBoard) {
            System.out.println("Player " + playerCharacter + " please write coordinate x of board");
            coordinateX = input.nextInt();
            System.out.println("Player " + playerCharacter + " please write coordinate y of board");
            coordinateY = input.nextInt();
            if (coordinateX < 0 | coordinateX > 2 | coordinateY < 0 | coordinateY > 2) {
                print.printFieldOutOfArrayErrorMSG();
            } else {
                if ((board.getFieldOfBoard3X3(coordinateX, coordinateY).equals(" "))) {
                    board.updateBoard(coordinateX, coordinateY, playerCharacter);
                    outOfBoard = false;
                } else {
                    print.printFieldIsAlreadySelectedMSG();
                }
            }
        }
    }

    public String getCharacter() {
        return playerCharacter;
    }
}