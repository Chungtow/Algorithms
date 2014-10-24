package com.onion.algorithm.sort;

/**
 * 堆排序
 * @author yushuo.lct
 *
 */
public class BubbleSort {
	
	public static void ascending(int[] num) {
		
		int i, j;
		int temp;
		for (i = 0; i < num.length; i ++) {
			for (j = num.length - 1; j > i; j --) {
				if (num[j] < num[j-1]) {
					temp = num[j];
					num[j] = num[j-1];
					num[j-1] = temp;
				}
			}
		}
	}
	
	public static void print(int[] num) {
		int i;
		for (i = 0; i < num.length; i ++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] num = {32,12,8,16,64,22,25,3,16};
		BubbleSort.print(num);
		BubbleSort.ascending(num);
		BubbleSort.print(num);
		
	}
}
