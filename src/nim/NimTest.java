/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;


import java.util.Scanner;

/**
 * File : NimTest.java
 * This program tests the Nim class.
 * This class asks the user's name and who plays first.
 * This method calls the play(() method.
 * It returns the name of the winner at the end of the game.
 * After each game, it asks if the user wants to play again.
 * This class creates the player object and the Nim object.
 * 
 * @author mona
 */
public class NimTest 
{
    public static void main(String[] args) 
    {
        String answer;
       
        do
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose players by selecting a number");
            System.out.println("1. SmartComputer" + "\n" + 
                    "2. BelowAverageComputer" + "\n" + "3. Human");
            
            // Declare two players.
            Player A;
            Player B;
            
            // Create Player A
            System.out.print("First Player: ");
            int playerA = scan.nextInt();
            if (playerA == 1) 
            {
            	A = new SmartComputer();
            }
            else if (playerA == 2)
            {
            	A = new BelowAverageComputer();
            }
            else
            {
            	System.out.print("Choose Your Name, Human : ");
            	String usrName = scan.next();
            	A = new Human(usrName);
            }
            
            
            // Create Player B
            System.out.print("Second Player : ");
            int playerB = scan.nextInt();
            if (playerB == 1) 
            {
            	B = new SmartComputer();
            }
            else if (playerB == 2)
            {
            	B = new BelowAverageComputer();
            }
            else
            {
            	System.out.print("Choose Your Name, Human : ");
            	String usrName = scan.next();
            	B = new Human(usrName);
            }
            
            // Start a game of NIM
            Nim gameTime = new Nim(A,B);
            gameTime.play();
            
            
           
           
            
            
                    
                    
           System.out.println("Do you want to play again ? "
                + "Enter 'Y' if yes.");
           answer = scan.next();       
            
        } while (answer.equalsIgnoreCase("Y"));
        
                
    }
    
}
