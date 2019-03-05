/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

/**
 * Nim conducts the game between all the players by calling the move method
 * for each player polymorphically.
 * @author mona
 */
public class Nim
{
    Player A; // First player
    Player B; // Second player
    private int move;
   /**
    * Constructs a Nim object
    */
   public Nim(Player X, Player Y)
   {
       this.A = X;
       this.B = Y;
   }
   
   /**
    * This method conducts the game and returns the winner's name at the end.
    * This method calls the move method and implements it polymorphically for 
    * each class.
    * @return winner the name of the winner
    */
   public String play()
   {
       int turn = 0; // Decides who is gets to remove the marbles
       
       // Create a pile object
       Pile p = new Pile();
       int marblesTaken = 0;
       String player;
       while(p.getMarbles() > 1)
       {
           
           if (turn % 2 == 0)
           {
               marblesTaken = A.move(p.getMarbles());
               player = A.getName();
           }
           else
           {
               marblesTaken = B.move(p.getMarbles());
               player = B.getName();
           }
           p.setMarbles(p.getMarbles() - marblesTaken);
           turn++ ;  // Increment turn by 1.
           
           System.out.printf("%s removed %d marbles\nRemaining marbles : %d\n", player, marblesTaken, p.getMarbles() );
       }
       if (turn % 2 == 0)
       {
           return A.getName();
       }
       else
       {
           return B.getName();
       }
   }
}
