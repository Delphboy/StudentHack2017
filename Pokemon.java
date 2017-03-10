public class Pokemon
{
  private final String pokemonName;
  private Attack pokemonAttack;
  private int health;

  public Pokemon(String requiredName, Attack requiredAttack, 
  	             int requiredHealth)
  {
    pokemonName = requiredName;
    pokemonAttack = requiredAttack;
    health = requiredHealth;
  } // Pokemon

  public String getPokemonName()
  {
    return pokemonName;
  } // getPokemonName

  public Attack getPokemonAttack()
  {
    return pokemonAttack;
  } // getPokemonAttack

  public int getHealth()
  {
  	return health;
  } // getHealth


} // Pokemon