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
    private Monkey themonkey;
    
    public Jungle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        themonkey = new Monkey();
        this.addObject(themonkey,400,530);
        
    }
    public void act()
    {
        time();
        frames = frames +1;
        if (frames < 9)
        {
            Line();
        }
        
        
       
        
        
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
    private void Line()
    {
        int x =100 * frames;
        FirstFood(x);
        SecondFood(x);
        ThirdFood(x);
        FourthFood(x);
        FifthFood(x); 
    }
    
    
    private void FirstFood(int x)
    {
        int y = 100 * frames;
        int selection = Greenfoot.getRandomNumber(2);
        if (selection == 0)
        {
           addObject(new Banana(), x,y);
        }
        if (selection == 1)
        {
            addObject(new Worm(), x, y);
        }
        
    }
    private void SecondFood(int x)
    {
        int y = 200;
        int selection = Greenfoot.getRandomNumber(2);
        if (selection == 0)
        {
           addObject(new Banana(), x,y);
        }
        if (selection == 1)
        {
            addObject(new Worm(), x, y);
        }
        
    }
    private void ThirdFood(int x)
    {
        int y = 300;
        int selection = Greenfoot.getRandomNumber(2);
        if (selection == 0)
        {
           addObject(new Banana(), x,y);
        }
        if (selection == 1)
        {
            addObject(new Worm(), x, y);
        }
        
    }
    private void FourthFood(int x)
    {
        int y = 400;
        int selection = Greenfoot.getRandomNumber(2);
        if (selection == 0)
        {
           addObject(new Banana(), x,y);
        }
        if (selection == 1)
        {
            addObject(new Worm(), x, y);
        }
        
    }
    private void FifthFood(int x)
    {
        int y = 500;
        int selection = Greenfoot.getRandomNumber(2);
        if (selection == 0)
        {
           addObject(new Banana(), x,y);
        }
        if (selection == 1)
        {
            addObject(new Worm(), x, y);
        }
        
    }
    
    
    
    
    
    
    
    
}
