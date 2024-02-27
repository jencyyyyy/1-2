import java.awt.*;
import java.awt.event.*;

public class EventDemo {

   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public EventDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      EventDemo  awtControlDemo = new EventDemo();
      awtControlDemo.showEventDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      WindowEventListner wListener = new WindowEventListner(); 
      mainFrame.addWindowListener(wListener);

      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);

      statusLabel = new Label();
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      //mainFrame.setVisible(true);
   }

   private void showEventDemo(){
      headerLabel.setText("Control in action: Button");

      Button okButton     = new Button("OK");
      Button submitButton = new Button("Submit");
      Button cancelButton = new Button("Cancel");

      okButton.setActionCommand("A");
      submitButton.setActionCommand("B");
      cancelButton.setActionCommand("C");

      okButton.addActionListener(new ButtonClickListener());
      submitButton.addActionListener(new ButtonClickListener());
      cancelButton.addActionListener(new ButtonClickListener());

      controlPanel.add(okButton);
      controlPanel.add(submitButton);
      controlPanel.add(cancelButton);

      mainFrame.setVisible(true);
   }

   private class WindowEventListner implements WindowListener {
      public void windowClosing(WindowEvent we){
          System.out.println(we.toString());
          System.exit(0);
      }

      public void windowActivated(WindowEvent we){

      }

      public void windowClosed(WindowEvent we){

      }

      public void windowDeactivated(WindowEvent we){

      }

      public void windowDeiconified(WindowEvent we){

      }

      public void windowIconified(WindowEvent we) {

      }

      public void windowOpened(WindowEvent we){

      }
   }


   private class ButtonClickListener implements ActionListener{

      public void actionPerformed(ActionEvent e) {

         String command = e.getActionCommand();

         System.out.println(e.toString());

         if( command.equals( "A" ))  {
            statusLabel.setText("Ok Button clicked.");
         }
         else if( command.equals( "B" ) )  {
            statusLabel.setText("Submit Button clicked.");
         }
         else  {
            statusLabel.setText("Cancel Button clicked.");
         }

      }
   }

}