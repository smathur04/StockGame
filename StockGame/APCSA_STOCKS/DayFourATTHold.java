import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayFourATTHold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayFourATTHold extends World
{

    /**
     * Constructor for objects of class DayFourATTHold.
     * 
     */
    public DayFourATTHold()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new ResultATT());
        }
    }
}
