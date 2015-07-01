//import AutoInventory;
//import AutoInventoryCmdLineInterface;


public class ProcessAutoInventory {
	
	
	public static void main(String[] args){
		//init
		String path = args[0];
		AutoInventory autoInventory = new AutoInventory(path);
		AutoInventoryCmdLineInterface cli = new AutoInventoryCmdLineInterface(autoInventory);
		//start
		cli.mainMenu();
		//quit
		//do some other stuff
		String[][] inventoryArray = autoInventory.getInventory();
		autoInventory.getInventory();
		//autoInventory.searchTextField(AutoInventory.makeIndex, "Honda");
		
	}

	
	
}
