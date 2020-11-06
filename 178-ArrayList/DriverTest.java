package edu.ilstu;

import java.util.*;


public class DriverTest {

    //static variables for global use. 
    public static ArrayList<Cruise> cruiseList;
    public static ArrayList<Passenger> passengerList;
    public static ArrayList<Ship> shipList;
    public static Scanner in;

    /**
     * Main Statement.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        in = new Scanner(System.in);
        cruiseList = new ArrayList<>();     //Initialize array lists and Scanner
        passengerList = new ArrayList<>();
        shipList = new ArrayList<>();

        initializeShipList();
        initializeCruiseList();     //put some info into the array lists.
        initializePassengerList();

        boolean quit = false;   //While the user doesnt want to quit, loop the main menu and process the users selection.
        String input;
        do {
            displayMenu();
            input = in.nextLine();
            if (verifyMenuOption(input)) {
                if(evaluateMenu(input.charAt(0))){
                    quit = true;
                }
            } else errorMsg();
        } while (!quit);
    }

    /**
     * Creates 4 ships using hard-coded constructors and adds them to the ArrayList
     */
    public static void initializeShipList() {
        shipList.add(new Ship("Wave Glider", 40, 20, 10, 20, true));
        shipList.add(new Ship("Sea Spirit", 90, 40, 30, 60, false));
        shipList.add(new Ship("Explorer", 60, 30, 20, 30, true));
        shipList.add(new Ship("SeaStride", 200, 100, 75, 200, true));
    }

    /**
     * Creates 6 Passengers using hard-coded constructors and adds them to the ArrayList
     */
    public static void initializePassengerList() {
        passengerList.add(new Passenger("Peter Lewis", "Coral Cruiser", "Ocean View"));
        passengerList.add(new Passenger("John Smith", "Maritime Fun", "Suite"));
        passengerList.add(new Passenger("Jane Doe", "Around the Seas", "Balcony"));
        passengerList.add(new Passenger("Mike Hoff", "Coral Cruiser", "Interior"));
        passengerList.add(new Passenger("Jack Duff", "Maritime Fun", "Ocean View"));
        passengerList.add(new Passenger("Eliza Park", "Coral Cruiser", "Balcony"));

    }

    /**
     * Creates 3 cruises using hard-coded constructors and adds them to the ArrayList
     */
    public static void initializeCruiseList() {
        cruiseList.add(new Cruise("Coral Cruiser", "Wave Glider", "Miami", "St. John Island", "Miami"));
        cruiseList.add(new Cruise("Around the Seas", "Explorer", "New Orleans", "Cozumel", "New Orleans"));
        cruiseList.add(new Cruise("Maritime Fun", "SeaStride", "Ft. Lauderdale", "Cuba", "Ft. Lauderdale"));
    }

    /**
     * Prints requested ship information in ArrayList<Ship> to console
     *
     * @param type The type of information requested, either "name", "active", "inactive", or "full"
     */
    public static void printShipList(String type) {
        int eval = 0;

        //if-elseif block to determine what printout is needed
        if (shipList.size() == 0) {
            System.out.println("There are no ships to print.");
        } else if (type.contains("name")) {
            eval = 1;
        } else if (type.contains("inactive")) {
            eval = 3;
        } else if (type.contains("active")) {
            eval = 2;
        } else eval = 4;

        switch (eval) { //switch to perform proper printout.
            case 0: //No ships to print.
                break;
            case 1: {   //just ship names
                System.out.println("-------------------SHIP NAME LIST-------------------");
                for (Ship s : shipList) {
                    System.out.println(s.toString());
                }
                break;
            }
            case 2: { //all active ships
                System.out.println("--------------------ACTIVE SHIP LIST--------------------");
                System.out.println("-                    Number of Rooms                   -");
                System.out.print("- Name\t\t\tBalcony\tO.V. Suite Interior\tIn Service -\n");
                for (Ship s : shipList) {
                    if (s.getInService()) {
                        System.out.printf("%s\t\t\t%d\t%d\t\t%d\t%d\t\t%s\n", s.getShipName(), s.getNoOfBalcRooms(), s.getNoOfOVRooms(), s.getNoOfSuites(), s.getNoOfIntRooms(), s.getInService());
                    }
                }
                break;
            }
            case 3: { //all inactive ships
                System.out.println("-------------------INACTIVE SHIP LIST-------------------");
                System.out.println("-                    Number of Rooms                   -");
                System.out.print("- Name\t\t\tBalcony\tO.V. Suite Interior\tIn Service -\n");
                for (Ship s : shipList) {
                    if (!s.getInService()) {
                    	System.out.printf("%s\t\t\t%d\t%d\t\t%d\t%d\t\t%s\n", s.getShipName(), s.getNoOfBalcRooms(), s.getNoOfOVRooms(), s.getNoOfSuites(), s.getNoOfIntRooms(), s.getInService());
                    }
                }
                break;
            }
            case 4: { //all ships all info.
                System.out.println("---------------------FULL SHIP LIST---------------------");
                System.out.println("-                    Number of Rooms                   -");
                System.out.print("- Name\t\t\tBalcony\tO.V. Suite Interior\tIn Service -\n");
                for (Ship s : shipList) {
                	System.out.printf("%s\t\t\t%d\t%d\t\t%d\t%d\t\t%s\n", s.getShipName(), s.getNoOfBalcRooms(), s.getNoOfOVRooms(), s.getNoOfSuites(), s.getNoOfIntRooms(), s.getInService());
                }
                break;
            }
        }
    }

