package com.hz.algorithem.matrix;
/**
 * 矩阵旋转 90度
 * 解题关键
 * n*n矩阵
 * 当前元素位置[x][y]
 * 在新矩阵位置[y][n-x-1] 
 * @author huang_z
 *
 */

public class RotateMatrix {
	
	private static void rotate(int[][] matrix){
		int rows = matrix.length;
		int column = matrix[0].length;
		int[][] newMatrix = new int[column][rows];
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < column; j++){
				newMatrix[j][rows-1-i] = matrix[i][j];
			}
		}
		
		//显示结果
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < column; j++){
				System.out.print(newMatrix[i][j]+",");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix = new int[3][3];
//		System.out.println(matrix.length);
		int[][] matrix = {
				{1,2,3,4},
				{6,7,8,9},
				{4,6,7,9},
				{4,2,4,0},
		};
		
		rotate(matrix);
	}

}
