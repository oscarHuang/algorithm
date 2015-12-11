package com.hz.algorithem.string_array;

/**
 * 向右移动数组元素，如：
 * {1，2，3，4，5，6，7}
 * 向右移动3位
 * {5，6，7，1，2，3，4}
 * 
 * 使用冒泡方法，O(n2)
 * @author huang_z
 *
 */
public class RotateArray1 {
	
	private void bubbleRotate(int[] array, int orderNum){
		
		for(int i=0; i<orderNum; i++){
			// 往左冒泡
			for(int k=array.length-1; k>0; k--){
				int temp = array[k-1];
				array[k-1] = array[k];
				array[k] = temp;
			}
			System.out.println("----------- " + i);
			for(int j = 0; j < array.length; j++){
				System.out.print(array[j] + ",");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		RotateArray1 rotate = new RotateArray1();
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		rotate.bubbleRotate(array, 4);
	}
}
