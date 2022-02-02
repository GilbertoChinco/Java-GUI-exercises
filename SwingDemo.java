import javax.swing.*;
class SwingDemo {
    
    SwingDemo(){
        
        //create a new JFrame Container -- Create a top-level container
        JFrame jfrm = new JFrame("A simple Swing Container");

        //give the frame an initial size
        jfrm.setSize(275, 100);

        //Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a text-based label
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI");

        // Add the label to the content pane
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    new SwingDemo();
                }
        });     
    }
}