    /**
     * Prints all passengers in ArrayList<Passenger> to console
     */
    public static void printPassengerList() { //Always print all the passengers and all info on them.
        System.out.println("---------------FULL PASSENGER LIST-----------------");
        System.out.println("- Name\t\t\t\tCruise\t\t\tPreferred Room -\n");
        for (Passenger p : passengerList) {
            System.out.printf("%s\t\t%s\t\t%s\n", p.getName(), p.getCruiseName(), p.getRoomType());
        }
    }

    /**
     * Prints specified cruise information in ArrayList<Cruise> to console.
     *
     * @param type The type of information requested, either "list" or "complete"
     */
    public static void printCruiseList(String type) {
        int eval = 0;
        //if-elseif block to determine the type of printout needed.
        if (cruiseList.size() == 0) {
            System.out.println("There are no cruises to print.");
        }
        //evaluate type
        else if (type.contains("list")) {
            eval = 1;
        } else eval = 2;

        switch (eval) { //switch statement on the types of printouts.
            case 0: //no cruises option
                break;
            case 1: { //just cruise names
                System.out.println("------------------CRUISE NAME LIST-------------------");
                for (Cruise c : cruiseList) {
                    System.out.println(c.toString());
                }
                break;
            }
            case 2: { //the full list of information on cruises.
                System.out.println("-------------------------------FULL CRUISE LIST--------------------------------");
                System.out.println("- Name\t\t\t\tShip Name\t\tDeparts From -- Destination -- Returns To -\n");
                for (Cruise c : cruiseList) {
                    System.out.printf("%s\t\t%s\t\t%s -- %s -- %s\n", c.getCruiseName(), c.getShipName(), c.getDepartPort(), c.getDestination(), c.getReturnPort());
                }
                break;
            }
        }
    }

    /**
     * Displays base menu for user interaction
     */
    public static void displayMenu() {
        System.out.println("\n\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\tSystem Menu");
        System.out.println("[1] Add Ship\t\t\t[A] Print Ship Names");
        System.out.println("[2] Edit Ship\t\t\t[B] Print Ship In Service List");
        System.out.println("[3] Add Cruise\t\t\t[C] Print Ship Full List");
        System.out.println("[4] Edit Cruise\t\t\t[D] Print Cruise List");
        System.out.println("[5] Add Passenger\t\t[E] Print Cruise Details");
        System.out.println("[6] Edit Passenger\t\t[F] Print Passenger Details");
        System.out.println("[x] Exit System");
        System.out.print("\nEnter a menu selection: ");
    }
    /**
     * Prints a generic error message to console
     */
    public static void errorMsg() {
        System.out.println("\nThis input could not be accepted. Please try again.\n");
    }

