import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TwoTFDemo implements ActionListener{
    
    JTextField jtf1, jtf2;
    JLabel jlab;

    TwoTFDemo(){
        
        //Create a new JFrame Container
        JFrame jfrm = new JFrame("Use two label text");

        //Specify FlowLayout fot the layout manager
        jfrm.setLayout(new FlowLayout());

        //Give the frame an initial size
        jfrm.setSize(240, 120);

        //Terminate the program whem the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create two text field instances
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);

        //Set de acctions commands
        jtf1.setActionCommand("One");
        jtf2.setActionCommand("two");

        //Add the action listeners for the text field
        jtf1.addActionListener(this);
        jtf2.addActionListener(this);

        //Add the tet field to the content pane
        jfrm.add(jtf1);
        jfrm.add(jtf2);

        //Create a label instance
        jlab = new JLabel("");

        //Add the label to the frame
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);

    }

    //Handle action events
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("One")){
            jlab.setText("ENTER pressed in tf1: " + jtf1.getText());
        }
        else{
            jlab.setText("ENTER pressed in tf2: " + jtf2.getText());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TwoTFDemo();
            }
        });     
    }
}
