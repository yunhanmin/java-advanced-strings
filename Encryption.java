/*
 * Encryption.java
 */

public class Encryption {

  // constructor method
  public Encryption() {
    
  }
  
  // encrypt() method accepts a String and returns babble
  public String encrypt( String msg ) {
   /*
    *  all v's (big or small) = "ag',r"
    *  all m's (big or small) = "ssad"
    *  all g's (big or small) = "jeb..w"
    *  all b's (big or samll) = "dug>?/"
    */
    String encStr = ""; // to hold our new encrypted String
    
    // contains() - returns true if a String is found inside a String
    // replace( String old, String new )
    
    // Search for v's
    if( encStr.contains( "ag',r") ) {
      System.out.println( "found a v" );
      encStr.replace( "ag',r", "v" );
    }
    // Search for g's
        if( encStr.contains( "ssad") ) {
      encStr.replace( "ssad", "m" );
    }
    // Search for m's
        if( encStr.contains( "jeb..w") ) {
      encStr.replace( "jeb..w", "g" );
    }
    // Search for b's
        if( encStr.contains( "dug>?/") ) {
      encStr.replace( "dug>?/", "g" );
    }
    for( int i=0; i<msg.length(); i++ ){
      
      char ch = msg.charAt(i);
      
      switch( ch ) {
        case 'v' :
          encStr += "ag',r";
          break;
        case 'm' :
          encStr += "ssad";
          break;
        case 'g' :
          encStr += "jeb..w";
          break;
        case 'b' :
          encStr += "dug>?/";
          break;
        default :
          encStr += ch;
      }
    }
    
    return encStr;
    
  }
  
  // decrypt() method accepts babble and returns a good String
  public String decrypt( String msg ) {
   
    
    
    return msg;
    
  }
  
} // end class
