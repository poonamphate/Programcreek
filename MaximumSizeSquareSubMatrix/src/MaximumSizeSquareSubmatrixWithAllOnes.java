/**
 Explanation: https://www.youtube.com/watch?v=NYeVhmWsWec
* Given a matrix of dimensions m x n having all entries as 1 or 0,
* find out the size of maximum size square sub-matrix with all 1s.
*/
public class MaximumSizeSquareSubmatrixWithAllOnes {
 
    private static int maximumSizeSquareSubmatrixWithAllOnes(int[][] matrix) {
        int maxSize = 0;
        int r = matrix.length;
        System.out.println("r = "+r);
        
        int c = matrix[0].length;
        System.out.println("c = "+c);
        // Step 1
        int[][] table = new int[r][c];
 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Step 2 a vqy7
                if (i == 0 || j == 0) {
                    table[i][j] = matrix[i][j];
                    if(table[i][j] > maxSize){
                    	maxSize = table[i][j];
                    }
                }             
                
                // Step 2 b
                else if (matrix[i][j] == 0) {
                    table[i][j] = 0;
                }
                // Step 2 c
                else {
                    table[i][j] =Math.min( Math.min(table[i - 1][j - 1], table[i - 1][j]), table[i][j - 1]) + 1;
                    maxSize = table[i][j] > maxSize ? table[i][j] : maxSize;
                    
                }
            }
        }
 
        return maxSize;
    }
     
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 0, 0, 1, 1 },
                           { 0, 0, 1, 0, 1, 1 },
                           { 1, 1, 1, 1, 1, 0 },
                           { 1, 1, 1, 1, 1, 1 },
                           { 1, 1, 1, 1, 1, 1 },
                           { 0, 1, 1, 1, 1, 1 },
                           { 1, 0, 0, 0, 1, 1 }
                         };
        System.out.println(maximumSizeSquareSubmatrixWithAllOnes(matrix));
    }
}