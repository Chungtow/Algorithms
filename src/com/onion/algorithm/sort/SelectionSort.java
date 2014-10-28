package com.onion.algorithm.sort;

public class SelectionSort {
	
	/**
	 * 升序排序
	 * @param num
	 */
	public static void ascending(int[] num) {
		int i, j, index;
		
		int temp;
		for (i = 0; i < num.length-1; i ++) {
			index = i;
			for (j = i+1; j < num.length; j ++) {
				if (num[j] < num[index]) {
					index = j;
				}
			}
			
			if (i != index) {
				temp = num[i];
				num[i] = num[index];
				num[index] = temp;
			}	
		}
	}
	
	
	/**
	 * 打印数组
	 * @param num
	 */
	public static void print(int[] num) {
		int i;
		for (i = 0; i < num.length; i ++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] num = {32,12,8,16,64,22,25,3,16};
		SelectionSort.print(num);
		SelectionSort.ascending(num);
		SelectionSort.print(num);
		
	}
}
