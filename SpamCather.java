/* 
 * Project: SpamCatcher.java
 * Description: A program to catch spammy email.
 * Name: Hanmin Yun
 * Date: Oct 6, 2015
 */

import java.util.Scanner;

public class SpamCather {

  public static void main( String[] args ) {
    
    String spamTitle = "Low cost loans";
    String spamFilteredTitle = "L*o*w *c*o*s*t* *l*o*a*n*s*";
    
    // This is the title we received
    String sentTitle = "d^^*_^^ir....-t***y"; // dirty
    
    Scanner s = new Scanner( sentTitle );
    s.useDelimiter( "" ); // now EVERYTHING is a token
    
    // This is the actual title
    String trueTitle = "";
    
    while( s.hasNext() ) {
     
      // skip the stuff we want to get rid of
      while( s.hasNext( "\\W|_" ) ) {
        
        s.skip( "_*" ); // Step 1: skip underscores
        if ( s.hasNext() ) {
          s.skip( "\\W*" ); // Step 2: skip non-word characters. [a-zA-Z_0-9]
        }
        
      }
      
      if( s.hasNext() ) {
        trueTitle = trueTitle + s.next(); // Step 3: keep everything else 
      }
      
    }
    System.out.println( trueTitle);
    
  } // end main method
  
} // end class
