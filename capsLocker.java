/* Class:	Web Calculator 
 * Name:		Rick Larsen
 * Date:		8/30/2013 
 * Purpose:	Enable users to enter numbers and perform simple calculations. Results are displayed in a textbox.
 */
import java.util.Scanner;
import java.io.*;

public class capsLocker
{
	public static void main(String[] args) throws IOException
	{
		// declare variables
		String fileName,
				 fileNameShort,
				 fileNameUpdated,
				 fileContents = "";		
				 
		// create a scanner object for input
		Scanner keyboard = new Scanner(System.in);

		// ask user for file name
		System.out.println("CAPS LOCKER!");
		System.out.println("\nTurn any .txt file into an online argument!");
		System.out.println("(Sample file: sample.txt)");
		System.out.print("Enter file name: ");
		fileNameShort = (keyboard.nextLine());
		fileName = (fileNameShort) + ".txt";

		// open the input file
		File file = new File(fileName);
		
		// Check that file exists.
		if (!file.exists())
		{
			System.out.println("File ain't found.");
			System.exit(0);
		}
		Scanner inputFile = new Scanner(file);
		
		// read file until end is reached.
		while (inputFile.hasNext())
		{
			fileContents += (inputFile.nextLine()) + "\n";
		}
		
		// close file
		inputFile.close();
		
		// change case.
		fileContents = fileContents.toUpperCase();
				
		// streamwriter writes updated file.
		fileNameUpdated = fileNameShort.toUpperCase() + "1.txt";
		PrintWriter outputFile = new PrintWriter(fileNameUpdated);
		outputFile.println(fileContents);
		outputFile.close();
		
		// confirmation message.	
		System.out.println("File written successfully");
		System.out.println("GO GET 'EM, TIGER!");
	}
}