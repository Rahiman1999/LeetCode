class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        List<Integer> ans = new ArrayList<Integer>();
        if(row<1){
            return ans;
        }

        int col=matrix[0].length;
        int startRow=0;
        int startCol=0;
        int i=0;
        while(startRow<row&&startCol<col){
            for(i=startCol;i<col;i++){
                ans.add(matrix[startRow][i]);
            }
            startRow++;
            for(i=startRow;i<row;i++){
                ans.add(matrix[i][col-1]);
            }
            col--;
            if(startRow<row){
            for(i=col-1;i>=startCol;i--){
                ans.add(matrix[row-1][i]);
            }
            row--;
            }
            if(startCol<col){
            for(i=row-1;i>=startRow;i--){
                ans.add(matrix[i][startCol]);
            }
            startCol++;
            }
        }
        return ans;
    }
}