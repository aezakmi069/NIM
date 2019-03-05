/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;
import java.util.Random;

/**
 * A player - BelowAverageComputer that removes a random number of marbles
 * between 1 and n / 2 each turn.
 * @author mona
 */
public class BelowAverageComputer implements Player
{
    private String name;
    private Random generator = new Random();
    
    /**
     * Create a player - BelowAverageComputer
     * @param name of the player.
     */
    
    public BelowAverageComputer()
    {
        this.name = "BelowAverageComputer";
    }
    
    /**
     * Get the name of the player.
     * @return the name
     */
    public String getName()
    { 
        return this.name ;
    }
    
    /**
     * Gets the number of marbles removed by the player.
     * @param marbles the number of marbles in the pile.
     * @return num the number of marble removed by the player.
     */
    
    public int move(int marbles)
    {
        int n = marbles / 2 ; // half the number of marbles in the pile
        int num = generator.nextInt(n - 10 + 1) + 1 ; 
        return num;
    }
    
}

