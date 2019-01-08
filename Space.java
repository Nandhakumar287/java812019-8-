import java.io.*;
import java.util.*;
  public class Space{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The String");
      String str=sc.nextLine();
      String str1="";
	 
      for(int i=0;i<str.length();i++)
        {
			
			if(str.charAt(i)!=' ')
			{
			str1=str1+str.charAt(i);	
			}
       System.out.println("Answer:"+str1);
     }
   }
   
   
   /*
   str="Hello World"
   str1=str.replace(" ","");
   Output:HelloWorld.*/  
