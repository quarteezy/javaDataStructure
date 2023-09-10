package arrStacks;

import java.util.Arrays;
import java.util.Scanner;

public class arrStacksLab3 {
    public static void main(String[] args) {
    Scanner dm = new Scanner (System.in);
    int menu = 0;
    
    
        System.out.print("How many elements will the stack have: ");
        int size = dm.nextInt();
        System.out.println("Stack Created!");
        int[] stackEle = new int[size];
        int i = 0;
        
        
        while( menu !=7)   
        {   
            System.out.println("\n\n================");
            System.out.println("MENU \n1. PUSH\n2. POP\n3. TOP\n4. SIZE\n5. EMPTY\n6. DISPLAY STACK\n7. EXIT");    
            System.out.println("================");
            System.out.print("Enter Choice: ");
            menu = dm.nextInt();
            System.out.println();
            
            
        switch (menu) 
        {
            case 1:
                
                System.out.print("Please enter an interger: "); 
                int x = dm.nextInt();
                
                if(i == -1)
                {i = 0;}
        
                if (i <= size-1)
                    {   
                        stackEle[i] = x;
                        System.out.print("Stack: ");
                        for(int z = 0; z <= stackEle.length-1; z++)
                        {
                            if(stackEle[z] != 0)
                            {
                            System.out.print(stackEle[z] + "  ");
                            }
                        }
                    }
                else
                    {
                        System.out.println("Error stack Overflow!");
                    }
            
                
                i++; 
                break;
            
                
            case 2:
                
                i--;
                if(i == -1)
                {i = 0;}
                else if(i > size-1)
                {i = size-1;}
                
                    if(stackEle[i] == 0)
                    {
                        System.out.println("Error stack empty!");
                    }
                    else
                    {
                        stackEle[i] = 0;
                        System.out.println(Arrays.toString(stackEle));
                        System.out.println("Last element popped!");
                    }
                    
                break;
            
            
            case 3:
                
                int top = 0;
                
                for(int y = 0; y <= stackEle.length-1; y++)
                {
                    if(stackEle[y] == 0)
                    {
                        top = y-1;
                        break;
                    }
                }
                
                System.out.println(stackEle[top]);
                break;
                
            
            case 4:
                
                int sDisp = 0;
                
                for(int z = 0; z < stackEle.length; z++)
                {
                    if(stackEle[z] != 0)
                    {
                        sDisp ++;
                    }
                }
                
                System.out.println("Size of stack: " + sDisp);
                break;
                
                
            case 5:
                
                boolean stackEmpty = false;
                
                    if(stackEle[0] == 0)
                    {
                        stackEmpty = true;
                        System.out.println("TRUE, the stack IS empty.");
                    }
                    else
                    {
                        stackEmpty = false;
                        System.out.println("FALSE, the stack IS NOT empty.");
                    }
                
                break;
                
            
            case 6:
                
                System.out.print("[ ");
                for(int z = 0; z <= stackEle.length-1; z++)
                {
                    if(stackEle[z] != 0)
                    {
                        System.out.print(" " + stackEle[z] + " ");
                    }
                }
                
                System.out.print(" ]");
                break;
                
               
            case 7:
                
                System.out.println("================= Shutting Down =================");
                System.out.println("\nProgrammer: Dave Matthew H. Mendoza || (つ⌐▨_▨)つ\n");
                
                break;
                
        }
        }    
    }
}