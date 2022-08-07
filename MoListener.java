import java.awt.*;
import java.awt.event.*;

public class MoListener extends Frame implements MouseListener {
    Label l;

    MoListener() {
        super("AWT Frame");
        l = new Label();
        l.setBounds(25, 60, 250, 30);
        l.setAlignment(Label.CENTER);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MoListener();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
        setSize(900, 900);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setSize(300, 300);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
}