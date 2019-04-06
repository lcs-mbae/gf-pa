import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jungle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jungle extends World
{
  
    
    /**
     * Constructor for objects of class Jungle.
     * 
     */
    private int frames = 0;
    private monkey themonkey;
    
    public Jungle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        themonkey = new monkey();
        this.addObject(themonkey,400,530);
    }
    public void act()
    {
        time();
        frames = frames +1;
        
        
        
    }
    
    private void time()
    {
        if ((frames % 60) == 0)
        {
        String timeElapsed = Integer.toString(frames / 60);
        showText("Time:", 30,20);
        showText(timeElapsed, 80, 20); 
        }
    }
    
    
    
    
    
    
    
    
}
