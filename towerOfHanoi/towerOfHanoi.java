package towerOfHanoi;

import java.util.Scanner;

class hanoi
{
    Scanner scan = new Scanner(System.in);
    // Initialize the method that will verify if the tower is empty.
    int t1, 
        t2 = 0,
        t3 = 0,
        j = 1;
    int size, 
        temp,
        movesavl,
        moves = 2;
    int[] a, b, c; // Tower
    
    // Player will input its desired number of disks to use in the game
    public int setDisk()
    {
        // User input for number of disks
        System.out.print("How many disks will Tower of Hanoi will have? : ");
        size = scan.nextInt();
        
        // Set the disk into the tower
        t1 = size;
        
        // Setting of Sizes
        a = new int[size];
        b = new int[size];
        c = new int[size];
        
        
        for(int i = size; i != 0; i--)
        {
            a[i-1] = j;
            j++;
        }
        
        
        
        
        System.out.println("Tower of Hanoi disks Created!");
        return size;
    }
    
    // Calculates the moves that will be available for the player
    public void moveCalc()
    {
        for(int i = size-1; i != 0; i--)
        {
            moves = moves * 2;
        }
        moves--;
        
        movesavl = moves;
        System.out.println("\nAvailable Moves: " + moves);
    }
    
    // This method will count the remaining moves available for the player
    public void moveCount()
    {
        
        
        if(movesavl == 0)
        {
            System.out.println("Game Over! You ran out of moves.");
            System.exit(0);
        }
        
        System.out.println("Remaining moves: " + movesavl);
    }
    
    // This method will print out the tower
    public void dispTower()
    {
        
        for(int i = size; i != 0; i--)
        {
            System.out.print("   ");
            
            // Print out the first tower
            if(a[i-1] != 0) 
            
                System.out.print(a[i-1]); // 0 | // 1 2 3 
            
            else
            
                System.out.print("|");
            
            
            System.out.print("   ");
            
            // Print out the second tower
            if(b[i-1] != 0)
            {
                System.out.print(b[i-1]);
            }
            else
            {
                System.out.print("|");
            }
            
            System.out.print("   ");
            
            // Print out the third tower
            
            if(c[i-1] != 0)
            {
                System.out.print(c[i-1]);
            }
            else
            {
                System.out.print("|");
            }
        
            System.out.println();
        }
        
        System.out.println("---+---+---+---");
        System.out.println();
        
    }
    
    // Moving Disks from Tower a to Tower b
    public void aTob()
    {
        temp = a[t1-1];
        // This method verifies if the tower has a disk to move from it.
        if(t1 == 0)
        {
            System.out.println("Error! tower is empty!");
        }
        // If selected tower is empty it will be automatically inserted.
        else if(t2 == 0)
        {
            temp = a[t1-1];
            b[t2] = temp;
            a[t1-1] = 0;
            t1--;
            t2++;
            movesavl--;
        }
        // An error will pop-up if the disk is greater than the disk in the selected tower.
        else if(b[t2-1] < temp)
        {
            
            System.out.println("Error Move is invalid!\n");
        }
        // If the selected tower already has an disk inserted to it.
        else
        {
            temp = a[t1-1];
            b[t2] = temp;
            a[t1-1] = 0;
            t1--;
            t2++;
            movesavl--;
        }
        
        // Display the tower.
        dispTower();
    }
    
    // Moving Disks from Tower a to Tower c
    public void aToc()
    {
        temp = a[t1-1];
        // This method verifies if the tower has a disk to move from it.
        if(t1 == 0)
        {
            System.out.println("Error! tower is empty!");
        }
        // If selected tower is empty it will be automatically inserted.
        else if(t3 == 0)
        {
            temp = a[t1-1];
            c[t3] = temp;
            a[t1-1] = 0;
            t1--;
            t3++;
            movesavl--; 
        }
        // An error will pop-up if the disk is greater than the disk in the selected tower.
        else if(c[t3-1] < temp)
        {
            System.out.println("Error Move is invalid!\n");
        }
        // If the selected tower already has an disk inserted to it.
        else
        {
            temp = a[t1-1];
            c[t3] = temp;
            a[t1-1] = 0;
            t1--;
            t3++;
            movesavl--; 
        }
            
        // Display the tower.
        dispTower();
    }
    
    // Moving Disks from Tower b to Tower a
    public void bToa()
    {
        temp = b[t2-1];
        // This method verifies if the tower has a disk to move from it.
        if(t2 == 0)
        {
            System.out.println("Error! tower is empty!");
            //System.exit(0);
        }
        // If selected tower is empty it will be automatically inserted.
        else if(t1 == 0)
        {
            temp = b[t2-1];
            a[t1] = temp;
            b[t2-1] = 0;
            t2--;
            t1++;
            movesavl--;
        }
        // An error will pop-up if the disk is greater than the disk in the selected tower.
        else if(a[t1-1] < temp)
        {
            System.out.println("Error Move is invalid!\n");
        }
        // If the selected tower already has an disk inserted to it.
        else
        {
            temp = b[t2-1];
            a[t1] = temp;
            b[t2-1] = 0;
            t2--;
            t1++;
            movesavl--;
        }
        
        // Display the tower.
        dispTower();
    }
    
