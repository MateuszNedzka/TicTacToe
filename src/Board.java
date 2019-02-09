package TicTacToe;

public class Board {

    private String[][] board3X3;
    private int counter = 0;

    public Board() {
        this.board3X3 = new String[][]{
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
    }

    public void showBoard() {
        System.out.println("Current board:");
        for (String[] x : board3X3) {
            System.out.println("---------");
            for (String y : x) {
                System.out.print("|" + y + "|" );
            }
            System.out.println();
        }
    }

    public void updateBoard(int indexX, int indexY, String playerSign) {
        board3X3[indexX][indexY] = playerSign;
    }

    public void checkColsIfWin(String playerSign) {
        for (int col = 0; col < 3; col++) {
            counter = 0;
            for (String[] row : board3X3) {
                if (row[col].equals(playerSign)) {
                    counter++;
                    if (counter == 3) {
                        printWinner(playerSign);
                    }
                }
            }
        }
    }

    public void checkRowsIfWin(String playerSign) {
        for (String[] row : board3X3) {
            counter = 0;
            for (String el : row) {
                if (el.equals(playerSign)) {
                    counter++;
                    if (counter == 3) {
                        printWinner(playerSign);
                    }
                }
            }
        }
    }

    public void checkDiagonalsIfWin(String playerSign) {
        for (int i = 0; i < board3X3.length; i++) {
            if ((board3X3[i][i]).equals(playerSign)) {
                counter++;
                if (counter == 3) {
                    printWinner(playerSign);
                }
            }
        }
        counter = 0;
        for (int i = 0; i < board3X3.length; i++) {
            if ((board3X3[i][(board3X3.length) - 1 - i]).equals(playerSign)) {
                counter++;
                if (counter == 3) {
                    printWinner(playerSign);
                }
            }
        }
    }

    public void checkAllWinConditions(String playerSign) {
        checkColsIfWin(playerSign);
        checkRowsIfWin(playerSign);
        checkDiagonalsIfWin(playerSign);
    }

    public void printWinner(String playerSign) {
        System.out.print("Player " + playerSign + " win");
    }
}

