package FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class OutputFile {
	
	static File file;	
	static FileReader fileReader;
	static PrintWriter outputFile;
	static BufferedReader br;
	static String lineOutput;
	static FileWriter sampleText2;
	static int count;
	
	public static void main(String[] args) throws Exception
{
		
		 file = new File("../Java Project/src/FileHandling/SampleText.txt");
		 fileReader = new FileReader("../Java Project/src/FileHandling/SampleText.txt");  
		 outputFile = new PrintWriter("../Java Project/src/FileHandling/SampleOutputText.txt"); 
		 br = new BufferedReader(fileReader); 
     
        openFile();
        outputFile.println("Absolute path: " + file.getAbsolutePath());   
 
        outputFile.println("File size in bytes " + file.length());  
	
        outputFile.println("Number of words present in given file: " + numOfWords());  		

		  String data2 = "\nThis little light of mine, I’m gonna let it shine";

			try 
{
				FileWriter sampleText2 = new FileWriter("../Java Project/src/FileHandling/SampleText.txt", true);
				fileReader = new FileReader("../Java Project/src/FileHandling/SampleText.txt");  
				br = new BufferedReader(fileReader); 
				sampleText2.write(data2);
				sampleText2.close();
			count = 0;	
			
			outputFile.println("Absolute path: " + file.getAbsolutePath());   
				 
			
			outputFile.println("File size in bytes " + file.length());  
			
			outputFile.println("Number of words present in given file: " + numOfWords());  
			 
			br.close();  
			
			outputFile.close();
				
}			catch (IOException ex)
			
{
				System.out.println("Data appended not successful");
				
}
			
}
		
		public static void openFile() 
{
	
		
			try 
{
			  	      File sampleText1 = new File("../Java Project/src/FileHandling/SampleText.txt");
			  	      Scanner myReader = new Scanner(sampleText1);
			  	      while (myReader.hasNextLine())
{
			  	        String data1 = myReader.nextLine();
		
}
			  	      myReader.close();
} 			catch (FileNotFoundException e) 
			  	    
{
			  	      System.out.println("An error occurred.");
		  	      e.printStackTrace();
}
			  }
		
public static int numOfWords() 
{
			try 
{
				while((lineOutput = br.readLine()) != null) 
{
		
					String [] words = lineOutput.split(" ");
	
				count = count + words.length;
}
} 
				catch (IOException e) 
{
					e.printStackTrace();
}
	
			return count;
}
}
		


	
