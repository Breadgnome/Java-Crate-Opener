package cratesPackage;

public class Crates 
{
    private String typeCase;
    private int itemsCaseCount = 10;
    private int rollChance;
    private String itemRolled;

    // add array of the basic items in the crate
    public String[] basicItemsArray() 
    {
        String[] basicItems = {"Common Duck", "Common Goose", "Uncommon Goose", "Rare Goose", "Legendary Lochness Monster"};
        private int rollChance = (int) (Math.random() * 1500);
        return basicItems;
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

    public class CommonRoll extends Common 
    {
        public void roll() 
        {
            roll();
        }
    }

    public class UncommonCase extends Common 
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

    public class RareCase extends Common 
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

    public class Legendary extends Crates 
    {
        // add new items to the legendary crate
        String[] legendaryItems = {"Legendary Duck", "Legendary Goose", "Epic Duck", "Epic Goose", "Mythical Lochness Monster"};

        // add a roll function for the legendary case
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

    public class RareRoll extends RareCase 
    {
        public void roll() 
        {
            roll(); 
        }
    }

    public class LegendaryRoll extends Legendary
    {
        public void roll() 
        {
            roll(); 
        }
    }
    
}