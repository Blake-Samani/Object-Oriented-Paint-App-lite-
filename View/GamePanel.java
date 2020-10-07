package View;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;


import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import Controller.ShapeListener;



public class GamePanel {

    public enum GameState {
        BLOCK, OVAL, READY
    }

    private JFrame window;
    private GameCanvas canvas;

    private JRadioButton blockButton = new JRadioButton("Block");
    private JRadioButton ovalButton = new JRadioButton("Oval");
    private JRadioButton orangeButton = new JRadioButton("Orange");
    private JRadioButton greenButton = new JRadioButton("Green");
    private JRadioButton redButton = new JRadioButton("Red");
    private JRadioButton whiteButton = new JRadioButton("White");
    private JRadioButton pinkButton = new JRadioButton("Pink");
    private JRadioButton smallButton = new JRadioButton("Small");
    private JRadioButton largeButton = new JRadioButton("Large");

    private JButton clearButton = new JButton("Clear");
    private JButton exitButton = new JButton("Exit");
    private GameState gameState = GameState.READY;
    


    public GamePanel(JFrame window){
        this.window = window;
    }

    public void init(){
        Container cp = window.getContentPane();

        JPanel southPanel = new JPanel();
        JPanel topsouthPanel = new JPanel();
        JPanel centersouthPanel = new JPanel();
        JPanel bottomsouthPanel = new JPanel();

        southPanel.setLayout(new GridLayout(3,1));
       
        topsouthPanel.add(blockButton);
        topsouthPanel.add(ovalButton);
        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(blockButton);
        shapeGroup.add(ovalButton);
        TitledBorder title = BorderFactory.createTitledBorder("Shapes"); // javaxswing package //border object we can use
        topsouthPanel.setBorder(title);

        centersouthPanel.add(orangeButton);
        centersouthPanel.add(greenButton);
        centersouthPanel.add(redButton);
        centersouthPanel.add(whiteButton);
        centersouthPanel.add(pinkButton);
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(orangeButton);
        colorGroup.add(greenButton);
        colorGroup.add(redButton);
        colorGroup.add(whiteButton);
        colorGroup.add(pinkButton);
        TitledBorder title1 = BorderFactory.createTitledBorder("Color"); // javaxswing package //border object we can use
        centersouthPanel.setBorder(title1);

        bottomsouthPanel.add(clearButton);
        bottomsouthPanel.add(exitButton);
        bottomsouthPanel.add(smallButton);
        bottomsouthPanel.add(largeButton);

        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallButton);
        sizeGroup.add(largeButton);
      

        southPanel.add(topsouthPanel);
        southPanel.add(centersouthPanel);
        southPanel.add(bottomsouthPanel);
        cp.add(BorderLayout.SOUTH, southPanel);
      
        canvas = new GameCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        ShapeListener listener = new ShapeListener(this);

        blockButton.addActionListener(listener);
        ovalButton.addActionListener(listener);
        clearButton.addActionListener(listener);
        exitButton.addActionListener(listener);
        greenButton.addActionListener(listener);
        redButton.addActionListener(listener);
        whiteButton.addActionListener(listener);
        pinkButton.addActionListener(listener);
        orangeButton.addActionListener(listener);
        smallButton.addActionListener(listener);
        largeButton.addActionListener(listener);
        canvas.addMouseListener(listener);
        

    }

    public JRadioButton getBlockButton(){
        return blockButton;
    }

    public JRadioButton getOvalButton(){
        return ovalButton;
    }

    public JRadioButton getOrangeButton(){
        return orangeButton;
    }

    public JRadioButton getRedButton(){
        return redButton;
    }

    public JRadioButton getPinkButton(){
        return pinkButton;
    }

    public JRadioButton getGreenButton(){
        return greenButton;
    }

    public JRadioButton getwhiteButton(){
        return whiteButton;
    }

    public JButton getExitButton(){
        return exitButton;
    }

    public JButton getClearButton(){
        return clearButton;
    }

    public JRadioButton getSmallButton(){
        return smallButton;
    }

    public JRadioButton getLargeButton(){
        return largeButton;
    }



    public JFrame getWindow(){
        return window;
    }

    public GameCanvas getCanvas(){
        return canvas;
    }

    public void setGameState(GameState state){
        this.gameState = state;
    }

    public GameState getGameState(){
        return gameState;
    }
}
