package com.onion.algorithm.sort;

/**
 * 堆排序
 * @author yushuo.lct
 *
 */
public class HeapSort {
	private static void max_heapify(int[] a, int i) {
		int i_l = 2*i;
		int i_r = 2*i+1;
		
		int j = i_l;
				
		int tmp;
		if (a[i_l] < a[i_r]) {
			j = i_r;
		}
		
		if (a[i] < a[j]) {
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
	}
	
	/**
	 * 构建最大堆
	 * @param num
	 */
	public static void build_max_heapify(int[] num) {
		
		for (int i = 0; i < num.length/2; i ++) {
			max_heapify(num, i);
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
	
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String [] args) {
		int[] num = {32,12,8,16,64,22,25,3,16};
		HeapSort.print(num);
		HeapSort.build_max_heapify(num);
		HeapSort.print(num);
		
		
	}

}
