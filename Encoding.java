/*Program to accept a string entered by user and display the new string after encoding by a number entered by the user
  Eg. Encoding by 2 means each character moves two characters ahead  */
import java.io.*; //importing io package
class Encoding //start of class
{
   public static void main(String args[])throws IOException //start of main method
   {
      int num = 0, pos = 0;
      String na = " ";
      String s = " ";
      //initalizing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a string");
      na = br.readLine(); //to take input from user
      int l = na.length(); //to find length of String
      System.out.println("Enter a number between 0 to 26 for required encoding");
      num = Integer.parseInt(br.readLine());
      //taking input from user
      for(int i = 0; i < l; i++)//encoding by 2
      {
         pos = (int)(na.charAt(i));
         //finding ASCII value of each character
         if((pos >= 97 && pos <= (122 - num)) || (pos >= 65 && pos <= (90 - num)))  
         {
            s = s + (char)(pos + num);  
          }//end of if statement
         if((pos >= (122 - num + 1) && pos <= 122) || (pos >= (90 - num) && pos <= 90))  
         {
            s = s + (char)(pos - (26 - num));
          }
          //storing new string in 's'
       }//end of for loop
      //displaying the original and the new string
      System.out.println("");
      System.out.println("ORIGINAL STRING: " +  na);
      System.out.println("NEW STRING: " + s);
      System.out.println("");
    }//end of main
}//end of class
/**VDT
 Variable   Datatype        Description
    num       int     to take input from user
    pos       int     to store ASCII value of 
                          each character 
    na      String    to take input from user
    s       String      to store new srting
    l         int    to find the length of String
    i         int    control variable to run loop   */
        
          

       
       
