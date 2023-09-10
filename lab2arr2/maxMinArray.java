package lab2arr2;

import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args) {
        Scanner dm = new Scanner (System.in);
        
        System.out.print("Input array size: ");
        int size = dm.nextInt();
        int[] value = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            System.out.print(i + 1 + ": ");
            int x = dm.nextInt();
            value[i] = x;
        }
        
        int small = value[0];
        int big = value[0];
        
        for(int i = 0; i <= value.length-1; i++)
        {
            if (value[i] > big)     big = value[i];
            if (value[i] < small) small = value[i];
        }
        System.out.println("Max: " + big);
        System.out.println("Min: " + small);
        
    }
    
}
