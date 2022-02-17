import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Coder implements ActionListener{
    
    JTextField jtfPlaintext;
    JTextField jtfCiphertext;

    Coder(){

        //Create a new JFrame Container
        JFrame jfrm = new JFrame("A simple code machine");

        //Specify the FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        //Give the frame an initial size
        jfrm.setSize(340, 120);

        //Termiante the porgram when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create two labels
        JLabel JlabPlaintext = new JLabel(" Plain text:");
        JLabel JlabCiphetext = new JLabel("Cipher text:");

        // Create two text field instances
        jtfPlaintext = new JTextField(20);
        jtfCiphertext = new JTextField(20);

        //Set Action command for the text field
        jtfPlaintext.setActionCommand("Encode");
        jtfCiphertext.setActionCommand("Decode");

        //Add action listeners to the text field
        jtfPlaintext.addActionListener(this);
        jtfCiphertext.addActionListener(this); 

        //Add the text field and labels to the content pane
        jfrm.add(JlabPlaintext);
        jfrm.add(jtfPlaintext);
        jfrm.add(JlabCiphetext);
        jfrm.add(jtfCiphertext);

        //Create JButtuns instances
        JButton jbtnEncode = new JButton("Encode");
        JButton jbtnDecode = new JButton("Decode");
        JButton jbtnReset = new JButton("Reset");

        //Add action listener for the buttons
        jbtnEncode.addActionListener(this);
        jbtnDecode.addActionListener(this);
        jbtnReset.addActionListener(this);

        //Add the buttons to the content pane
        jfrm.add(jbtnEncode);
        jfrm.add(jbtnDecode);
        jfrm.add(jbtnReset);

        //Display the frame
        jfrm.setVisible(true);
    }

    //Handle action events
    public void actionPerformed(ActionEvent ae){
        
        //if action command is "Encode" the encode the string
        if(ae.getActionCommand().equals("Encode")){

            //This will hold the encoded string
           String encStr = "";
           
           //obtain the plain text
           String str = jtfPlaintext.getText();

           //Add 1 to each character
           for(int i = 0; i < str.length(); i++){
               encStr += (char)(str.charAt(i) + 1);
           }

           //Set the encode text into the cipher text field
           jtfCiphertext.setText(encStr.toString());
        }

        else if(ae.getActionCommand().equals("Decode")){
            //This will hold the encoded string
            String decStr = "";

            //obtain the plain text
            String str = jtfCiphertext.getText();
            
            //Substract 1 to each character
            for(int i = 0; i < str.length(); i++){
                decStr += (char)(str.charAt(i) - 1);
            }
            //Set the encode text into the cipher text field
            jtfPlaintext.setText(decStr.toString());
        }
        else{
            //Otherwise must be "Reset"
            jtfPlaintext.setText("");
            jtfCiphertext.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Coder();
            }
        });     
    }
}
