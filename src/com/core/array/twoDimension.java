package com.core.array;
public class twoDimension{
	public static void main(String[] args) {
		int[][] a2 = new int[10][5];

		//int a2[][]={{1,2},{3,4,6,7},{5},{1,2,3}};
		for (int i=0; i<a2.length; i++) {
			for (int j=0; j<a2[i].length; j++) 
		{
			
				a2[i][j] = i;
				System.out.print(" " + a2[i][j]);
			}
			
			System.out.println("");
		}
	}
}