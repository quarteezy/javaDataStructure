package _2BSIT1_Mendoza_IntroductionB;

import java.util.Scanner;

public class introductionB {
    public static void main(String[] args) {
    Scanner dm = new Scanner(System.in);
    int i = 0;
    String inString1;
    String inString2;
    String inString3 = "";
    
    System.out.println("\nDave Matthew H. Mendoza \n2BSIT-1\n");
    
    System.out.print("\nPlease enter your first input string: ");
    inString1 = dm.nextLine();
    System.out.print("Next enter your second input string: ");
    inString2 = dm.nextLine();
    
    while( i !=6)   {
    
    System.out.println("\nPlease pick an option: \n1. String Copy\n2. String Concatenate\n3. String Comparison\n4. String Reverse the first string output: \n5. String Second Stringconversion (uppercase to lowercase and vice-versa)\n6. Terminate Program\n");    
    System.out.print("Option Choice: ");
    i = dm.nextInt();
    System.out.println();
    
    switch (i) {
    case 1:
        int input;
        System.out.print("Enter string number you copy: ");
        input = dm.nextInt();
        
        if (input == 1)
            {System.out.println("String 3: " + inString1 + "\n"); inString3 = inString1;}
        else if(input == 2)
            {System.out.println("String 3: " + inString2 + "\n"); inString3 = inString2;}
        break;
        
        
    case 2: 
        String strngCon = null;

        strngCon = inString1.concat(inString2);
        System.out.println("OUTPUT: " + strngCon);
        break;
        
    
    case 3: 
    {
        String s1 = inString1;
        int compS1;
            System.out.print("Select the String that you want to compare with String 1: "); 
            compS1 = dm.nextInt();
            switch (compS1)   {
                case 1: 
                    if(s1.equals(inString1))
                        {System.out.println("They are Equal. ");}
                    else
                        {System.out.println("They are not Equal. ");}
                    break;
                    
                case 2: 
                    if(s1.equals(inString2))
                        {System.out.println("They are Equal. ");}
                    else
                        {System.out.println("They are not Equal. ");}
                    break;
                    
                case 3:
                    if(s1.equals(inString3))
                        {System.out.println("They are Equal. ");}
                    else
                        {System.out.println("They are not Equal. ");}
                    break;
                    
                default: break; 
                            }  
    }
        break;
        
    
    case 4: 
    { 
        String reverse = "" ;
        System.out.print("Enter String number you reverse: ");
        int d = dm.nextInt();
        
        if(d == 1)
        {
        int length = inString1.length();
        for(int i1 = length - 1; i1 >= 0; i1--)
        reverse = reverse + inString1.charAt(i1);
        System.out.println("Reversed string: " + reverse);
        }
        break;
        }
    
    case 5:
    {
        System.out.print("Enter String number you change: ");
        int b = dm.nextInt();
        if(b == 1)
        {
        System.out.println("\nString: " + inString1);
        System.out.println(inString1.toUpperCase());
        System.out.println(inString1.toLowerCase());
        }
        else if(b == 2) {
        System.out.println("\nString: " + inString2);
        System.out.println(inString2.toUpperCase());
        System.out.println(inString2.toLowerCase());
        }
        break;
    }
        
    case 6:
        System.out.println("\n=====Program Terminated.=====\n");
        break;
    
    default:
        System.out.print("\n==Invalid option, program will be terminated.==\n");
        break;
                }
                    }
    }
}