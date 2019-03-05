/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.util.Scanner;

/**
 *This is a class for the player Human which implements the 
 * Player interface.
 * This class interacts with the user.
 * 
 * @author mona
 */
public class Human implements Player
{
    private String name;
      
    /**
     * Create a player - Human
     * @param name of the player.
     * @param moves the moveber of marbles selected by player.
     */
    
    public Human(String name)
    {
        this.name = name;
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
     * The number of marbles removed by the player.
     * @param numOfMarbles the number entered by the user.
     * @return num the number of marble removed by the player.
     */
    
    
    public int move(int numOfMarbles)
    {
        int x;
        Scanner input = new Scanner(System.in);
        do {
        	System.out.print("How many marbles to remove? ");
        	x = input.nextInt();
        } while (x < 1 || x > numOfMarbles/2);
      
        return x;
        
    }
    
}
