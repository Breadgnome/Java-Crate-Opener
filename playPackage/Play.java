package playPackage;

//importing the scanner
import java.util.Scanner;

import cratesPackage.Crates;

//Welcome class that will welcome the user and ask a couple of questions
public class Play
{
    private boolean helpBoolean; // Apparently this has to be in the class level in order for all methods can access it, should of know LOL
    private int helpLoop = 1;
    private int helpLoopGo = 1;
    private int chooseCrateGo =1;

    public void welcomeUser() throws InterruptedException // I just learned the throws function, this allows me to have a pause in time between printing, this gives it a nicer feel
    {
    //Main code used for the welcome class
    
        System.out.println("Welcome user, what is your name?");
        System.out.println();
        System.out.println("Type your name: ");

        //scanner name class
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();

        if (userName.equals("Ernesto")) // Ernesto cannot enter
        {
            System.out.print("You may not enter Ernesto");
            return;
        }
        else
        {
        System.out.println("You may enter " + userName);
        }   

        Thread.sleep(1000); // this peice of code uses the thread method and pauses for 1 second, i learned this from online forums

        
        // This asks the person if they want help, they will type out "Help" or "Go"
        
        
        // This for loop is to make sure that the person types the right thing, if they don't it will repeat
        for (int i= 0; i < helpLoop; i++)
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
                helpLoop ++;
            }
        }

        if (helpBoolean == true)
        {
            showHelp();
        }

        else if(helpBoolean == false)
        {
            goOpen();
        }

    }

    // Checks if user needs help
    public void showHelp()
    {
        System.out.println("\nShowing 'Help'\n#1: How to pick the crate you want\n- You will be prompted...");
        
        for (int i= 0; i < helpLoopGo; i++)
        {
            System.out.println("Type 'Go' to move on\n");
            Scanner helpScannerGo = new Scanner(System.in);
            String helpStringGo = helpScannerGo.nextLine();

            if (helpStringGo.equals("Go"))
            {
                goOpen();
            }

            else
            {
                helpLoopGo ++;
            }
        }
        
    }

    public void goOpen()
    {
        System.out.println("Pick your crate:\n #1 - Common Case \n #2 - Uncommon Case \n #3 - Rare Cares \n #4 - Legendary Case");
        System.out.println("\nType '#' and then the number of what case you want");
        System.out.println("Example: #1");

        Scanner goOpenScanner = new Scanner(System.in);
        String goOpenString = goOpenScanner.nextLine();

        for (int i= 0; i < chooseCrateGo; i++)
        {
            if (goOpenString.equals("#1"))
            {
                System.out.println("You have picked a Common Case");
            }

            else if (goOpenString.equals("#2"))
            {
                System.out.println("You have picked an Uncommon Case");
            }

            else if (goOpenString.equals("#3"))
            {
                System.out.println("You have picked a Rare Case");
            }

            else if (goOpenString.equals("#4"))
            {
                System.out.println("You have picked a Legendary Case");
            }

            else
            {
                helpLoopGo ++;
            }
        }

        
    }
}

