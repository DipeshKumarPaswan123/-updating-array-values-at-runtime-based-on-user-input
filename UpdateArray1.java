package com.anonymous.p1;

import java.util.Scanner;

/**
 * Updating of an Array
 *
 * @author DIPESH
 * @date 9/11/2024
 */
public class UpdateArray1 {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        System.out.println("Original Array: ");
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("Updated Array: ");
        num[2] = 100;
        num[4] = 200;
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
//  updating array values at runtime based on user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value of an array: ");
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Arry: ");
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the index you want to update: ");
        int index = sc.nextInt();
        System.out.println("Enter the value: ");
        int newValue = sc.nextInt();
        if(index>=0 && index<arr.length) {
            arr[index] = newValue;
        }
        else {
            System.out.println("Invalid index");
        }
        System.out.println("Updated Array: ");
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
