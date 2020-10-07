package Controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Model.Block;
import Model.Oval;
import Model.Shape;
import View.GamePanel;
import View.MenuScreen;
import View.GamePanel.GameState;

import java.awt.event.ActionEvent;

public class ShapeListener implements ActionListener, MouseListener {

    private GamePanel panel;
    private Color color = Color.WHITE;
    private int size = 0;

    public ShapeListener(GamePanel panel){
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
       
        if(source == panel.getExitButton()){
            JFrame window = panel.getWindow();
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        } else if (source == panel.getClearButton()){
            panel.getCanvas().getShapes().clear();
            panel.getCanvas().repaint();
        } else if (source == panel.getRedButton()){
            color = Color.red;
        } else if (source == panel.getPinkButton()){
            color = Color.pink;
        } else if (source == panel.getOrangeButton()){
            color = Color.orange;
        } else if (source == panel.getGreenButton()){
            color = Color.green;
        } else if (source == panel.getwhiteButton()){
            color = Color.white;
        } else if (source == panel.getSmallButton()){
            size = 0;
        } else if (source == panel.getLargeButton()){
            size = 1;
        } else if (source == panel.getBlockButton()){
            panel.setGameState(GameState.BLOCK);
        } else if (source == panel.getOvalButton()){
            panel.setGameState(GameState.OVAL);
        }


    }


    @Override
    public void mousePressed(MouseEvent e) {
        if(panel.getGameState() == GameState.BLOCK){
            if(size == 0){
               Shape b = new Block(e.getX(), e.getY(), color, 25 , 25);
               panel.getCanvas().getShapes().add(b);
            } else if (size == 1) {
                Shape b = new Block(e.getX(), e.getY(), color, 50 , 50);
                panel.getCanvas().getShapes().add(b);
            }
        }else if (panel.getGameState() == GameState.OVAL){
            if(size == 0){
                Shape o = new Oval(e.getX(), e.getY(), color, 25);
                panel.getCanvas().getShapes().add(o);
            }else if (size == 1){
                Shape o = new Oval(e.getX(),e.getY(), color, 50);
                panel.getCanvas().getShapes().add(o);
            }
        }
        panel.getCanvas().repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }
    
}
