package cTicTacToe;

public class Board {

    private static String[][] board3X3 = new String[][]{
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };

    public String[][] showBoard() {
        System.out.println("Current board:");
        for (String[] x : board3X3) {
            System.out.println("---------");
            for (String y : x) {
                System.out.print("|" + y + "|");
            }
            System.out.println();
        }
        return board3X3;
    }

    public void updateBoard(int indexX, int indexY, String kolkoLubKrzyzyk) {
        board3X3[indexX][indexY] = kolkoLubKrzyzyk;
    }

    public void checkIfWin() {
        if (board3X3[0][0].equals("O") & board3X3[0][1].equals("O") & board3X3[0][2].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[1][0].equals("O") & board3X3[1][1].equals("O") & board3X3[1][2].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[2][0].equals("O") & board3X3[2][1].equals("O") & board3X3[2][2].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[0][0].equals("X") & board3X3[0][1].equals("X") & board3X3[0][2].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[1][0].equals("X") & board3X3[1][1].equals("X") & board3X3[1][2].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[2][0].equals("X") & board3X3[2][1].equals("X") & board3X3[2][2].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[0][0].equals("O") & board3X3[1][0].equals("O") & board3X3[2][0].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[0][1].equals("O") & board3X3[1][1].equals("O") & board3X3[2][1].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[0][2].equals("O") & board3X3[1][2].equals("O") & board3X3[2][2].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[0][0].equals("X") & board3X3[1][0].equals("X") & board3X3[2][0].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[0][1].equals("X") & board3X3[1][1].equals("X") & board3X3[2][1].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[0][2].equals("X") & board3X3[1][2].equals("X") & board3X3[2][2].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[0][0].equals("O") & board3X3[1][1].equals("O") & board3X3[2][2].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[0][2].equals("O") & board3X3[1][1].equals("O") & board3X3[2][0].equals("O")) {
            System.out.println("Player 'O' Win");
        } else if (board3X3[0][0].equals("X") & board3X3[1][1].equals("X") & board3X3[2][2].equals("X")) {
            System.out.println("Player 'X' Win");
        } else if (board3X3[0][2].equals("X") & board3X3[1][1].equals("X") & board3X3[2][0].equals("X")) {
            System.out.println("Player 'X' Win");
        } else {
            System.out.println("REMIS");
        }
    }
}
