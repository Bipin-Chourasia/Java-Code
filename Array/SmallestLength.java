package Array;

import java.util.Arrays;
import java.util.Scanner;
public class SmallestLength {
	public static int smallLength(int[] arr) {

		int target = 7;
		int min =Integer.MAX_VALUE;

		for(int i=0; i<=arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j]; // arr[j] is subarray element 
				if(sum>=target) {
					int len=j-i+1;
					min=Math.min(min,len);
					break;

				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=s.nextInt();
		int [] arr= new int [size]; 
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++) {

			arr[i]=s.nextInt();

		}
		int result = smallLength(arr);
		System.out.println("Smallest Length :" +result );
	}
}
