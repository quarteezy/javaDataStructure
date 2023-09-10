package arrayDuplicate;

import java.util.Scanner;

public class arrayProg4 {
    public static void main(String[] args) {
        Scanner dm = new Scanner (System.in);
        
        System.out.print("Input array size: ");
        int size = dm.nextInt();
        int[] value = new int[size];
        System.out.println("Input " + size + " values: ");
        
        
        //Input the values
        for(int i = 0; i < size; i++)
        {
            System.out.print(i +1 + ": ");
            int v = dm.nextInt();
            value[i] = v;
        }
        
        
        //Shows the array before removing the duplicates.
        System.out.print("Before: ");
        for(int i = 0; i <= size-1; i++)
        {
            if(value[i] != 0)
            {
                System.out.print(value[i] + "  ");
            }
        }
        
        
        //Setting duplicated arrays to 0 or empty.
        for(int i = 0; i < size-1 ; i++)
        {
            for(int j = i + 1; j < size ; j++)
            {
                if(value[i] == value[j])
                {
                    value[j] = 0;
                }
            }
        }
        
        
        
        //To Print array without duplicates.
        System.out.print("\nAfter:  ");
        for(int i = 0; i <= size-1; i++)
        {
            if(value[i] != 0)
            {
                System.out.print(value[i] + "  ");
            }
        }
        System.out.println("\n");
        
    }
    
}   
