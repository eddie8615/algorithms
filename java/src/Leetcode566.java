public class Leetcode566{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m * n != r * c)
            return mat;
        
        int[][] result = new int[r][c];
        int rowIndex = 0, colIndex = 0;
        for(int i = 0; i < r; i++){
            int[] row = new int[c];
            for(int j = 0; j < c; j++){
                if(colIndex < n){
                    row[j] = mat[rowIndex][colIndex++];
                }else{
                    colIndex = 0;
                    rowIndex++;
                    row[j] = mat[rowIndex][colIndex++];
                }
            }
            result[i] = row;
        }
        return result;
    }
}