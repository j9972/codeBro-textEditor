import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame implements ActionListener {

    JTextArea textArea;

    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bro text Editor");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(450,450));

        this.add(textArea);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
