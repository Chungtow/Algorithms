package com.onion.algorithm;

public class YoungMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] ym = {
				{1, 2, 8, 9},
				{2, 4, 9, 12},
				{4, 7, 10, 13},
				{6, 8, 11, 15}
		};
		
		
		System.out.println(YoungMatrix.search(ym, 6));
		System.out.println(YoungMatrix.search(ym, 5));

	}
	
	public static boolean search(int[][] ym, int a) {
		int len = ym.length;
		
		for (int i = 0; i < len; i ++) {
			if (ym[i][i] == a) {
				return true;
			}
			
			if (ym[i][i] < a && len > 1 && ym[i+1][i+1] > a) {
				int begin = i + 1;
				int nlen = len - begin;
				int[][] taga = new int[nlen][nlen];
				
				int[][] tagb = new int[nlen][nlen];
				
				
				
				matrixCopy(ym, begin, taga, tagb);
				
				/*
				for (int xx = 0; xx < nlen; xx ++) {
					for (int yy = 0; yy  < nlen; yy ++) {
						System.out.print(taga[xx][yy] + "\t");
					}
					System.out.println();
				}
				
				for (int xx = 0; xx < nlen; xx ++) {
					for (int yy = 0; yy  < nlen; yy ++) {
						System.out.print(tagb[xx][yy] + "\t");
					}
					System.out.println();
				}
				*/
				
				if(search(taga, a)) return true;
				if(search(tagb, a)) return true;
			}
		}
		
		return false;
	}
	
	public static void matrixCopy(int[][] ym, int begin, int[][] taga, int[][] tagb) {
		int len = ym.length - begin;
		for (int i = 0; i < len; i ++) {
			for (int j = 0; j < len; j ++) {
				taga[i][j] = ym[i+begin][j];
				tagb[i][j] = ym[i][j+begin];
			}
		}
	}
}
