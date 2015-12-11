package com.hz.algorithem.string_array;

/**
 * 向右移动数组元素，如：
 * {1，2，3，4，5，6，7}
 * 向右移动3位
 * {5，6，7，1，2，3，4}
 * 
 * 定义成左右两块
 * 第一步：反转左边部分；
 * 第二步：反转右边部分；
 * 第三步：合并左右部分再做反转，O(n)
 * @author huang_z
 *
 */
public class RotateArray2 {

	private static void rotate(int[] array, int start, int end){
		
		for(int i = start; i <= (start+end)/2; i++){
			int temp = array[i];
			array[i] = array[start+end-i];
			array[start+end-i] = temp;
		}
	}
	
	private static void rotateByNum(int[] array, int orderNum){
		rotate(array, 0, array.length-1-orderNum);
		
		rotate(array, array.length-orderNum, array.length -1);
		
		rotate(array, 0, array.length -1);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 85, 3, 4, 5, 16, 9, 8, 7};
		
		rotateByNum(array, 3);
		
		System.out.println("----------- ");
		for(int k=0; k<array.length; k++){
			System.out.print(array[k] + ",");
		}
		
	}

}
