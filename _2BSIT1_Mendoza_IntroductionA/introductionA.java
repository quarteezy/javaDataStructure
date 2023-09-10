package _2BSIT1_Mendoza_IntroductionA;

import java.util.Scanner;

public class introductionA {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    int reverseInt = 0;
    System.out.println("\nDave Matthew H. Mendoza \n2BSIT-1\n");
    
    System.out.print("Enter A Integer Value: ");
    int value = scan.nextInt();
    
    String numToStr = Integer.toString(value);
    System.out.println("\nPlease pick an option: \n1. Sum of the Digits\n2. Reverse the Integer Value\n3. Display the Prime Numbers\n4. Palindrome Checking\n5. Check if Odd or Even\n6. Terminate Program\n");
    System.out.print("Option Choice: ");
    int choice = scan.nextInt();
    
    switch (choice) {
        
    case 1:
        int sumDigit = 0;
        for(int sd = 0; sd < numToStr.length() ; sd++)
        { sumDigit += Integer.parseInt(numToStr.charAt(sd) + ""); }
        System.out.println("Sum: " + sumDigit + "\n");
        break;
    
    case 2:
        while (value != 0) 
        {
        int digit = value % 10;
        reverseInt = reverseInt * 10 + digit;
        value = value / 10;
        }
        System.out.println("Reversed Number: " + reverseInt + "\n");
        break;
    
    case 3:
        int N = value;
        int x, y, primeNo;
        System.out.print("Prime Numbers from 2 to your input value are: \n");
        for (x = 2; x <= N; x++) 
        {
        primeNo = 1;
        for (y = 2; y*y <= x; y++)
        {
        if (x % y == 0) 
        {
        primeNo = 0;
        break;
        }
        }
        if (primeNo == 1) {System.out.print(x + " \n");}
        }
        break;
    
    case 4:
        int num1 = Integer.parseInt(new StringBuilder(numToStr).reverse().toString());
        System.out.print(value + " is ");
        if(num1 != value) System.out.print("not ");
        System.out.print("a Palindrome.\n");
        break;
    
    case 5:
        if (value % 2 == 0) {   System.out.print(value + " is an even number.\n");}
        else {System.out.print(value + " is an odd number.\n");}
        break;
    
    case 6:
        System.out.print("\n=====Program Terminated.=====\n");
        break;
    
    default:
        System.out.print("\n==Invalid option, program will be terminated.==\n");
        break;
                    }
    }
}