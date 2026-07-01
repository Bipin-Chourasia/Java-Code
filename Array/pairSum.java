package Array;

import java.util.Scanner;

public class pairSum {
	public static int MaxOdd(int [] arr) {
		int target=6;
		int count=0;
				
	for(int i=0; i<=arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			int sum = arr[i]+arr[j];
			if(sum>target) 
				count++;
				
		}
		}
	return count;
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
