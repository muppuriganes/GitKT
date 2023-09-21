import java.util.Scanner;

class Solution {
    public boolean isSafe(char[][] board, int row, int col, char number) {
        // Check the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == number || board[i][col] == number) {
                return false;
            }
        }

        // Check the 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solveSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board)) {
                                return true; // If a solution is found, return true
                            }
                            board[row][col] = '.'; // Backtrack
                        }
                    }
                    return false; // If no valid number can be placed, backtrack
                }
            }
        }
        return true; // If all cells are filled, the Sudoku is solved
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Solution solver = new Solution();
            char[][] board = new char[9][9];

            System.out.println("Enter the Sudoku board:");
            for (int i = 0; i < 9; i++) {
                String row = scanner.next();
                for (int j = 0; j < 9; j++) {
                    board[i][j] = row.charAt(j);
                }
            }

            if (solver.solveSudoku(board)) {
                System.out.println("Solved Sudoku:");
                printBoard(board);
            } else {
                System.out.println("No solution found.");
            }
        }
    }
}