package Array;

import java.util.Scanner;

public class FirstLastPosition {
    public static void FirstLast(int[] arr, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Position = " + first);
            System.out.println("Last Position = " + last);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = s.nextInt();
        FirstLast(arr, target);
    }
}