/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.util.Random;

/**
 *
 * @author mona
 */
public class Pile 
{

    private int marbles; // Number of marbles in a pile
    Random generator = new Random(); // creates a random number
    private final int MAX = 100 ; // maximum pile size
    
    /**
     * Creates a pile of random number of marbles
     * @param marbles the number of marbles
     */
    
    public Pile()
    {
        this.marbles = generator.nextInt(MAX - 10 + 1) + 1;
    }
    /**
     * Gets the number of marbles in the pile.
     * @return marbles the number of marbles in the pile.
     */
    public int getMarbles()
    {
        return marbles;
    }
    
    /**
     * Sets the number of remaining marbles in the pile.
     * @param m the number of marbles remaining.
     */
    public void setMarbles(int m)
    {
        this.marbles = m;
    }
            
}