    /**
     * Returns a boolean to say if the first char of the string parameter is a valid option or not.
     * @param userInput The string the user entered into console.
     * @return boolean The boolean value of if this input can be used or not
     */
    public static boolean verifyMenuOption(String userInput) {
            try{
                char input = userInput.charAt(0);
                return input == '1' ||
                        input == '2' ||
                        input == '3' ||
                        input == '4' ||
                        input == '5' ||
                        input == '6' ||
                        input == 'A' ||
                        input == 'B' ||
                        input == 'C' ||
                        input == 'D' ||
                        input == 'E' ||
                        input == 'F' ||
                        input == 'x';
            }
            catch (Exception e){
                return false;
            }
    }

    /**
     * evaluateMenu uses a switch block to determine what method should be called from the users input.
     * @param userInput The char the user typed into console.
     * @return boolean A boolean value that is false if the user has not chosen to quit, and true if the user wishes to quit.
     */
    public static boolean evaluateMenu(char userInput) {
        switch (userInput) {
            case '1' : addShip();
                break;
            case '2' : editShip();
                break;
            case '3' : addCruise();
                break;
            case '4' : editCruise();
                break;
            case '5' : addPassenger();
                break;
            case '6' : editPassenger();
                break;
            case 'A' : printShipList("name");
                break;
            case 'B' : {
                System.out.println("Would you like to see the active ships? (Y for yes, N for no)");
                if (getYesNo()) {
                    printShipList("active");
                } else printShipList("inactive");
                break;
            }
            case 'C' : printShipList("full");
                break;
            case 'D' : printCruiseList("list");
                break;
            case 'E' : printCruiseList("full");
                break;
            case 'F' : printPassengerList();
                break;
            case 'x' : {
                return true;
            }
        }
        return false;
    }

