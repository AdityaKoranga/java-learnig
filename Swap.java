import java.awt.*;
import java.awt.event.*;
public class Swap {
    
    public static void main(String[] args) {
        
    
    //sabse pehle Frame
    Frame fr= new Frame("Swap window");
    Label l1= new Label("First");
    Label l2= new Label("Second");

    TextField t1= new TextField(10);
    TextField t2= new TextField(10);

    Button b= new Button("OK");

    fr.add(l1);
    fr.add(t1);
    fr.add(l2);
    fr.add(t2);
    fr.add(b);

    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            String temp=t1.getText();
            // System.out.println("temp is "+temp);
            t1.setText(t2.getText());
            // System.out.println();
            t2.setText(temp);
        }
    });

    //visibility, size and layout.

    fr.setLayout(new FlowLayout());
    fr.setSize(300,400);
    fr.setVisible(true);
}

}
