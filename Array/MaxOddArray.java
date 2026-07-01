package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOddArray {
	
		public static int MaxOdd(int [] arr) {
			int k=4;
			int max = Integer.MIN_VALUE;
					
		for(int i=0; i<=arr.length-k; i++) {
			int count = 0;
			//inner loop is the subarray
			for(int j=i; j<i+k; j++) {
				if(arr [j]%2!=0) 
					count++;
					
			}
			max = Math.max(count,max);
			
			}
		return max;
	}
		// fixed subarray size-k value is subarray size.
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the size of array: ");
			int size=s.nextInt();
			int [] arr= new int [size]; 
			System.out.println("Enter the array elements: ");
			for(int i=0; i<size; i++) {
				
				arr[i]=s.nextInt();
				
			}
			int result = MaxOdd(arr);
			System.out.println("Count:" +result);
		}
	}

