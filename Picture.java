/**
 * This class represents a picture of an astronaut inside of a rocket ship
 * in space with the sun and the moon in the background.
 * 
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Alessandro Marucci
 * @version 2025.02.02
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
    private Person astronaut;
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
        astronaut = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            moon.changeColor("magenta");
            moon.moveHorizontal(-200);
            moon.moveVertical(-79);
            moon.makeVisible();
            
            nose.changeColor("red");
            nose.changeSize(60, 115);
            nose.moveHorizontal(20);
            nose.moveVertical(-100);
            nose.makeVisible();
            
            fuselage.moveHorizontal(-140);
            fuselage.moveVertical(-20);
            fuselage.changeSize(120);
            fuselage.makeVisible();
            
            hatch.changeColor("blue");
            hatch.moveHorizontal(-120);
            hatch.moveVertical(-10);
            hatch.changeSize(80);
            hatch.makeVisible();
            
            astronaut.changeColor("green");
            astronaut.moveHorizontal(-50);
            astronaut.moveVertical(-50);
            astronaut.makeVisible();
            
            boosterL.changeColor("black");
            boosterL.moveHorizontal(-40);
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
        moon.changeColor("black");
        boosterL.changeColor("black");
        boosterR.changeColor("black");
        astronaut.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        fuselage.changeColor("red");
        hatch.changeColor("blue");
        nose.changeColor("red");
        sun.changeColor("yellow");
        moon.changeColor("magenta");
        boosterL.changeColor("black");
        boosterR.changeColor("black");
        astronaut.changeColor("green");
    }
}
