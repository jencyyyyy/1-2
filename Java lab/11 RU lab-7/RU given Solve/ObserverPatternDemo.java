// Farjana Aktar (1912276145)

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObserverPatternDemo {
        Subject subject = new Subject();
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver =  new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

    void prepareGUI() {
        JFrame frame = new JFrame();
        frame.setSize(800,200);
        frame.setVisible(true);

        frame.setLayout(new GridLayout(2,1));
        JPanel display_panel = new JPanel(new GridLayout(1,3)); // Display
        JPanel input_panel = new JPanel(new FlowLayout(FlowLayout.CENTER));// For Input

      
        JLabel hexa = new JLabel("HexaDecimal");
        JLabel show_hexa = new JLabel();


        JLabel octal = new JLabel("Octal");
        JLabel show_octal = new JLabel();

        

        JLabel Binary = new JLabel("Binary");
        JLabel show_Binary = new JLabel();

     
          
        JTextField textField = new JTextField(20);
        JLabel input = new JLabel("Input");

        display_panel.add(Binary);
        display_panel.add(show_Binary);

        display_panel.add(hexa);
        display_panel.add(show_hexa);

        display_panel.add(octal);
        display_panel.add(show_octal);

        input_panel.add(input);
        input_panel.add(textField);


        frame.add(display_panel);
        frame.add(input_panel);

        textField.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e){

                if (e.getSource() == textField) {
                  
                        String s = textField.getText();
                        int input_int = Integer.parseInt(s);
                        subject.setState(input_int);
                        show_Binary.setText(binaryObserver.update());
                        show_hexa.setText(hexaObserver.update());
                        show_octal.setText(octalObserver.update());
                }
            }
        });
    }




    public static void main(String[] args) {
            ObserverPatternDemo observer = new ObserverPatternDemo();
			observer.prepareGUI();
    }
}

