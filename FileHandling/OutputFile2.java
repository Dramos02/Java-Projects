package FileHandling;
import java.io.*;
import java.util.Scanner;

public class OutputFile2 {
	static File myFile;
	static FileReader myFileReader;
	static BufferedReader myFileBr;
	static Scanner inputFile;
	static PrintWriter outputFile;
	static FileWriter newData;
	
	//variables for determining the files
	static String line;
	static int wordCount;
	
	public static void main(String[] args) throws FileNotFoundException
	{
		openFile();
		outputFile.println("length: " + myFile.length() + " bytes");
		outputFile.println("path: " + myFile.getAbsolutePath());
		outputFile.println("words: " + numOfWords());
		
		try 
		{
			newData.append("\nThis little light of mine, I’m gonna let it shine");
			newData.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//to recall the reader again so the word counter will not recount the first sentence
		//instead it will recount all of the sentences
		myFileReader = new FileReader(myFile);  
		myFileBr = new BufferedReader(myFileReader); 
		
		//set back to 0 to avoid adding up from the previous word counter
		wordCount = 0;
		
		outputFile.println();
		outputFile.println("length: " + myFile.length() + " bytes");
		outputFile.println("path: " + myFile.getAbsolutePath());
		outputFile.println("words: " + numOfWords());
		closeFile();
	}
	
	//opener of file
	public static void openFile()
	{
		//try catch for IOException 
		try 
		{
			//dapat ilagay ung mismong path ng SampleText.txt mo tas may .. sa una
			myFile = new File("../Java Project/src/FileHandling/SampleText.txt");
			myFileReader = new FileReader(myFile);  
			myFileBr = new BufferedReader(myFileReader);  
			newData = new FileWriter(myFile, true); 
		}
		catch(IOException e) 
		{
			System.out.println("File error.");
		}
		
		//try catch FileNotFoundException 
		try 
		{
			inputFile = new Scanner(new FileReader(myFile));
			//dapat ilagay ung mismong path ng SampleOutputText.txt mo tas may .. sa una (eto kse ung output kung san lalabas ung length, path at ung wordcount ng SampleText.txt)
			outputFile = new PrintWriter("../Java Project/src/FileHandling/SampleOutputText.txt");
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File is not found.");
		}
	}
	
	//closes the file
	public static void closeFile() 
	{
		inputFile.close();
		outputFile.close();
	}
	
	//counts the number of words
	public static int numOfWords() 
	{
		try 
		{
			while((line = myFileBr.readLine()) != null) 
			{
				//splits the words with spaces and counts them
				String [] words = line.split(" ");
				
				//counter
				wordCount = wordCount + words.length;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return wordCount;
	}
	
}


