import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ComplexMultiplication
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		File inFile = new File("input.txt");
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		
		try
		{
			Scanner read = new Scanner (inFile);
			
			while (read.hasNext())
			{
				myNums.add(read.nextInt());
			}
			
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
