public class Runner
{
  public static void main(String[] args) 
  {
    Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric", 120);
    pikachu.SetMove(1, "Quick Attack", 10, "Normal");
    pikachu.SetMove(2, "Thunderbolt", 30, "Electric");
    pikachu.SetMove(3, "Thunderwave", 15, "Electric");
    pikachu.SetMove(4, "Thunder", 55, "Electric");

    Pokemon squirtle = new Pokemon("Squirtle", 4, "Water", 100);
    squirtle.SetMove(1, "Quick Attack", 10, "Normal");
    squirtle.SetMove(2, "Watergun", 30, "Water");
    squirtle.SetMove(3, "Hydro Pump", 50, "Water");
    squirtle.SetMove(4, "Earthquake", 55, "Ground");
    
    introPrintOut(pikachu, squirtle);

    //TODO: Set all of this to loop
    if(pikachu.getSpeed() >= squirtle.getSpeed())
    {
        pikachu.Attack(squirtle, 4);
    }
    else if(squirtle.getSpeed() >= pikachu.getSpeed())
    {
        squirtle.Attack(pikachu, 4);
    }

    pikachu.checkHealth();
    squirtle.checkHealth();
  }

  public static void introPrintOut(Pokemon pokemon1, Pokemon pokemon2)
  {
    System.out.println("It's "+pokemon1.getName() + " vs. " + pokemon2.getName() + "!");
    System.out.println(pokemon1.getName() + ": " + pokemon1.getHealth() + " HP!");
    System.out.println(pokemon2.getName() + ": " + pokemon2.getHealth() + " HP!");
  }

} 
