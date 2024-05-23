package cratesPackage;

public class Crates // where the code for crates will be located
{
    private String typeCase;
    private int itemsCaseCount = 10;
    private int rollChance;
    private String itemRolled;
    
    // add array of the basic items in the crate
    public String[] createBasicItemsArray() 
    {
        String[] basicItems = {"Common Duck", "Common Goose", "Uncommon Goose", "Rare Goose", "Legendary Lochness Monster"};

        private int rollChance = (int)(Math.random() * 1500)

        
    }

    // common
    public class Common extends Crates
    {
        public void setCommonRollChance()
        {
            if (rollChance < 25)
            {
                itemRolled = basicItems[4];
                System.out.println(itemRolled);
            }

            else if (rollChance > 25 && rollChance < 200)
            {
                itemRolled = basicItems[3];
                System.out.println(itemRolled);
            }

            else if (rollChance > 200 && rollChance < 500)
            {
                itemRolled = basicItems[2];
                System.out.println(itemRolled);
            }

            else if (rollChance > 500 && rollChance < 1000)
            {
                itemRolled = basicItems[1];
                System.out.println(itemRolled);
            }

            else if (rollChance > 1000 && rollChance < 1500)
            {
                itemRolled = basicItems[1];
                System.out.println(itemRolled);
            }
        }
    }

    public class CommonCase extends Common
    {
        
    }

    public class UncommonCase extends Common
    {

    }   

    // rare
    public class Rare extends Crates
    {
        public void setRareRollChance()
        {
            rollChance = (int)(Math.random() * 2500)
            if (rollChance < 25)
            {
                itemRolled = basicItems[4];
                System.out.println(itemRolled);
            }

            else if (rollChance > 25 && rollChance < 200)
            {
                itemRolled = basicItems[3];
                System.out.println(itemRolled);
            }

            else if (rollChance > 200 && rollChance < 500)
            {
                itemRolled = basicItems[2];
                System.out.println(itemRolled);
            }

            else if (rollChance > 500 && rollChance < 1000)
            {
                itemRolled = basicItems[1];
                System.out.println(itemRolled);
            }

            else if (rollChance > 1000 && rollChance < 1500)
            {
                itemRolled = basicItems[1];
                System.out.println(itemRolled);
            }
        }
    }

    public class RareCase extends Rare
    {

    }

    public class Legendary extends Crates
    {

    }

    public class LegendaryCase extends Legendary
    {

    }
}