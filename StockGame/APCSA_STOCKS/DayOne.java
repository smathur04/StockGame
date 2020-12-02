import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayOne extends World
{

    /**
     * Constructor for objects of class DayOne.
     * 
     */
    public DayOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        if (Greenfoot.isKeyDown("enter"))
        {
            System.out.println("IMPORTANT TIPS:");
            System.out.println("Stocks that have been trending down for a long time are likely to shoot back up!");
            System.out.println("Stocks that have been trending up for a long time are likely to shoot back down!");
        }
        else if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new DayTwoApple());
        }
        else if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new DayTwoATT());
        }
    }
}
