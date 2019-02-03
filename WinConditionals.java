package TicTacToe;

public class WinConditionals {

    public void checkColsIfWin() {
        for (int col = 0; col < 3; col++) {
            int counter = 0;
            for (String[] row : Board.getBoard3X3()) {
                if (row[col].equals("O")) {
                    counter++;
                    if (counter == 3) {
                        System.out.println("Player 'O' win");
                    }
                }
            }
        }
    }

        public void checkRowsIfWin() {
            for (String[] row : Board.getBoard3X3()) {
                int counter = 0;
                for (String el : row) {
                    if (el.equals("X")) {
                        counter++;
                        if (counter == 3) {
                            System.out.println("Player 'X' win");
                        }
                    }
                }
            }
        }

        public void checkDiagonalsIfWin() {
            if (Board.getBoard3X3()[0][0].equals("O") & Board.getBoard3X3()[1][1].equals("O") & Board.getBoard3X3()[2][2].equals("O")) {
                System.out.println("Player 'O' Win");
            } else if (Board.getBoard3X3()[0][2].equals("O") & Board.getBoard3X3()[1][1].equals("O") & Board.getBoard3X3()[2][0].equals("O")) {
                System.out.println("Player 'O' Win");
            } else if (Board.getBoard3X3()[0][0].equals("X") & Board.getBoard3X3()[1][1].equals("X") & Board.getBoard3X3()[2][2].equals("X")) {
                System.out.println("Player 'X' Win");
            } else if (Board.getBoard3X3()[0][2].equals("X") & Board.getBoard3X3()[1][1].equals("X") & Board.getBoard3X3()[2][0].equals("X")) {
                System.out.println("Player 'X' Win");
            }
        }

    }
