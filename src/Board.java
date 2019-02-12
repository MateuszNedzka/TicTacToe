package TicTacToe;

public class Board {

    private String[][] board3X3;
    private Print print = new Print();
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
                System.out.print("|" + y + "|");
            }
            System.out.println();
        }
    }

    public void updateBoard(int indexX, int indexY, String playerCharacter) {
            board3X3[indexX][indexY] = playerCharacter;
    }

    public void checkColsIfWin(String playerCharacter) {
        for (int col = 0; col < 3; col++) {
            counter = 0;
            for (String[] row : board3X3) {
                if (row[col].equals(playerCharacter)) {
                    counter++;
                    if (counter == 3) {
                        print.printWinner(playerCharacter);
                    }
                }
            }
        }
    }

    public void checkRowsIfWin(String playerCharacter) {
        for (String[] row : board3X3) {
            counter = 0;
            for (String el : row) {
                if (el.equals(playerCharacter)) {
                    counter++;
                    if (counter == 3) {
                        print.printWinner(playerCharacter);
                    }
                }
            }
        }
    }

    public void checkDiagonalsIfWin(String playerCharacter) {
        for (int i = 0; i < board3X3.length; i++) {
            if ((board3X3[i][i]).equals(playerCharacter)) {
                counter++;
                if (counter == 3) {
                    print.printWinner(playerCharacter);
                }
            }
        }
        counter = 0;
        for (int i = 0; i < board3X3.length; i++) {
            if ((board3X3[i][(board3X3.length) - 1 - i]).equals(playerCharacter)) {
                counter++;
                if (counter == 3) {
                    print.printWinner(playerCharacter);
                }
            }
        }
    }

    public void checkAllWinConditions(String playerCharacter) {
        checkColsIfWin(playerCharacter);
        checkRowsIfWin(playerCharacter);
        checkDiagonalsIfWin(playerCharacter);
    }

    public String getFieldOfBoard3X3(int x, int y) {
        return board3X3[x][y];
    }
}

