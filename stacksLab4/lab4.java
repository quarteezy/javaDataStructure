package stacksLab4;

import java.util.Scanner;
import java.util.LinkedList;


public class lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    	
        // Calls the infPrePos class
        infPrePos inf = new infPrePos();
        String notation = null;
        int menu = 0;
                
        
	System.out.print("Infix notation: ");
	String infix = scan.nextLine();
	infix = infix.replaceAll("\\s", "");
        inf.parVrf(infix);
	inf.vrfNotation(infix);
        
	while(menu != 6)
	{   
            System.out.println("======================");
            System.out.println("MENU\n1. Prefix Notation\n2. Postfix Notation\n3. Prefix Evaluation\n4. Postfix Evaluation\n5. Reset\n6. Exit");
            System.out.println("======================");
            System.out.print("\nEnter Choice: ");
            menu = scan.nextInt();
            System.out.println();
            
            switch (menu) 
            {
                case 1:
                    System.out.println(inf.infixToPrefix(infix));
                    notation = inf.infixToPrefix(infix);
                    break;
	        	
                case 2:
                    System.out.println(inf.infixToPostfix(infix));
                    notation = inf.infixToPostfix(infix);
                    break;
	        	
                case 3:
                    inf.evaluatePrefix(notation);
                    break;
                        
                case 4:
                    inf.evaluatePostfix(notation);
                    break;
                        
                case 5:
                    System.out.print("Infix notation: ");
                    infix = scan.nextLine();
                    infix = scan.nextLine();
                    infix = infix.replaceAll("\\s", "");
                    inf.vrfNotation(infix);
                    notation = null;
                    break;
                       
                case 6:
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammers:\nDave Matthew H. Mendoza   (つ⌐▨_▨)つ\nRustie Angelo D. Sumalbag (つ⌐▨_▨)つ\n");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("================= Shutting Down =================");
                    System.out.println("\nProgrammers:\nDave Matthew H. Mendoza   (つ⌐▨_▨)つ\nRustie Angelo D. Sumalbag (つ⌐▨_▨)つ\n");
                    System.exit(0);
            }
	}
}}




