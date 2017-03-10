public class Pokemon
{
  private final String pokemonName;
  private Attack ability;
  private int health;

  public Pokemon(String requiredName, Attack requiredAttack, 
  	             int requiredHealth)
  {
    pokemonName = requiredName;
    ability = requiredAttack;
    health = requiredHealth;
  } // Pokemon

  public String getPokemonName()
  {
    return pokemonName;
  } // getPokemonName

  public Attack getAbility()
  {
    return ability;
  } // getability

  public int getHealth()
  {
  	return health;
  } // getHealth


} // Pokemon