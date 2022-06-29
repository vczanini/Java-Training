import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        //Creating a GUI for this application

        JFrame frame = new JFrame("Hello Java!"); //CREATE THE GUI
        frame.setSize(300, 300); //SET THE SIZE OF THE GUI
        frame.setVisible(true); //MAKE THE GUI VISIBLE

        JLabel label = new JLabel("Hello Java!", JLabel.CENTER); //CREATE A LABEl
        frame.add(label); //Put the label on the GUI

    }
}