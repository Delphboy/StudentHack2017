
/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int damage;

    /**
     * Constructor for objects of class Attack
     */
    public Attack(String attackName, int damage)
    {
        this.attackName = attackName;
        this.damage = damage;
    }
    
    /**
     * method to see damage
     */
    public int getDamage()
    {
        return damage;
    }
    
    /**
     * method to see the name of the attack
     */
    public String getAttackName()
    {
        return attackName;
    }
    
    /**
     * method to change the damage 
     */
    public void newDamage(int newDamage)
    {
        damage = newDamage;
    }
}
