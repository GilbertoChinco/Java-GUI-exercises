import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JTextFieldDemo implements ActionListener{
    
    JTextField jtf;
    JLabel jlab;

    JTextFieldDemo(){

        //Create the new Jframe Container
        JFrame jfrm = new JFrame("A text Field Example");

        //Specify the FlowLayout for the layout mananger
        jfrm.setLayout(new FlowLayout());

        //Give the frame a initial size
        jfrm.setSize(240, 100);

        //Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a text field instance
        jtf = new JTextField(10);

        //add an action listener for the text field
        jtf.addActionListener(this);

        //Add the text field to the content
        jfrm.add(jtf);

        //Create an empty based text label
        jlab = new JLabel("");

        //Add the label to the frame
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);
    }

    //Handle action event
    public void actionPerformed(ActionEvent ae){
        //Obtain the current text and display it in a label.
        jlab.setText("Current contents: " + jtf.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new JTextFieldDemo();
            }
        });     
    }
}
