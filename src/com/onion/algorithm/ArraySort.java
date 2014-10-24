package com.onion.algorithm;

public class ArraySort {
	static byte INSERTION_SORT = 1;
	static byte BUBBLE_SORT = 2;
	static byte QUICK_SORT = 3;
	
	public static void sort(int[] a, byte sortMethod) {
		switch(sortMethod) {
			case 1:
				insertionSort(a);
				break;
			case 2:
				bubbleSort(a);
				break;
			case 3:
				quickSort(a);
				break;
			default:
				quickSort(a);
				break;
		}
	}
	
	
	/**
	 * 插入排序
	 * 假设a[0..j-1]已排序，将a[j]插入到其中
	 */
	private static void insertionSort(int[] a) {
		int i, j;
		int len = a.length;
		int key;
		
		for (j = 1; j < len; j ++) {
			key = a[j];
			i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i+1] = a[i];
				i = i - 1;
			}
			a[i+1] = key;
		}
	}
	
	
	/**
	 * 冒泡排序
	 */
	private static void bubbleSort(int[] a) {
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
	 * 快速排序
	 */
	private static void quickSort(int[] a) {}
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
		ArraySort.sort(a, ArraySort.INSERTION_SORT);
		
		for (i = 0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
