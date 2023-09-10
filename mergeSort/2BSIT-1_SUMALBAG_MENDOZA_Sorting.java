package mergeSort;

import java.util.Scanner;



public class mergeSort {
    public static void main(String[] args) { 
    boolean loop = true;
    Scanner In = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int q = In.nextInt();
        int MHS []=new int[q];
        System.out.println("Enter "+q+" values: ");
        for (int i = 0; i < q; ++i) {
            MHS[i] = In.nextInt();}
        MergeS MS = new MergeS(MHS);
        do{
        System.out.println("MENU");
        System.out.println("1. Merge Sort\n" +
                "2. Heap\n" +
                "3. Exit");
        System.out.print("Enter Choice [1-6] : ");
        int EC = In.nextInt();
            switch (EC){
                case 1:
                    MS.MergeSort(MHS);
                    break;
                case 2:
                    //HS.SHeap();
                    loop = false;
                    break;
                case 3:
                    System.out.println("<<Program Terminated>>");
                    System.out.println("Sumalbag, Rustie Angelo D.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!\n");
                    loop = false;}}
        while (loop==false);}

    private static class MergeS {
        private MergeS(int[] MHS) {
            
        }
        private void MergeSort(int[] MHS) {
            printArray(MHS);
            MHS = mergeSort(MHS);
            printArray(MHS);
            
        }
        private static void printArray(int[] MHS) {
        for (int i: MHS) {
            System.out.print("\t"+i+ " ");}
            System.out.print("\n\t\t/\t\t\\");
            System.out.print("\n\t/\t\t\t\t\\");}
         
        private void printSecArr(int[] MHS,int[] left, int[] right) {
            int midpoint = MHS.length / 2;
            
            for(int i=0; i < midpoint; i++) {
            System.out.print(""+left[i]+"");}
        for(int j=0; j < right.length; j++) {
            System.out.print(""+right[j]+"");}
        
        
                System.out.println();
            }
        
        

        private int[] mergeSort(int[] MHS) {
           if(MHS.length <= 1) {
            return MHS;
        }
        int midpoint = MHS.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if(MHS.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];}
        for(int i=0; i < midpoint; i++) {
            left[i] = MHS[i];}
        for (int j=0; j < right.length; j++) {
            right[j] = MHS[midpoint+j];} 
        //pano ilabas to tol sa call stack kasi continues siya na kasama parang loop kasi yan
        // run mo to tol
        printSecArr(MHS,left, right);
        
        int[] result = new int[MHS.length];  
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge (left, right);
        return result;}
        
        
    private static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            while(leftPointer < left.length || rightPointer < right.length) {
                if(leftPointer < left.length && rightPointer < right.length) {
                    if(left[leftPointer] < right[rightPointer]) {
                        result[resultPointer++] = left[leftPointer++];
                    } else {
                        result[resultPointer++] = right[rightPointer++]; } }
                else if(leftPointer < left.length) {
                    result[resultPointer++] = left[leftPointer++];}
                else if(rightPointer < right.length) {
                    result[resultPointer++] = right[rightPointer++];}
            }
        }
        return result;
    }

       
    }
    }
        
