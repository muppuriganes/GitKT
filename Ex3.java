public class Ex3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        StringBuilder output1 = new StringBuilder();
        StringBuilder output2 = new StringBuilder();
        StringBuilder output3 = new StringBuilder();

        // Generate output 1: Concatenate elements column-wise, alternating rows
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                output1.append(matrix[i][j]);
                if (i != matrix.length - 1 || j != matrix[i].length - 1) {
                    output1.append(" ");
                }
            }
        }

        // Generate output 2: Concatenate elements row-wise in normal order, then reverse the second row
        for (int i = 0; i < matrix.length; i++) {
            if (i == 1) {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    output2.append(matrix[i][j]);
                    if (j != 0) {
                        output2.append(" ");
                    }
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    output2.append(matrix[i][j]);
                    if (!(i == matrix.length - 1 && j == matrix[i].length - 1)) {
                        output2.append(" ");
                    }
                    
                }
                
            }
        }

        // Generate output 3: Extract specific elements from the matrix
        output3.append(matrix[0][2]).append(" ");
        output3.append(matrix[1][2]).append(" ");
        output3.append(matrix[2][2]).append(" ");
        for (int i = 0; i < matrix[1].length; i++) {
            output3.append(matrix[1][i]);
            if (i != matrix[1].length - 1) {
                output3.append(" ");
            }
        }

        // Print the concatenated strings
        System.out.println("Output 1: " + output1.toString());
        System.out.println("Output 2: " + output2.toString());
        System.out.println("Output 3: " + output3.toString());
    }
}