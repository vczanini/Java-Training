import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hello_Component extends JComponent
    implements MouseMotionListener
{
    String theMessage;
    int messageX = 125, messageY = 95; //GIVES THE MESSAGE COORDINATION

    public Hello_Component(String message)
    {
        theMessage = message; //Receives what is written
        addMouseMotionListener(this); //Make the mouse drag works
    }

    //prints the message in the position
    public void paintComponent(Graphics g)
    {
        g.drawString(theMessage, messageX, messageY);
    }

    //Drags the label
    public void mouseDragged(MouseEvent e) //
    {
        //get the new coordination
        messageX = e.getX();
        messageY = e.getY();
        //Puts the label into the new place
        repaint();
    }

    public void mouseMoved(MouseEvent e){} //Makes the mouse being part of the GUI
}
