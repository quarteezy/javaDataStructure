package singlyLL;

import java.util.Arrays;

// Mali to

class singlyLinkedList
{
int[] arrList;
int[] tempArr;

boolean nullCk;
int arrSize;
int arrNewSize;

int tempIn;
int tempval;


void nullChecker()
{
    if(arrList == null)
    {
        this.arrList = new int[0];
        this.nullCk = true;
    }
    else
    {this.nullCk = false;}
}


int[] addFirst(int[] array, int input)
{
    if(array == null)
    {
        array = new int[1];
        array[0] = input;
    }
    else
    {
        tempArr = new int[array.length+1];
    
        for (int i = array.length-1; i >= 0; i--)
            {
                tempArr[i+1] = array[i];
            }
            tempArr[0] = input;
            array = tempArr;
    }
    
    
    return array;
}

int[] addLast(int[] array, int input)
{
    if(array == null)
    {
        array = new int[1];
        array[0] = input;
    }
    else
    {
        tempArr = new int[array.length+1];
    
        for (int i = 0; i <= array.length-1; i++)
            {
                tempArr[i] = array[i];
            }
            tempArr[tempArr.length-1] = input;
            array = tempArr;
    }
    
    
    return array;
}

int[] addPos(int[] array, int input, int pos)
{
    for (int i = 0; i <= pos-1; i++)
            {
                {tempArr[i] = array[i];}
            }
    
    for (int i = 0; i <= array.length-1; i++)
            {
                if(tempArr[i] == 0)
                {tempArr[i] = array[i];}
            }
            
            array = tempArr;
    return array;
}

void tempCopy()
{
    for (int i = 0; i <= this.arrList.length-1; ++i)
    {tempArr[i] = arrList[i];}
}

}






public class singlyLL {
    public static void main(String[] args) {
        int[] mainArr = null;
        singlyLinkedList dm = new singlyLinkedList();
        
        mainArr = dm.addFirst(mainArr, 1);
        mainArr = dm.addFirst(mainArr, 2);
        System.out.println(Arrays.toString(mainArr));
        mainArr = dm.addFirst(mainArr, 3);
        mainArr = dm.addFirst(mainArr, 4);
        mainArr = dm.addFirst(mainArr, 5);
        mainArr = dm.addFirst(mainArr, 6);
        mainArr = dm.addFirst(mainArr, 7);
        mainArr = dm.addFirst(mainArr, 8);
        System.out.println(Arrays.toString(mainArr));
        mainArr = dm.addLast(mainArr, 2);
        System.out.println(Arrays.toString(mainArr));
        /*
        System.out.println(Arrays.toString(dm.arrList));
        dm.add(2);
        System.out.println(Arrays.toString(dm.arrList));
        dm.add(3);
        System.out.println(Arrays.toString(dm.arrList));
        */
    }
}


// ETO YUNG TAMA TALAGA

