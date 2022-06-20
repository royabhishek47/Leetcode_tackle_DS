//Reshape the matrix

class Solution {
public int[][] matrixReshape(int[][] mat, int r, int c) {
int m = mat.length;
int n = mat[0].length;
if(m * n != r * c)
return mat;
if(m == r && n == c)
return mat;
int new_index = 0;
int original_index = 0;
int result[][] = new int[r][c];
while(new_index < r * c && original_index < m * n) {
result[new_index / c][new_index % c] = mat[original_index / n][original_index % n];
new_index++;
original_index++;
}
return result;
}
}