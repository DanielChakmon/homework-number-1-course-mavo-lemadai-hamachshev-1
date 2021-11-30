import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class ExerciseSeven {
    public static void printBoard(char[] boardSymbols) {
        int rowNumber = 1;
        final int Number_Of_Symbols_In_Row = 3;
        for (int i = 0; i < boardSymbols.length; i++) {
            System.out.print("|" + boardSymbols[i]);
            if (rowNumber * Number_Of_Symbols_In_Row == i + 1) {
                System.out.println("|");
                rowNumber++;
            }
        }
    }

    public static boolean isAvailable(char[] boardSymbols, int selectedPlace) {
        boolean isAvailable = false;
        if (boardSymbols[selectedPlace - 1] == 'O' || boardSymbols[selectedPlace - 1] == 'X') {
            isAvailable = false;
        } else {
            isAvailable = true;
        }
        return isAvailable;
    }

    public static int getPositionFromUser(char[] boardSymbols) {
        Scanner scanner = new Scanner(System.in);
        int selectedPlace = -1;
        while (true) {
            System.out.println("please enter the position you want to play:");
            selectedPlace = scanner.nextInt();
            if (0 < selectedPlace && selectedPlace < 10) {
                boolean isAvailable = isAvailable(boardSymbols, selectedPlace);
                if (isAvailable == true) {
                    break;
                } else {
                    System.out.println("this cell is already taken");
                }
            } else {
                System.out.println("please enter a number between 1 to 9");
            }
        }
        return selectedPlace;
    }

    public static char checkWinner(char[] boardSymbols) {
        char winner = '-';
        for (int i = 0; i < 7; i++) {
            if (i + 1 == 1 || i + 1 == 4 || i + 1 == 7) {
                if (boardSymbols[i] == boardSymbols[i + 1] && boardSymbols[i] == boardSymbols[i + 2]) {
                    winner = boardSymbols[i];
                    return winner;
                }
            }
            if (i + 1 == 1 && boardSymbols[i] == boardSymbols[i + 4] && boardSymbols[i] == boardSymbols[i + 8]) {
                winner = boardSymbols[i];
                return winner;
            }
            if (i + 1 == 3 && boardSymbols[i] == boardSymbols[i + 2] && boardSymbols[i] == boardSymbols[i + 4]) {
                winner = boardSymbols[i];
                return winner;
            }
            if ((i + 1 == 1 || i + 1 == 2 || i + 1 == 3) && (boardSymbols[i] == boardSymbols[i + 3] && boardSymbols[i] == boardSymbols[i + 6])) {
                winner = boardSymbols[i];
                return winner;
            }
        }
        return winner;
    }

    public static boolean placeSymbolsOnBoard(char[] boardSymbols, int selectedPlace, char whichPlayer) {
        boolean isThereAWinner = false;
        boardSymbols[selectedPlace - 1] = whichPlayer;
        printBoard(boardSymbols);
        char winner = checkWinner(boardSymbols);
        if (winner == 'X' || winner == 'O') {
            System.out.println(whichPlayer + " won the game!");
            isThereAWinner = true;
        } else {
            isThereAWinner = false;
        }
        return isThereAWinner;
    }

    public static boolean checkIfStuck(boolean isThereAWinner, int numberOfTurns) {
        boolean isStuck = false;
        if (numberOfTurns >= 9 && isThereAWinner == false) {
            System.out.println("looks like you're stuck!, no winners this round:(");
            isStuck = true;
        } else {
            isStuck=false;
        }
        return isStuck;
    }

    public static void main(String[] args) {
        boolean isThereAWinner = false;
        char whichPlayer = 'O';
        char[] boardSymbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        printBoard(boardSymbols);
        boolean isStuck = false;
        int numberOfTurns = 0;
        while (isThereAWinner == false && isStuck == false) {
            numberOfTurns++;
            if (whichPlayer == 'O') {
                whichPlayer = 'X';
            } else {
                whichPlayer = 'O';
            }
            System.out.println(whichPlayer + "'s turn:");
            int selectedPlace = getPositionFromUser(boardSymbols);
            isThereAWinner = placeSymbolsOnBoard(boardSymbols, selectedPlace, whichPlayer);
            isStuck=checkIfStuck(isThereAWinner,numberOfTurns);
        }
    }
}
