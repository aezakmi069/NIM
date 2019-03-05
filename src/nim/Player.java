/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

/**
 * An interface Player which implements 3 classes- Human,
 * BelowAverageComputer and SmartComputer.
 * @return Name the name of the player
 * @return moves the number of marbles removed from the pile by the player.
 * @author mona
 */
interface Player 
{

    public int move(int n);

    public String getName();
    
}
