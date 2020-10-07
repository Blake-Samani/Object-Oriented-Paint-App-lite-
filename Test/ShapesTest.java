package Test;

import java.util.ArrayList;
import java.awt.Color;

import Model.Block;
import Model.Oval;
import Model.Shape;


public class ShapesTest {
    

    public static void main(String[] args){
        float f1 = 1+0.01f+.01f+.01f+.01f+.01f;
        Oval c1 = new Oval(f1, 1, Color.white, 2);
        assert isEqual(c1.getX(), 1.05f);
        assert isEqual(c1.getArea(), (float)(2*2*Math.PI));

        Block r1 = new Block(10, 12.5F, Color.red, 5, 7);
        assert isEqual(r1.getArea(), (float)(5*7));
        assert isEqual(12.5F, r1.getY());

    
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Oval(0, 0, Color.white, 1));
        shapes.add(new Oval(1, 1, Color.white, 2));
        shapes.add(new Block(10, 10, Color.white, 5,5));

        for(var s: shapes){
            System.out.println(s.toString()); //prints as string // polymorphism// the toString function will be called upon each shape from their overidden functions
        }
    }

    public static boolean isEqual(float x, float y){ // how to compare two floating point numbers // compare difference abs value to a very small number
        final float SMALL = 0.00000001f;
        if (Math.abs(x-y) < SMALL) {
            return true;
        }
            else{
                return false;
            }
        
     }
    }

