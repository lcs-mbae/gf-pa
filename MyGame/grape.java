import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class grape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grape extends Actor
{
    /**
     * Act - do whatever the grape wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Monkey.class))
        {
        getWorld().showText("You Won", 450,300);
        Greenfoot.stop();
        }
    }    
}
