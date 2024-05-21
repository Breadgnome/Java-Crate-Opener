package cratesPackage;

public class Crates // where the code for crates will be located
{
    private String typeCase;
    private int itemsCaseCount = 10;
    
    // add array of the basic items in the crate
    public String[] createBasicItemsArray() 
    {
        String[] basicItems = {"Common Duck", "Common Goose", "Uncommon Goose", "Rare Goose", "Legendary Lochness Monster"};
    }

// common
public class Common extends Crates
{
    
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

}

public class RareCase extends Crates
{

}

public class LegendaryCase extends Crates
{

}