package com.hz.algorithem.string_array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 合并两个有序数组或集合
 * 
 * @author huang_z
 *
 */
public class MergeArray {
	
	private void merge2(int[] array1, int[] array2){
		int size = array1.length + array2.length;
		int[] result = new int[size];
		int k = 0, i=0,j =0;
		while(k < size){
			if(i > array1.length -1){
				result[k++] = array2[j++];
				continue;
			}
			if(j > array2.length -1){
				result[k++] = array1[i++];
				continue;
			}
			
			if(array1[i] > array2[j]){
				result[k++] = array2[j++];
			}else{
				result[k++] = array1[i++];
			}
		}
		// 显示结果
		for(int t = 0; t < result.length; t++){
			System.out.print(result[t] + ",");
		}
		
	}

	private void Merge(int[] array1, int[] array2){
		Queue<Integer> leftQueue = new LinkedList<Integer>();
		Queue<Integer> rightQueue = new LinkedList<Integer>();
		Queue<Integer> resultQueue = new LinkedList<Integer>();
		
		for(int i = 0; i < array1.length; i++){
			leftQueue.add(array1[i]);
		}
		for(int i = 0; i < array2.length; i++){
			rightQueue.add(array2[i]);
		}
		while(true){
			if(leftQueue.isEmpty() && rightQueue.isEmpty()){
				break;
			}else {
				// System.out.println("leftQueue.size() " + leftQueue.size() + " rightQueue.size() " + rightQueue.size());
			}
			Integer leftHead = leftQueue.peek();
			Integer rightHead = rightQueue.peek();
			if(leftHead == null){
				rightQueue.poll();
				resultQueue.add(rightHead);
				continue;
			}
			if(rightHead == null){
				leftQueue.poll();
				resultQueue.add(leftHead);
				continue;
			}
			if(leftHead > rightHead){
				rightQueue.poll();
				resultQueue.add(rightHead);
			}else {
				leftQueue.poll();
				resultQueue.add(leftHead);
			}
		}
		
		// 显示结果
		while(!resultQueue.isEmpty()){
			System.out.print(resultQueue.poll() + ",");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeArray mergeArray = new MergeArray();
		int[] array1 = {3,4,7,8,9,98,102};
		int[] array2 = {1,4,5,6,12,15,99,101};
//		mergeArray.Merge(array2, array1);
		mergeArray.merge2(array2, array1);
	}

}
