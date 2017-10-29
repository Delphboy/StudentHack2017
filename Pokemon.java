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

  public void setHealth(int newHealth)
  {
    health = newHealth;
  } // setHealth

  public String attackPokemon(Pokemon other)
  {
    // Damage dealt to other pokemon
    int newOtherHealth = other.getHealth() - ability.getDamage();
    if (newOtherHealth < 0)
      newOtherHealth = 0;
    other.setHealth(newOtherHealth);
    // Battle Message
    return this.pokemonName + " used " + ability.getAttackName() + " on " + other.getPokemonName() + "! "
                            + other.getPokemonName() + " has " + other.getHealth() + " health left!";
  } // attackPokemon

  public boolean isDead()
  {
    if (health <= 0)
      return true;

    return false;
  } // isDead

  public String toString()
  {
  	return pokemonName + " " + ability.getAttackName() + " " + health;
  } // toString
} // Pokemon