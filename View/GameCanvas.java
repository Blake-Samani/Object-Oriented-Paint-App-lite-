package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.ArrayList;

import javax.swing.JPanel;


import Model.Oval;
import Model.Shape;


public class GameCanvas extends JPanel {

    private GamePanel panel;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public GameCanvas(GamePanel panel){
        this.panel = panel;
        setPreferredSize(new Dimension(500,500));
        setBackground((Color.black));

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Oval s = new Oval(105, 125, Color.GREEN, 150);
        s.render(g2);

        for(var k: shapes){
            k.render(g2);
        }
      

    }

    public ArrayList<Shape> getShapes(){
        return shapes;
    }
}
