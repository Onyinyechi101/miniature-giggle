
package Array;

import java.util.*;
public class ArraylistSizeIterate {
    // variable declaration
  static int i; 
  //main method
  public static void main(String[] args){
     // declaring the arraylist
    List <String> FiveProgrammingLangs =new ArrayList<>();
   //Adding the objects to the array 
    FiveProgrammingLangs.add("Java");
    FiveProgrammingLangs.add("C#");
    FiveProgrammingLangs.add("Python");
    FiveProgrammingLangs.add("Laravel");
    FiveProgrammingLangs.add("PHP");
    
   // To find the size of the arraylist
   
   System.out.println("Here are the top "  +  FiveProgrammingLangs.size() + " programming languages in the world");
  
   //iterating using for loop with index
   for(int i=0;i<FiveProgrammingLangs.size();i++){
   System.out.println(FiveProgrammingLangs.get(i));

   
   }
  }
}