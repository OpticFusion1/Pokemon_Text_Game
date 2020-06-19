public class Moves {
    private String name;
    private int damage;
    private String type;
    private int availableUses;

    public Moves(String inName, int inDamage, String inType)
    {
        name = inName;
        damage = inDamage;
        type = inType;
        availableUses = 5;

        
    }
    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }
    public int getDamage()
    {
        return this.damage;
    }
    public int getUsesLeft()
    {
        return this.availableUses;
    }
}