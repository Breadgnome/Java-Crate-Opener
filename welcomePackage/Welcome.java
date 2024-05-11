package welcomePackage;

//importing the scanner
import java.util.Scanner;

//Welcome class that will welcome the user and ask a couple of questions
public class Welcome
{
    private boolean helpBoolean; // Apparently this has to be in the class level in order for all methods can access it, should of know LOL

    public void welcomeUser() throws InterruptedException // I just learned the throws function, this allows me to have a pause in time between printing, this gives it a nicer feel
    {
    //Main code used for the welcome class
    
        System.out.println("Welcome user, what is your name?");
        System.out.println();
        System.out.println("Type your name: ");

        //scanner name class
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();

        System.out.println("You may enter " + userName);

        Thread.sleep(1000); // this peice of code uses the thread method and pauses for 1 second, i learned this from online forums

        
        // This asks the person if they want help, they will type out "Help" or "Go"
        int helpLoop = 1;
        
        // This for loop is to make sure that the person types the right thing, if they don't it will repeat
        for (int i= 0; i < helpLoop; i++)
        {
            System.out.println("Would you like instructions? \nType 'Help' if you need help | Type 'Go' if you do not"); // \n breaks the lines up so I dont have to write a bunch of print functions
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

        if (helpBoolean)
        {
            showHelp();
        }
        

    }

    // Checks if user needs help
    public void showHelp()
    {
        System.out.println("I work");
    }

}

