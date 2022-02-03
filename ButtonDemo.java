//Demonstrate a button
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener{

    JLabel jlab;
    
    ButtonDemo(){
        //create a new JFrame Container -- Create a top-level container
        JFrame jfrm = new JFrame("A button Example");

        //Specify FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        //give the frame an initial size
        jfrm.setSize(320, 100);

        //Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make two buttons
        JButton jbtnFirst = new JButton("First");
        JButton jbtnSecond = new JButton("Second");

        //Add action listeners
        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);

        //add the buttons to the contents pane
        jfrm.add(jbtnFirst);
        jfrm.add(jbtnSecond);

        //create a text-based label
        jlab = new JLabel("Press the button");
        
        //Add the label to the content pane
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);
    }

    //Handle button events
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("First"))
            jlab.setText("First Button was pressed");
        else
            jlab.setText("Second button was pressed");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new ButtonDemo();
            }
        });     
    }
}
