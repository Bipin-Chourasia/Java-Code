package Array;

import java.util.Arrays;
import java.util.Scanner;
public class LongestSubArray {
	public static int longestLength(int[] arr) {

		int target = 5;
		int max =Integer.MIN_VALUE;

		for(int i=0; i<=arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j]; // arr[j] is subarray element 
				if(sum<=target) {
					int len=j-i+1;
					max=Math.max(max,len);
				}
			}
		}
		return max;
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
		int result = longestLength(arr);
		System.out.println("Longest Length :" +result );
	}
}

