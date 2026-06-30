package Array;

import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=s.nextInt();
		int arr[]= new int [size];
		System.out.println("Enter array element: ");
		for(int i=0; i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("The array elements are: ");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
