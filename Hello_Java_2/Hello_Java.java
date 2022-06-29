//Vinicius Zanini 2022
import javax.swing.*;

public class Hello_Java {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello, Java!!");

        frame.add(new Hello_Component("Hello, Java!!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if the GUI is closed, end the program
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
