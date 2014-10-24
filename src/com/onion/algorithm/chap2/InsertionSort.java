package com.onion.algorithm.chap2;

/**
 * 插入排序
 * @author yushuo.lct
 *
 */
public class InsertionSort {
	
	public static void sort(int[] a) {
		int len = a.length;
		int i, j;
		int temp;
		for (i = 0; i < len-1; i ++) {
			for (j = i+1; j < len; j ++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {3, 2, 7, 9, 4, 10};
		int i;
		for (i = 0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		InsertionSort.sort(a);
		
		for (i = 0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

}
