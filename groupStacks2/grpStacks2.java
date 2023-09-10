package groupStacks2;

import java.util.Scanner;
import java.util.Arrays;

public class grpStacks2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*int operandCnt = 0;
        
        
        String initInput = scanner.nextLine();
        
        String infixStr[] = initInput.split("");
        
        for(int i = 0; i >= infixStr.length-1; i++)
        {
            
            //if(Character.isLetter('infixStr[i]'))
            //{
                operandCnt++;
            //}
        }
        
        System.out.println(operandCnt);
        System.out.println(Arrays.toString(infixStr));
        System.out.println(initInput);*/
        
        System.out.print("Infix: ");
        String infInput = scan.nextLine();
        
        String substrings[] = infInput.split("");
        //System.out.println(Arrays.toString(substrings));
        
        for(int i = 0; i >= substrings.length-1; i++)
        {
            if(substrings[i] == "[0-9]")
            {
                System.out.println(substrings[i]);
            }
        }
        
        
        /*
        int number_output = Integer.parseInt(infInput.replaceAll("[^0-9]", ""));
        
        
        /////////////////////////////////////////////////
        
        String boi = infInput.replaceAll("[^0-9]", "");
                
        int[] operand = new int[boi.length()];
        
        for(int i = 0; i < boi.length(); i++)
        {
            if(boi.charAt(i) != '_')
            {
                operand[i] = Integer.parseInt(boi.charAt(i) + "");
            }
        }
        
        System.out.println(Arrays.toString(operand));
        
        /////////////////////////////////////////////////
        
        /////////////////////////////////////////////////
        
        String operator = infInput.replaceAll("[^A-Za-z]", "");
        
        String[] operatorArr = new String[operator.length()];
        
        for(int i = 0; i < operator.length(); i++)
        {
            if(operator.charAt(i) != '_')
            {
                operatorArr[i] = operator.charAt(i) + "";
            }
        }
        
        int bobo = operatorArr.length;
        System.out.println(Arrays.toString(operatorArr));
        
        /////////////////////////////////////////////////
        /*
        
        System.out.println("number_output = " + number_output);
        
        String int_output = input_string.replaceAll("[^0-9]", " ");
        System.out.println("BOBO" + int_output);
        
        input_string = input_string.replaceAll("[^A-Za-z]", "");
        System.out.println(input_string);*/
        
        
    }
    
}
