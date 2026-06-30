package Array;

import java.util.Scanner;
public class MaximumElement {
	public static int MaxOfArr(int [] arr) {
		int max= arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size= sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i= 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int res=MaxOfArr(arr);
		System.out.println("Largest element in tha array: "+res);

	}
}