/*
package node;

import java.util.Scanner;

public class singly 
{
    public static void main(String[] args) 
    {
        singlyLL node = new singlyLL();
        Scanner scan = new Scanner(System.in);
        int input;
        int pos;
        int menu = 0;
        
        while(menu != 9)
	{   
            System.out.println("======================");
            System.out.println("MENU\n1. Insertion at the beginning\n2. Insertion at the end\n3. Insertion at any specified position \n4. Deletion at the beginning\n5. Deletion at the end\n6. Deletion at the specified position\n7. Display\n8. Search\n9. EXIT");
            System.out.println("======================");
            System.out.print("\nEnter Choice: ");
            menu = scan.nextInt();
            System.out.println();
            
            switch (menu) 
            {
                case 1:
                    System.out.print("Data: ");
                    input = scan.nextInt();
                    node.addFirst(input);
                    break;
	        	
                case 2:
                    System.out.print("Data: ");
                    input = scan.nextInt();
                    node.addLast(input);
                    break;
	        	
                case 3:
                    System.out.print("Data: ");
                    input = scan.nextInt();
                    System.out.print("Position: ");
                    pos = scan.nextInt();
                    node.addPos(input, pos);
                    break;
                        
                case 4:
                    node.delFirst();
                    break;
                        
                case 5:
                    node.delLast();
                    break;
                       
                case 6:
                    System.out.print("Position: ");
                    pos = scan.nextInt();
                    node.delPos(pos);
                    break;
                    
                case 7:
                    System.out.println(node.display() + "\n");
                    break;
                    
                case 8:
                    System.out.print("Data: ");
                    input = scan.nextInt();
                    node.search(input);
                    break;
                    
                case 9:
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammers:\nDave Matthew H. Mendoza   (つ⌐▨_▨)つ\n");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammers:\nDave Matthew H. Mendoza   (つ⌐▨_▨)つ\n");
                    System.exit(0);
            }
        }
    }
}

class singlyLL
{
    node start = null;
    node end = null;
    
    class node
    {
        int data;
        node next;
    
        public node(int data)
        {
            this.data = data;
            this.next = null;
        }
        
        public int getData()
        {
            return data;
        }
    
        public node getNext()
        {
            return next;
        }
    
        public void setData(int data)
        {
            this.data = data;
        }
    
        public void setNext(node next)
        {
            this.next = next;
        }
    }
    
    public void addFirst(int input) 
    {
        node newNode = new node(input);  
        if(start == null) 
        {  
            start = newNode;  
            end = newNode;  
            System.out.println("Data is successfully inserted\n");
        }  
        else 
        {  
            node temp = start;
            start = newNode;   
            start.next = temp;  
            System.out.println("Data is successfully inserted\n");
        }  
    }
    
    public void addLast(int input) 
    {
        node newNode = new node(input);  
        if(start == null) 
        {  
            start = newNode;  
            end = newNode;  
            System.out.println("Data is successfully inserted\n");
        }  
        else 
        {   
            end.next = newNode;  
            end = newNode;
            System.out.println("Data is successfully inserted\n");
        }  
    }
    
    public void addPos(int input, int pos) 
    {
	node newNode = new node(input);
		
	if (pos == 1 || pos == 0) 
        {
            newNode.setNext(start);
            start = newNode;
            System.out.println("Data is successfully inserted\n");
            return;
	}
                
        node temp = start;
	int i = 1;
                
	while (i < pos-1) 
        {
            temp = temp.getNext();
            if (temp == null) 
            {
                throw new IndexOutOfBoundsException("Cannot find item at position " + pos);
            }
            i++;
	}
		
	newNode.setNext( temp.getNext() );
	temp.setNext( newNode );
        System.out.println("Data is successfully inserted\n");
    }
    
    public void delFirst() 
    {
        if(start == null) 
        {  
            throw new IndexOutOfBoundsException("The Linked list is empty"); 
        }  
        else 
        {
            if(start != end) 
            {  
                start = start.next;  
            } 
            else 
            {  
                start = end;
                end = null;
            }
        }
        System.out.println("Data is successfully deleted\n");
    }
    
    public void delLast() 
    {
        if(start == null) 
        {  
            throw new IndexOutOfBoundsException("The Linked list is empty"); 
        }  
        else 
        {
            if(start != end) 
            {  
                node temp = start;
                while(temp.next != end)
                {
                    temp = temp.next;
                }
                end = temp;
                end.next = null;
            } 
            else 
            {  
                start = end;
                end = null;
            }
        }
        System.out.println("Data is successfully deleted\n");
    }
    
    public void delPos(int inPos)
    {
        if(start == null)
        {
            throw new IndexOutOfBoundsException("The Linked list is empty"); 
        }
        
        node temp = start;
        
        if(inPos == 1)
        {
            start = temp.next;
            System.out.println("Data is successfully deleted\n");
            return;
        }
        
        for(int i = 1; temp != null && i < inPos-1; i++)
        {
            temp = temp.next;
        }
        
        if(temp == null || temp.next == null)
        {
            throw new IndexOutOfBoundsException("The node position is not found"); 
        }
        
        node next = temp.next.next;
        temp.next = next;
        System.out.println("Data is successfully deleted\n");
    }
    
    public void search(int input) 
    {
        node temp = start;
	int count = 1;
        
        if(start == null)
        {
            throw new IndexOutOfBoundsException("The Linked list is empty"); 
        }
        else
        {
            while (temp != null) 
            {
                if (temp.data == input) 
                {
                    System.out.println("Data: " + input + " is on position: " + count + "\n");
                    break;
                }
                count++;
                temp = temp.getNext();
            }
        }
    }
    
    public String display()
    {
        String result = "";
        node temp = start;
        
        while(temp != null)
        {
            result += temp.data + " ";
            temp = temp.getNext();
        }
        
        return result;
    }
}

*/