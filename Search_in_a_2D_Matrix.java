package Leet;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i=matrix.length-1;          // we are starting from last row and 0th column cell
        int j = 0;
        while(i>=0 && j<=matrix[0].length-1){
            if(target > matrix[i][j]){
                j++;
            }
            else if(target < matrix[i][j]){
                i--;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
}