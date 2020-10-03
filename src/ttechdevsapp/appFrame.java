package ttechdevsapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;

import java.util.Map;


public class appFrame extends JFrame implements ActionListener {

    Map<String, String> elMap = new LinkedHashMap<>();

// create and initalize variables
    JLabel title = new JLabel("Welcome to the TTechDevsApp");
    Container container = getContentPane();
    JLabel label1 = new JLabel("Enter Element Name: ");
    JLabel label2 = new JLabel("Enter Element Number: ");
    JTextField TextField1 = new JTextField();
    JTextField Textfield2 = new JTextField();
    JButton Button = new JButton("Add");
    JButton Button2 = new JButton("Change");
    JButton Button3 = new JButton("Show All");
    JButton Button4 = new JButton("Remove");

    appFrame() {
        //create the layout
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }
    // set layout for buttton, text and inputs

    public void setLocationAndSize() {
        label1.setBounds(50, 150, 150, 30);
        label2.setBounds(50, 220, 150, 30);
        title.setBounds(80, 50, 350, 30);
        TextField1.setBounds(190, 150, 150, 30);
        Textfield2.setBounds(190, 220, 150, 30);
        Button.setBounds(50, 320, 170, 30);
        Button2.setBounds(265, 320, 170, 30);
        Button3.setBounds(265, 420, 170, 30);
        Button4.setBounds(50, 420, 170, 30);

    }
//add buttons, text, and inputs to the frame

    public void addComponentsToContainer() {
        container.add(label1);
        container.add(label2);
        container.add(TextField1);
        container.add(Textfield2);
        container.add(Button);
        container.add(Button2);
        container.add(Button3);
        container.add(Button4);
        container.add(title);

    }
// adding the action listener to the buttons

    public void addActionEvent() {

        Button.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        Button4.addActionListener(this);
    }

    // adding the action listener to the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        final String Text = TextField1.getText();
        final String Text2 = Textfield2.getText();
        if (e.getSource() == Button) {
            if (Text != "") {
                TextField1.getText();
                JOptionPane.showMessageDialog(this, "Please enter element number and name");

            } else {
                elMap.put(Text, Text2);
                JOptionPane.showMessageDialog(null, "Element has been added to LinkedHashMap " + Text);
            }
        }
        if (e.getSource() == Button2) {
            if (Text != null) {

                elMap.put(Text, Text2);
                JOptionPane.showMessageDialog(null, "The specified element does not exist in LinkedHashMap");

            } else {
                JOptionPane.showMessageDialog(null, "Please enter element number and name");
            }
        }
        if (e.getSource() == Button3) {
            if (Text != null) {
                //adds name and number to linkedhashmap
                elMap.put(Text, Text2);
                JOptionPane.showMessageDialog(null, " ", "List of all Elements", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Please enter element number and name", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource() == Button4) {
            if (Text != null) {

                elMap.put(Text, Text2);
                JOptionPane.showMessageDialog(null, "The specified element does not exist in LinkedHashMap", "Error, cannot remove", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Please enter element number and name");
            }
        }

    }

}
