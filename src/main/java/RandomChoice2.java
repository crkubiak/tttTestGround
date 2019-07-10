import java.util.ArrayList;

public class RandomChoice2 {

    public static void main(String[] args) {
        takeTurn();
    }

    private static String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static ArrayList<Integer> availableSpaces() {
        ArrayList<Integer> available = new ArrayList<>();
        for (int space = 0; space < board.length; space++) {
            if (!board[space].equals("X") && !board[space].equals("O")) {
                available.add(space);
            }
        }
        return available;
    }

    public static int takeTurn() {
        java.util.Random random = new java.util.Random();
        int randomSquare = random.nextInt(availableSpaces().size());
        int returnValue = availableSpaces().get(randomSquare);
        System.out.println(returnValue);
        return returnValue;
    }
}


