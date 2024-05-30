package playPackage;

import java.util.Scanner;

public class Play 
{
    private boolean helpBoolean;
    private int helpLoop = 1;
    private int helpLoopGo = 1;
    private int chooseCrateGo = 1;

    public void welcomeUser() throws InterruptedException 
    {
        //Main code used for the welcome class

        System.out.println("Welcome user, what is your name?");
        System.out.println();
        System.out.println("Type your name: ");

        //scanner name class
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();

        if (userName.equals("Ernesto")) 
        {
            // Ernesto cannot enter
            System.out.print("You may not enter Ernesto");
            return;
        } 
        else 
        {
            System.out.println("You may enter " + userName);
        }

        Thread.sleep(1000); // this peice of code uses the thread method and pauses for 1 second, i learned this from online forums

        // This asks the person if they want help, they will type out "Help" or "Go"
        for (int i = 0; i < helpLoop; i++) 
        {
            System.out.println("\nWould you like instructions? \nType 'Help' if you need help | Type 'Go' if you do not"); // \n breaks the lines up so I dont have to write a bunch of print functions
            Scanner helpScanner = new Scanner(System.in);
            String helpString = helpScanner.nextLine();

            if (helpString.equals("Help")) 
            {
                helpBoolean = true;
                helpLoop = 0;
            } 
            else if (helpString.equals("Go")) 
            {
                helpBoolean = false;
                helpLoop = 0;
            } 
            else 
            {
                helpLoop++;
            }
        }

        if (helpBoolean == true) 
        {
            showHelp();
        } 
        else if (helpBoolean == false) 
        {
            goOpen();
        }
    }

    public void showHelp() 
    {
        System.out.println("\nShowing 'Help'\n#1: How to pick the crate you want\n- You will be prompted...");

        for (int i = 0; i < helpLoopGo; i++) {

            System.out.println("Type 'Go' to move on\n");
            Scanner helpScannerGo = new Scanner(System.in);
            String helpStringGo = helpScannerGo.nextLine();

            if (helpStringGo.equals("Go")) 
            {
                goOpen();
            } 
            else 
            {
                helpLoopGo++;
            }
        }
    }

    public void goOpen() 
    {
        System.out.println("Pick your crate:\n #1 - Common Case \n #2 - Uncommon Case \n #3 - Rare Cases \n #4 - Legendary Case");
        System.out.println("\nType '#' and then the number of what case you want");
        System.out.println("Example: #'then the number of the case you want'");

        Crates crate = new Crates();
        crate.roll();

        Scanner goOpenScanner = new Scanner(System.in);
        String goOpenString = goOpenScanner.nextLine();

        for (int i = 0; i < chooseCrateGo; i++) 
        {
            if (goOpenString.equals("#1")) {
                System.out.println("You have picked a Common Case");
                
                // Create an instance of the Crates class
                Crates commonCase = new Crates();

                // Call the roll method for each case
                commonCase.roll();

            } 
            
            else if (goOpenString.equals("#2")) 
            {
                System.out.println("You have picked an Uncommon Case");
                Crates uncommonCase = new Crates();
                uncommonCase.roll();
            } 
            else if (goOpenString.equals("#3")) 
            {
                System.out.println("You have picked a Rare Case");
                Crates rareCase = new Crates();
                rareCase.roll();

            } 
            else if (goOpenString.equals("#4")) 
            {
                System.out.println("You have picked a Legendary Case");
                Crates legendaryCase = new Crates();
                legendaryCase.roll();
            } 
            else 
            {
                helpLoopGo++;
            }
        }
    }

public class Crates 
{
    public int rollChance;
    public String itemRolled;

    // add array of the basic items in the crate
    public String[] basicItemsArray() 
    {
        String[] basicItems = {"Common Duck", "Common Goose", "Uncommon Goose", "Rare Goose", "Legendary Lochness Monster"};
        rollChance = (int) (Math.random() * 1500);
        return basicItems;
    }
    public void roll() 
    {
        if (rollChance < 25) 
        {
            itemRolled = basicItemsArray()[4];
            System.out.println(itemRolled);
        } 
        else if (rollChance > 25 && rollChance < 200) 
        {
            itemRolled = basicItemsArray()[3];
            System.out.println(itemRolled);
        } 
        else if (rollChance > 200 && rollChance < 500) 
        {
            itemRolled = basicItemsArray()[2];
            System.out.println(itemRolled);
        } 
        else if (rollChance > 500 && rollChance < 1000) 
        {
            itemRolled = basicItemsArray()[1];
            System.out.println(itemRolled);
        } 
        else if (rollChance > 1000 && rollChance < 1500) 
        {
            itemRolled = basicItemsArray()[1];
            System.out.println(itemRolled);
        }
    }

    // common
    public class Common extends Crates 
    {
        public void roll() 
        {
            if (rollChance < 25) 
            {
                itemRolled = basicItemsArray()[4];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 25 && rollChance < 200) 
            {
                itemRolled = basicItemsArray()[3];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 200 && rollChance < 500) 
            {
                itemRolled = basicItemsArray()[2];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 500 && rollChance < 1000) 
            {
                itemRolled = basicItemsArray()[1];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 1000 && rollChance < 1500) 
            {
                itemRolled = basicItemsArray()[1];
                System.out.println(itemRolled);
            }
        }
    }

    // uncommon
    public class Uncommon extends Crates 
    {
        public void roll() 
        {
            rollChance = (int) (Math.random() * 2500);
            if (rollChance < 25) {
                itemRolled = basicItemsArray()[4];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 25 && rollChance < 200) 
            {
                itemRolled = basicItemsArray()[3];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 200 && rollChance < 500) 
            {
                itemRolled = basicItemsArray()[2];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 500 && rollChance < 1000) 
            {
                itemRolled = basicItemsArray()[1];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 1000 && rollChance < 1500) 
            {
                itemRolled = basicItemsArray()[1];
                System.out.println(itemRolled);
            }
        }
    }

    // rare
    public class Rare extends Crates 
    {
        public void roll() 
        {
            rollChance = (int) (Math.random() * 2500);
            if (rollChance < 25) 
            {
                itemRolled = basicItemsArray()[4];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 25 && rollChance < 200) 
            {
                itemRolled = basicItemsArray()[3];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 200 && rollChance < 500) 
            {
                itemRolled = basicItemsArray()[2];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 500 && rollChance < 1000) 
            {
                itemRolled = basicItemsArray()[1];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 1000 && rollChance < 1500) 
            {
                itemRolled = basicItemsArray()[1];
                System.out.println(itemRolled);
            }
        }
    }

    // legendary
    public class Legendary extends Crates 
    {
        private String[] legendaryItems = {"Legendary Duck", "Legendary Goose", "Epic Duck", "Epic Goose", "Mythical Lochness Monster"};

        public void roll() 
        {
            rollChance = (int) (Math.random() * 2500);
            if (rollChance < 25) 
            {
                itemRolled = legendaryItems[4];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 25 && rollChance < 200) 
            {
                itemRolled = legendaryItems[3];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 200 && rollChance < 500) 
            {
                itemRolled = legendaryItems[2];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 500 && rollChance < 1000) 
            {
                itemRolled = legendaryItems[1];
                System.out.println(itemRolled);
            } 
            else if (rollChance > 1000 && rollChance < 1500) 
            {
                itemRolled = legendaryItems[1];
                System.out.println(itemRolled);
            }
        }
    }
}}
