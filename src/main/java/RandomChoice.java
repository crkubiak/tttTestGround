public class RandomChoice {
    private static String[] board = {"X", "X", "X", "O", "O", "X", "7", "O", "9"};

    private static void randomChoice() {
        String[] availableSquares = board;
        String choice = "X";
        while (choice == "X" || choice == "O"){
            java.util.Random random = new java.util.Random();
            int randomSquare = random.nextInt(availableSquares.length);
            choice = board[randomSquare];
            System.out.println(board[randomSquare]);
        }

    }

    public static void main(String[] args) {
        randomChoice();
    }
}


//        if (!availableSquares[randomSquare].equals("X") && !availableSquares[randomSquare].equals("O")) {
//                System.out.println(availableSquares[randomSquare]);
//                return Integer.parseInt(availableSquares[randomSquare]);
//                }
//                return 42;