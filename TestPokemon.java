public class TestPokemon
{
  public static void main(String[] args)
  {
  	Attack blaze = new Attack("Blaze", 5);
  	Attack bubbleBeam = new Attack("Bubble Beam", 5);
  	Attack razorLeaf = new Attack("Razor Leaf", 5);
  	Attack thunderBolt = new Attack("Thunder Bolt", 5);

  	Pokemon charizard = new Pokemon("Charizard", blaze, 10);
  	Pokemon squirtle = new Pokemon("Squirtle", bubbleBeam, 10);
  	Pokemon bulbasaur = new Pokemon("Bulbasaur", razorLeaf, 10);
  	Pokemon pikachu = new Pokemon("Pikachu", thunderBolt, 10);
		
    System.out.println(charizard.attackPokemon(squirtle));
		System.out.println(bulbasaur.attackPokemon(pikachu));


  }
}