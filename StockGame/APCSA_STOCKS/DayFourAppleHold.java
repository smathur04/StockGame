import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayFourAppleHold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayFourAppleHold extends World
{

    /**
     * Constructor for objects of class DayFourAppleHold.
     * 
     */
    public DayFourAppleHold()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new ResultApple());
        }
    }
}
