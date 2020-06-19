public class Pokemon
{
    private String name;
    private int number; //throws a warning, as it's not actually used anywhere. eh
    private int speed;
    private String type; //would use an enumerator (or even array) but we aren't there yet.

    private String weakness;

    private double health;
    //can include more stats if interested here.

    public Moves move01;
    public Moves move02;
    public Moves move03;
    public Moves move04;

    public Pokemon(String inName, int inNumber, String inType, int inSpeed)
    {
        name = inName;
        number = inNumber;
        type = inType;
        SetWeakness(inType);
        health = 100.0;
        speed = inSpeed;
    }

    public void SetMove(int moveNumber, String inName, int inDamage, String inType)
    {
        if(moveNumber == 1)
        {
            move01 = new Moves(inName, inDamage, inType);
        }
        else if(moveNumber == 2)
        {
            move02 = new Moves(inName, inDamage, inType);
        }
        else if(moveNumber == 3)
        {
            move03 = new Moves(inName, inDamage, inType);
        }
        else if(moveNumber == 4)
        {
            move04 = new Moves(inName, inDamage, inType);
        }
        else
        {
            //TODO: Error
        }
    }
    private void SetWeakness(String inType)
    {
        if(inType.equals("Electric"))
        {
            weakness = "Ground";
        }
        else if(inType.equals("Water"))
        {
            weakness = "Electric";
        }
        //TODO: automatically set the rest of the weakness based on inType
    }

    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }
    public String getWeakness()
    {
        return this.weakness;
    }
    public double getHealth()
    {
        return this.health;
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public void loseHealth(int inDamage)
    {
        this.health -= inDamage;
    }
    public void checkHealth()
    {
        if(this.health <= 0)
        {
            System.out.println(this.name + " loses!");
        }
    }
    
    public void Attack(Pokemon enemyPokemon, int moveNumber)
    {
        if(moveNumber == 1)
        {
            if(move01.getUsesLeft() > 0)//check if you can use the move
            {
                System.out.println(this.name + " uses " + move01.getName());

                if(enemyPokemon.getWeakness().equals(move01.getType()))
                {
                    enemyPokemon.loseHealth(move01.getDamage()*2);
                    System.out.println("It hits for " + move01.getDamage()*2);
                    System.out.println("It's Super Effective");
                }
                else
                {
                    enemyPokemon.loseHealth(move01.getDamage());
                    System.out.println("It hits for " + move01.getDamage());
                }
                
            }
        }
        else if(moveNumber == 2)
        {
            if(move02.getUsesLeft() > 0)//check if you can use the move
            {
                System.out.println(this.name + " uses " + move02.getName());

                if(enemyPokemon.getWeakness().equals(move02.getType()))
                {
                    enemyPokemon.loseHealth(move02.getDamage()*2);
                    System.out.println("It hits for " + move02.getDamage()*2);
                    System.out.println("It's Super Effective");
                }
                else
                {
                    enemyPokemon.loseHealth(move02.getDamage());
                    System.out.println("It hits for " + move02.getDamage());
                }
            }
        }
        else if(moveNumber == 3)
        {
            if(move03.getUsesLeft() > 0)//check if you can use the move
            {
                System.out.println(this.name + " uses " + move03.getName());

                if(enemyPokemon.getWeakness().equals(move03.getType()))
                {
                    enemyPokemon.loseHealth(move03.getDamage()*2);
                    System.out.println("It hits for " + move03.getDamage()*2);
                    System.out.println("It's Super Effective");
                }
                else
                {
                    enemyPokemon.loseHealth(move03.getDamage());
                    System.out.println("It hits for " + move03.getDamage());
                }
            }
        }
        else if(moveNumber == 4)
        {
            if(move04.getUsesLeft() > 0)//check if you can use the move
            {
                System.out.println(this.name + " uses " + move04.getName());

                if(enemyPokemon.getWeakness().equals(move04.getType()))
                {
                    enemyPokemon.loseHealth(move04.getDamage()*2);
                    System.out.println("It hits for " + move04.getDamage()*2);
                    System.out.println("It's Super Effective");
                }
                else
                {
                    enemyPokemon.loseHealth(move04.getDamage());
                    System.out.println("It hits for " + move04.getDamage());
                }
            }
        }
    }
}