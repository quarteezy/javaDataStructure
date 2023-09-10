package queueDSA;

import java.util.Scanner;

public class queue 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        queueOP q = new queueOP();
        
        int menu = 0;
        boolean exit = false;
        
        q.set();
        
        while(exit != true)
        {
            System.out.println("======================");
            System.out.println("MENU\n1. ENQUEUE\n2. DEQUEUE\n3. SIZE\n4. EMPTY\n5. DISPLAY QUEUES\n6. EXIT");
            System.out.println("======================");
            System.out.print("\nEnter Choice: ");
            menu = scan.nextInt();
            System.out.println();
            
            switch(menu)
            {
                case 1:
                    q.enqueue();
                    break;
                    
                case 2:
                    q.dequeue();
                    break;
                    
                case 3:
                    System.out.println("Size of the queue is: " + q.size());
                    break;
                
                case 4:
                    System.out.println(q.empty());
                    System.out.println();
                    break;
                
                case 5:
                    q.display();
                    break;    
                    
                case 6:
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
                
        if(front == -1 && rear == -1 && i == -1)
        {
            i = 0;
            front = 0;
            rear = 0;
            queue[0] = x;
            rear++;
            
            System.out.print("Queue data: ");
            for(int j = 0; j <= queue.length-1; j++)
            {
                if(queue[j] != 0)
                {
                    System.out.print(queue[j] + "  ");
                }
            }
            System.out.println("\n");
        }
        else if(i <= size-1 && rear <= size-1)
        {   
            queue[rear] = x;
            System.out.print("Queue data: ");
            for(int j = 0; j <= queue.length-1; j++)
            {
                if(queue[j] != 0)
                {
                    System.out.print(queue[j] + "  ");
                }
            }
            System.out.println("\n");
            rear++;
            i++;
        }
        else
        {
            System.out.println("Error queue overflow!");
        }
        return x; 
    }
    
    public void dequeue()
    {
        
        if(front == -1 && rear == -1 && i == -1)
        {
            System.out.println("Error queue empty!\n");
        }
        else if(front <= size-1)
        {
            int temp = queue[front];
            queue[front] = '\0';
            front++;
            System.out.println("Element removed!\n");
        }
        else
        {
            System.out.println("Error queue already emptied!\n");
        }
    }
    
    public int size()
    {
        int size = 0;
                
        for(int j = 0; j <= queue.length-1; j++)
        {
            if(queue[j] != 0 || queue[j] != '\0')
            {
                size++;
            }
        }
                
        return size;
    }
    
    public boolean empty()
    {
        boolean empty = false;
        
        if(rear == -1 && front == -1)
        {
            empty = true;
        }
        else if(rear == size && front == size)
        {
            empty = true;
        }
        else if(rear != -1 && front != -1)
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
            if(queue[j] != 0 || queue[j] != '\0')
            {
                System.out.print(" " + queue[j] + " ");
            }
        }
                
        System.out.print(" ]\n");
    } 
}