import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld class directs the user based on their response 
 * 
 * @author (your name) 
 * @version 11292020
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        //Interact with the user and based on the user response, display the message/instantiate an object of class Instructions
        Greenfoot.delay(100);
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes"))
        {
            Greenfoot.setWorld(new Instructions());
        }
        else 
        {
          q=Greenfoot.ask("Please restart the program and enter you answer carefully"); 
        }    
    }
}
