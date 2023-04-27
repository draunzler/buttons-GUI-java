package button;

import java.awt.*;
import java.awt.event.*;        //event listener
import javax.swing.*;           //for JButton

public class ButtonFrame extends JFrame
{
    //creates GUI of 300x200 pixels 
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame()        //inner class
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        //to create button
        JButton yButton = new JButton("Yellow");
        JButton bButton = new JButton("Blue");
        JButton rButton = new JButton("Red");

        buttonPanel = new JPanel();

        //to use the buttonPanel and add buttons

        buttonPanel.add(yButton);
        buttonPanel.add(bButton);
        buttonPanel.add(rButton);

        //add the button panel

        add(buttonPanel);

        //creates actions for the buttons

        ColorAction yAction = new ColorAction(color.YELLOW);
        ColorAction bAction = new ColorAction(color.BLUE);
        ColorAction rAction = new ColorAction(color.RED);

        //implement the actions to the buttons

        yButton.addActionListener(yAction);
        bButton.addActionListener(bAction);
        rButton.addActionListener(rAction);
    }

    //class used as an action listener to add bg color to the buttons

    private class ColorAction implements addActionListener
    {
        private Color backgroundColor;      //datatype `Color`

        public ColorAction(Color c)
        {backgroundColor = c;}

        //implements the colors, i.e., sets the bg color of buttons to either yellow, blue or red
        public void actionPerformed(ActionEvent event)
        {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}