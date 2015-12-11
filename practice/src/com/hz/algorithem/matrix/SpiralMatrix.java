package com.hz.algorithem.matrix;

import java.util.ArrayList;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * 
 * ÂİĞıÊä³ö¾ØÕóÊıÖµ [1,2,3,6,9,8,7,4,5]
 * 
 * @author huang_z
 *
 */
public class SpiralMatrix {

	private ArrayList<Integer> spiralOrder(int[][] matrix){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0)
			return result;
		
		int m = matrix.length;
		int n = matrix[0].length;
		int sum = m*n;
		// ºá×İË÷Òı
		int x=0, y =0;
		
		while(m > 0 && n > 0){
			// top, move right
			for(int i = 0; i < n-1; i++){
				if(result.size() < sum){
					result.add(matrix[x][y++]);
				}
			}
			
			// right, move down
			for(int i = 0; i < m-1; i++){
				if(result.size() < sum){
					result.add(matrix[x++][y]);
				}
			}
			// bottom, move left
			for(int i = 0; i < n-1; i++){
				if(result.size() < sum){
					result.add(matrix[x][y--]);
				}
			}
			// left, move up
			for(int i = 0; i < m-1; i++){
				if(result.size() < sum){
					result.add(matrix[x--][y]);
				}
			}
			
			x++;
			y++;
			m = m-2;
			n = n-2;
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1,2,3,4,5},
				{6,7,8,9,1},
				{4,6,7,9,2}
		};
		
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		ArrayList<Integer> resultOrder = spiralMatrix.spiralOrder(matrix);
		for(Integer i : resultOrder){
			System.out.print(i + ",");
		}
	}

}
