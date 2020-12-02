import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
