package TicTacToe;

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

    public void updateBoard(int indexX, int indexY, String circleOrCross) {
        board3X3[indexX][indexY] = circleOrCross;
    }

    public static String[][] getBoard3X3() {
        return board3X3;
    }
}

