package FileHandling;
import java.io.*;
 
public class Append {
	
	public static void main(String[] args)  throws FileNotFoundException
	{
			String data2 = "\nThis little light of mine, I’m gonna let it shine";

			try 
{
				FileWriter sampleText2 = new FileWriter("../Java Project/src/FileHandling/aaa.txt");
				sampleText2.write(data2);
				System.out.println("Data appended successfully");
				sampleText2.close();
				
}			catch (FileNotFoundException ex)
{
				System.out.println("Data appended not successful");
				

}
			catch (IOException e) 
			{
				e.printStackTrace();
}
}
}
	


