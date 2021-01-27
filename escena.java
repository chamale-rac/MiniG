package vdj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class escena extends JFrame implements ActionListener {

    panel1 pa = new panel1();

    JButton d1, d2;
    int el = 0;

    public escena() {

        super("Shooter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1411, 752);

        this.add(pa);

        this.setLocationRelativeTo(null);

        if (el == 1) {
            this.add(pa);
        }
        this.setVisible(true);
    }

    public void obj() {

        d1 = new JButton("Salir");

        this.setLayout(null);

        d1.setBounds(10, 10, 85, 75);;//ESPECIALITA

        add(d1);
        d1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == d1) {
            System.exit(0);
        }

    }
}
    
    
    

   
 
    


    
    
    

   
 
    


