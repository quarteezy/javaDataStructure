package lab2arr3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class gradeBookArray {
    public static void main(String[] args) {
        Scanner dm = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("##.00");
        
        
        System.out.print("Number of students: ");
        int studNo = dm.nextInt();
        
        
        System.out.print("Number of quizzes: ");
        int quizNo = dm.nextInt();
        double[] quizVal = new double[quizNo];
        double quizTotal = 0;
        System.out.println();
        
        
        int studPass = 0;
        int studFail = 0;
        
        
        for(int i = 0; i < studNo; i++)
            {
                System.out.println("Student #" + (i + 1));
                for(int x = 0; x < quizNo; x++)
                {
                    System.out.print("Quiz #" + (x + 1) + ": ");
                    double quizInp = dm.nextDouble();
                    quizVal[x] = quizInp;
                    quizTotal += quizInp;
                }
            
                double quizAve = quizTotal / quizNo;

                if (quizAve >= 75)
                    {System.out.println("\nStudent #" + (i + 1) + " Average: " + df.format(quizAve) + "\t \nRemarks: PASSED\n\n"); studPass++;}
                else
                    {System.out.println("\nStudent #" + (i + 1) + " Average: " + df.format(quizAve) + "\t \nRemarks: FAILED\n\n"); studFail++;}
        
                quizTotal = 0;
            }
        
        
        System.out.println("Number of student(s) passed: " + studPass);
        System.out.println("Number of student(s) failed: " + studFail);
    }
    
}