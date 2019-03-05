/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

/**
 * This is a class for the player SmartComputer which implements the 
 Player interface.
 * This class removes exactly enough marbles to make the remaining pile size
 * a power of two minus one.
 * @author mona
 */
public class SmartComputer implements Player
{
    private String name;
  
    
    /**
     * Create a player - BelowAverageComputer
     * @param name of the player.
     * @param num the number of marbles removed by player.
     */
    
    public SmartComputer()
    {
        this.name = "SmartComputer";
    }
    
    /**
     * Get the name of the player.
     * @return the name
     */
    public String getName()
    {
        return this.name ;
    }
    
       
    
    public int move(int numOfMarbles)
    {
        return 1;
    }
    
}
