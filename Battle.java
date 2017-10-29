
/**
 * Write a description of class Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battle
{
  // instance variables - replace the example below with your own
  private Pokemon playerPokemon;
  private Pokemon alexaPokemon;

  /**
   * Constructor for objects of class Battle
   */
    public Battle(Pokemon playerPokemon, Pokemon alexaPokemon)
    {
      this.playerPokemon = playerPokemon;
      this.alexaPokemon = alexaPokemon;
    }
    
    /**
     * 
     */
    public void beginBattle()
    {    
      while(playerPokemon.getHealth() > 0 && alexaPokemon.getHealth() > 0)
      {
        System.out.println(playerPokemon.attackPokemon(alexaPokemon));
        if(alexaPokemon.isDead())
        {   
          System.out.println(alexaPokemon.getPokemonName() + " has fainted!");
          System.out.println(playerPokemon.getPokemonName()+" Wins!");
          break;
        }   

        System.out.println(alexaPokemon.attackPokemon(playerPokemon));

        if(playerPokemon.isDead())
        {
          System.out.println(playerPokemon.getPokemonName() + " has fainted!");
          System.out.println(alexaPokemon.getPokemonName()+" Wins!");                
          break;
        }
      }
    }
  }
