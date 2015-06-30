import java.util.Scanner;

public class AutoInventoryCmdLineInterface
{
	private String filename;
	
	AutoInventoryCmdLineInterface()
	{
		filename = "invalid";
	}
	
	private void promptUser( String[] args)
	{
		int command = 0 ;
		do{// Initial prompt and repeats until "-1" is input
			System.out.println("-----------------------------------------------------------");
			System.out.println("Available commands, please type the coressponding number");
			System.out.println("Display Inventory[0]\nSearch[1]\nExit System[-1]\n");
			System.out.print("Command:");
			Scanner input = new Scanner ( System.in );
			command = input.nextInt();
			
			if (command==0)
			{//display inventory
				Autoinventoru.makeArray( command, args);
			}
			if (command==1)
			{//search based on user
				System.out.println("-----------------------------------------------------------");
				System.out.println("Searchable fields");
				System.out.println("Make[0]\nModel[1]\nYear[2]\nCondition[3]\nMileage[4]\nPrice[5]\nVin[6]");
				System.out.print("Command or type -1 to exit:");
				command = input.nextInt();
				if (command == -1)
				{
					break;
				}
				if (command >=7)
				{//error if wrong value
					System.out.println("Invalid choice!");
				}
				Autoinventoru.makeArray( (command +1 ) , args);//command adds 1 so that full inventory is not displayed
				System.out.println("-----------------------------------------------------------");
			}
			}while( command!=-1);
		
		
	}
}
