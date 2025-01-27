/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square fuselage;
    private Square hatch;
    private Triangle nose;
    private Circle sun;
    private Circle moon;
    private Triangle boosterL;
    private Triangle boosterR;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        fuselage = new Square();
        hatch = new Square();
        nose = new Triangle();  
        sun = new Circle();
        moon = new Circle();
        boosterL = new Triangle();
        boosterR = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            fuselage.moveHorizontal(-140);
            fuselage.moveVertical(20);
            fuselage.changeSize(120);
            fuselage.makeVisible();
            
            hatch.changeColor("black");
            hatch.moveHorizontal(-100);
            hatch.moveVertical(40);
            hatch.changeSize(50);
            hatch.makeVisible();
    
            
            nose.changeColor("red");
            nose.changeSize(60, 115);
            nose.moveHorizontal(20);
            nose.moveVertical(-60);
            nose.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            moon.changeColor("magenta");
            moon.moveHorizontal(-200);
            moon.moveVertical(-79);
            moon.makeVisible();
            
            boosterL.changeColor("black");
            boosterL.moveHorizontal(-50);
            boosterL.moveVertical(80);
            boosterL.makeVisible();
            
            boosterR.changeColor("black");
            boosterR.moveHorizontal(80);
            boosterR.moveVertical(80);
            boosterR.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        fuselage.changeColor("black");
        hatch.changeColor("white");
        nose.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        fuselage.changeColor("red");
        hatch.changeColor("black");
        nose.changeColor("green");
        sun.changeColor("yellow");
    }
}
