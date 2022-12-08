package ExampleLab;
import java.awt.*;
import java.applet.*;

// The class that draws my project
public class FlowerField extends Applet{
    public void paint(Graphics g){
        Background.drawBackground(g,200,500);
        Background.drawBackground(g,270,500);
        Background.drawBackground(g,340,500);
        Background.drawBackground(g,410,500);
        Background.drawBackground(g,480,500);



        Clouds.drawHappyCloud(g);
        Clouds.drawAngryCloud(g);
        Clouds.drawSadCloud(g);

        Flower.drawPetals(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
        Flower.drawRoots(g);
    }

}
