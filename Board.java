package cTicTacToe;

public class Board {

    private String[][] board3X3 = new String[][]{
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
                continue;
            }
            System.out.println();
        }
        return board3X3;
    }

    public void updateBoard(int indexX, int indexY, String kolkoLubKrzyzyk) {
        board3X3[indexX][indexY] = kolkoLubKrzyzyk;
    }

    public String[][] getBoard3X3() {
        return board3X3;
    }

    public void setBoard3X3(String[][] board3X3) {
        this.board3X3 = board3X3;
    }
}
