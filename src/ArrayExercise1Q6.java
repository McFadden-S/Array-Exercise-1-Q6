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
    
    // ************************ print output ****************************

    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
