
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class SimpleStopwatch implements ActionListener{
    JLabel jlab;
    long start;     //Holds the starts time in millisenconds 

    SimpleStopwatch(){

        //Create a new JFrame Container
        JFrame jfrm = new JFrame("A simple Stop Watch");

        // specifiy flowlayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(300, 150);

        //Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons       
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");

        //Add action listeners
        btnStart.addActionListener(this);
        btnStop.addActionListener(this);

        //Add the buttons to the content pane
        jfrm.add(btnStart);
        jfrm.add(btnStop);

        // cReate a text-based label
        jlab = new JLabel("Press Start to begin timing");

        // Add the label to the frame
        jfrm.add(jlab);

        //Make the display visible 
        jfrm.setVisible(true);
    }

    //Handle the buttons actions
    public void actionPerformed(ActionEvent ae){
        
        //Get the current system time
        Calendar cal = Calendar.getInstance();

        if(ae.getActionCommand().equals("Start")){
            //Store start time
            start = cal.getTimeInMillis();
            jlab.setText("Stopwatch is running ...");                        
        }
        else
            //compute the elapsed time
            jlab.setText("Elisped time is " + (double)(cal.getTimeInMillis() - start)/1000);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SimpleStopwatch();
            }
        });     
    }
}
