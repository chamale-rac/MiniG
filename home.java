package vdj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame implements ActionListener {
//Declaración de Variables//

    Color colbt, colbt1;
    panel2 s = new panel2();

    JButton d1, d2, d3, d4, d5;
    JLabel d6;
    int el = 0;

    public home() {

        super("Shooter");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj();
        add(s);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void obj() {
        colbt = new Color(255, 0, 0);
        colbt1 = new Color(0, 255, 0);

        d1 = new JButton("Salir");
        d2 = new JButton("Jugar");
        d6 = new JLabel("Disparar = Z, Granada = X, Poder = C, Moverse = Flechas");
        this.setLayout(null);

        d1.setBounds(315, 500, 85, 75);//Salir
        d2.setBounds(300, 400, 115, 75);//Per1
        d6.setBounds(80, 570, 600, 75);

        add(d1);
        add(d2);

        add(d6);
        d1.addActionListener(this);
        d2.addActionListener(this);

        d1.setBackground(colbt1);
        d2.setBackground(colbt1);

        d6.setBackground(colbt1);
        d6.setForeground(Color.blue);
        d6.setFont(new Font("Serif", Font.PLAIN, 24));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == d1) {
            System.exit(0);
        }

        if (e.getSource() == d2) {
            //JFrame frame =  (JFrame)SwingUtilities.getWindowAncestor(this);
            this.dispose();
            escena cuañ = new escena();
        }

    }
}
