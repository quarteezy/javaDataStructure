package cirQueue;

import java.util.Scanner;



public class circQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        queueOP q = new queueOP();
        
        int menu = 0;
        boolean exit = false;
        
        q.set();
        
        while(exit != true)
        {
            System.out.println("======================");
            System.out.println("MENU\n1. ENQUEUE\n2. DEQUEUE\n3. DISPLAY QUEUES\n4. EXIT");
            System.out.println("======================");
            System.out.print("Enter Choice: ");
            menu = scan.nextInt();
            System.out.println();
            
            switch(menu)
            {
                case 1:
                    q.enqueue();
                    System.out.println();
                    q.display();
                    System.out.println();
                    q.displayArr();
                    System.out.println("\nFront: " + q.front + "\n");
                    System.out.println("Rear: " + q.rear);
                    System.out.println();
                    break;
                    
                case 2:
                    q.display();
                    System.out.println();
                    q.displayArr();
                    q.dequeue();
                    System.out.println("Front: " + q.front + "\n");
                    System.out.println("Rear: " + q.rear);
                    System.out.println();
                    break;
                case 3:
                    q.display();
                    System.out.println();
                    q.displayArr();
                    System.out.println("\nFront: " + q.front + "\n");
                    System.out.println("Rear: " + q.rear);
                    System.out.println();
                    break;    
                    
                case 4:
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammer:\nDave Matthew H. Mendoza   (つ⌐▨_▨)つ\n");
                    System.exit(0);
                    exit = true;
                    break;
            }
        }
        
        
    }
    
}

class queueOP
{
    Scanner scan = new Scanner(System.in);
    
    int i, 
        front, 
        rear;
    int size;
    int[] queue;
    
    public int set()
    {
        System.out.print("How many elements will the queues have: ");
        size = scan.nextInt();
        queue = new int[size];
        System.out.println("Queue element created!");
        i = -1;
        front = -1;
        rear = -1;
        return size;
    }
    
    public int enqueue()
    {
        System.out.print("Please enter an interger: "); 
        int x = scan.nextInt();
          
        if((rear + 1) % size == front)
        {
            System.out.println("\nError queue overflow!");
            return x;
        }
        else if(empty())
        {
            i = 0;
            front = 0;
            rear = 0;
            queue[0] = x;
        }
        else
        {
            rear = (rear + 1) % size;
            i++;
        }
        
        queue[rear] = x;
        
        return x; 
    }
    
    public int dequeue()
    {
        int temp = '\0';
                
        if(empty())
        {
            System.out.println("Error queue empty!\n");
            return temp;
        }
        else if(front == rear)
        {
            queue[front] = '\0';
            i = -1;
            front = -1;
            rear = -1;
            System.out.println("\nElement removed!\n");
            return temp;
        }
        else
        {
            temp = queue[front];
            queue[front] = '\0';
            front = (front + 1) % size;
            System.out.println("\nElement removed!\n");
        }
        
        return temp;
    }
    
    public boolean empty()
    {
        boolean empty = false;
        
        if(front == -1 && rear == -1)
        {
            empty = true;
        }
        else
        {
            empty = false;
        }
        return empty;
    }
    
    public void display()
    {
        System.out.print("[ ");
        
        for(int j = 0; j <= queue.length-1; j++)
        {
            System.out.print(" " + queue[j] + " ");
        }
        
        System.out.print(" ]");
    }
    
    public void displayArr()
    {
        System.out.print("[ ");
        
        for(int j = 0; j <= size-1; j++)
        {
            System.out.print(" " + j + " ");
        }
                
        System.out.print(" ]\n");
    }
}