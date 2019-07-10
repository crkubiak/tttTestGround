import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Board b = new Board();
        Scanner s = new Scanner(System.in);

        b.displayBoard();
        System.out.println("Select turn\n1. Computer(X) / 2. User(O)");

        int choice = s.nextInt();
        if (choice == Board.PLAYER_X) {
            Point p = new Point(RANDOM.nextInt(3), RANDOM.nextInt(3));
            b.placeAMove(p, Board.PLAYER_X);
            b.displayBoard();
        }

        while (!b.isGameOver()) {
            boolean moveOk = true;

            do {
                if (!moveOk) {
                    System.out.println("Cell is already filled!");
                }
                System.out.println("Your move : ");
                Point userMove = new Point(s.nextInt(), s.nextInt());
                moveOk = b.placeAMove(userMove, Board.PLAYER_O);
            } while (!moveOk);

            b.displayBoard();

            if (b.isGameOver()) {
                break;
            }

            b.minimax(0, Board.PLAYER_X);
            System.out.println("Computer chooses position : " + b.computerMove);

            b.placeAMove(b.computerMove, Board.PLAYER_X);
            b.displayBoard();
        }
        if (b.hasPlayerWon(Board.PLAYER_X)) {
            System.out.println("You lost!");
        } else if (b.hasPlayerWon(Board.PLAYER_O)) {
            System.out.println("You won!");
        } else {
            System.out.println("Draw!");
        }
    }
}
