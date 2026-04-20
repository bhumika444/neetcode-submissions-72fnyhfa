class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length, COL = matrix[0].length;
        int l = 0, r = (ROW * COL) - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            int row = m / COL;
            int col = m % COL;
            int k = matrix[row][col];
            if(k == target){
                return true;
            }
            else if(k < target){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return false;
    }
}
