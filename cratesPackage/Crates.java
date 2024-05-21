package cratesPackage;

public class Crates // where the code for crates will be located
{
    private String typeCase;

    public void toCase(String c)
    {
        typeCase = c;
    }
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