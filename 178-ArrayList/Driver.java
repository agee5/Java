package edu.ilstu;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	//Create each array list that will be used for the 3 classes
	static ArrayList<Ship> ships = new ArrayList<Ship>();
	static ArrayList<Cruise> cruise = new ArrayList<Cruise>();
	static ArrayList<Passenger> passenger = new ArrayList<Passenger>();
	
	public static void initializeShipList ()
	{
		//Initialize 4 ship objects, to start with
		Ship ship1 = new Ship("Candy Cane", 20, 40, 10, 60, true);
		Ship ship2 = new Ship("Peppermint", 10, 20, 5, 50, true);
		Ship ship3 = new Ship("Bon Bon", 12, 18, 2, 26, true);
		Ship ship4 = new Ship("Candy Corn", 12, 18, 2, 24, false);
		
		//Add each object to ship arraylist
		ships.add(ship1);
		ships.add(ship2);
		ships.add(ship3);
		ships.add(ship4);
	}
	
	public static void initializeCruiseList ()
	{
		//Initialize 3 cruise object
		Cruise cruise1 = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
		Cruise cruise2 = new Cruise("Jolly Fun", "Peppermint", "New Orleans", "Cozumel", "New Orleans");
		Cruise cruise3 = new Cruise("Lollipop", "CandyCorn", "Ft Lauderdale", "Bahamas", "Ft Lauderdale");
		
		//Add each cruise into the arraylist
		cruise.add(cruise1);
		cruise.add(cruise2);
		cruise.add(cruise3);
	}
	
	public static void initializePassengerList ()
	{
		//Initialize 6 passenger objects
		Passenger pass1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
		Passenger pass2 = new Passenger("Trinity", "Southern Swirl", "BAL");
		Passenger pass3 = new Passenger("Morpheus", "Jolly Fun", "INT");
		Passenger pass4 = new Passenger("Aaron Gee", "Lollipop", "BAL");
		Passenger pass5 = new Passenger("Niobi", "Jolly Fun", "BAL");
		Passenger pass6 = new Passenger("Agent Smith", "Lollipop", "INT");
		
		//Add each passenger object into arraylist
		passenger.add(pass1);
		passenger.add(pass2);
		passenger.add(pass3);
		passenger.add(pass4);
		passenger.add(pass5);
		passenger.add(pass6);
	}
	
	public static void printShipList (String typeOfList)
	{
		//Print entire list of only the ship names
		if (typeOfList.contentEquals("name"))
		{
			for(Ship ships : ships) 
			{
	            System.out.println(ships.toString());
	        }
		}
		
		//Print full details of all active ships
		else if (typeOfList.contentEquals("active"))
		{
			for(Ship ships : ships) 
			{
				if (ships.inService == true)
	            System.out.println(ships.printShipData());
	        }
		}
		
		//Print full details of all inactive ships
		else if (typeOfList.contentEquals("inactive"))
		{
			for(Ship ships : ships) 
			{
				if (ships.inService == false)
	            System.out.println(ships.printShipData());
	        }
		}
		
		//Print full details of all ships in the arraylist
		else if (typeOfList.contentEquals("full"))
		{
			for(Ship ships : ships) 
			{
	            System.out.println(ships.printShipData());
	        }
		}
		
		//Error for no matching ships
		else
		{
			System.out.println("There are no ships to print");
		}
	}
	
	public static void printCruiseList (String typeOfList)
	{
		//Print all names of cruises in cruise arraylist
		if (typeOfList.contentEquals("list"))
		{
			for(Cruise cruise : cruise) 
			{
	            System.out.println(cruise.toString());
	        }
		}
		
		//Print full details of all cruises
		else if (typeOfList.contentEquals("details"))
		{
			for(Cruise cruise : cruise) 
			{
	            System.out.println(cruise.printCruiseDetails());
	        }
		}
		
		//Error for no matching cruises
		else
		{
			System.out.println("There are no cruises to print");
		}
	}
	
	public static void printPassengerList ()
	{
		//Print full details of all passengers
		for(Passenger passenger : passenger) 
		{
            System.out.println(passenger.printPassenger());
        }
	}
	
	public static void displayMenu ()
	{
		//Display menu for navigation
		System.out.println("\n\tLuxury Ocean Cruise Outings");
		System.out.println("\t\tSystem Menu");
		System.out.println("\n[1] Add Ship\t\t[A] Print Ship Names");
		System.out.println("[2] Edit Ship\t\t[B] Print Ship In Service");
		System.out.println("[3] Add Cruise\t\t[C] Print Ship Full List");
		System.out.println("[4] Edit Cruise\t\t[D] Print Cruise List");
		System.out.println("[5] Add Passenger\t[E] Print Cruise Details");
		System.out.println("[6] Edit Passenger\t[F] Print Passenger List");
		System.out.println("[x] Exit System");
	}
	
	public static void addShip ()
	{
		Scanner keyboard = new Scanner(System. in);
		
		//Variables for creating new ship object
		String shipName;
		int noOfBalcRooms = 0;
		int noOfOVRooms = 0;
		int noOfSuites = 0;
		int noOfIntRooms = 0;
		String choice;
		boolean inService;
		
		//Ask user for ship details
		System.out.print("Enter the new ship name: ");
		shipName = keyboard.nextLine();
		System.out.print("How many balcony rooms? ");
		noOfBalcRooms = keyboard.nextInt();
		System.out.print("How many OceanView rooms? ");
		noOfOVRooms = keyboard.nextInt();
		System.out.print("How many rooms are suites? ");
		noOfSuites = keyboard.nextInt();
		System.out.print("How many interior rooms? ");
		noOfIntRooms = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Has this ship been assigned a service? [Y][N] ");
		choice = keyboard.nextLine();
		
		//Checks if user wants ship to be active or inactive
		if (choice.equalsIgnoreCase("Y"))
		{
			inService = true;
		}
		else
		{
			inService = false;
		}
		
		//Create new ship object with details user input
		Ship ship5 = new Ship(shipName, noOfBalcRooms, noOfOVRooms, noOfSuites, noOfIntRooms, inService);
		
		//Add new ship object to arraylist
		ships.add(ship5);
		
		System.out.println("\nNew Ship Has Been Added!");
	}
	
	public static void editShipMenu(int shipIndex) 
	{
        System.out.printf("Ship Edit Menu for: %s", ships.get(shipIndex).getShipName());
        System.out.println("[1]\tEdit ship name.");
        System.out.println("[2]\tEdit number of balcony rooms.");
        System.out.println("[3]\tEdit number of ocean view rooms.");
        System.out.println("[4]\tEdit number of suite rooms.");
        System.out.println("[5]\tEdit number of interior rooms.");
        System.out.println("[6]\tEdit in service status.");
        System.out.println("[7]\tEdit all options.");
        System.out.println("[8]\tDelete this ship.");
        System.out.println("[9]\tCancel Edit.");
        System.out.print("\nPlease enter a selection: ");
    }

    public static void performShipEdit(int menuSelection, int shipIndex) 
    {
    	Scanner keyboard = new Scanner(System. in);
    	
        //switch on menuSelection
        switch (menuSelection) {
            case 1 : {   //option 1: rename the ship
                String name;
                System.out.print("What is the new name of the ship? ");
                name = keyboard.nextLine();
                ships.get(shipIndex).setShipName(name); //save edit
                System.out.println("Ship name changed!");
                break;
            }
            case 2 : {   //option 2: change the number of balcony rooms.
                int bal;
                System.out.printf("\nHow many balcony rooms are on %s? ", ships.get(shipIndex).getShipName());
                bal = getNumber();  //get the number from the user
                ships.get(shipIndex).setNoOfBalcRooms(bal);   //save edit
                System.out.printf("Room count updated for %s. \n", ships.get(shipIndex).getShipName());
                break;
            }
            case 3 : {   //option 3: change the number of ocean view rooms
                int ov;
                System.out.printf("\nHow many ocean view rooms are on %s? ", ships.get(shipIndex).getShipName());
                ov = getNumber(); //get the number from user
                ships.get(shipIndex).setNoOfOVRooms(ov); //save the edit
                System.out.printf("Room count updated for %s. \n", ships.get(shipIndex).getShipName());
                break;
            }
            case 4 : {   //option 4: change the number of suites
                int suite;
                System.out.printf("\nHow many suite rooms are on %s? ", ships.get(shipIndex).getShipName());
                suite = getNumber(); //get a number
                ships.get(shipIndex).setNoOfSuites(suite); //save edit
                System.out.printf("Room count updated for %s. \n", ships.get(shipIndex).getShipName());
                break;
            }
            case 5 : {   //option 5: change the number of interior rooms
                int inter;
                System.out.printf("\nHow many interior rooms are on %s? ", ships.get(shipIndex).getShipName());
                inter = getNumber(); //get a number
                ships.get(shipIndex).setNoOfIntRooms(inter); //save the edit
                System.out.printf("Room count updated for %s. \n", ships.get(shipIndex).getShipName());
                break;
            }
            case 6 : { //option 6: change the status of the ship
                boolean inServ;
                System.out.printf("\nIs %s in service? (Does it have an assigned cruise?)\n(Y for yes, N for no)", ships.get(shipIndex).getShipName());
                inServ = getYesNo(); //Get the yes no answer.
                ships.get(shipIndex).setInService(inServ); //update in service status
                System.out.println("Ship service status updated.");
                break;
            }
            case 7 : { //perform all options 1-6 on the same ship.
                performShipEdit(1, shipIndex);
                performShipEdit(2, shipIndex);
                performShipEdit(3, shipIndex);
                performShipEdit(4, shipIndex);
                performShipEdit(5, shipIndex);
                performShipEdit(6, shipIndex);
                break;
            }
            case 8 : { //option 8: delete this ship
                System.out.printf("\nDO YOU WANT TO DELETE '%s'? (Y or N)", ships.get(shipIndex).getShipName());
                if (getYesNo()) {
                    ships.remove(shipIndex);
                    System.out.println("Ship Deleted.");
                } else System.out.println("Ship delete cancelled.");
                break;
            }
            case 9 : //option 9: cancel edit
                    System.out.println("Returning to main menu.");
                break;
        }
    }

    public static void editShip() 
    {
    	 //Check there are ships to edit
        if (ships.size() == 0) 
        {
            System.out.println("There are no ships to edit. Please add a ship first.");
        }
      //There are ships, so offer options to user
        else 
        {
            int selection;
            System.out.println("Please select the number of the ship you wish to edit from the following list");
            
            //loop to print all ship names to console with a number for picking one.
            for (int i = 0; i < ships.size(); i++) 
            {
                System.out.printf("[%d]\t%s\n", i + 1, ships.get(i));
            }
            selection = getNumber();

          //Check the number was a valid choice.
            if (selection > ships.size()) 
            {
                System.out.println("That was not a listed option, sorry. Returning to main menu.");
            }
          //The user picked a ship. Print the edit menu, and get a selection from that menu
            else 
            {
                int secondSelection;
                boolean accepted = false;
                editShipMenu(selection - 1);
                do 
                {
                    secondSelection = getNumber();
                    if (secondSelection > 9 || secondSelection == 0) 
                    {
                    	//ask the user to make a selection until they have picked a valid choice.
                        System.out.println("That was not a menu option. Try again.");
                    } 
                    else accepted = true;
                } 
                while (!accepted);
                //perform the edit selected.
                performShipEdit(secondSelection, selection - 1);
            }
        }
    }
    
    public static int getNumber() 
    {
    	Scanner keyboard = new Scanner(System. in);
    	
        boolean accepted = false;
        int val = -1;
        do {
            try {
                val = Integer.parseInt(keyboard.nextLine());
                if (val >= 0) {
                    accepted = true;
                } else System.out.println("Please enter 0 or greater.");
            } catch (NumberFormatException e) {
                System.out.println("That number is not formatted correctly. Try again.");
            }
        } while (!accepted);
        return val;
    }
    
    public static boolean getYesNo() 
    {
    	Scanner keyboard = new Scanner(System. in);
    	
        boolean accepted = false;
        char answer;
        boolean userInput = false;
        do {
                answer = keyboard.nextLine().charAt(0);
                if (answer == 'y' || answer == 'Y') {
                    userInput = true;
                    accepted = true;
                } else if (answer == 'n' || answer == 'N') {
                    accepted = true;
                }
                else{
                    System.out.println("We couldn't accept that input. Please answer 'y','Y','n', or 'N'.");
                }
        } while (!accepted);
        return userInput;
    }
	
    public static void addCruise() 
    {
    	Scanner keyboard = new Scanner(System. in);
    	
        String name, ship = "", depPort, dest, retPort;
        int selection, shipCounter = 1;
        boolean accepted = false;

        //Ask user for cruise name
        System.out.println("Add a Cruise:");
        System.out.print("Enter Cruise name: ");
        name = keyboard.nextLine();

        //Show options for in service ships
        System.out.println("Select the ship from the list that should be used for this cruise.");
        System.out.println("This will also put the ship into service.");
        for (Ship value : ships) {
            if (!value.getInService()) {
                System.out.printf("[%d] - %s", shipCounter, value.getShipName());
                shipCounter++;
            }
        }
        
        //if the counter is the same, all ships are in service. Error message, and quit adding.
        if (shipCounter == 1) 
        {
            System.out.println("Sorry, there are no ships that can be added to this cruise. Mark a ship as out of service to add it.");
            System.out.println("Adding cruise cancelled.");
        }
        //the user picked a ship, but we dont really know which one. Loop again to find out, and report if it was valid or not
        else 
        {
            do 
            {
                selection = getNumber();
                if (selection == 0 || selection > shipCounter - 1) 
                {        //check if it was invalid.
                    System.out.println("That was not a valid option. Please try again.");
                }
                else 
                {      //its valid, so loop to find it
                    shipCounter = 0;
                    for (Ship s : ships) {
                        if (!s.getInService()) {
                            shipCounter++;
                        }
                        if (shipCounter == selection) {
                            ship = s.getShipName();
                            s.setInService(true);
                        }
                    }
                    accepted = true;
                }
            } while (!accepted);

          //ask for departure port
            System.out.println("What is the departure port?");
            depPort = keyboard.nextLine();

            //ask for destination
            System.out.println("What is the destination?");
            dest = keyboard.nextLine();

            //ask for return port
            System.out.println("What is the return port?");
            retPort = keyboard.nextLine();

            //save the new cruise.
            cruise.add(new Cruise(name, ship, depPort, dest, retPort)); //save the new cruise.
            System.out.println("Cruise added successfully.");
        }
    }

    public static void editCruiseMenu(int cruiseIndex) 
    {
        System.out.printf("\nEdit Cruise %s:\n", cruise.get(cruiseIndex));
        System.out.println("[1]\tEdit cruise name.");
        System.out.println("[2]\tEdit ship for cruise.");
        System.out.println("[3]\tEdit cruise departure port.");
        System.out.println("[4]\tEdit cruise destination.");
        System.out.println("[5]\tEdit cruise return port.");
        System.out.println("[6]\tEdit all options for cruise.");
        System.out.println("[7]\tDelete this cruise.");
        System.out.println("[8]\tCancel editing.");
    }

    public static void performCruiseEdit(int menuSelection, int cruiseIndex) 
    {
    	Scanner keyboard = new Scanner(System. in);
    	
        //switch block
        switch (menuSelection) {
            
            //option 1: rename cruise
        	case 1 : 
            {
                String name;
                System.out.println("Enter new name for cruise:");
                name = keyboard.nextLine();
                cruise.get(cruiseIndex).setCruiseName(name);
                System.out.println("Edit saved!");
                break;
            }
            //option 2: re-select ship
        	case 2 : 
            {
                if (setShipNameForCruise(cruiseIndex)) break; //check for ships to be put into service
                System.out.println("Edit completed");
                break;
            }
            //option 3: re-enter departure port
        	case 3 : 
            {
                String depPort;
                System.out.println("Enter new departure port for cruise:");
                depPort = keyboard.nextLine();
                cruise.get(cruiseIndex).setDepartPort(depPort);
                System.out.println("Edit completed");
                break;
            }
            //option 4: re-enter destination
        	case 4 : 
            {
                String dest;
                System.out.println("Enter new destination for cruise:");
                dest = keyboard.nextLine();
                cruise.get(cruiseIndex).setDestination(dest);
                System.out.println("Edit completed");
                break;
            }
            //option 5: re-enter return port
        	case 5 : 
            {
                String retPort;
                System.out.println("Enter new return port for cruise:");
                retPort = keyboard.nextLine();
                cruise.get(cruiseIndex).setReturnPort(retPort);
                System.out.println("Edit completed");
                break;
            }
            //option 6: re-enter all cruise info.
        	case 6 : 
            {
                String name, depPort, dest, retPort;

                System.out.println("Enter new name for cruise:");
                name = keyboard.nextLine();
                cruise.get(cruiseIndex).setCruiseName(name);

                setShipNameForCruise(cruiseIndex);

                System.out.println("Enter new departure port:");
                depPort = keyboard.nextLine();
                cruise.get(cruiseIndex).setDepartPort(depPort);

                System.out.println("Enter new destination:");
                dest = keyboard.nextLine();
                cruise.get(cruiseIndex).setDestination(dest);

                System.out.println("Enter new return port:");
                retPort = keyboard.nextLine();
                cruise.get(cruiseIndex).setReturnPort(retPort);

                System.out.println("Edits saved!");
                break;
            }
            //option 7: delete the cruise
        	case 7 : 
            {
                System.out.println("DO YOU WANT TO DELETE? (Y or N)");
                if (getYesNo()) {
                    for (Ship s : ships) {
                        if (s.getShipName().contains(cruise.get(cruiseIndex).getShipName())) {
                            s.setInService(false);
                        }
                    }
                    cruise.remove(cruiseIndex);
                    System.out.println("Cruise Deleted.");
                } else System.out.println("Cruise was NOT deleted.");
                break;
            }
            //option 8: cancel the edit.
            case 8 : System.out.println("Returning to main menu.");
                break;
        }
    }

    public static boolean setShipNameForCruise(int cruiseIndex) 
    {
        String ship = "";
        int shipIndex = 1, selection;

        //Ask user which ship
        System.out.println("Select ship from list below:");
        for (Ship value : ships) 
        {
            if (!value.getInService()) {
                System.out.printf("[%d] - %s\n", shipIndex, value.getShipName());
                shipIndex++;
            }
        }

        if (shipIndex == 1) 
        {
            System.out.println("Sorry, all ships are in service. Add a ship, or remove one from service.");
            return true;
        }
        else 
        {
            boolean accepted = false;
            do {
                selection = getNumber();
                if (selection == 0 || selection > shipIndex - 1) {
                    System.out.println("That was not a valid option. Try again.");
                } else accepted = true;
            } while (!accepted);

            shipIndex = 0;
            for (Ship s : ships) 
            {
                if (!s.getInService()) {
                    shipIndex++;
                }
                if (shipIndex == selection) 
                {
                    s.setInService(true);
                    ship = s.getShipName();
                }
            }
        }
        cruise.get(cruiseIndex).setShipName(ship);
        return false;
    }

    public static void editCruise() 
    {
        int selection, secondSelection, i;
        boolean accepted = false;

        System.out.println("Edit a Cruise:");
        if (cruise.size() == 0) 
        {
            System.out.println("There are no cruises to edit. Please add one first.");
        }
        else 
        {
            System.out.println("Select the number of the cruise to edit from below:");
            
            for (i = 0; i < cruise.size(); i++) 
            {
                System.out.printf("\n[%d] - %s", i + 1, cruise.get(i).getCruiseName());
            }

            selection = getNumber();
            if (selection == 0 || selection > i + 1) 
            {
                System.out.println("That was not an option, sorry. Returning to main menu.");
            }
            else 
            {
                editCruiseMenu(selection - 1);
                do {
                    secondSelection = getNumber();
                    if (secondSelection != 0 && secondSelection <= 8) {
                        accepted = true;
                    } else System.out.println("That was not a valid option, please try again.");
                } while (!accepted);

                performCruiseEdit(secondSelection, selection - 1);
                System.out.println("Editing closed.");
            }
        }
    }
	
    public static void addPassenger() 
    {
    	Scanner keyboard = new Scanner(System. in);
    	
        if (cruise.size() == 0) 
        {
            System.out.println("A passenger cannot be added while there are no scheduled cruises. Sorry.");
        }
        else 
        {
            String name, cruise;
            int selection;

            //Ask user for name
            System.out.println("Add Passenger:");
            System.out.println("Enter passenger name:");
            name = keyboard.nextLine();

            //Get possible cruise options
            cruise = getCruiseName();

            selection = getRoomSelection();

            //add the passenger
            switch (selection) 
            {
                case 1 : passenger.add(new Passenger(name, cruise, "balcony"));
                    break;
                case 2 : passenger.add(new Passenger(name, cruise, "ocean view"));
                    break;
                case 3 : passenger.add(new Passenger(name, cruise, "suite"));
                    break;
                case 4 : passenger.add(new Passenger(name, cruise, "interior"));
                    break;
            }
            System.out.println("Passenger Added!");
        }
    }
    
    public static int getRoomSelection() 
    {
        boolean accepted = false;
        int selection;
        System.out.println("Select a preferred room type from list below:");
        System.out.println("[1] - Balcony");
        System.out.println("[2] - Ocean View");
        System.out.println("[3] - Suite");
        System.out.println("[4] - Interior");
        do 
        {
            selection = getNumber();
            if (selection != 0 && selection <= 4) 
            {
                accepted = true;
            } 
            else System.out.println("That was not a valid option. Please try again.");
        }
        while (!accepted);
        return selection;
    }
    
    public static String getCruiseName() 
    {
        boolean accepted = false;
        int i;
        int selection;

        System.out.println("Select cruise number from list below:");
        for (i = 0; i < cruise.size(); i++) {
            System.out.printf("[%d] - %s\n", i + 1, cruise.get(i).getCruiseName());
        }

        do {
            selection = getNumber();
            if (selection != 0 && selection <= i + 1) {
                accepted = true;
            } else System.out.println("That was not a valid option. Please try again.");
        }
        while (!accepted);

        return cruise.get(selection - 1).getCruiseName();
    }

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System. in);
		
		String typeOfList;
		
		//Run methods to initialze ship, cruise, and passenger object and input into arraylists
		initializeShipList();
		initializeCruiseList();
		initializePassengerList();
		
		System.out.println("ArrayList Program");
		System.out.println("IT 178");
		System.out.println("Created by: Aaron Gee");
		System.out.println("August 21st 2020");
		
		String input = "first run";
		//loop to keep displaying menu
		while (!input .contentEquals("x"))
		{
			//Display navigation menu
			displayMenu();
			System.out.print("\nEnter a menu selection: ");
			input = keyboard.nextLine();
			
			if (input.contentEquals("1"))
			{
				//User chose 1 which is add ship
				addShip();
			}
			else if (input.contentEquals("2"))
			{
				//User chose 2 which is edit ship
				editShip();
			}
			else if (input.contentEquals("3"))
			{
				//User chose 3 which is add cruise
				addCruise();
			}
			else if (input.contentEquals("4"))
			{
				//User chose 4 which is edit cruise
				editCruise();
			}
			else if (input.contentEquals("5"))
			{
				//User chose 5 which is add passenger
				addPassenger();
			}
			else if (input.contentEquals("6"))
			{
				//User chose 6 which is edit passenger
				System.out.println("Edit Passenger");
			}
			else if (input.equalsIgnoreCase("A"))
			{
				//User chose a which will print all ship names only
				System.out.println("\nSHIP LIST - NAME");
				System.out.println("--------------------");
				typeOfList = "name";
				printShipList(typeOfList);
				System.out.println("--------------------");
			}
			else if (input.equalsIgnoreCase("B"))
			{
				//User chose b which will print all details of all active ships
				typeOfList = "active";
				System.out.println("\nSHIP LIST - ACTIVE");
				System.out.println("-------------------------------------------------");
				System.out.println("\t\tNumber of Rooms\t\tIn");
				System.out.println("SHIP NAME\tBal  OV  Ste  Int\tService");
				System.out.println("-------------------------------------------------");
				printShipList(typeOfList);
				System.out.println("-------------------------------------------------");
			}
			else if (input.equalsIgnoreCase("C"))
			{
				//User chose c which is show full list of all ship details
				typeOfList = "full";
				System.out.println("\nSHIP LIST - FULL");
				System.out.println("-------------------------------------------------");
				System.out.println("\t\tNumber of Rooms\t\tIn");
				System.out.println("SHIP NAME\tBal  OV  Ste  Int\tService");
				System.out.println("-------------------------------------------------");
				printShipList(typeOfList);
				System.out.println("-------------------------------------------------");
			}
			else if (input.equalsIgnoreCase("D"))
			{
				//User chose d which is show all cruise names only
				typeOfList = "list";
				System.out.println("\nCRUISE LIST - NAME");
				System.out.println("--------------------");
				printCruiseList(typeOfList);
				System.out.println("--------------------");
			}
			else if (input.equalsIgnoreCase("E"))
			{
				//User chose e which is show full cruise details for all cruises
				typeOfList = "details";
				System.out.println("\nCRUISE LIST - DETAILS");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("\t\t\t\t--------------------Ports--------------------");
				System.out.println("\nCRUISE NAME\tSHIP NAME\tDEPARTURE\tDESTINATION\tRETURN");
				System.out.println("-----------------------------------------------------------------------------");
				printCruiseList(typeOfList);
				System.out.println("-----------------------------------------------------------------------------");
			}
			else if (input.equalsIgnoreCase("F"))
			{
				//User chose f which will show full details of all passengers
				System.out.println("\nPASSENGER LIST");
				System.out.println("---------------------------------------------------");
				System.out.println("PASSENGER NAME\t\tCRUISE\t\t  ROOM TYPE");
				System.out.println("---------------------------------------------------");
				printPassengerList();
				System.out.println("---------------------------------------------------");
			}
			else if (input.equalsIgnoreCase("X"))
			{
				break;
			}
			else
			{
				System.out.println("\nDid not recognize input, please try again");
			}
		}
		
		//If nothing matches it will exit the program
		System.out.println("\nGoodbye!");

	}

}