    /**
     * getNumber uses a while loop and a try catch block to ask the user for an integer > 0.
     * Catches NumberFormatExceptions, and prints error messages if the user input cannot be accepted.
     * If the user enters a number > 0, the loop exits, and the number is returned.
     * @return int The number the user typed in console.
     */
    public static int getNumber() {
        boolean accepted = false;
        int val = -1;
        do {
            try {
                val = Integer.parseInt(in.nextLine());
                if (val >= 0) {
                    accepted = true;
                } else System.out.println("Please enter 0 or greater.");
            } catch (NumberFormatException e) {
                System.out.println("That number is not formatted correctly. Try again.");
            }
        } while (!accepted);
        return val;
    }
    /**
     * getYesNo grabs the next line, and checks if the first character is a 'y' or a 'n'
     * The method will loop until a proper input is given.
     * If it is neither a 'y' or 'n', an error is printed, and the user is allowed to enter data again.
     * If it is 'y' true is returned.
     * If it is 'n' false is returned.
     * @return boolean Whether the user answered yes or no, where yes is equal to true.
     */
    public static boolean getYesNo() {
        boolean accepted = false;
        char answer;
        boolean userInput = false;
        do {
                answer = in.nextLine().charAt(0);
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

    /**
     * addShip will prompt the user for a string, and call getNumber() 4 times, as well as getYesNo() once.
     * It will then save these answers as a new Ship and store that ship into shipList.
     */
    public static void addShip() {
        String name;  //method vars.
        int bal, ov, suite, inter;
        boolean inServ;

        System.out.println("\nAdd a Ship:");//Header and ask for ship name.
        System.out.print("What is the name of the ship? ");
        name = in.nextLine();

        System.out.printf("\nHow many balcony rooms are on %s? ", name);//ask for balcony rooms
        bal = getNumber();

        System.out.printf("\nHow many ocean view rooms are on %s? ", name);//ask for ocean view rooms
        ov = getNumber();

        System.out.printf("\nHow many suite rooms are on %s? ", name);//ask for suite rooms
        suite = getNumber();

        System.out.printf("\nHow many interior rooms are on %s? ", name);//ask for interior rooms
        inter = getNumber();

        System.out.printf("\nIs %s in service? (Does it have an assigned cruise?)\n(Y for yes, N for no)", name);//ask if ship is in service
        inServ = getYesNo();

        shipList.add(new Ship(name, bal, ov, suite, inter, inServ));//save ship to shipList
        System.out.println("Ship created and saved!");
    }

    /**
     * editShipMenu prints all the options a user has when editing a ship.
     * It needs the users selection to print the name of the ship the user is about to edit.
     * @param shipIndex The index of the ship the user wishes to edit within shipList
     */
    public static void editShipMenu(int shipIndex) {
        System.out.printf("Ship Edit Menu for: %s", shipList.get(shipIndex).getShipName());
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

    /**
     * performShipEdit will take the users menu selection and the index of the ship.
     * It will use a switch block on the menuSelection to perform the edit selected by the user.
     * It uses ship index to save these edits within the shipList.
     * @param menuSelection The integer selection from the menu printed by editShipMenu()
     * @param shipIndex The index of the selected ship to edit within the shipList.
     */
    public static void performShipEdit(int menuSelection, int shipIndex) {
        //switch on menuSelection
        switch (menuSelection) {
            case 1 : {   //option 1: rename the ship
                String name;
                System.out.print("What is the new name of the ship? ");
                name = in.nextLine();
                shipList.get(shipIndex).setShipName(name); //save edit
                System.out.println("Ship name changed!");
                break;
            }
            case 2 : {   //option 2: change the number of balcony rooms.
                int bal;
                System.out.printf("\nHow many balcony rooms are on %s? ", shipList.get(shipIndex).getShipName());
                bal = getNumber();  //get the number from the user
                shipList.get(shipIndex).setNoOfBalcRooms(bal);   //save edit
                System.out.printf("Room count updated for %s. \n", shipList.get(shipIndex).getShipName());
                break;
            }
            case 3 : {   //option 3: change the number of ocean view rooms
                int ov;
                System.out.printf("\nHow many ocean view rooms are on %s? ", shipList.get(shipIndex).getShipName());
                ov = getNumber(); //get the number from user
                shipList.get(shipIndex).setNoOfOVRooms(ov); //save the edit
                System.out.printf("Room count updated for %s. \n", shipList.get(shipIndex).getShipName());
                break;
            }
            case 4 : {   //option 4: change the number of suites
                int suite;
                System.out.printf("\nHow many suite rooms are on %s? ", shipList.get(shipIndex).getShipName());
                suite = getNumber(); //get a number
                shipList.get(shipIndex).setNoOfSuites(suite); //save edit
                System.out.printf("Room count updated for %s. \n", shipList.get(shipIndex).getShipName());
                break;
            }
            case 5 : {   //option 5: change the number of interior rooms
                int inter;
                System.out.printf("\nHow many interior rooms are on %s? ", shipList.get(shipIndex).getShipName());
                inter = getNumber(); //get a number
                shipList.get(shipIndex).setNoOfIntRooms(inter); //save the edit
                System.out.printf("Room count updated for %s. \n", shipList.get(shipIndex).getShipName());
                break;
            }
            case 6 : { //option 6: change the status of the ship
                boolean inServ;
                System.out.printf("\nIs %s in service? (Does it have an assigned cruise?)\n(Y for yes, N for no)", shipList.get(shipIndex).getShipName());
                inServ = getYesNo(); //Get the yes no answer.
                shipList.get(shipIndex).setInService(inServ); //update in service status
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
                System.out.printf("\nARE YOU SURE YOU WISH TO DELETE '%s'? (Y or N)", shipList.get(shipIndex).getShipName());
                if (getYesNo()) {
                    shipList.remove(shipIndex);
                    System.out.println("Ship Deleted.");
                } else System.out.println("Ship delete cancelled.");
                break;
            }
            case 9 : //option 9: cancel edit
                    System.out.println("Returning to main menu.");
                break;
        }
    }

    /**
     * editShip is used to determine if there are ships to edit, and if so which one.
     * It will ask the user to pick a ship from a menu, and then prompt them with editShipMenu(shipIndex)
     * Then it calls performShipEdit.
     */
    public static void editShip() {
        if (shipList.size() == 0) {     //Check there are ships to edit
            System.out.println("There are no ships to edit. Please add a ship first.");
        }
        else {     //There are ships, so offer options to user
            int selection;
            System.out.println("Please select the number of the ship you wish to edit from the following list");
            for (int i = 0; i < shipList.size(); i++) {     //loop to print all ship names to console with a number for picking one.
                System.out.printf("[%d]\t%s\n", i + 1, shipList.get(i));
            }
            selection = getNumber(); //Get a number from the user.

            if (selection > shipList.size()) {      //Check the number was a valid choice.
                System.out.println("That was not a listed option, sorry. Returning to main menu.");
            }
            else {      //The user picked a ship. Print the edit menu, and get a selection from that menu
                int secondSelection;
                boolean accepted = false;
                editShipMenu(selection - 1);
                do {
                    secondSelection = getNumber();
                    if (secondSelection > 9 || secondSelection == 0) {
                        System.out.println("That was not a menu option. Try again.");//ask the user to make a selection until they have picked a valid choice.
                    } else accepted = true;
                } while (!accepted);
                performShipEdit(secondSelection, selection - 1); //perform the edit selected.
            }
        }
    }

    /**
     * addCruise will prompt the user for 5 strings.
     * It will then save these answers as a new Cruise and store that cruise into cruiseList.
     */
    public static void addCruise() {
        String name, ship = "", depPort, dest, retPort; //method vars
        int selection, shipCounter = 1;
        boolean accepted = false;

        System.out.println("Add a Cruise:"); //header and ask for cruise name
        System.out.print("Enter Cruise name: ");
        name = in.nextLine();

        System.out.println("Select the ship from the list that should be used for this cruise."); //print a list of ships out of service. Ask the user to pick one.
        System.out.println("This will also put the ship into service.");
        for (Ship value : shipList) {
            if (!value.getInService()) {
                System.out.printf("[%d] - %s", shipCounter, value.getShipName());
                shipCounter++;
            }
        }
        if (shipCounter == 1) { //if the counter is the same, all ships are in service. Error message, and quit adding.
            System.out.println("Sorry, there are no ships that can be added to this cruise. Mark a ship as out of service to add it.");
            System.out.println("Adding cruise cancelled.");
        }
        else {      //the user picked a ship, but we dont really know which one. Loop again to find out, and report if it was valid or not
            do {
                selection = getNumber();
                if (selection == 0 || selection > shipCounter - 1) {        //check if it was invalid.
                    System.out.println("That was not a valid option. Please try again.");
                }
                else {      //its valid, so loop to find it
                    shipCounter = 0;
                    for (Ship s : shipList) {
                        if (!s.getInService()) {
                            shipCounter++;
                        }
                        if (shipCounter == selection) {
                            ship = s.getShipName();
                            s.setInService(true); //save the name in a string, set the ship into service.
                        }
                    }
                    accepted = true;
                }
            } while (!accepted);

            System.out.println("What is the departure port for the cruise?");//ask for departure port
            depPort = in.nextLine();

            System.out.println("What is the destination of the cruise?"); //ask for destination
            dest = in.nextLine();

            System.out.println("What is the return port of the cruise?"); //ask for return port
            retPort = in.nextLine();

            cruiseList.add(new Cruise(name, ship, depPort, dest, retPort)); //save the new cruise.
            System.out.println("Cruise added successfully.");
        }
    }

    /**
     * editCruiseMenu prints all the options a user has when editing a cruise.
     * It needs the users selection to print the name of the cruise the user is about to edit.
     * @param cruiseIndex The index of the cruise the user wishes to edit within cruiseList
     */
    public static void editCruiseMenu(int cruiseIndex) {
        System.out.printf("Edit Cruise %s:\n", cruiseList.get(cruiseIndex));
        System.out.println("[1]\tEdit cruise name.");
        System.out.println("[2]\tEdit ship for cruise.");
        System.out.println("[3]\tEdit cruise departure port.");
        System.out.println("[4]\tEdit cruise destination.");
        System.out.println("[5]\tEdit cruise return port.");
        System.out.println("[6]\tEdit all options for cruise.");
        System.out.println("[7]\tDelete this cruise.");
        System.out.println("[8]\tCancel editing.");
    }

    /**
     * performCruiseEdit will take the users menu selection and the index of the cruise.
     * It will use a switch block on the menuSelection to perform the edit selected by the user.
     * It uses cruise index to save these edits within the cruiseList.
     * @param menuSelection The integer selection from the menu printed by editCruiseMenu()
     * @param cruiseIndex The index of the selected ship to edit within the cruiseList.
     */
    public static void performCruiseEdit(int menuSelection, int cruiseIndex) {
        //switch block
        switch (menuSelection) {
            case 1 : { //option 1: rename cruise
                String name;
                System.out.println("Enter new name for cruise:");
                name = in.nextLine();
                cruiseList.get(cruiseIndex).setCruiseName(name);
                System.out.println("Edit saved!");
                break;
            }
            case 2 : {   //option 2: re-select ship
                if (setShipNameForCruise(cruiseIndex)) break; //check for ships to be put into service
                System.out.println("Edit saved!");
                break;
            }
            case 3 : {   //option 3: re-enter departure port
                String depPort;
                System.out.println("Enter new departure port for cruise:");
                depPort = in.nextLine();
                cruiseList.get(cruiseIndex).setDepartPort(depPort);
                System.out.println("Edit saved!");
                break;
            }
            case 4 : { //option 4: re-enter destination
                String dest;
                System.out.println("Enter new destination for cruise:");
                dest = in.nextLine();
                cruiseList.get(cruiseIndex).setDestination(dest);
                System.out.println("Edit saved!");
                break;
            }
            case 5 : { //option 5: re-enter return port
                String retPort;
                System.out.println("Enter new return port for cruise:");
                retPort = in.nextLine();
                cruiseList.get(cruiseIndex).setReturnPort(retPort);
                System.out.println("Edit saved!");
                break;
            }
            case 6 : { //option 6: re-enter all cruise info.
                String name, depPort, dest, retPort;

                System.out.println("Enter new name for cruise:");
                name = in.nextLine();
                cruiseList.get(cruiseIndex).setCruiseName(name);

                setShipNameForCruise(cruiseIndex); // if no ship can be put in service we continue anyway.

                System.out.println("Enter new departure port for cruise:");
                depPort = in.nextLine();
                cruiseList.get(cruiseIndex).setDepartPort(depPort);

                System.out.println("Enter new destination for cruise:");
                dest = in.nextLine();
                cruiseList.get(cruiseIndex).setDestination(dest);

                System.out.println("Enter new return port for cruise:");
                retPort = in.nextLine();
                cruiseList.get(cruiseIndex).setReturnPort(retPort);

                System.out.println("Edits saved!");
                break;
            }
            case 7 : { //option 7: delete the cruise
                System.out.println("ARE YOU SURE YOU WISH TO DELETE THIS CRUISE? (Y or N)");
                if (getYesNo()) {
                    for (Ship s : shipList) {
                        if (s.getShipName().contains(cruiseList.get(cruiseIndex).getShipName())) {
                            s.setInService(false);
                        }
                    }
                    cruiseList.remove(cruiseIndex);
                    System.out.println("Cruise Removed.");
                } else System.out.println("Cruise was NOT removed.");
                break;
            }
//option 8: cancel the edit.
            case 8 : System.out.println("Returning to main menu.");
                break;
        }
    }

    /**
     * setShipNameForCruise will handle helping the user add a ship to a cruise
     * It will also put the ship into service.
     * It prints a list of valid ships, and lets the user select one, and verifies their choice.
     * It returns true only if there are no ships that can be added to a cruise.
     * Otherwise returns false
     * @param cruiseIndex The index of the cruise to edit in cruiseList
     * @return boolean The boolean value to check if there was a ship to add or not. If not, returns true.
     */
    public static boolean setShipNameForCruise(int cruiseIndex) {
        String ship = "";   //method vars
        int shipIndex = 1, selection;

        System.out.println("Select ship from list below:"); //offer a list of valid ships to pick.
        for (Ship value : shipList) {
            if (!value.getInService()) {
                System.out.printf("[%d] - %s\n", shipIndex, value.getShipName());
                shipIndex++;
            }
        }

        if (shipIndex == 1) { //if the index is still 1, there are no ships. Return true.
            System.out.println("Sorry, all ships are in service. Add a ship, or remove one from service.");
            return true;
        }
        else { //Theres a ship! lets check what the user picks.
            boolean accepted = false;
            do {
                selection = getNumber();
                if (selection == 0 || selection > shipIndex - 1) {
                    System.out.println("That was not a valid option. Try again.");
                } else accepted = true;
            } while (!accepted);    //we verified the ship selection.

            shipIndex = 0;
            for (Ship s : shipList) {   //find the ship the user picked.
                if (!s.getInService()) {
                    shipIndex++;
                }
                if (shipIndex == selection) {   //we found it. Lets save it/put it into service.
                    s.setInService(true);
                    ship = s.getShipName();
                }
            }
        }
        cruiseList.get(cruiseIndex).setShipName(ship); //save new ship name.
        return false;
    }

    /**
     * editCruise will prompt the user to pick a cruise, and then call performCruiseEdit on this.
     */
    public static void editCruise() {
        int selection, secondSelection, i; //method vars
        boolean accepted = false;

        System.out.println("Edit a Cruise:"); //header, and check for cruises to edit.
        if (cruiseList.size() == 0) {
            System.out.println("There are no cruises to edit. Please add one first.");
        }
        else {  //we have cruises, lets ask what to edit.
            System.out.println("Select the number of the cruise to edit from below:");
            for (i = 0; i < cruiseList.size(); i++) {
                System.out.printf("[%d] - %s", i + 1, cruiseList.get(i).getCruiseName());
            }

            selection = getNumber();
            if (selection == 0 || selection > i + 1) {  //Check that the pick was valid.
                System.out.println("That was not an option, sorry. Returning to main menu.");
            }
            else {  //Valid pick. Print menu, and then verify second selection.
                editCruiseMenu(selection - 1);
                do {
                    secondSelection = getNumber();
                    if (secondSelection != 0 && secondSelection <= 8) {
                        accepted = true;
                    } else System.out.println("That was not a valid option, please try again.");
                } while (!accepted);

                performCruiseEdit(secondSelection, selection - 1);//valid 2nd menu choice. Perform the edit.
                System.out.println("Editing closed.");
            }
        }
    }

    /**
     * addPassenger will prompt the user for 2 strings, and then ask them to pick a room type.
     */
    public static void addPassenger() {
        if (cruiseList.size() == 0) { //Check we have cruises to add them to.
            System.out.println("A passenger cannot be added while there are no scheduled cruises. Sorry.");
        }
        else {
            String name, cruise;    //method vars
            int selection;

            System.out.println("Add Passenger:");//header and ask for name
            System.out.println("Enter passenger name:");
            name = in.nextLine();

            cruise = getCruiseName(); //call method for getting a cruise name

            selection = getRoomSelection(); //call method for getting the room type

            switch (selection) {    //add the passenger
                case 1 : passengerList.add(new Passenger(name, cruise, "balcony"));
                    break;
                case 2 : passengerList.add(new Passenger(name, cruise, "ocean view"));
                    break;
                case 3 : passengerList.add(new Passenger(name, cruise, "suite"));
                    break;
                case 4 : passengerList.add(new Passenger(name, cruise, "interior"));
                    break;
            }
            System.out.println("Passenger Added!");
        }
    }

    /**
     * getRoomSelection prompts user to pick a room from a list, and verifies they made a valid choice.
     * @return int The number associated with the specified room type.
     */
    public static int getRoomSelection() {
        boolean accepted = false;
        int selection;
        System.out.println("Select a preferred room type from list below:");
        System.out.println("[1] - Balcony");
        System.out.println("[2] - Ocean View");
        System.out.println("[3] - Suite");
        System.out.println("[4] - Interior");
        do {
            selection = getNumber();
            if (selection != 0 && selection <= 4) {
                accepted = true;
            } else System.out.println("That was not a valid option. Please try again.");
        }
        while (!accepted);
        return selection;
    }

    /**
     * getCruiseName will ask the user to pick a cruise from a menu. It will return the name of this cruise.
     * @return String The name of the cruise the user picked.
     */
    public static String getCruiseName() {
        boolean accepted = false;
        int i;
        int selection; //method vars

        System.out.println("Select cruise number from list below:"); //print menu
        for (i = 0; i < cruiseList.size(); i++) {
            System.out.printf("[%d] - %s\n", i + 1, cruiseList.get(i).getCruiseName());
        }

        do {    //loop until we can verify input
            selection = getNumber();
            if (selection != 0 && selection <= i + 1) {
                accepted = true;
            } else System.out.println("That was not a valid option. Please try again.");
        }
        while (!accepted);

        return cruiseList.get(selection - 1).getCruiseName(); //grab cruise name then return it.
    }

    /**
     * performPassengerEdit will take the menu choice and the index of the passenger within passengerList.
     * It uses the menuSelection in a switch block to prompt and perform the proper edit.
     * @param menuSelection The users selected edit action.
     * @param passengerIndex The index of the passenger within passengerList.
     */
    public static void performPassengerEdit(int menuSelection, int passengerIndex) {
        switch (menuSelection) {    //switch block
            case 1 : { //option 1: change the passenger name
                String name;
                System.out.println("Enter passenger name:");
                name = in.nextLine();
                passengerList.get(passengerIndex).setName(name);
                System.out.println("Edit Saved!");
                break;
            }
            case 2 : { //option 2: change the cruise the passenger is on.
                String cruise;
                cruise = getCruiseName();
                passengerList.get(passengerIndex).setCruiseName(cruise);
                System.out.println("Edit Saved!");
                break;
            }
            case 3 : { //option 3 : change preferred room type.
                int selection = getRoomSelection();
                setPassengerRoomType(passengerIndex, selection);
                break;
            }
            case 4 : { //option 4: change all passenger options.
                int selection;
                String name;
                System.out.println("Enter passenger name:"); //get new name for passenger
                name = in.nextLine();
                passengerList.get(passengerIndex).setName(name);

                String cruise;
                cruise = getCruiseName(); //change the cruise for passenger
                passengerList.get(passengerIndex).setCruiseName(cruise);

                selection = getRoomSelection(); //change the room for passenger.
                setPassengerRoomType(passengerIndex, selection);
                break;
            }
            case 5 : { //option 5: delete the passenger.
                System.out.println("Are you sure you wish to delete this passenger? (Y or N)");
                if (getYesNo()) {
                    passengerList.remove(passengerIndex);
                    System.out.println("Passenger Removed.");
                } else System.out.println("Passenger was NOT removed.");
                break;
            }
            case 6 : System.out.println("Returning to main menu."); //option 6: cancel edit.
                break;
        }
    }

    /**
     * setPassengerRoomType is a small switch to be sure the proper spelling of the type of room is set.
     * @param passengerIndex Index of passenger to update
     * @param selection The integer that lines up passenger selection to the proper setRoomType() call.
     */
    public static void setPassengerRoomType(int passengerIndex, int selection) {
        switch (selection) {
            case 1 : passengerList.get(passengerIndex).setRoomType("balcony");
                break;
            case 2 : passengerList.get(passengerIndex).setRoomType("ocean view");
                break;
            case 3 : passengerList.get(passengerIndex).setRoomType("suite");
                break;
            case 4 : passengerList.get(passengerIndex).setRoomType("interior");
                break;
        }
        System.out.println("Edit Saved!");
    }

    /**
     * printPassengerEdit prints the menu for editing a passenger.
     * @param passengerIndex The index of the passenger getting edited.
     */
    public static void printPassengerEdit(int passengerIndex) {
        System.out.printf("Edit Passenger %s:\n", passengerList.get(passengerIndex).getName());
        System.out.println("[1] - Edit Name.");
        System.out.println("[2] - Edit Cruise.");
        System.out.println("[3] - Edit Room Preference.");
        System.out.println("[4] - Edit All.");
        System.out.println("[5] - Remove Passenger.");
        System.out.println("[6] - Cancel Edit.");
    }

    /**
     * editPassenger checks there are passengers to edit, and if there are asks the user to pick which one to edit.
     * Then it calls performPassengerEdit()
     */
    public static void editPassenger() {
        boolean accepted = false;
        int selection, secondSelection, i; //method vars

        System.out.println("Edit Passenger:"); //header and check if there are passengers
        if (passengerList.isEmpty()) {
            System.out.println("There are no passengers to edit. Sorry!");
        }
        else {      //There are passengers
            System.out.println("Select a passenger from below");
            for (i = 0; i < passengerList.size(); i++) {
                System.out.printf("[%d] - %s\n", i + 1, passengerList.get(i).getName());   //offer a menu of passengers
            }

            do {
                selection = getNumber();
                if (selection != 0 && selection <= i) {
                    accepted = true;
                } else System.out.println("That was not an option. Please try again."); //Check they picked a option.
            } while (!accepted);

            printPassengerEdit(selection - 1); //Print the menu.
            accepted = false;
            do {
                secondSelection = getNumber();
                if (secondSelection != 0 && secondSelection <= 6) {
                    accepted = true;
                } else System.out.println("That was not an option. Please try again."); //verify the menu selection
            } while (!accepted);

            performPassengerEdit(secondSelection, selection - 1); //perform the edit.
        }
    }
}
    