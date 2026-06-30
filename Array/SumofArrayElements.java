package Array;

import java.util.Scanner;
public class SumofArrayElements {
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50};
		int res= sumOfArray(arr);
		System.out.println(res);
	}
	public static int sumOfArray(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++)
			sum+=arr[i];
		
		return sum;
	}
	

}
