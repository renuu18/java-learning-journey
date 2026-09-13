package com.practice;

public class Twodimensional {

	public static void main(String[] args) {
		/*int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
        /* int[][] arr=new int[3][3];
         arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=1;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[1][2]=3;
        arr[2][0]=5;
        arr[2][1]=6;
        arr[2][2]=5;
        System.out.println(arr.length);*/
		
		/*int[][] arr=new int[3][3];
		arr[0] =new int[] {1,2,3};
		arr[1] =new int[] {4,5,6};
		arr[2] =new int[] {7,8,9};
		*/
		
        /*for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		System.out.print(arr[i][j] + "  ");
        	}
        	System.out.println();
        }*/
		
		//for overall size
		/*int size=0;
		for(int i=0;i<arr.length;i++) {
			size +=arr[i].length;
		}
		System.out.println(size);*/
		
		//jagged Array
		/*int[][] arr=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[5];
		arr[2]=new int[3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		
		arr[1][0]=1;
		arr[1][1]=2;
		arr[1][2]=2;
		arr[1][3]=1;
		arr[1][4]=2;
		
		arr[2][0]=1;
		arr[2][1]=2;
		arr[2][2]=2;*/
		
		int[][] arr = {{1,2},
		{1,4,5},
		{7,4,0}
		};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
