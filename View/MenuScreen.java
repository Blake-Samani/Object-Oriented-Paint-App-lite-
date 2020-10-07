package View;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {
    
    JFrame window;

    public MenuScreen(JFrame window){
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(1,1));
        menuPanel.setPreferredSize(new Dimension(400, 200));

        JButton startButton = new JButton("Draw a face :D");
        
        menuPanel.add(startButton);
        

        cp.add(BorderLayout.CENTER, menuPanel);

        startButton.addActionListener(event ->{
            window.getContentPane().removeAll();
            var panel = new GamePanel(window);
            panel.init();
            window.pack();
            window.revalidate();
        });
    }
}