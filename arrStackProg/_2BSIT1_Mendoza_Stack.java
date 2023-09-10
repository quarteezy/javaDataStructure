package arrStackProg;

import java.util.Arrays;
import java.util.Scanner;

class Stacks
{
    Scanner dm = new Scanner (System.in);
    int i = 0;
    int size;
    int[] stackEle;
    
    public int setStack()
    {
        System.out.print("How many elements will the stack have: ");
        size = dm.nextInt();
        stackEle = new int[size];
        System.out.println("Stack Created!");
        return size;
    }

    public int pushStack()
    {
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
            
                
        return i++; 
    }

    public void popStack()
    {
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
    }

    public void topStack()
    {
        int top = 0;
                
        for(int y = 0; y <= stackEle.length-1; y++)
        {
            if(stackEle[y] == 0)
            {
                top = y-1;
                break;
            }
        }
        
        if(top <= -1)
        {
            top = 0;
        }
        else if(top > size-1)
        {
            top = size-1;
        }
        System.out.println(stackEle[top]);
    }
    
    public void sizeStack()
    {
        int sDisp = 0;
                
        for(int z = 0; z < stackEle.length; z++)
        {
            if(stackEle[z] != 0)
            {
                sDisp ++;
            }
        }
                
        System.out.println("Size of stack: " + sDisp);
    }
    
    public void emptyStack()
    {
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
    }
    
    public void displayStack()
    {
        System.out.print("[ ");
        for(int z = 0; z <= stackEle.length-1; z++)
        {
            if(stackEle[z] != 0)
            {
                System.out.print(" " + stackEle[z] + " ");
            }
        }
                
        System.out.print(" ]");
    }   
}

public class _2BSIT1_Mendoza_Stack {
    public static void main(String[] args) {
        Scanner dm = new Scanner (System.in);
        int menu = 0;
        
        
        //Initialize Stacks
        Stacks dmStacks = new Stacks();  
        
        
        //Ask the user how many elements the stack can handle.
        dmStacks.setStack();
        
        
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
                    //PUSH OPERATION
                    dmStacks.pushStack();
                    break;
            
                case 2:
                    //POP OPERATION
                    dmStacks.popStack();
                    break;
                
                case 3:
                    //TOP OPERATION
                    dmStacks.topStack();
                    break;
                
                case 4:
                    //SIZE
                    dmStacks.sizeStack();
                    break;
                
                case 5:
                    //EMPTY
                    dmStacks.emptyStack();
                    break;
                
                case 6:
                    //DISPLAY STACK
                    dmStacks.displayStack();
                    break;
                
                case 7:
                    //EXIT 
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammer: Dave Matthew H. Mendoza || (つ⌐▨_▨)つ\n");
                
                    break;
        
            }
            
        }
    }
    
}