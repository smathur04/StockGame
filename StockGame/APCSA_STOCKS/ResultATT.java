import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResultATT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResultATT extends World
{

    /**
     * Constructor for objects of class ResultATT.
     * 
     */
    public ResultATT()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Review());
        }
    }
}