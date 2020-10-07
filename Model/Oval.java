package Model;

import java.awt.Graphics2D;
import java.awt.Color;

public class Oval extends Shape {

    private float radius;

    public Oval(float x, float y, Color color, float radius){
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (radius*radius * Math.PI); //typecasting
    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(super.getColor()); //called from shape
        g2.drawOval((int)super.getX(), (int)super.getY(), (int)(radius*2), (int)(radius*2));
        // here we have to double the radius so that the circle will fit inside the "invisible box" that its actually placed in
        // see notes
        g2.fillOval((int)super.getX(), (int)super.getY(), (int)(radius*2), (int)(radius*2));
    }

    @Override
    public String toString(){
        return "[Circle:" + super.toString() + " r=" + radius+"]";

    }
}
