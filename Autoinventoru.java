import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Autoinventoru 
{
	private String location;
	
	Autoinventoru()
	{
		location = "none" ;
	}
	
	public String makeArray(String []args, int srRow, int srColumn)
	{
		try
		{//makes a 2d array and fills in data from file in args
			Scanner inventoryFile = new Scanner(new File(args[0]));
			String fline=inventoryFile.nextLine();//reads the first line
			String fray[]=fline.split(" ");//splits the string based on space
			int row=Integer.parseInt(fray[0]);//converts the string to an integer
			int col=Integer.parseInt(fray[1]);
			String master[][]=new String[row][col];//creates a 2d array based on values from the first line
			
			for (int n = 0 ; n < master.length; n++ )
				{//outer loop that controls location of the row in the 2d array
				
					String inline=inventoryFile.nextLine();//reads in the next line from file
					// splits the string based on the delimiter ";" and assigns it to array sub_master
					String sub_master[]=inline.split(";");
					for (int m = 0; m < col; m++ )
						{//inner loop that controls location of column in the 2d array
						//assigns an element of sub_master to an element in the 2d array  
						master[n][m]= sub_master[m]; 
						//repeats until row is full
						}
				}
			location = master[srRow][srColumn];
		}
		
				
		catch(FileNotFoundException except)
		{
		 System.out.println("Error: Inventory read failure. Error: " + except.getMessage());
		 System.exit(-1);
		}
		
		return location;
	}
}
