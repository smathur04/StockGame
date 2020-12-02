import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayFiveStarbucksApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayFiveStarbucksApple extends World
{

    /**
     * Constructor for objects of class DayFiveStarbucksApple.
     * 
     */
    public DayFiveStarbucksApple()
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
            System.out.println("Major global events can cause the stock market to respond dramatically in either direction.");
            System.out.println("Market crashes can cause many people to sell their owned stocks, further lowering the value of the stock.");
            System.out.println("Although the prices will fall quickly, they will rebound some time in the future.");
        }
        else if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new DaySixStarbucksApple());
        }
        else if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new DaySixStarbucks());
        }
    }
}
