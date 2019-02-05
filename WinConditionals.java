package TicTacToe;

public class WinConditionals {

    private String playerSign;
    int counter = 0;

    public WinConditionals(String playerSign) {
        this.playerSign = playerSign;
    }

    public void checkColsIfWin() {
        for (int col = 0; col < 3; col++) {
            int counter = 0;
            for (String[] row : Board.getBoard3X3()) {
                if (row[col].equals(playerSign)) {
                    counter++;
                    if (counter == 3) {
                        System.out.println("Player " + playerSign + " win");
                    }
                }
            }
        }
    }

    public void checkRowsIfWin() {
        for (String[] row : Board.getBoard3X3()) {
            int counter = 0;
            for (String el : row) {
                if (el.equals(playerSign)) {
                    counter++;
                    if (counter == 3) {
                        System.out.println("Player " + playerSign + " win");
                    }
                }
            }
        }
    }

    public void checkDiagonalsIfWin() {
        for (int i = 0; i < Board.getBoard3X3().length; i++) {
            if ((Board.getBoard3X3()[i][i]).equals(playerSign)) {
                counter++;
                if (counter == 3) {
                    System.out.print("Player " + playerSign + " win");
                }
            }
        }
        counter = 0;
        for (int i = 0; i < Board.getBoard3X3().length; i++) {
            if ((Board.getBoard3X3()[i][(Board.getBoard3X3().length) - 1 - i]).equals(playerSign)) {
                counter++;
                if (counter == 3) {
                    System.out.print("Player " + playerSign + " win");
                }
            }
        }
    }
}
