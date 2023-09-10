package lab2arr1;

import java.util.Arrays;
import java.util.Scanner;

public class sumArray1 {
    public static void main(String[] args) {
        Scanner dm = new Scanner (System.in);
        
        System.out.print("Input array size: ");
        int size = dm.nextInt();
        int[] value = new int[size];
        //int count = size;
        int sum = 0;
        System.out.println(Arrays.toString(value));
        
        for(int i = 0; i < size; i++)
        {
            System.out.print(i + 1 + ": ");
            int x = dm.nextInt();
            value[i] = x;
            sum += x;
        }
        
        System.out.println("\n" + sum);
        
        
        
        
    }
    
}