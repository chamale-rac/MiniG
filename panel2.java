package vdj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panel2 extends JPanel implements KeyListener, ActionListener, MouseListener {

    public ImageIcon storm, caba, sol, reaper, lf, mejorr, fbal, m5, m6, m7, m8, m9, m10, blabla2, blabla3, blabla4, blabla5, blabla6, blabla7, blabla8, blabla9, blabla10, lvl, zv10, zv12, zv11, zv13, zv14, zv15, m1c, granada1, mascor, mave, granada, boss, ze3, ze4, ze5, ze6, ze7, ze8, ze9, m1, m2, m3, m4, soldado, soldado3, fondo, blabla, stta, cora1, cora2, cora3, som, zom2, prueba, balascontadas;

    public panel2() {

        this.setSize(700, 700);
        this.setFocusable(true);

        this.addKeyListener(this);
        this.addMouseListener(this);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //storm,caba,sol,reaper

        fondo = new ImageIcon(getClass().getResource("recursos/fuego.jpg"));
        g.drawImage(fondo.getImage(), 1, 1, getWidth(), getHeight(), this);

        lf = new ImageIcon(getClass().getResource("recursos/zombiel.png"));
        g.drawImage(lf.getImage(), 120, 40, 500, 350, this);

        storm = new ImageIcon(getClass().getResource("recursos/cabab.png"));
        g.drawImage(storm.getImage(), 253, 300, 70, 70, this);

        caba = new ImageIcon(getClass().getResource("recursos/sbaj.png"));
        g.drawImage(caba.getImage(), 100, 300, 70, 70, this);

        sol = new ImageIcon(getClass().getResource("recursos/solab.png"));
        g.drawImage(sol.getImage(), 505, 300, 70, 70, this);

        reaper = new ImageIcon(getClass().getResource("recursos/reab.png"));
        g.drawImage(reaper.getImage(), 370, 300, 70, 70, this);

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
