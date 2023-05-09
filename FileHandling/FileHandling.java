package FileHandling;

import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner;


public class FileHandling {

	  public static void main(String[] args) throws FileNotFoundException
{
	    try 
{
	      File myfile = new File("../Java Project/src/FileHandling/SampleText.txt" );
	      Scanner output = new Scanner(myfile);
	      while (output.hasNextLine())
{
	        String data1 = output.nextLine();
	        System.out.println(data1);
}
	      output.close();
} catch (FileNotFoundException e) 
	    
{
	      System.out.println("An error occurred.");
	      e.printStackTrace();
}
}
}
	