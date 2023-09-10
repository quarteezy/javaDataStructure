package arrSymMatrix;

import java.util.Scanner;

public class symMatrix {
    public static void main(String[] args) {
        Scanner dm = new Scanner(System.in);
        
  	System.out.print("Enter array size for row and column: ");
  	int size = dm.nextInt();
  	int symMatrix[][] = new int[size][size];
        boolean symAsymMatrix = true;
        
        
  	System.out.println("\nEnter the matrix number below:  ");
  	for(int x = 0; x < size; x++)
  	{
            for(int y = 0; y < size; y++)
            {
        	symMatrix[x][y] = dm.nextInt();
            }
  	}
        
        
  	System.out.println();
  	for(int x = 0; x < size; x++)
        {
            for(int y = 0; y < size; y++)
            {
        	System.out.print(symMatrix[x][y] + "  ");
            }
            System.out.println();
  	}
        
        
        for(int x = 0; x < size; x++)
        {
            for(int y = 0; y < size; y++)
            {
                if(symMatrix[x][y] != symMatrix[y][x])
                {
                    symAsymMatrix = false;
                    break;
                }
            }
        }
            
        
        if(symAsymMatrix)
        {
            System.out.println("Matrix is symmetrical.");
        }else
        {
            System.out.println("Matrix is asymmetrical.");
        }
  	
   
    }
    
}