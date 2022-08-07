import java.awt.*;
import java.awt.event.*;

// class AWTo implements ActionListener{
//     Frame frame=new Frame();
//     Button red=new Button();
//     Button blue=new Button();
//     AWTo() {        
//         red.setBackground(Color.red);
//         blue.setBackground(Color.blue);
//         blue.setBounds(25,200,250,30);
//         red.setBounds(25, 100, 250, 30);
//         red.setLabel("RED");
//         blue.setLabel("BLUE");
//         red.setForeground(Color.white);
//         blue.setForeground(Color.white);
//         frame.add(blue);
//         frame.add(red);
//         red.addActionListener(this);
//         blue.addActionListener(this);
//         frame.setLayout(null);
//         frame.setSize(300, 400);
//         frame.setVisible(true);
//         frame.addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent e) {
//             frame.dispose();
//             }
                
//         });
        
//     }  
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==red) frame.setBackground(Color.red);
//         else if(e.getSource()==blue) frame.setBackground(Color.blue);
//         }

//     }

// public class MouseListenerExample {
//     public static void main(String[] args) {
//         new AWTo();
//     }
    
// }
public class Colorchange extends Frame implements ActionListener{
    Button red;
    Button blue;
    Colorchange(){
        red= new Button("RED");
        blue=new Button("BLUE");
        add(red);
        add(blue);
        
        // setVisible(true);
        red.addActionListener(this);
        blue.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==red) red.setBackground(Color.red);
        else if(ae.getSource()==blue) blue.setBackground(Color.blue);
    }
    public static void main(String[] args) {
        Colorchange sr= new Colorchange();
        sr.setLayout(new FlowLayout());
        sr.setSize(300,300);
        sr.setVisible(true);
    }
}