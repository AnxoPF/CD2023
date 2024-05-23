package Ej1;

import java.util.Arrays;  
import java.util.Scanner;  
  
class Anagrama {  
  public static void main(String[] args) {  
    Scanner input = new Scanner(System.in);  
    
    System.out.print("Enter first String value: ");  
    String str1 = input.nextLine();  
    System.out.print("Enter second String value: ");  
    String str2 = input.nextLine();  
  
      
        
    boolean result = SonAnagrama(str1, str2);  
    if(result) {  
      System.out.println(str1 + " and " + str2 + " are anagram.");  
    } else {  
      System.out.println(str1 + " and " + str2 + " are not anagram.");  
    }  
  }  
  
  static boolean SonAnagrama(String str1, String str2){
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if(str1.length() == str2.length()) {  
      char[] charArray1 = str1.toCharArray();  
      char[] charArray2 = str2.toCharArray();  

      Arrays.sort(charArray1);  
      Arrays.sort(charArray2);

      return Arrays.equals(charArray1, charArray2);
    }else{
      return false;
    }
  }
  
}  