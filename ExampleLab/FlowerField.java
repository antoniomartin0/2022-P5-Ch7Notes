package ExampleLab;
import java.awt.*;
import java.applet.*;

// The class that draws my project
public class FlowerField extends Applet{
    public void paint(Graphics g){
        Background.drawGround(g);
        Background.drawSky(g);

        Clouds.drawHappyCloud(g);
        Clouds.drawAngryCloud(g);
        Clouds.drawSadCloud(g);

        Flower.drawPetals(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
        Flower.drawRoots(g);
    }

}
