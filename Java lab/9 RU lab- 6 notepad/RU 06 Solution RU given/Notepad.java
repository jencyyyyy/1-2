
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Notepad extends JFrame implements ActionListener {
    private TextArea txt = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
    private MenuBar menubar = new MenuBar();
    private Menu file = new Menu();
    private MenuItem op = new MenuItem();
    private MenuItem sv = new MenuItem();

    public Notepad() {
        prepareGUI();
    }

    public void prepareGUI() {
    	this.setVisible(true);
        this.setSize(800, 600);
        this.setTitle("Notepad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txt.setBackground(Color.cyan);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(txt);
        this.setMenuBar(this.menubar);
        this.menubar.add(this.file);
        this.file.setLabel("File");
        this.op.setLabel("Open");
        this.op.addActionListener(this);
        this.file.add(this.op);
        this.sv.setLabel("Save");
        this.sv.addActionListener(this);
        this.file.add(this.sv);
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == this.op) {
            JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                this.txt.setText("");
                try {
                    Scanner in = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                    while (in.hasNext())
                        this.txt.append(in.nextLine() + "\n");
                } catch (Exception ex) {}
            }
        }

        else if (e.getSource() == this.sv) {
            JFileChooser save = new JFileChooser();
            int option = save.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                    out.write(this.txt.getText());
                    out.close();
                } catch (Exception ex) { }
            }
        }
    }

}
