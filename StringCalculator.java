/*
 * Project: StringCalculator.java
 * Description: Takes in a string with math symbol and calculates.
 * Name: Hanmin Yun
 * Date: Oct 6, 2015
 */

import java.util.Scanner;
import java.util.*;

public class StringCalculator {
  
  public static void main( String [] args ) {
    
    Scanner s = new Scanner( System.in );
    
    System.out.println( "Enter a String sum like 2 + 3: " );
    String str = s.nextLine();
    
    Scanner s2 = new Scanner( str ); // creat NEW Scanner for the string
    
    /*
     * Set delimiters to + sign and any whitespace ... or ... -
     */
    s2.useDelimiter( "\\s*\\+\\s*" );
    
    int total = 0;
    while( s2.hasNextInt() ) {
      total = total + s2.nextInt();
    }
    
    System.out.println( "Sum is: " + total );
    
  } // end main method
  
} // end class