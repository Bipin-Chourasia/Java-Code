package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubMinArray {
	public static int submin(int[] arr) {
		
		int k =3;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<=arr.length-k; i++) {
			int sum = 0;
			for(int j=i; j<i+k; j++) {
				sum += arr[j]; // arr[j] is subarray element 
			}
				 System.out.println("sum = " + sum);
				 if(sum<min) {
					 min=sum;
				 }
			}
		return min;
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
			System.out.println("The minimum value of these sum:" +submin(arr));
		}

}
