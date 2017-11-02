/********************************************************************
 * Programmer:      McFadden
 * Class:           CS30S
 *
 * Assignment:      Array Exercise 1 Q6
 * Program Name:    Array Exercise 1 Q6
 *
 * Description:     Compute the 1st 20 numbers of a Fibonacci sequence. Once 
 *                  calculated the 1st 5 and last 5 numbers of the sequence 
 *                  should be printed to the screen 3 numbers to a line.
 *
 * Input:           None
 *
 * Output:          1st 5 and last 5 numbers of the sequence should be printed 
 *                  to the screen 3 numbers to a line.

 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class ArrayExercise1Q6 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
        final int MAX = 20;     //variable for max number of th array
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        int[] fibNum = new int[MAX];        //creates array for Fibonacci sequence
        
        //variable for the first two in the sequence as doesnt work with calculation
        //and there is no calculation required
        fibNum[0] = 0;                
        fibNum[1] = 1;
    	
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		McFadden");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:	Array Exercise 1 Q6");
    	System.out.println("*******************************************");

    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		McFadden\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	Array Exercise 1 Q6\n";
    	bannerOut += "*******************************************\n\n";
    	
    	fout.println("*******************************************");
    	fout.println("Name:		McFadden");
    	fout.println("Class:		CS30S");
    	fout.println("Assignment:	Array Exercise 1 Q6");
    	fout.println("*******************************************");
 	    	
    // ************************ get input **********************
    // ************************ processing ***************************
    
    for (int i = 2; i < MAX; i++){ //for loop for calculation
        
        fibNum[i] = fibNum[i-1] + fibNum[i-2]; //calculates the numbers
        
    }//end of calculation for loop
    
    // ************************ print output ****************************

        System.out.println("\nFirst Five Numbers:"); //output header
        fout.println("\nFirst Five Numbers:"); //output header
        for (int i = 0; i < 5; i++){ //for loop for output
            System.out.print(fibNum[i] + " "); //prints a number and adds space after
            fout.print(fibNum[i] + " "); //prints a number and adds space after
            
            if (i == 2){ //after the third adds a new line
                System.out.println("");
                fout.println("");
            }//end of new line if
        }//end of output for
        
        System.out.println("\n\nLast Five Numbers:"); //output header
        fout.println("\n\nLast Five Numbers:"); //output header
        for (int i = 15; i < 20; i++){ //second for loop for output
            System.out.print(fibNum[i] + " "); //prints a number and adds a space after
            fout.print(fibNum[i] + " "); //prints a number and adds a space after
            
            if (i == 17){ //after the third in this row adds a new line
                System.out.println("");
                fout.println("");
            }//end of new line if
        }//end of second output for loop
        // ******** closing message *********
        
        System.out.println("\n\nend of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
