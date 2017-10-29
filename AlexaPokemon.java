import java.util.Random;

public class AlexaPokemon
{
  // Initialise pokmeon attributes
  private static String pokemonName = null;
  private static String attackName = null;
  private static int attackDamage = 0;
  private static int health = 10;

  public static void main(String[] args)
  {
    // Player: Alexa, I choose [pokemon1]
    Pokemon playerPokemon = createPokemon(true);

    // Alexa: I choose [pokemon2]
    Pokemon alexaPokemon = createPokemon(false);
    
    // Create Battle
    Battle battle = new Battle(playerPokemon, alexaPokemon);

    // Start Battle
    battle.beginBattle();

  } // main

  private static Pokemon createPokemon(boolean isPlayer)
  {
    if (isPlayer)
      pokemonAttributes(1);
    else
    {
      // Generate random pokemon out of 4 choices
      Random rand = new Random();
      int randomPokemon = rand.nextInt(5);
      pokemonAttributes(randomPokemon);
    }
    
    Attack attack = new Attack(attackName, attackDamage);
    return new Pokemon(pokemonName, attack, health);

  } // createPokemon

  private static void pokemonAttributes(int choosePokemon)
  {
    switch (choosePokemon)
    {
      case 1: // Charmander
            pokemonName = "Charmander";
            attackName = "Blaze";
            attackDamage = 2;
            break;

      case 2: // Squirtle
            pokemonName = "Squirtle";
            attackName = "Bubble Beam";
            attackDamage = 2;
            break;

      case 3: // Bulbasaur
            pokemonName = "Bulbasaur";
            attackName = "Razor Leaf";
            attackDamage = 2;
            break;

      case 4: // Pikachu
            pokemonName = "Pikachu";
            attackName = "Thunder Bolt";
            attackDamage = 2;
            break;

      default: pokemonName = null;
               attackName = null;
               attackDamage = 0;
               break;
    } // switch
  } // pokemonAttributes

} // AlexaPokemon