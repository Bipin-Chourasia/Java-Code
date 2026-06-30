package Array;

import java.util.Scanner;

public class SecondMaxElement {
	public static int SecMaxOfArr(int [] arr) {
		int max= Integer.MIN_VALUE;
		int SecMax= Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				SecMax = max;
				max =arr[i];
			}
			else if (arr[i]>SecMax && arr[i]!=max) {
			SecMax = arr[i];
		}
		}
		return SecMax;
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
		int res=SecMaxOfArr(arr);
		System.out.println("Largest element in tha array: "+res);
	}
}
