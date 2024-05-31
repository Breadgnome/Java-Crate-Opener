package playPackage;

import java.util.Scanner;

public class Play 
{
    private boolean helpBoolean;
    private int helpLoop = 1;
    private int helpLoopGo = 1;
    private int chooseCrateGo = 1;

    public void welcomeUser() throws InterruptedException // found this on a java learning website so I could put a delay in printing things
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

        Thread.sleep(1000); // this peice of code uses the thread method and pauses for 1 second, i learned this from a java learning website

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

    // Display help
    public void showHelp()  
    {
        System.out.println("\nShowing 'Help'\n#1: How to pick the crate you want\n- You will be prompted to pick a crate, you need to type '#' and then the number of the crate you want\n#2: How to open the crate\n- It will automaticly open once you picked the crate");

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

    // Opens the crate
    public void goOpen() 
    {
        System.out.println("Pick your crate:\n #1 - Common Case \n #2 - Uncommon Case \n #3 - Rare Case \n #4 - Legendary Case");
        System.out.println("\nType '#' and then the number of what case you want");
        System.out.println("Example: #'then the number of the case you want'");

        Scanner goOpenScanner = new Scanner(System.in);
        String goOpenString = goOpenScanner.nextLine();

        for (int i = 0; i < chooseCrateGo; i++) 
        {
            int rollChance = (int) (Math.random() * 1500);

            if (goOpenString.equals("#1")) 
            {
                System.out.println("You have picked a Common Case");
                Common commonCase = new Common();
                commonCase.setRollChance(rollChance);
                commonCase.roll();
            } 

            else if (goOpenString.equals("#2")) 
            {
                System.out.println("You have picked an Uncommon Case");
                Uncommon uncommonCase = new Uncommon();
                uncommonCase.setRollChance(rollChance);
                uncommonCase.roll();
            } 
            else if (goOpenString.equals("#3")) 
            {
                System.out.println("You have picked a Rare Case");
                Rare rareCase = new Rare();
                rareCase.setRollChance(rollChance);
                rareCase.roll();
            } 
            else if (goOpenString.equals("#4")) 
            {
                System.out.println("You have picked a Legendary Case");
                Legendary legendaryCase = new Legendary();
                legendaryCase.setRollChance(rollChance);
                legendaryCase.roll();
            } 
            else 
            {
                chooseCrateGo++;
            }
        }
    }

    // All the code for the crates
    public class Crates 
    {
        public int rollChance; // This is the value that I use to determine what item is rolled
        public String itemRolled; // This is the item that is rolled

        public void setRollChance(int rollChance)
        {
            this.rollChance = rollChance; // I haven't really ever used 'this' before, but its used to set the value of 'rollChance' to itself
        }

        public void roll() 
        {
            System.out.println("Roll Chance: " + rollChance); // Tells user what number they rolled
        }
    }

    // Common
    public class Common extends Crates 
    {
        
        public void roll() 
        {
            super.roll(); // used to get the super basic roll function from the parent class Crates, all it does is print the roll chance
            if (rollChance < 25) 
            {
                itemRolled = "Legendary Lochness Monster";
            } 
            else if (rollChance >= 25 && rollChance < 200) 
            {
                itemRolled = "Common Duck";
            } 
            else if (rollChance >= 200 && rollChance < 500) 
            {
                itemRolled = "Common Goose";
            } 
            else if (rollChance >= 500 && rollChance < 1000) 
            {
                itemRolled = "Boring Fish";
            } 
            else if (rollChance >= 1000 && rollChance < 1500) 
            {
                itemRolled = "Boring Turtle";
            }
            System.out.println(itemRolled); // Output the rolled item
        }
    }

    // Uncommon
    public class Uncommon extends Crates 
    {
        
        public void roll() 
        {
            super.roll();
            if (rollChance < 25) 
            {
                itemRolled = "Legendary Lochness Monster";
            } 
            else if (rollChance >= 25 && rollChance < 200) 
            {
                itemRolled = "Uncommon Duck";
            } 
            else if (rollChance >= 200 && rollChance < 500) 
            {
                itemRolled = "Uncommon Goose";
            } 
            else if (rollChance >= 500 && rollChance < 1000) 
            {
                itemRolled = "Common Goose";
            } 
            else if (rollChance >= 1000 && rollChance < 1500) 
            {
                itemRolled = "Common Duck";
            }
            System.out.println(itemRolled); // Output the rolled item
        }
    }

    // Rare
    public class Rare extends Crates 
    {
        
        public void roll() 
        {
            super.roll();
            if (rollChance < 25) 
            {
                itemRolled = "Legendary Lochness Monster";
            } 
            else if (rollChance >= 25 && rollChance < 200) 
            {
                itemRolled = "Rare Duck";
            } 
            else if (rollChance >= 200 && rollChance < 500) 
            {
                itemRolled = "Rare Goose";
            } 
            else if (rollChance >= 500 && rollChance < 1000) 
            {
                itemRolled = "Uncommon Goose";
            } 
            else if (rollChance >= 1000 && rollChance < 1500) 
            {
                itemRolled = "Uncommon Duck";
            }
            System.out.println(itemRolled); // Output the rolled item
        }
    }

    // Legendary
    public class Legendary extends Crates 
    {
        private String[] legendaryItems = {"Legendary Duck", "Legendary Goose", "Epic Duck", "Epic Goose", "Mythical Lochness Monster"}; // Wanted to add an array because I wanted to show I could do that as well!

        
        public void roll() 
        {
            super.roll();
            if (rollChance < 25) 
            {
                itemRolled = legendaryItems[4];
            } 
            else if (rollChance >= 25 && rollChance < 200) 
            {
                itemRolled = legendaryItems[3];
            } 
            else if (rollChance >= 200 && rollChance < 500) 
            {
                itemRolled = legendaryItems[2];

            } 
            else if (rollChance >= 500 && rollChance < 1000) 
            {
                itemRolled = legendaryItems[1];
            } 
            else if (rollChance >= 1000 && rollChance < 1500) 
            {
                itemRolled = legendaryItems[0];
            }
            System.out.println(itemRolled); // Output the rolled item
        }
    }
}

