package main;

import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this is to allow player to exit out of game when they press x
        window.setResizable(false); //cant resize window
        window.setTitle("Orchid"); //window for title of game

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); //pack() causes this window to be sized to fit the prefered size and layouts of its subcomponents = (GamePanel)

        window.setLocationRelativeTo(null); //window displayeds at the center of screen
        window.setVisible(true); //we can this window

        gamePanel.startGameThread();

    }
}
