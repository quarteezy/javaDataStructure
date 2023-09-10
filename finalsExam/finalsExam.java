package finalsExam;

import java.util.Scanner;

public class finalsExam {
    public static void main(String[] args) {
        parBal par = new parBal();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please input a parenthesis: ");
        String input = scan.nextLine();
        
        par.parBal(input);
        
        System.out.println("\n\nProgrammer: \nDave Mendoza    (つ⌐▨_▨)つ");
    }
}




class parBal
{
    Boolean parBal(String input)
    {
        int opPar = 0; // (
        int clPar = 0; // )
        boolean par = false;
        
        for (int i = 0; i <= input.length()-1; ++i)
        {
            char c = input.charAt(i);
            
            if (c == '(')
            {
                opPar++;
            }
            else if(c == ')')
            {
                clPar++;
            }
        }
        if(opPar == clPar)
        { 
            System.out.println("Parenthesis is balanced!");
            par = true;
        }
        
        else if(opPar != clPar) 
        { 
            par = false;
            System.out.println("Parenthesis is not balanced!");
        }
        
        return par;
    }

}