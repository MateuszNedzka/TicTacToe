package TicTacToe;

public class Print {

    public void printFieldOutOfArrayErrorMSG() {
        System.out.println((char) 27 + "[31m" + "Field out of array, please write correct one" + (char) 27 + "[0m");
    }

    public void printFieldIsAlreadySelectedMSG() {
        System.out.println((char) 27 + "[31m" + "This field is already selected, choose correct one" + (char) 27 + "[0m");
    }

    public void printWinner(String playerCharacter) {
        System.out.print((char) 27 + "[32m" + "Player " + playerCharacter + " win" + (char) 27 + "[0m");
    }
}
