package com.matrix.diagonal.elements.sum;

public class MatrixDiagonalElementsSum {

	public static void main(String[] args) {
		
		
		int[][] a = new int[3][3];
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=1;
		a[1][1]=2;
		a[1][2]=3;
		
		a[2][0]=1;
		a[2][1]=2;
		a[2][2]=3;
		
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("Sum of diagonals Start.........  : ");
		
		for(int k=0; k<3;k++) {
			
			int i=k;
			int j=0;
			int sum=0;
			while(i >=0) {
			 sum =sum+a[i][j];
				i=i-1;
				j=j+1;
			}
			System.out.println("Sum of diagonal is : "+sum);
		}
		
		for(int k=1;k<3;k++) {
			
			int i=2;
			int j=k;
			int sum=0;
			while(j<3) {
				sum+=a[i][j];
				i=i-1;
				j=j+1;
			}
			System.out.println("Sum of diagonal is : "+sum);
		}
		
	}

}















