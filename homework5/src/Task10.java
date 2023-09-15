import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';

        do {
            printBoard(board);

            int[] move = getNextMove(board);
            int row = move[0];
            int col = move[1];

            board[row][col] = currentPlayer;

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Победил " + currentPlayer + "!");
                break;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("Ничья!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        } while (true);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public static int[] getNextMove(char[][] board) {
        Random random = new Random();
        int[] move = new int[2];

        do {
            move[0] = random.nextInt(3);
            move[1] = random.nextInt(3);
        } while (board[move[0]][move[1]] != ' ');

        return move;
    }

    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