class infPrePos
{
    
    
    // Verifies the parenthesis that is scanned
    // (If ever there is a parenthesis that is scanned).
    Boolean parVrf(String infix)
    {
        
        int opPar = 0; // (
        int clPar = 0; // )
        boolean par = false;
        
        for (int i = 0; i <= infix.length()-1; ++i)
        {
            char c = infix.charAt(i);
            
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
            par = true;
        }
        
        else if(opPar != clPar) 
        { 
            par = false;
            System.out.println("Error! Infix is an invalid Expression");
            System.exit(0);
        }
        
        return par;
    }
    
    
    // Verifies and tests if the infix is valid or not.
    String vrfNotation(String infix)
    {
        int operatorCnt = 0; 
        int operandCnt = 0;
            
            
        for (int i = 0; i < infix.length(); ++i)
        {
            char c = infix.charAt(i);
                     
            if (Character.isLetterOrDigit(c)) // revise double digit bug = 12 + 1
                {operandCnt++;}
            
            else if (c == '(' || c == ')'); // A+B+(ED)*F
            
            else
                {operatorCnt++;}
        }
        
            
        if(operatorCnt == operandCnt)
        {
            System.out.println("Error! Infix is an invalid Expression");
            System.exit(0);
        }
        else if(operatorCnt != operandCnt-1)         
        {                                    
            System.out.println("Error! Infix is an invalid Expression");
            System.exit(0);
        }
        else 
        {
            System.out.println("Verified! Infix is an valid Expression");
        }
            
        return infix;
    }
    
    
    // Counts the operator of the string input
    public int oprInit(String infix)
    {
        int operatorCnt = 0; 
        int operandCnt = 0;
            
            
        for (int i = 0; i < infix.length(); ++i)
        {
            char c = infix.charAt(i);
                     
            if (Character.isLetterOrDigit(c)) // revise double digit bug = 12 + 1
                {operandCnt++;}
            
            else if (c == '(' || c == ')')
                {operatorCnt++;}
            
            else
                {operatorCnt++;}
        }
        return operatorCnt;
    }
    
    
    // Counts the operand of the string input
    public int opdInit(String infix)
    {
        int operatorCnt = 0; 
        int operandCnt = 0;
            
            
        for (int i = 0; i < infix.length(); ++i)
        {
            char c = infix.charAt(i);
                     
            if (Character.isDigit(c)) // revise double digit bug = 12 + 1
                {operandCnt++;}
            
            else if(Character.isAlphabetic(c))
                {operandCnt++;}
            
            else if (c == '(' || c == ')')
                {operatorCnt++;}
            
            else
                {operatorCnt++;}
        }
        return operandCnt;
    }
    
    
    // Insert a value on the char array.
    public synchronized char[] push(char[] c, char ch)
    {
        //char[] tempo = c;
        char temp = ch;
        for(int i = 0; i <= c.length-1; i++)
        {
            if(c[i] == '\0')
            {
                c[i] = temp;
                break;
            }
            else if(c[i] == c.length-1 && c[i] != '\0')
            {
                System.out.println("Error! Stack Overflow!");
                break;
            }
        }
        return c;
    }
    
    
    // Delete a value on the char array.
    public synchronized char pop(char[] c)
    {
        char temp = '\0';
        for(int i = c.length-1; i >= 0; i--)
        {
            if(c[i] == '\0')
            {
            }
            else
            {
                temp = c[i];
                c[i] = '\0';
                break;
            }
        }
        return temp;
    }
    
    
    // Looks at the end of the char array without doing any modifications.
    public synchronized char peek(char[] c)
    {
        char temp = '\0';
        for(int i = c.length-1; i >= 0; i--)
        {
            if(c[i] == '\0');
            
            else
            {
                temp = c[i];
                break;
            }
        }
        return temp;
    }
    
    
    // Tests if the char array is empty.
    public boolean empty(char[] c)
    {
        boolean empty;
        
        if(c[0] == '\0')
        {empty = true;}
        else empty = false;
        
        return empty;
    }
    
    
    // Tests if the char array contains the specific char inserted.
    public boolean contains(char[] c, char ch) 
    {
        boolean search = false;
        char temp = '\0';
        
        
        for(int i = 0; i <= c.length-1; i++)
        {
            if(c[i] == ch)
            {
                search = true;
                break;
            }
            else 
            {
                search = false;
                break;
            }
        }
        return search;
    }

    
    // Searches for the char inserted on the char array.
    public char search(char[] c, char ch)
    {
        char temp = '\0';
        
        
        for(int i = 0; i <= c.length-1; i++)
        {
            if(c[i] == ch)
            {
                temp = c[i];
                break;
            }
            else 
            {
                System.out.println("Error! Search not found!");
                break;
            }
        }
        return temp;
    }
    
    
    // Tests if the selected char is an operator or not.
    boolean isOperator(char c)  // c = 1 
    {                           // isOperator = false
        return (!(c >= 'a' && c <= 'z') &&
                !(c >= '0' && c <= '9') &&
		!(c >= 'A' && c <= 'Z')); // true
    }
    
    
    // Checks the precedence of the hierarchy of operators.
    int getPriority(char C)
    {
        if (C == '-' || C == '+')
        {return 1;}
        else if (C == '*' || C == '/')
        {return 2;}
        else if (C == '^')
        {return 3;}
        else
        {return -1;}
    }
    
    
    // Converts the inserted Infix notation into a Prefix Notation.
    String infixToPrefix(String infix)
    {
        char[] opr = new char[oprInit(infix)];
        
        
        String result = new String("");
	
	         
	for (int i = infix.length()-1; i >= 0; i--)
	{
            char c = infix.charAt(i);
	             
            
            if (Character.isLetterOrDigit(c))
            {
                result = c + result;
            }     
            else if (c == ')')
            {
                push(opr, c);
            }
	    else if (c == '(')
	    {
                if(empty(opr))
                {
                    return "Invalid Expression";
                }   
                else if(!contains(opr, ')'))
                {
                    return "Invalid Expression";
                }    
                else
                {
                    while (!empty(opr) && peek(opr) != ')')
		    {
                        String temp;
		        
                        result = pop(opr) + result;
                        
                         
		    }
                    pop(opr);
                }
            }
            
	    else 
	    {
                while (!empty(opr) && getPriority(infix.charAt(i)) < getPriority(peek(opr)))
		{
                    String temp;
                    /*String opd1 = String.valueOf(peek(opd));
		    pop(opd);
		 
		    String opd2 = String.valueOf(peek(opd)); 
		    pop(opd);*/
		 
                        
                            char op = peek(opr);
                            pop(opr);

                            temp = op + result;
                            result = temp;
                        
                        
		}
		push(opr, c);
	    }
	      
	}
        
        while (!empty(opr))
        {
            String temp;
            /*String opd1 = String.valueOf(peek(opd));
            pop(opd);
		 
            String opd2 = String.valueOf(peek(opd));
            pop(opd);*/
            
            
                char op = peek(opr);
                pop(opr);
		 
                temp = op + result;
                result = temp;
            
           
            
                
        }
        return result;
        }
    
    
    // Converts the inserted Infix notation into a Postfix notation.
    String infixToPostfix(String infix)
    {
	char[] opr = new char[opdInit(infix)];
        
        
        String result = new String("");
	
	         
	for (int i = 0; i < infix.length(); ++i)
	{
            char c = infix.charAt(i);
	             
            if (Character.isLetterOrDigit(c))
            {
                result += c;
            }       
            else if (c == '(')
            {
                push(opr, c);
            }
	    else if (c == ')')
	    {
                if(empty(opr))
                {
                    return "Invalid Expression";
                }   
                else if(!contains(opr, '('))
                {
                    return "Invalid Expression";
                }    
                else
                {
                    while(!empty(opr) && peek(opr) != '(')
                    {
                        result += pop(opr);
                    }
                    pop(opr);	    
                }
            }
            
	    else 
	    {
                while (!empty(opr) && getPriority(c) <= getPriority(peek(opr)))
                {
                    result += pop(opr);
                }
                push(opr, c);  
	    }
	      
	}
        
        while(!empty(opr))
        {
	    result += pop(opr);
	}
            
	
	return result;
    }
	    
    
    // Evaluates the Prefix notation inserted.
    int evaluatePrefix(String prefix)
    {   
        int[] opd = new int[opdInit(prefix)]; // {0,0,0,0,0}
        
        int result = 0;
            
        for(int i = prefix.length()-1; i >= 0; i--)
        {
            char c = prefix.charAt(i);
            
            if (Character.isDigit(c))
            {
                pushInt(opd, Integer.parseInt(String.valueOf(c)));
            }
            else
            {
                char operator = prefix.charAt(i);
                
                int opd1 = peekInt(opd);
                popInt(opd);
                
                
                int opd2 = peekInt(opd);
                popInt(opd);
                    
                result = evaluate(operator, opd1, opd2);
                
                pushInt(opd, result);
            }
        }
            
        System.out.println(result);
        return result;
    }
        
        
    // Evaluates the Postfix notation inserted.
    int evaluatePostfix(String prefix)
    {   
        int[] opd = new int[opdInit(prefix)];
        int result = 0;
            
        for(int i = 0; i <= prefix.length()-1; i++)
        {
            char c = prefix.charAt(i);
            
            if (Character.isDigit(c))
            {
                pushInt(opd, Integer.parseInt(String.valueOf(c)));
            }
            else
            {
                char operator = prefix.charAt(i);
                
                    
                int op2 = peekInt(opd);
                popInt(opd);
                    
                int op1 = peekInt(opd);
                popInt(opd);
                    
                result = evaluate(operator, op1, op2);
                    
                pushInt(opd, result);
            }
        }
            
    System.out.println(peekInt(opd));
    return peekInt(opd);
    }
        
        
    // Checks what type of operator is inserted in order to 
    // execute the evaluation/calculation.
    int evaluate(char operation, int op1, int op2)
	{
            int result = 0;
            
            if (operation == '-')
            {
                result = op1 - op2;
            }
            else if (operation == '+')
            {
                result = op1 + op2;
            }
            else if (operation == '*')
            {
                result = op1 * op2;
            }
            else if (operation == '/')
            {
                result = op1 / op2;
            }
            else
            {
                return -1;
            }
            return result; 
	}        
	
	
    // Insert a value on the int array.
    public synchronized int[] pushInt(int[] c, int ch)
    {
        //char[] tempo = c;
        int temp = ch;
        for(int i = 0; i <= c.length-1; i++)
        {
            if(c[i] != 0)
            {
                
            }
            else
            {
                c[i] = temp;
                break;
            }
        }
        return c;
    }
    
    
    // Delete a value on the int array.
    public synchronized int popInt(int[] c) 
    {
        int temp = 0;
        for(int i = c.length-1; i >= 0; i--)
        {
            if(c[i] == 0)
            {
            }
            else
            {
                temp = c[i];
                c[i] = 0;
                break;
            }
        }
        return temp;
    }
    
    
    // Looks at the end of the int array without doing any modifications.
    public synchronized int peekInt(int[] c)
    {
        int temp = 0;
        for(int i = c.length-1; i >= 0; i--)
        {
            if(c[i] == 0);
            
            else
            {
                temp = c[i];
                break;
            }
        }
        return temp;
    }		
}