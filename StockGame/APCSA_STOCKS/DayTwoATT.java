import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayTwoATT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayTwoATT extends World
{

    /**
     * Constructor for objects of class DayTwoATT.
     * 
     */
    public DayTwoATT()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1);  
    }
    public void act()
    {
        Greenfoot.delay(300);
        String q=Greenfoot.ask("Please enter the word next to continue!");
        if (q.contains("next"))
        {
            Greenfoot.setWorld(new DayThreeATT());
        }
        else 
        {
          q=Greenfoot.ask("Please restart the program and enter you answer carefully next time"); 
        }    
    }
}