    // Moving Disks from Tower b to Tower c
    public void bToc()
    {
        temp = b[t2-1];
        // This method verifies if the tower has a disk to move from it.
        if(t2 == 0)
        {
            System.out.println("Error! tower is empty!");
        }
        // If selected tower is empty it will be automatically inserted.
        else if(t3 == 0)
        {
            temp = b[t2-1];
            c[t3] = temp;
            b[t2-1] = 0;
            t2--;
            t3++;
            movesavl--; 
        }
        // An error will pop-up if the disk is greater than the disk in the selected tower.
        else if(c[t3-1] < temp)
        {
            System.out.println("Error Move is invalid!\n");
        }
        // If the selected tower already has an disk inserted to it.
        else
        {
            temp = b[t2-1];
            c[t3] = temp;
            b[t2-1] = 0;
            t2--;
            t3++;
            movesavl--; 
        }
         
        // Display the tower.
        dispTower();
    }
    
    // Moving Disks from Tower c to Tower a
    public void cToa()
    {
        temp = c[t3-1];
        // This method verifies if the tower has a disk to move from it.
        if(t3 == 0)
        {
            System.out.println("Error! tower is empty!");
        }
        // If selected tower is empty it will be automatically inserted.
        else if(t1 == 0)
        {
            temp = c[t3-1];
            a[t1] = temp;
            c[t3-1] = 0;
            t3--;
            t1++;
            movesavl--; 
        }
        // An error will pop-up if the disk is greater than the disk in the selected tower.
        else if(a[t1-1] < temp)
        {
            System.out.println("Error Move is invalid!\n");
        }
        // If the selected tower already has an disk inserted to it.
        else
        {
            temp = c[t3-1];
            a[t1] = temp;
            c[t3-1] = 0;
            t3--;
            t1++;
            movesavl--; 
        }
               
        // Display the tower.
        dispTower();
    }
    
    // Moving Disks from Tower c to Tower b
    public void cTob()
    {
        temp = c[t3-1];
        // This method verifies if the tower has a disk to move from it.
        if(t3 == 0)
        {
            System.out.println("Error! tower is empty!");
        }
        // If selected tower is empty it will be automatically inserted.
        else if(t2 == 0)
        {
            temp = c[t3-1];
            b[t2] = temp;
            c[t3-1] = 0;
            t3--;
            t2++;
            movesavl--;
        }
        // An error will pop-up if the disk is greater than the disk in the selected tower.
        else if(b[t2-1] < temp)
        {
            System.out.println("Error Move is invalid!\n");
        }
        // If the selected tower already has an disk inserted to it.
        else
        {
            temp = c[t3-1];
            b[t2] = temp;
            c[t3-1] = 0;
            t3--;
            t2++;
            movesavl--;
        }
        
        // Display the tower.
        dispTower();
    }
}


public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        hanoi toh = new hanoi();
        
        toh.setDisk();
        toh.moveCalc();
        toh.dispTower();
        
        int menu = 0;
        boolean exit = false;
        
        while(exit != true)
        {
            System.out.println("======================");
            System.out.println("1. A to B || 2. A to C\n3. B to A || 4. B to C\n5. C to A || 6. C to B\n7. EXIT");
            System.out.println("======================");
            System.out.print("Enter Choice: ");
            menu = scan.nextInt();
            System.out.println();
            
            switch(menu)
            {
                case 1: // Moving Disks from Tower a to Tower b
                    toh.aTob();
                    toh.moveCount();
                    break;
                    
                case 2: // Moving Disks from Tower a to Tower c
                    toh.aToc();
                    toh.moveCount();
                    break;
                    
                case 3: // Moving Disks from Tower b to Tower a
                    toh.bToa();
                    toh.moveCount();
                    break;
                
                case 4: // Moving Disks from Tower b to Tower c
                    toh.bToc();
                    toh.moveCount();
                    break;
                
                case 5: // Moving Disks from Tower c to Tower a
                    toh.cToa();
                    toh.moveCount();
                    break;    
                
                case 6: // Moving Disks from Tower c to Tower b
                    toh.cTob();
                    toh.moveCount();
                    break;    
                    
                case 7: // Exit the program
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammer:\nMendoza      (つ⌐▨_▨)つ\nComandante   (つ⌐▨_▨)つ\nAlcantara    (つ⌐▨_▨)つ\n");
                    System.exit(0);
                    exit = true;
                    break;
            }
        }
        
        
        
    }
    
}
