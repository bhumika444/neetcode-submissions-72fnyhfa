class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[i].length; j++){
                int k = matrix[i][j];
                if(k == target){
                    return true;
                }
            }
        }
        return false;
    }
}
