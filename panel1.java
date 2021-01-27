package vdj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panel1 extends JPanel implements KeyListener, ActionListener, MouseListener {

    public ImageIcon mejorr, fbal, m5, m6, m7, m8, m9, m10, blabla2, blabla3, blabla4, blabla5, blabla6, blabla7, blabla8, blabla9, blabla10, lvl, zv10, zv12, zv11, zv13, zv14, zv15, m1c, granada1, mascor, mave, granada, boss, ze3, ze4, ze5, ze6, ze7, ze8, ze9, m1, m2, m3, m4, soldado, soldado3, fondo, blabla, stta, cora1, cora2, cora3, som, zom2, prueba, balascontadas;
    public int wowo, mejor, salbal, xv3 = 9999, yv3 = 9999, xv2 = 9999, yv2 = 9999, ran, b222, b12, b13, b14, b15, b16, b17, b18, b19, b110, b23, b24, b25, b26, b27, b28, b29, b210, bb2, bb3, bb4, bb5, bb6, bb7, bb8, bb9, bb10, asd2, asd3, asd4, asd5, asd6, asd7, asd8, asd9, asd10, y22, y23, y24, y25, y26, y27, y28, y29, y210, x22, x23, x24, x25, x26, x27, x28, x29, x210, sal = 0, smas, salto = 2, super7 = 0, super8 = 0, super9 = 0, xom = 30, cartelx = 6000, cartely = 6000, contacartel, ccartel, btz123, f10, f11, f12, f13, f14, f15, numero10, numero11, numero12, numero13, numero14, numero15, q10 = 400000, q11 = 400000, q12 = 400000, q13 = 400000, q14 = 400000, q15 = 400000,
            w10 = 400000, w11 = 400000, w12 = 400000, w13 = 400000, w14 = 400000, w15 = 400000, quinx = 15, quiny = 15, numg = 0,
            canimacion, igy = 5, igx = 30, yv1 = 9009, xv1 = 45, yc2 = 15, xc2 = 3000, contapoderes = 0, xv = 45, yv = 9009,
            vmas = 5, box, boy, mun1 = 2, grax = 2000, gy = 2000, tgrana, grat, btz2 = 0, btz3 = 0, btz4 = 0, btz56 = 0,
            btz789 = 0, dd, q3 = 300000, q4 = 300000, q5 = 300000, q6 = 300000, q7 = 300000, q8 = 300000, q9 = 300000, w3 = 300000, w4 = 300000,
            w5 = 300000, w6 = 300000, w7 = 300000, w8 = 300000, w9 = 300000, aanimacion, aanimacion2, aanimacion3, aanimacion4, aanimacion5, aanimacion6, aanimacion7,
            aanimacion8, aanimacion9, aanimacion10, my = 13, m1x = 15, m2x = 5, m3x = 5, m4x = 15, m5x = 25333, m6x = 12335, m7x = 45455, m8x = 54545, m9x = 15435, m10x = 8825, w = 0,
            mun = 5,
            tiempomun = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0, f7 = 0, f8 = 0, f9 = 0, ssc = 0, ssc2 = 0, masz = 0, numero, numero2, numero3, numero4, numero5, numero6,
            numero7, numero8, numero9, x = 690, y = 280, x1 = 170, y1 = 400, tt = 0, a = 25, l = 25, x2 = 2000, y2 = 2000, tbala = 0, btz = 0,
            animacion = 0, bb = 0, b1 = 25, b2 = 5, xi1 = 100, xi2 = 850, xi3 = 800, vida = 0, xz1 = 9000, yz1 = 19900;

    public String slvl[] = {"recursos/level1a.png", "recursos/level2a.png", "recursos/level3a.png", "recursos/lvl4.png", "recursos/lvl5.png", "recursos/lvlinf.png"};

    public String imag[] = {"recursos/granada.png", "recursos/explo.png"};//3arriba

    public String imagenes[] = {"recursos/stts.png",//0normal
        "recursos/stz.png",//1izquierda
        "recursos/sbaj.png",//2abajo
        "recursos/stta.png"};//3arriba

    public String bal[] = {"recursos/balan.png",//0normal
        "recursos/para.png"};

    public String ss[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss2[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss3[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss4[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss5[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss6[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss7[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss8[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};
    public String ss9[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public String zz10[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public String zz11[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public String zz12[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public String zz13[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public String zz14[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public String zz15[] = {"recursos/somr.png",//0normal
        "recursos/soml.png", "recursos/somu.png", "recursos/somd.png"};

    public Timer b22, b3, b4, b5, b6, b7, b8, b9, b10, matabalas, timercartelesdelvl, cr, bcg, bcg1, tiempo, balatiempo, bti, tim, bc, zz2, zz3, zz4, zz56, zz789, zz10al15;

    public panel1() {

        this.setSize(1411, 752);
        this.setFocusable(true);

        this.addKeyListener(this);
        this.addMouseListener(this);

        matabalas = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (masz >= 1) {

                    zz2.start();
                    if (contapoderes == 0) {
                        xom = xom + 35;
                        cartelx = -300;
                        cartely = 280;
                        timercartelesdelvl.start();

                        ran = (int) (Math.random() * 5);

                        if (ran == 0) {
                            xv = 690;
                            yv = 350;
                        }
                        if (ran == 2) {
                            xv = 90;
                            yv = 90;
                        }
                        if (ran == 3) {
                            xv = 1000;
                            yv = 90;
                        }
                        if (ran == 4) {
                            xv = 1000;
                            yv = 600;
                        }
                        if (ran == 1) {
                            xv = 90;
                            yv = 600;
                        }

                        contapoderes = 1;
                    }
                }
                if (masz >= 5) {
                    xv = 6690;
                    yv = 3560;
                }

                if (masz >= 2) {
                    zz3.start();
                }

                if (masz >= 4) {
                    zz4.start();
                }

                if (masz >= 10) {
                    zz4.start();
                    if (contapoderes == 2) {
                        xom = xom + 35;

                        contapoderes = 3;
                    }
                }

                //1-2 
                if (masz >= 8) {
                    zz56.start();
                    if (contapoderes == 1) {
                        xom = xom + 35;
                        contacartel = 1;
                        cartelx = -300;
                        cartely = 280;
                        timercartelesdelvl.start();

                        ran = (int) (Math.random() * 5);

                        if (ran == 0) {
                            xv1 = 690;
                            yv1 = 350;
                        }
                        if (ran == 2) {
                            xv1 = 90;
                            yv1 = 90;
                        }
                        if (ran == 3) {
                            xv1 = 1000;
                            yv1 = 90;
                        }
                        if (ran == 4) {
                            xv1 = 1000;
                            yv1 = 600;
                        }
                        if (ran == 1) {
                            xv1 = 90;
                            yv1 = 600;
                        }

                        contapoderes = 2;
                    }
                }
                if (masz >= 13) {
                    xv1 = 9000;
                }
                if (masz >= 28) {
                    zz789.start();
                    if (contapoderes == 4) {
                        xom = 70;
                        contacartel = 2;
                        cartelx = -300;
                        cartely = 280;
                        ran = (int) (Math.random() * 5);

                        if (ran == 0) {
                            xv2 = 690;
                            yv2 = 350;
                        }
                        if (ran == 2) {
                            xv2 = 90;
                            yv2 = 90;
                        }
                        if (ran == 3) {
                            xv2 = 1000;
                            yv2 = 90;
                        }
                        if (ran == 4) {
                            xv2 = 1000;
                            yv2 = 600;
                        }
                        if (ran == 1) {
                            xv2 = 90;
                            yv2 = 600;
                        }
                        timercartelesdelvl.start();
                        contapoderes = 5;
                    }
                }

                if (masz >= 25) {

                    if (contapoderes == 3) {
                        xom = xom + 35;
                        contapoderes = 4;
                    }
                }

                if (masz >= 39) {
                    zz10al15.start();

                    if (contapoderes == 5) {
                        xom = 90;
                        contacartel = 3;
                        cartelx = -300;
                        cartely = 280;
                        ran = (int) (Math.random() * 5);

                        if (ran == 0) {
                            xv3 = 690;
                            yv3 = 350;
                        }
                        if (ran == 2) {
                            xv3 = 90;
                            yv3 = 90;
                        }
                        if (ran == 3) {
                            xv3 = 1000;
                            yv3 = 90;
                        }
                        if (ran == 4) {
                            xv3 = 1000;
                            yv3 = 600;
                        }
                        if (ran == 1) {
                            xv3 = 90;
                            yv3 = 600;
                        }
                        timercartelesdelvl.start();
                        contapoderes = 6;
                    }
                }

                if (masz >= 60) {

                    if (contapoderes == 6) {
                        xom = 100;
                        contacartel = 5;
                        wowo = 5;
                        timercartelesdelvl.start();
                        contapoderes = 7;
                    }
                }

                repaint();

            }
        });
        matabalas.start();

///salto
        bcg1 = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                smas++;

                if ((smas == 13 - mejor - wowo) && (salto <= 0)) {

                    salto = 2;
                    smas = 0;
                }

                if ((smas == 13 - mejor - wowo) && (salto == 1)) {
                    xc2 = 30;
                    salto = 2;
                    smas = 0;
                }

                if (smas == 14 - mejor - wowo) {
                    smas = 0;
                }
                repaint();

                repaint();

            }
        });
        bcg1.start();

        timercartelesdelvl = new Timer(20, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ccartel++;

                cartelx = cartelx + 5;

                if (ccartel == 700) {
                    ccartel = 0;
                    timercartelesdelvl.stop();
                }

                if ((x + a > cartelx) && (x < cartelx + 300) && (y + l > cartely) && (y < cartely + 200)) {
                    ccartel = 0;
                    timercartelesdelvl.stop();
                    cartelx = -500;
                }

                repaint();

            }
        });

///////////////////////////zombies del 10 al 15
        zz10al15 = new Timer(105 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                btz123++;

                if (btz123 == 1) {
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                }
                if (btz123 == 20) {
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        q11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                }
                if (btz123 == 20) {
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        q12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                }

                if (btz123 == 20) {
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        q13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                }

                if (btz123 == 10) {
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        q14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                }

                if (btz123 == 10) {
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        q15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                }

                if (q10 >= 1400) {
                    q10 = q10 - 20;
                    f10 = 0;
                }
                if (q10 <= 0) {
                    q10 = q10 + 20;
                    f10 = 1;
                }
                if (w10 >= 710) {
                    w10 = w10 - 20;
                    f10 = 2;
                }
                if (w10 <= 0) {
                    w10 = w10 + 20;
                    f10 = 3;
                }
                if ((q10 >= x) && (w10 >= y)) {
                    q10 = q10 - 5;
                    f10 = 1;
                }//izquierda arriba
                if ((x >= q10) && (y >= w10)) {
                    q10 = q10 + 5;
                    f10 = 0;
                }// derecha abajo
                if ((x >= q10) && (y <= w10)) {
                    w10 = w10 - 5;
                    f10 = 2;
                }  //derecha arriba
                if ((q10 >= x) && (w10 <= y)) {
                    w10 = w10 + 5;
                    f10 = 3;
                }//izquierda abajo

                if (q11 >= 1400) {
                    q11 = q11 - 20;
                    f11 = 0;
                }
                if (q11 <= 0) {
                    q11 = q11 + 20;
                    f10 = 1;
                }
                if (w11 >= 710) {
                    w11 = w11 - 20;
                    f11 = 2;
                }
                if (w11 <= 0) {
                    w11 = w11 + 20;
                    f11 = 3;
                }
                if ((q11 >= x) && (w11 >= y)) {
                    q11 = q11 - 5;
                    f11 = 1;
                }//izquierda arriba
                if ((x >= q11) && (y >= w11)) {
                    q11 = q11 + 5;
                    f11 = 0;
                }// derecha abajo
                if ((x >= q11) && (y <= w11)) {
                    w11 = w11 - 5;
                    f11 = 2;
                }  //derecha arriba
                if ((q11 >= x) && (w11 <= y)) {
                    w11 = w11 + 5;
                    f11 = 3;
                }//izquierda abajo

                if (q12 >= 1400) {
                    q12 = q12 - 20;
                    f12 = 0;
                }
                if (q12 <= 0) {
                    q12 = q12 + 20;
                    f12 = 1;
                }
                if (w12 >= 710) {
                    w12 = w12 - 20;
                    f12 = 2;
                }
                if (w12 <= 0) {
                    w12 = w12 + 20;
                    f12 = 3;
                }
                if ((q12 >= x) && (w12 >= y)) {
                    q12 = q12 - 5;
                    f12 = 1;
                }//izquierda arriba
                if ((x >= q12) && (y >= w12)) {
                    q12 = q12 + 5;
                    f12 = 0;
                }// derecha abajo
                if ((x >= q12) && (y <= w12)) {
                    w12 = w12 - 5;
                    f12 = 2;
                }  //derecha arriba
                if ((q12 >= x) && (w12 <= y)) {
                    w12 = w12 + 5;
                    f12 = 3;
                }//izquierda abajo

                if (q13 >= 1400) {
                    q13 = q13 - 20;
                    f13 = 0;
                }
                if (q13 <= 0) {
                    q13 = q13 + 20;
                    f13 = 1;
                }
                if (w13 >= 710) {
                    w13 = w13 - 20;
                    f13 = 2;
                }
                if (w13 <= 0) {
                    w13 = w13 + 20;
                    f13 = 3;
                }
                if ((q13 >= x) && (w13 >= y)) {
                    q13 = q13 - 5;
                    f13 = 1;
                }//izquierda arriba
                if ((x >= q13) && (y >= w13)) {
                    q13 = q13 + 5;
                    f13 = 0;
                }// derecha abajo
                if ((x >= q13) && (y <= w13)) {
                    w13 = w13 - 5;
                    f13 = 2;
                }  //derecha arriba
                if ((q13 >= x) && (w13 <= y)) {
                    w13 = w13 + 5;
                    f13 = 3;
                }//izquierda abajo

                if (q14 >= 1400) {
                    q14 = q14 - 20;
                    f14 = 0;
                }
                if (q14 <= 0) {
                    q14 = q14 + 20;
                    f14 = 1;
                }
                if (w14 >= 710) {
                    w14 = w14 - 20;
                    f14 = 2;
                }
                if (w14 <= 0) {
                    w14 = w14 + 20;
                    f14 = 3;
                }
                if ((q14 >= x) && (w14 >= y)) {
                    q14 = q14 - 5;
                    f14 = 1;
                }//izquierda arriba
                if ((x >= q14) && (y >= w14)) {
                    q14 = q14 + 5;
                    f14 = 0;
                }// derecha abajo
                if ((x >= q14) && (y <= w14)) {
                    w14 = w14 - 5;
                    f14 = 2;
                }  //derecha arriba
                if ((q14 >= x) && (w14 <= y)) {
                    w14 = w14 + 5;
                    f14 = 3;
                }//izquierda abajo

                if (q15 >= 1400) {
                    q15 = q15 - 20;
                    f15 = 0;
                }
                if (q15 <= 0) {
                    q15 = q15 + 20;
                    f15 = 1;
                }
                if (w15 >= 710) {
                    w15 = w15 - 20;
                    f15 = 2;
                }
                if (w15 <= 0) {
                    w15 = w15 + 20;
                    f15 = 3;
                }
                if ((q15 >= x) && (w15 >= y)) {
                    q15 = q15 - 5;
                    f15 = 1;
                }//izquierda arriba
                if ((x >= q15) && (y >= w15)) {
                    q15 = q15 + 5;
                    f15 = 0;
                }// derecha abajo
                if ((x >= q15) && (y <= w15)) {
                    w15 = w15 - 5;
                    f15 = 2;
                }  //derecha arriba
                if ((q15 >= x) && (w15 <= y)) {
                    w15 = w15 + 5;
                    f15 = 3;
                }//izquierda abajo

                repaint();

            }
        });
////municion granada///
        bcg = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                grat++;

                if ((grat == 13 - mejor - wowo) && (mun1 <= 0)) {

                    mun1 = 1;
                    grat = 0;
                }

                if ((grat == 13 - mejor - wowo) && (mun1 == 1)) {
                    igx = 30;
                    mun1 = 2;
                    grat = 0;
                }

                if (grat == 14 - mejor - wowo) {
                    grat = 0;
                }

                repaint();

            }
        });
        bcg.start();

        bc = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tiempomun++;

                if ((tiempomun == 3 - mejor) && (mun <= 0)) {

                    mun = 1;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 1)) {
                    m1x = 15;
                    mun = 2;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 2)) {
                    m1x = 15;
                    m2x = 5;
                    mun = 3;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 3)) {
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    mun = 4;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 4)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    mun = 5;
                    tiempomun = 0;
                }
                if ((tiempomun == 3 - mejor) && (mun == 5) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    mun = 6;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 6) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    mun = 7;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 7) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    m7x = 5;
                    mun = 8;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 8) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    m7x = 5;
                    m8x = 5;
                    mun = 9;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 9) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    m7x = 5;
                    m8x = 5;
                    m9x = 15;
                    mun = 10;
                    tiempomun = 0;
                }

                if ((tiempomun == 3 - mejor) && (mun == 10) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    m7x = 5;
                    m8x = 5;
                    m9x = 15;
                    m10x = 25;
                    mun = 11;
                    tiempomun = 0;
                }

                if ((tiempomun == 5 - mejor) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    m7x = 5;
                    m8x = 5;
                    m9x = 15;
                    m10x = 25;
                    mun = 11;
                    tiempomun = 0;
                }
                if ((tiempomun == 6 - mejor) && (salbal == 2)) {
                    mun = 0;
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    m5x = 25;
                    m6x = 15;
                    m7x = 5;
                    m8x = 5;
                    m9x = 15;
                    m10x = 25;
                    mun = 11;
                    tiempomun = 0;
                }

                if (tiempomun == 5 - mejor) {
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    mun = 5;
                    tiempomun = 0;
                }

                if (tiempomun == 6 - mejor) {
                    m1x = 15;
                    m2x = 5;
                    m3x = 5;
                    m4x = 15;
                    mun = 5;
                    tiempomun = 0;
                }

                repaint();

            }
        });
        bc.start();
////////////////////////////////////////TIMER ZOMBIES///////////////////////////////////
/////////////////////////////////////z2/////////////////////////////
        zz2 = new Timer(115 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                btz2++;
                if (btz2 == 1) {
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                }

                if (xz1 >= 1400) {
                    xz1 = xz1 - 20;
                    ssc2 = 0;
                }
                if (xz1 <= 0) {
                    xz1 = xz1 + 20;
                    ssc2 = 1;
                }
                if (yz1 >= 710) {
                    yz1 = yz1 - 20;
                    ssc2 = 2;
                }
                if (yz1 <= 0) {
                    yz1 = yz1 + 20;
                    ssc2 = 3;
                }
                if ((xz1 >= x) && (yz1 >= y)) {
                    xz1 = xz1 - 5;
                    ssc2 = 1;
                }//izquierda arriba
                if ((x >= xz1) && (y >= yz1)) {
                    xz1 = xz1 + 5;
                    ssc2 = 0;
                }// derecha abajo
                if ((x >= xz1) && (y <= yz1)) {
                    yz1 = yz1 - 5;
                    ssc2 = 2;
                }  //derecha arriba
                if ((xz1 >= x) && (yz1 <= y)) {
                    yz1 = yz1 + 5;
                    ssc2 = 3;
                }//izquierda abajo

                repaint();
            }
        });
////////////////////////333333//////////////////////
        zz3 = new Timer(110 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//q=x w=y
                btz3++;
                if (btz3 == 1) {
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                }

                if (q3 >= 1400) {
                    q3 = q3 - 20;
                    f3 = 0;
                }
                if (q3 <= 0) {
                    q3 = q3 + 20;
                    f3 = 1;
                }
                if (w3 >= 710) {
                    w3 = w3 - 20;
                    f3 = 2;
                }
                if (w3 <= 0) {
                    w3 = w3 + 20;
                    f3 = 3;
                }
                if ((q3 >= x) && (w3 >= y)) {
                    q3 = q3 - 5;
                    f3 = 1;
                }//izquierda arriba
                if ((x >= q3) && (y >= w3)) {
                    q3 = q3 + 5;
                    f3 = 0;
                }// derecha abajo
                if ((x >= q3) && (y <= w3)) {
                    w3 = w3 - 5;
                    f3 = 2;
                }  //derecha arriba
                if ((q3 >= x) && (w3 <= y)) {
                    w3 = w3 + 5;
                    f3 = 3;
                }//izquierda abajo

                repaint();
            }
        });
////////////////////////44//////////////////////
        zz4 = new Timer(110 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//q=x w=y
                btz4++;
                if (btz4 == 1) {
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                }

                if (q4 >= 1400) {
                    q4 = q4 - 20;
                    f4 = 0;
                }
                if (q4 <= 0) {
                    q4 = q4 + 20;
                    f4 = 1;
                }
                if (w4 >= 710) {
                    w4 = w4 - 20;
                    f4 = 2;
                }
                if (w4 <= 0) {
                    w4 = w4 + 20;
                    f4 = 3;
                }
                if ((q4 >= x) && (w4 >= y)) {
                    q4 = q4 - 5;
                    f4 = 1;
                }//izquierda arriba
                if ((x >= q4) && (y >= w4)) {
                    q4 = q4 + 5;
                    f4 = 0;
                }// derecha abajo
                if ((x >= q4) && (y <= w4)) {
                    w4 = w4 - 5;
                    f4 = 2;
                }  //derecha arriba
                if ((q4 >= x) && (w4 <= y)) {
                    w4 = w4 + 5;
                    f4 = 3;
                }//izquierda abajo

                repaint();
            }
        });
///////////////////////5555556//////////////////////
        zz56 = new Timer(110 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//q=x w=y
                btz56++;
                if (btz56 == 1) {
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }

                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                }

                if (q6 >= 1400) {
                    q6 = q6 - 20;
                    f6 = 0;
                }
                if (q6 <= 0) {
                    q6 = q6 + 20;
                    f6 = 1;
                }
                if (w6 >= 710) {
                    w6 = w6 - 20;
                    f6 = 2;
                }
                if (w6 <= 0) {
                    w6 = w6 + 20;
                    f6 = 3;
                }
                if ((q6 >= x) && (w6 >= y)) {
                    q6 = q6 - 5;
                    f6 = 1;
                }//izquierda arriba
                if ((x >= q6) && (y >= w6)) {
                    q6 = q6 + 5;
                    f6 = 0;
                }// derecha abajo
                if ((x >= q6) && (y <= w6)) {
                    w6 = w6 - 5;
                    f6 = 2;
                }  //derecha arriba
                if ((q6 >= x) && (w6 <= y)) {
                    w6 = w6 + 5;
                    f6 = 3;
                }//izquierda abajo

                if (q5 >= 1400) {
                    q5 = q5 - 20;
                    f5 = 0;
                }
                if (q5 <= 0) {
                    q5 = q5 + 20;
                    f5 = 1;
                }
                if (w5 >= 710) {
                    w5 = w5 - 20;
                    f5 = 2;
                }
                if (w5 <= 0) {
                    w5 = w5 + 20;
                    f5 = 3;
                }
                if ((q5 >= x) && (w5 >= y)) {
                    q5 = q5 - 5;
                    f5 = 1;
                }//izquierda arriba
                if ((x >= q5) && (y >= w5)) {
                    q5 = q5 + 5;
                    f5 = 0;
                }// derecha abajo
                if ((x >= q5) && (y <= w5)) {
                    w5 = w5 - 5;
                    f5 = 2;
                }  //derecha arriba
                if ((q5 >= x) && (w5 <= y)) {
                    w5 = w5 + 5;
                    f5 = 3;
                }//izquierda abajo

                repaint();
            }
        });
/////////////////////////////////////789///////////////////////////////////////
        zz789 = new Timer(140 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//q=x w=y
                btz789++;
                if (btz789 == 1) {
                    numero7 = (int) (Math.random() * 4);
                    if (numero7 == 0) {
                        q7 = 690;
                        w7 = 20;
                    }
                    if (numero7 == 1) {
                        q7 = 690;;
                        w7 = 640;
                    }
                    if (numero7 == 2) {
                        q7 = 20;
                        w7 = 345;
                    }
                    if (numero7 == 3) {
                        q7 = 1340;
                        w7 = 345;
                    }
                }

                if (btz789 == 3) {
                    numero8 = (int) (Math.random() * 4);
                    if (numero8 == 0) {
                        q8 = 690;
                        w8 = 20;
                    }
                    if (numero8 == 1) {
                        q8 = 690;;
                        w8 = 640;
                    }
                    if (numero8 == 2) {
                        q8 = 20;
                        w8 = 345;
                    }
                    if (numero8 == 3) {
                        q8 = 1340;
                        w8 = 345;
                    }
                }

                if (btz789 == 5) {
                    numero9 = (int) (Math.random() * 4);
                    if (numero9 == 0) {
                        q9 = 690;
                        w9 = 20;
                    }
                    if (numero9 == 1) {
                        q9 = 690;;
                        w9 = 640;
                    }
                    if (numero9 == 2) {
                        q9 = 20;
                        w9 = 345;
                    }
                    if (numero9 == 3) {
                        q9 = 1340;
                        w9 = 345;
                    }
                }

                /////////////////////mov7////////////////////////  
                //     public String ss7 []={"recursos/somr.png",//0normal
                //                     "recursos/soml.png", "recursos/somu.png","recursos/somd.png" };
                if (q7 >= 1400) {
                    q7 = q7 - 20;
                    f7 = 0;
                }
                if (q7 <= 0) {
                    q7 = q7 + 20;
                    f7 = 1;
                }
                if (w7 >= 710) {
                    w7 = w7 - 20;
                    f7 = 2;
                }
                if (w7 <= 0) {
                    w7 = w7 + 20;
                    f7 = 3;
                }

                if ((animacion == 1) && (q7 >= x) && (w7 >= y)) {
                    f7 = 1;
                    q7 = q7 - 5;
                }//izquierda arriba
                if ((animacion == 1) && (x >= q7) && (y >= w7)) {
                    f7 = 0;
                    q7 = q7 + 5;
                }// derecha abajo
                if ((animacion == 1) && (x >= q7) && (y <= w7)) {
                    f7 = 0;
                    q7 = q7 + 5;
                }  //derecha arriba
                if ((animacion == 1) && (q7 >= x) && (w7 <= y)) {
                    f7 = 1;
                    q7 = q7 - 5;
                }//izquierda abajo

                if ((animacion == 2) && (q7 >= x) && (w7 >= y)) {
                    f7 = 2;
                    w7 = w7 - 5;
                }//izquierda arriba
                if ((animacion == 2) && (x >= q7) && (y >= w7)) {
                    f7 = 3;
                    w7 = w7 + 5;
                }// derecha abajo
                if ((animacion == 2) && (x >= q7) && (y <= w7)) {
                    f7 = 2;
                    w7 = w7 - 5;
                }  //derecha arriba
                if ((animacion == 2) && (q7 >= x) && (w7 <= y)) {
                    f7 = 3;
                    w7 = w7 + 5;
                }//izquierda abajo

                if ((animacion == 3) && (q7 >= x) && (w7 >= y)) {
                    f7 = 2;
                    w7 = w7 - 5;
                }//izquierda arriba
                if ((animacion == 3) && (x >= q7) && (y >= w7)) {
                    f7 = 3;
                    w7 = w7 + 5;
                }// derecha abajo
                if ((animacion == 3) && (x >= q7) && (y <= w7)) {
                    f7 = 2;
                    w7 = w7 - 5;
                }  //derecha arriba
                if ((animacion == 3) && (q7 >= x) && (w7 <= y)) {
                    f7 = 3;
                    w7 = w7 + 5;
                }//izquierda abajo   

                if ((animacion == 0) && (q7 >= x) && (w7 >= y)) {
                    f7 = 1;
                    q7 = q7 - 5;
                }//izquierda arriba
                if ((animacion == 0) && (x >= q7) && (y >= w7)) {
                    f7 = 0;
                    q7 = q7 + 5;
                }// derecha abajo
                if ((animacion == 0) && (x >= q7) && (y <= w7)) {
                    f7 = 0;
                    q7 = q7 + 5;
                }  //derecha arriba
                if ((animacion == 0) && (q7 >= x) && (w7 <= y)) {
                    f7 = 1;
                    q7 = q7 - 5;
                }//izquierda abajo

                ///////////////////////////////////////////////////////////////////////////////////////////
                ///////////////move8//////////////////////////////////////////////////////////////////////
                if (q8 >= 1400) {
                    q8 = 87 - 80;
                    f8 = 8;
                }
                if (q8 <= 0) {
                    q8 = q8 + 20;
                    f8 = 1;
                }
                if (w8 >= 710) {
                    w8 = w8 - 20;
                    f8 = 2;
                }
                if (w8 <= 0) {
                    w8 = w8 + 20;
                    f8 = 3;
                }

                if ((animacion == 1) && (q8 >= x) && (w8 >= y)) {
                    f8 = 1;
                    q8 = q8 - 5;
                }//izquierda arriba
                if ((animacion == 1) && (x >= q8) && (y >= w8)) {
                    f8 = 0;
                    q8 = q8 + 5;
                }// derecha abajo
                if ((animacion == 1) && (x >= q8) && (y <= w8)) {
                    f8 = 0;
                    q8 = q8 + 5;
                }  //derecha arriba
                if ((animacion == 1) && (q8 >= x) && (w8 <= y)) {
                    f8 = 1;
                    q8 = q8 - 5;
                }//izquierda abajo

                if ((animacion == 2) && (q8 >= x) && (w8 >= y)) {
                    f8 = 2;
                    w8 = w8 - 5;
                }//izquierda arriba
                if ((animacion == 2) && (x >= q8) && (y >= w8)) {
                    f8 = 3;
                    w8 = w8 + 5;
                }// derecha abajo
                if ((animacion == 2) && (x >= q8) && (y <= w8)) {
                    f8 = 2;
                    w8 = w8 - 5;
                }  //derecha arriba
                if ((animacion == 2) && (q8 >= x) && (w8 <= y)) {
                    f8 = 3;
                    w8 = w8 + 5;
                }//izquierda abajo

                if ((animacion == 3) && (q8 >= x) && (w8 >= y)) {
                    f8 = 2;
                    w8 = w8 - 5;
                }//izquierda arriba
                if ((animacion == 3) && (x >= q8) && (y >= w8)) {
                    f8 = 3;
                    w8 = w8 + 5;
                }// derecha abajo
                if ((animacion == 3) && (x >= q8) && (y <= w8)) {
                    f8 = 2;
                    w8 = w8 - 5;
                }  //derecha arriba
                if ((animacion == 3) && (q8 >= x) && (w8 <= y)) {
                    f8 = 3;
                    w8 = w8 + 5;
                }//izquierda abajo   

                if ((animacion == 0) && (q8 >= x) && (w8 >= y)) {
                    f8 = 1;
                    q8 = q8 - 5;
                }//izquierda arriba
                if ((animacion == 0) && (x >= q8) && (y >= w8)) {
                    f8 = 0;
                    q8 = q8 + 5;
                }// derecha abajo
                if ((animacion == 0) && (x >= q8) && (y <= w8)) {
                    f8 = 0;
                    q8 = q8 + 5;
                }  //derecha arriba
                if ((animacion == 0) && (q8 >= x) && (w8 <= y)) {
                    f8 = 1;
                    q8 = q8 - 5;
                }//izquierda abajo

                //////////////////////9999
                if (q9 >= 1400) {
                    q9 = q9 - 20;
                    f9 = 0;
                }
                if (q9 <= 0) {
                    q9 = q9 + 20;
                    f9 = 1;
                }
                if (w9 >= 710) {
                    w9 = w9 - 20;
                    f9 = 2;
                }
                if (w9 <= 0) {
                    w9 = w9 + 20;
                    f9 = 3;
                }

                if ((animacion == 1) && (q9 >= x) && (w9 >= y)) {
                    f9 = 1;
                    q9 = q9 - 5;
                }//izquierda arriba
                if ((animacion == 1) && (x >= q9) && (y >= w9)) {
                    f9 = 0;
                    q9 = q9 + 5;
                }// derecha abajo
                if ((animacion == 1) && (x >= q9) && (y <= w9)) {
                    f9 = 0;
                    q9 = q9 + 5;
                }  //derecha arriba
                if ((animacion == 1) && (q9 >= x) && (w9 <= y)) {
                    f9 = 1;
                    q9 = q9 - 5;
                }//izquierda abajo

                if ((animacion == 2) && (q9 >= x) && (w9 >= y)) {
                    f9 = 2;
                    w9 = w9 - 5;
                }//izquierda arriba
                if ((animacion == 2) && (x >= q9) && (y >= w9)) {
                    f9 = 3;
                    w9 = w9 + 5;
                }// derecha abajo
                if ((animacion == 2) && (x >= q9) && (y <= w9)) {
                    f9 = 2;
                    w9 = w9 - 5;
                }  //derecha arriba
                if ((animacion == 2) && (q9 >= x) && (w9 <= y)) {
                    f9 = 3;
                    w9 = w9 + 5;
                }//izquierda abajo

                if ((animacion == 3) && (q9 >= x) && (w9 >= y)) {
                    f9 = 2;
                    w9 = w9 - 5;
                }//izquierda arriba
                if ((animacion == 3) && (x >= q9) && (y >= w9)) {
                    f9 = 3;
                    w9 = w9 + 5;
                }// derecha abajo
                if ((animacion == 3) && (x >= q9) && (y <= w9)) {
                    f9 = 2;
                    w9 = w9 - 5;
                }  //derecha arriba
                if ((animacion == 3) && (q9 >= x) && (w9 <= y)) {
                    f9 = 3;
                    w9 = w9 + 5;
                }//izquierda abajo   

                if ((animacion == 0) && (q9 > x) && (w9 > y)) {
                    f9 = 1;
                    q9 = q9 - 5;
                }//izquierda arriba
                if ((animacion == 0) && (x > q9) && (y > w9)) {
                    f9 = 0;
                    q9 = q9 + 5;
                }// derecha abajo
                if ((animacion == 0) && (x > q9) && (y < w9)) {
                    f9 = 0;
                    q9 = q9 + 5;
                }  //derecha arriba
                if ((animacion == 0) && (q9 > x) && (w9 < y)) {
                    f9 = 1;
                    q9 = q9 - 5;
                }//izquierda abajo

                repaint();
            }
        });

/////////////////zombie 1
        bti = new Timer(120 - xom, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (x1 >= 1400) {
                    x1 = x1 - 5;
                    ssc = 0;
                }
                if (x1 <= 0) {
                    x1 = x1 + 5;
                    ssc = 1;
                }
                if (y1 >= 710) {
                    y1 = y1 - 5;
                    ssc = 2;
                }
                if (y1 <= 0) {
                    y1 = y1 + 5;
                    ssc = 3;
                }

                if ((x1 >= x) && (y1 >= y)) {
                    x1 = x1 - 5;
                    ssc = 1;
                }//izquierda arriba
                if ((x >= x1) && (y >= y1)) {
                    x1 = x1 + 5;
                    ssc = 0;
                }// derecha abajo
                if ((x >= x1) && (y <= y1)) {
                    y1 = y1 - 5;
                    ssc = 2;
                }  //derecha arriba
                if ((x1 >= x) && (y1 <= y)) {
                    y1 = y1 + 5;
                    ssc = 3;
                }//izquierda abajo
                repaint();
                repaint();

            }
        });
        bti.start();

        ///timer granada///
        cr = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tgrana++;

                if ((tgrana >= 0) && (tgrana <= 20)) {
                    numg = 0;
                    if (canimacion == 0) {
                        grax = grax + 10;
                    }
                    if (canimacion == 1) {
                        grax = grax - 10;
                    }
                    if (canimacion == 2) {
                        gy = gy + 10;
                    }
                    if (canimacion == 3) {
                        gy = gy - 10;
                    }

                }
                if ((tgrana >= 56) && (tgrana <= 57)) {
                    grax = 6789;
                    quinx = 15;
                    quiny = 15;
                    tgrana = 0;
                    cr.stop();
                }

                if ((tgrana >= 26) && (tgrana <= 55)) {
                    numg = 1;
                    grax = grax - 3;
                    gy = gy - 3;
                    quinx = quinx + 5;
                    quiny = quiny + 5;

                    ////choque g z1
                    if ((grax + quinx > x1 + 0) && (grax + 0 < x1 + 25)
                            && (gy + quiny > y1 + 0) && (gy + 0 < y1 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero = (int) (Math.random() * 4);

                            if (numero == 0) {
                                x1 = 690;
                                y1 = 10;
                            }
                            if (numero == 1) {
                                x1 = 690;;
                                y1 = 640;
                            }
                            if (numero == 2) {
                                x1 = 20;
                                y1 = 345;
                            }
                            if (numero == 3) {
                                x1 = 1340;
                                y1 = 345;
                            }
                        }
                        bti.start();
                    }

                    if ((grax + quinx > xz1 + 0) && (grax + 0 < xz1 + 25)
                            && (gy + quiny > yz1 + 0) && (gy + 0 < yz1 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero2 = (int) (Math.random() * 4);

                            if (numero2 == 0) {
                                xz1 = 690;
                                yz1 = 20;
                            }
                            if (numero2 == 1) {
                                xz1 = 690;;
                                yz1 = 640;
                            }
                            if (numero2 == 2) {
                                xz1 = 20;
                                yz1 = 345;
                            }
                            if (numero2 == 3) {
                                xz1 = 1340;
                                yz1 = 345;
                            }
                        }
                        bti.start();

                    }
                    /////////////////////////////////////////////////////############3333
                    //q=x
                    // w = y
                    if ((grax + quinx > q3 + 0) && (grax + 0 < q3 + 25)
                            && (gy + quiny > w3 + 0) && (gy + 0 < w3 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero3 = (int) (Math.random() * 4);

                            if (numero3 == 0) {
                                q3 = 690;
                                w3 = 20;
                            }
                            if (numero3 == 1) {
                                q3 = 690;;
                                w3 = 640;
                            }
                            if (numero3 == 2) {
                                q3 = 20;
                                w3 = 345;
                            }
                            if (numero3 == 3) {
                                q3 = 1340;
                                w3 = 345;
                            }
                        }
                        bti.start();

                    }
                    /////////////////////////////////////////////444444
                    //q=x
                    // w = y
                    if ((grax + quinx > q4 + 0) && (grax + 0 < q4 + 25)
                            && (gy + quiny > w4 + 0) && (gy + 0 < w4 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero4 = (int) (Math.random() * 4);

                            if (numero4 == 0) {
                                q4 = 690;
                                w4 = 20;
                            }
                            if (numero4 == 1) {
                                q4 = 690;;
                                w4 = 640;
                            }
                            if (numero4 == 2) {
                                q4 = 20;
                                w4 = 345;
                            }
                            if (numero4 == 3) {
                                q4 = 1340;
                                w4 = 345;
                            }
                        }
                        bti.start();

                    }
                    ///////////////////////////////////55
                    if ((grax + quinx > q5 + 0) && (grax + 0 < q5 + 25)
                            && (gy + quiny > w5 + 0) && (gy + 0 < w5 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero5 = (int) (Math.random() * 4);

                            if (numero5 == 0) {
                                q5 = 690;
                                w5 = 20;
                            }
                            if (numero5 == 1) {
                                q5 = 690;;
                                w5 = 640;
                            }
                            if (numero5 == 2) {
                                q5 = 20;
                                w5 = 345;
                            }
                            if (numero5 == 3) {
                                q5 = 1340;
                                w5 = 345;
                            }
                        }
                        bti.start();

                    }
                    ///////////////////////////////////66
                    if ((grax + quinx > q6 + 0) && (grax + 0 < q6 + 25)
                            && (gy + quiny > w6 + 0) && (gy + 0 < w6 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero6 = (int) (Math.random() * 4);

                            if (numero6 == 0) {
                                q6 = 690;
                                w6 = 20;
                            }
                            if (numero6 == 1) {
                                q6 = 690;;
                                w6 = 640;
                            }
                            if (numero6 == 2) {
                                q6 = 20;
                                w6 = 345;
                            }
                            if (numero6 == 3) {
                                q6 = 1340;
                                w6 = 345;
                            }
                        }
                        bti.start();

                    }

                    if ((grax + quinx > q7 + 0) && (grax + 0 < q7 + 50)
                            && (gy + quiny > w7 + 0) && (gy + 0 < w7 + 50)) {
                        masz = masz + 1;
                        super7 = super7 + 1;

                        if (super7 == 2) {
                            bti.stop();
                            if (bti.isRunning() == false) {
                                numero7 = (int) (Math.random() * 4);

                                if (numero7 == 0) {
                                    q7 = 690;
                                    w7 = 20;
                                }
                                if (numero7 == 1) {
                                    q7 = 690;;
                                    w7 = 640;
                                }
                                if (numero7 == 2) {
                                    q7 = 20;
                                    w7 = 345;
                                }
                                if (numero7 == 3) {
                                    q7 = 1340;
                                    w7 = 345;
                                }
                            }
                            bti.start();
                            super7 = 0;
                        }

                    }

                    if ((grax + quinx > q8 + 0) && (grax + 0 < q8 + 50)
                            && (gy + quiny > w8 + 0) && (gy + 0 < w8 + 50)) {
                        masz = masz + 1;
                        super8 = super8 + 1;

                        if (super8 == 2) {
                            bti.stop();
                            if (bti.isRunning() == false) {
                                numero8 = (int) (Math.random() * 4);

                                if (numero8 == 0) {
                                    q8 = 690;
                                    w8 = 20;
                                }
                                if (numero8 == 1) {
                                    q8 = 690;;
                                    w8 = 640;
                                }
                                if (numero8 == 2) {
                                    q8 = 20;
                                    w8 = 345;
                                }
                                if (numero8 == 3) {
                                    q8 = 1340;
                                    w8 = 345;
                                }
                            }
                            bti.start();
                            super8 = 0;
                        }

                    }

                    if ((grax + quinx > q9 + 0) && (grax + 0 < q9 + 80)
                            && (gy + quiny > w9 + 0) && (gy + 0 < w9 + 80)) {
                        masz = masz + 1;

                        super9 = super9 + 1;

                        if (super9 == 8) {
                            bti.stop();
                            if (bti.isRunning() == false) {
                                numero9 = (int) (Math.random() * 4);

                                if (numero9 == 0) {
                                    q9 = 690;
                                    w9 = 20;
                                }
                                if (numero9 == 1) {
                                    q9 = 690;;
                                    w9 = 640;
                                }
                                if (numero9 == 2) {
                                    w9 = 20;
                                    w9 = 345;
                                }
                                if (numero9 == 3) {
                                    q9 = 1340;
                                    w9 = 345;
                                }
                            }
                            bti.start();
                            super9 = 0;
                        }

                    }
                    /////9
                    if ((grax + quinx > q10 + 0) && (grax + 0 < q10 + 25)
                            && (gy + quiny > w10 + 0) && (gy + 0 < w10 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero10 = (int) (Math.random() * 4);

                            if (numero10 == 0) {
                                q10 = 690;
                                w10 = 20;
                            }
                            if (numero10 == 1) {
                                q10 = 690;;
                                w10 = 640;
                            }
                            if (numero10 == 2) {
                                q10 = 20;
                                w10 = 345;
                            }
                            if (numero10 == 3) {
                                q10 = 1340;
                                w10 = 345;
                            }
                        }
                        bti.start();

                    }
                    /////11
                    if ((grax + quinx > q11 + 0) && (grax + 0 < q11 + 25)
                            && (gy + quiny > w11 + 0) && (gy + 0 < w11 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero11 = (int) (Math.random() * 4);

                            if (numero11 == 0) {
                                q11 = 690;
                                w11 = 20;
                            }
                            if (numero11 == 1) {
                                q11 = 690;;
                                w11 = 640;
                            }
                            if (numero11 == 2) {
                                w11 = 20;
                                w11 = 345;
                            }
                            if (numero11 == 3) {
                                q11 = 1340;
                                w11 = 345;
                            }
                        }
                        bti.start();

                    }
                    ///////////////12
                    if ((grax + quinx > q12 + 0) && (grax + 0 < q12 + 25)
                            && (gy + quiny > w12 + 0) && (gy + 0 < w12 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero12 = (int) (Math.random() * 4);

                            if (numero12 == 0) {
                                q12 = 690;
                                w12 = 20;
                            }
                            if (numero12 == 1) {
                                q12 = 690;;
                                w12 = 640;
                            }
                            if (numero12 == 2) {
                                w12 = 20;
                                w12 = 345;
                            }
                            if (numero12 == 3) {
                                q12 = 1340;
                                w12 = 345;
                            }
                        }
                        bti.start();

                    }

                    if ((grax + quinx > q13 + 0) && (grax + 0 < q13 + 25)
                            && (gy + quiny > w13 + 0) && (gy + 0 < w13 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero13 = (int) (Math.random() * 4);

                            if (numero13 == 0) {
                                q13 = 690;
                                w13 = 20;
                            }
                            if (numero13 == 1) {
                                q13 = 690;;
                                w13 = 640;
                            }
                            if (numero13 == 2) {
                                w13 = 20;
                                w13 = 345;
                            }
                            if (numero13 == 3) {
                                q13 = 1340;
                                w13 = 345;
                            }
                        }
                        bti.start();

                    }
                    if ((grax + quinx > q14 + 0) && (grax + 0 < q14 + 25)
                            && (gy + quiny > w14 + 0) && (gy + 0 < w14 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero14 = (int) (Math.random() * 4);

                            if (numero14 == 0) {
                                q14 = 690;
                                w14 = 20;
                            }
                            if (numero14 == 1) {
                                q14 = 690;;
                                w14 = 640;
                            }
                            if (numero14 == 2) {
                                w14 = 20;
                                w14 = 345;
                            }
                            if (numero14 == 3) {
                                q14 = 1340;
                                w14 = 345;
                            }
                        }
                        bti.start();

                    }

                    if ((grax + quinx > q15 + 0) && (grax + 0 < q15 + 25)
                            && (gy + quiny > w15 + 0) && (gy + 0 < w15 + 25)) {
                        masz = masz + 1;

                        bti.stop();
                        if (bti.isRunning() == false) {
                            numero15 = (int) (Math.random() * 4);

                            if (numero15 == 0) {
                                q15 = 690;
                                w15 = 20;
                            }
                            if (numero15 == 1) {
                                q15 = 690;;
                                w15 = 640;
                            }
                            if (numero15 == 2) {
                                w15 = 20;
                                w15 = 345;
                            }
                            if (numero15 == 3) {
                                q15 = 1340;
                                w15 = 345;
                            }
                        }
                        bti.start();

                    }

                    ////final de zombiens con granada///
                }

                repaint();

            }
        });
        cr.stop();

        b3 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd3++;
                if (aanimacion3 == 0) {
                    bb3 = 0;
                    x23 = x23 + 10;
                    if (asd3 == 100) {
                        asd3 = 0;
                        x23 = -2000;
                        y23 = -2000;
                        b3.stop();
                    }
                }

                if (aanimacion3 == 1) {
                    bb3 = 0;
                    x23 = x23 - 10;
                    if (asd3 == 100) {
                        asd3 = 0;
                        x23 = -2000;
                        y23 = -2000;
                        b3.stop();
                    }
                }

                if (aanimacion3 == 2) {
                    bb3 = 1;
                    y23 = y23 + 10;
                    if (asd3 == 100) {
                        asd3 = 0;
                        x23 = -2000;
                        y23 = -2000;
                        b3.stop();
                    }
                }

                if (aanimacion3 == 3) {
                    bb3 = 1;
                    y23 = y23 - 10;
                    if (asd3 == 100) {
                        asd3 = 0;
                        x23 = -2000;
                        y23 = -2000;
                        b3.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x23 + b1 > x1 + 0) && (x23 + 0 < x1 + 25) && (y23 + b2 > y1 + 0) && (y23 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b3.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x23 + b1 > xz1 + 0) && (x23 + 0 < xz1 + 25) && (y23 + b2 > yz1 + 0) && (y23 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b3.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x23 + b1 > q3 + 0) && (x23 + 0 < q3 + 25) && (y23 + b2 > w3 + 0) && (y23 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b3.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x23 + b1 > q4 + 0) && (x23 + 0 < q4 + 25) && (y23 + b2 > w4 + 0) && (y23 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b3.stop();
                }
                ///////////////////////////////////55
                if ((x23 + b1 > q5 + 0) && (x23 + 0 < q5 + 25) && (y23 + b2 > w5 + 0) && (y23 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b3.stop();
                }
                ///////////////////////////////////66
                if ((x23 + b1 > q6 + 0) && (x23 + 0 < q6 + 25) && (y23 + b2 > w6 + 0) && (y23 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b3.stop();
                }

                if ((x23 + b1 > q7 + 0) && (x23 + 0 < q7 + 50) && (y23 + b2 > w7 + 0) && (y23 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b3.stop();

                }

                if ((x23 + b1 > q8 + 0) && (x23 + 0 < q8 + 50) && (y23 + b2 > w8 + 0) && (y23 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b3.stop();
                }

                if ((x23 + b1 > q9 + 0) && (x23 + 0 < q9 + 80) && (y23 + b2 > w9 + 0) && (y23 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b3.stop();
                }
                /////9
                if ((x23 + b1 > q10 + 0) && (x23 + 0 < q10 + 25) && (y23 + b2 > w10 + 0) && (y23 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b3.stop();
                }
                /////11
                if ((x23 + b1 > q11 + 0) && (x23 + 0 < q11 + 25) && (y23 + b2 > w11 + 0) && (y23 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b3.stop();
                }
                ///////////////12
                if ((x23 + b1 > q12 + 0) && (x23 + 0 < q12 + 25) && (y23 + b2 > w12 + 0) && (y23 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b3.stop();
                }

                if ((x23 + b1 > q13 + 0) && (x23 + 0 < q13 + 25) && (y23 + b2 > w13 + 0) && (y23 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b3.stop();
                }

                if ((x23 + b1 > q14 + 0) && (x23 + 0 < q14 + 25) && (y23 + b2 > w14 + 0) && (y23 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b3.stop();
                }

                if ((x23 + b1 > q15 + 0) && (x23 + 0 < q15 + 25) && (y23 + b2 > w15 + 0) && (y23 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x23 = 2000;
                    y23 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b3.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b3.stop();

        b22 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd2++;
                if (aanimacion2 == 0) {
                    bb2 = 0;
                    x22 = x22 + 10;
                    if (asd2 == 100) {
                        asd2 = 0;
                        x22 = -2000;
                        y22 = -2000;
                        b22.stop();
                    }
                }

                if (aanimacion2 == 1) {
                    bb2 = 0;
                    x22 = x22 - 10;
                    if (asd2 == 100) {
                        asd2 = 0;
                        x22 = -2000;
                        y22 = -2000;
                        b22.stop();
                    }
                }

                if (aanimacion2 == 2) {
                    bb2 = 1;
                    y22 = y22 + 10;
                    if (asd2 == 100) {
                        asd2 = 0;
                        x22 = -2000;
                        y22 = -2000;
                        b22.stop();
                    }
                }

                if (aanimacion2 == 3) {
                    bb2 = 1;
                    y22 = y22 - 10;
                    if (asd2 == 100) {
                        asd2 = 0;
                        x22 = -2000;
                        y22 = -2000;
                        b22.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x22 + b1 > x1 + 0) && (x22 + 0 < x1 + 25) && (y22 + b2 > y1 + 0) && (y22 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b22.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x22 + b1 > xz1 + 0) && (x22 + 0 < xz1 + 25) && (y22 + b2 > yz1 + 0) && (y22 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b22.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x22 + b1 > q3 + 0) && (x22 + 0 < q3 + 25) && (y22 + b2 > w3 + 0) && (y22 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b22.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x22 + b1 > q4 + 0) && (x22 + 0 < q4 + 25) && (y22 + b2 > w4 + 0) && (y22 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b22.stop();
                }
                ///////////////////////////////////55
                if ((x22 + b1 > q5 + 0) && (x22 + 0 < q5 + 25) && (y22 + b2 > w5 + 0) && (y22 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b22.stop();
                }
                ///////////////////////////////////66
                if ((x22 + b1 > q6 + 0) && (x22 + 0 < q6 + 25) && (y22 + b2 > w6 + 0) && (y22 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b22.stop();
                }

                if ((x22 + b1 > q7 + 0) && (x22 + 0 < q7 + 50) && (y22 + b2 > w7 + 0) && (y22 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b22.stop();

                }

                if ((x22 + b1 > q8 + 0) && (x22 + 0 < q8 + 50) && (y22 + b2 > w8 + 0) && (y22 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b22.stop();
                }

                if ((x22 + b1 > q9 + 0) && (x22 + 0 < q9 + 80) && (y22 + b2 > w9 + 0) && (y22 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b22.stop();
                }
                /////9
                if ((x22 + b1 > q10 + 0) && (x22 + 0 < q10 + 25) && (y22 + b2 > w10 + 0) && (y22 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b22.stop();
                }
                /////11
                if ((x22 + b1 > q11 + 0) && (x22 + 0 < q11 + 25) && (y22 + b2 > w11 + 0) && (y22 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b22.stop();
                }
                ///////////////12
                if ((x22 + b1 > q12 + 0) && (x22 + 0 < q12 + 25) && (y22 + b2 > w12 + 0) && (y22 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b22.stop();
                }

                if ((x22 + b1 > q13 + 0) && (x22 + 0 < q13 + 25) && (y22 + b2 > w13 + 0) && (y22 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b22.stop();
                }

                if ((x22 + b1 > q14 + 0) && (x22 + 0 < q14 + 25) && (y22 + b2 > w14 + 0) && (y22 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b22.stop();
                }

                if ((x22 + b1 > q15 + 0) && (x22 + 0 < q15 + 25) && (y22 + b2 > w15 + 0) && (y22 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x22 = 2000;
                    y22 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b22.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b22.stop();

        b4 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd4++;
                if (aanimacion4 == 0) {
                    bb4 = 0;
                    x24 = x24 + 10;
                    if (asd4 == 100) {
                        asd4 = 0;
                        x24 = -2000;
                        y24 = -2000;
                        b4.stop();
                    }
                }

                if (aanimacion4 == 1) {
                    bb4 = 0;
                    x24 = x24 - 10;
                    if (asd4 == 100) {
                        asd4 = 0;
                        x24 = -2000;
                        y24 = -2000;
                        b4.stop();
                    }
                }

                if (aanimacion4 == 2) {
                    bb4 = 1;
                    y24 = y24 + 10;
                    if (asd4 == 100) {
                        asd4 = 0;
                        x24 = -2000;
                        y24 = -2000;
                        b4.stop();
                    }
                }

                if (aanimacion4 == 3) {
                    bb4 = 1;
                    y24 = y24 - 10;
                    if (asd4 == 100) {
                        asd4 = 0;
                        x24 = -2000;
                        y24 = -2000;
                        b4.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x24 + b1 > x1 + 0) && (x24 + 0 < x1 + 25) && (y24 + b2 > y1 + 0) && (y24 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b4.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x24 + b1 > xz1 + 0) && (x24 + 0 < xz1 + 25) && (y24 + b2 > yz1 + 0) && (y24 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b4.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x24 + b1 > q3 + 0) && (x24 + 0 < q3 + 25) && (y24 + b2 > w3 + 0) && (y24 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b4.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x24 + b1 > q4 + 0) && (x24 + 0 < q4 + 25) && (y24 + b2 > w4 + 0) && (y24 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b4.stop();
                }
                ///////////////////////////////////55
                if ((x24 + b1 > q5 + 0) && (x24 + 0 < q5 + 25) && (y24 + b2 > w5 + 0) && (y24 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b4.stop();
                }
                ///////////////////////////////////66
                if ((x24 + b1 > q6 + 0) && (x24 + 0 < q6 + 25) && (y24 + b2 > w6 + 0) && (y24 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b4.stop();
                }

                if ((x24 + b1 > q7 + 0) && (x24 + 0 < q7 + 50) && (y24 + b2 > w7 + 0) && (y24 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b4.stop();

                }

                if ((x24 + b1 > q8 + 0) && (x24 + 0 < q8 + 50) && (y24 + b2 > w8 + 0) && (y24 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b4.stop();
                }

                if ((x24 + b1 > q9 + 0) && (x24 + 0 < q9 + 80) && (y24 + b2 > w9 + 0) && (y24 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b4.stop();
                }
                /////9
                if ((x24 + b1 > q10 + 0) && (x24 + 0 < q10 + 25) && (y24 + b2 > w10 + 0) && (y24 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b4.stop();
                }
                /////11
                if ((x24 + b1 > q11 + 0) && (x24 + 0 < q11 + 25) && (y24 + b2 > w11 + 0) && (y24 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b4.stop();
                }
                ///////////////12
                if ((x24 + b1 > q12 + 0) && (x24 + 0 < q12 + 25) && (y24 + b2 > w12 + 0) && (y24 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b4.stop();
                }

                if ((x24 + b1 > q13 + 0) && (x24 + 0 < q13 + 25) && (y24 + b2 > w13 + 0) && (y24 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b4.stop();
                }

                if ((x24 + b1 > q14 + 0) && (x24 + 0 < q14 + 25) && (y24 + b2 > w14 + 0) && (y24 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b4.stop();
                }

                if ((x24 + b1 > q15 + 0) && (x24 + 0 < q15 + 25) && (y24 + b2 > w15 + 0) && (y24 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x24 = 2000;
                    y24 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b4.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b4.stop();

        b6 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd6++;
                if (aanimacion6 == 0) {
                    bb6 = 0;
                    x26 = x26 + 10;
                    if (asd6 == 100) {
                        asd6 = 0;
                        x26 = -2000;
                        y26 = -2000;
                        b6.stop();
                    }
                }

                if (aanimacion6 == 1) {
                    bb6 = 0;
                    x26 = x26 - 10;
                    if (asd6 == 100) {
                        asd6 = 0;
                        x26 = -2000;
                        y26 = -2000;
                        b6.stop();
                    }
                }

                if (aanimacion6 == 2) {
                    bb6 = 1;
                    y26 = y26 + 10;
                    if (asd6 == 100) {
                        asd6 = 0;
                        x26 = -2000;
                        y26 = -2000;
                        b6.stop();
                    }
                }

                if (aanimacion6 == 3) {
                    bb6 = 1;
                    y26 = y26 - 10;
                    if (asd6 == 100) {
                        asd6 = 0;
                        x26 = -2000;
                        y26 = -2000;
                        b6.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x26 + b1 > x1 + 0) && (x26 + 0 < x1 + 25) && (y26 + b2 > y1 + 0) && (y26 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b6.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x26 + b1 > xz1 + 0) && (x26 + 0 < xz1 + 25) && (y26 + b2 > yz1 + 0) && (y26 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b6.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x26 + b1 > q3 + 0) && (x26 + 0 < q3 + 25) && (y26 + b2 > w3 + 0) && (y26 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b6.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x26 + b1 > q4 + 0) && (x26 + 0 < q4 + 25) && (y26 + b2 > w4 + 0) && (y26 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b6.stop();
                }
                ///////////////////////////////////55
                if ((x26 + b1 > q5 + 0) && (x26 + 0 < q5 + 25) && (y26 + b2 > w5 + 0) && (y26 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b6.stop();
                }
                ///////////////////////////////////66
                if ((x26 + b1 > q6 + 0) && (x26 + 0 < q6 + 25) && (y26 + b2 > w6 + 0) && (y26 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b6.stop();
                }

                if ((x26 + b1 > q7 + 0) && (x26 + 0 < q7 + 50) && (y26 + b2 > w7 + 0) && (y26 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b6.stop();

                }

                if ((x26 + b1 > q8 + 0) && (x26 + 0 < q8 + 50) && (y26 + b2 > w8 + 0) && (y26 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b6.stop();
                }

                if ((x26 + b1 > q9 + 0) && (x26 + 0 < q9 + 80) && (y26 + b2 > w9 + 0) && (y26 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b6.stop();
                }
                /////9
                if ((x26 + b1 > q10 + 0) && (x26 + 0 < q10 + 25) && (y26 + b2 > w10 + 0) && (y26 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b6.stop();
                }
                /////11
                if ((x26 + b1 > q11 + 0) && (x26 + 0 < q11 + 25) && (y26 + b2 > w11 + 0) && (y26 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b6.stop();
                }
                ///////////////12
                if ((x26 + b1 > q12 + 0) && (x26 + 0 < q12 + 25) && (y26 + b2 > w12 + 0) && (y26 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b6.stop();
                }

                if ((x26 + b1 > q13 + 0) && (x26 + 0 < q13 + 25) && (y26 + b2 > w13 + 0) && (y26 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b6.stop();
                }

                if ((x26 + b1 > q14 + 0) && (x26 + 0 < q14 + 25) && (y26 + b2 > w14 + 0) && (y26 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b6.stop();
                }

                if ((x26 + b1 > q15 + 0) && (x26 + 0 < q15 + 25) && (y26 + b2 > w15 + 0) && (y26 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x26 = 2000;
                    y26 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b6.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b6.stop();

        b5 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd5++;
                if (aanimacion5 == 0) {
                    bb5 = 0;
                    x25 = x25 + 10;
                    if (asd5 == 100) {
                        asd5 = 0;
                        x25 = -2000;
                        y25 = -2000;
                        b5.stop();
                    }
                }

                if (aanimacion5 == 1) {
                    bb5 = 0;
                    x25 = x25 - 10;
                    if (asd5 == 100) {
                        asd5 = 0;
                        x25 = -2000;
                        y25 = -2000;
                        b5.stop();
                    }
                }

                if (aanimacion5 == 2) {
                    bb5 = 1;
                    y25 = y25 + 10;
                    if (asd5 == 100) {
                        asd5 = 0;
                        x25 = -2000;
                        y25 = -2000;
                        b5.stop();
                    }
                }

                if (aanimacion5 == 3) {
                    bb5 = 1;
                    y25 = y25 - 10;
                    if (asd5 == 100) {
                        asd5 = 0;
                        x25 = -2000;
                        y25 = -2000;
                        b5.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x25 + b1 > x1 + 0) && (x25 + 0 < x1 + 25) && (y25 + b2 > y1 + 0) && (y25 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b5.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x25 + b1 > xz1 + 0) && (x25 + 0 < xz1 + 25) && (y25 + b2 > yz1 + 0) && (y25 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b5.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x25 + b1 > q3 + 0) && (x25 + 0 < q3 + 25) && (y25 + b2 > w3 + 0) && (y25 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b5.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x25 + b1 > q4 + 0) && (x25 + 0 < q4 + 25) && (y25 + b2 > w4 + 0) && (y25 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b5.stop();
                }
                ///////////////////////////////////55
                if ((x25 + b1 > q5 + 0) && (x25 + 0 < q5 + 25) && (y25 + b2 > w5 + 0) && (y25 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b5.stop();
                }
                ///////////////////////////////////66
                if ((x25 + b1 > q6 + 0) && (x25 + 0 < q6 + 25) && (y25 + b2 > w6 + 0) && (y25 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b5.stop();
                }

                if ((x25 + b1 > q7 + 0) && (x25 + 0 < q7 + 50) && (y25 + b2 > w7 + 0) && (y25 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b5.stop();

                }

                if ((x25 + b1 > q8 + 0) && (x25 + 0 < q8 + 50) && (y25 + b2 > w8 + 0) && (y25 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b5.stop();
                }

                if ((x25 + b1 > q9 + 0) && (x25 + 0 < q9 + 80) && (y25 + b2 > w9 + 0) && (y25 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b5.stop();
                }
                /////9
                if ((x25 + b1 > q10 + 0) && (x25 + 0 < q10 + 25) && (y25 + b2 > w10 + 0) && (y25 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b5.stop();
                }
                /////11
                if ((x25 + b1 > q11 + 0) && (x25 + 0 < q11 + 25) && (y25 + b2 > w11 + 0) && (y25 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b5.stop();
                }
                ///////////////12
                if ((x25 + b1 > q12 + 0) && (x25 + 0 < q12 + 25) && (y25 + b2 > w12 + 0) && (y25 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b5.stop();
                }

                if ((x25 + b1 > q13 + 0) && (x25 + 0 < q13 + 25) && (y25 + b2 > w13 + 0) && (y25 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b5.stop();
                }

                if ((x25 + b1 > q14 + 0) && (x25 + 0 < q14 + 25) && (y25 + b2 > w14 + 0) && (y25 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b5.stop();
                }

                if ((x25 + b1 > q15 + 0) && (x25 + 0 < q15 + 25) && (y25 + b2 > w15 + 0) && (y25 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x25 = 2000;
                    y25 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b5.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b5.stop();

        b7 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd7++;
                if (aanimacion7 == 0) {
                    bb7 = 0;
                    x27 = x27 + 10;
                    if (asd7 == 100) {
                        asd7 = 0;
                        x27 = -2000;
                        y27 = -2000;
                        b7.stop();
                    }
                }

                if (aanimacion7 == 1) {
                    bb7 = 0;
                    x27 = x27 - 10;
                    if (asd7 == 100) {
                        asd7 = 0;
                        x27 = -2000;
                        y27 = -2000;
                        b7.stop();
                    }
                }

                if (aanimacion7 == 2) {
                    bb7 = 1;
                    y27 = y27 + 10;
                    if (asd7 == 100) {
                        asd7 = 0;
                        x27 = -2000;
                        y27 = -2000;
                        b7.stop();
                    }
                }

                if (aanimacion7 == 3) {
                    bb7 = 1;
                    y27 = y27 - 10;
                    if (asd7 == 100) {
                        asd7 = 0;
                        x27 = -2000;
                        y27 = -2000;
                        b7.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x27 + b1 > x1 + 0) && (x27 + 0 < x1 + 25) && (y27 + b2 > y1 + 0) && (y27 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b7.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x27 + b1 > xz1 + 0) && (x27 + 0 < xz1 + 25) && (y27 + b2 > yz1 + 0) && (y27 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b7.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x27 + b1 > q3 + 0) && (x27 + 0 < q3 + 25) && (y27 + b2 > w3 + 0) && (y27 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b7.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x27 + b1 > q4 + 0) && (x27 + 0 < q4 + 25) && (y27 + b2 > w4 + 0) && (y27 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b7.stop();
                }
                ///////////////////////////////////55
                if ((x27 + b1 > q5 + 0) && (x27 + 0 < q5 + 25) && (y27 + b2 > w5 + 0) && (y27 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b7.stop();
                }
                ///////////////////////////////////66
                if ((x27 + b1 > q6 + 0) && (x27 + 0 < q6 + 25) && (y27 + b2 > w6 + 0) && (y27 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b7.stop();
                }

                if ((x27 + b1 > q7 + 0) && (x27 + 0 < q7 + 50) && (y27 + b2 > w7 + 0) && (y27 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b7.stop();

                }

                if ((x27 + b1 > q8 + 0) && (x27 + 0 < q8 + 50) && (y27 + b2 > w8 + 0) && (y27 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b7.stop();
                }

                if ((x27 + b1 > q9 + 0) && (x27 + 0 < q9 + 80) && (y27 + b2 > w9 + 0) && (y27 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b7.stop();
                }
                /////9
                if ((x27 + b1 > q10 + 0) && (x27 + 0 < q10 + 25) && (y27 + b2 > w10 + 0) && (y27 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b7.stop();
                }
                /////11
                if ((x27 + b1 > q11 + 0) && (x27 + 0 < q11 + 25) && (y27 + b2 > w11 + 0) && (y27 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b7.stop();
                }
                ///////////////12
                if ((x27 + b1 > q12 + 0) && (x27 + 0 < q12 + 25) && (y27 + b2 > w12 + 0) && (y27 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b7.stop();
                }

                if ((x27 + b1 > q13 + 0) && (x27 + 0 < q13 + 25) && (y27 + b2 > w13 + 0) && (y27 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b7.stop();
                }

                if ((x27 + b1 > q14 + 0) && (x27 + 0 < q14 + 25) && (y27 + b2 > w14 + 0) && (y27 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b7.stop();
                }

                if ((x27 + b1 > q15 + 0) && (x27 + 0 < q15 + 25) && (y27 + b2 > w15 + 0) && (y27 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x27 = 2000;
                    y27 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b7.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b7.stop();

        b10 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd10++;
                if (aanimacion10 == 0) {
                    bb10 = 0;
                    x210 = x210 + 10;
                    if (asd10 == 100) {
                        asd10 = 0;
                        x210 = -2000;
                        y210 = -2000;
                        b10.stop();
                    }
                }

                if (aanimacion10 == 1) {
                    bb10 = 0;
                    x210 = x210 - 10;
                    if (asd10 == 100) {
                        asd10 = 0;
                        x210 = -2000;
                        y210 = -2000;
                        b10.stop();
                    }
                }

                if (aanimacion10 == 2) {
                    bb10 = 1;
                    y210 = y210 + 10;
                    if (asd10 == 100) {
                        asd10 = 0;
                        x210 = -2000;
                        y210 = -2000;
                        b10.stop();
                    }
                }

                if (aanimacion10 == 3) {
                    bb10 = 1;
                    y210 = y210 - 10;
                    if (asd10 == 100) {
                        asd10 = 0;
                        x210 = -2000;
                        y210 = -2000;
                        b10.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x210 + b1 > x1 + 0) && (x210 + 0 < x1 + 25) && (y210 + b2 > y1 + 0) && (y210 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b10.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x210 + b1 > xz1 + 0) && (x210 + 0 < xz1 + 25) && (y210 + b2 > yz1 + 0) && (y210 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b10.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x210 + b1 > q3 + 0) && (x210 + 0 < q3 + 25) && (y210 + b2 > w3 + 0) && (y210 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b10.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x210 + b1 > q4 + 0) && (x210 + 0 < q4 + 25) && (y210 + b2 > w4 + 0) && (y210 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b10.stop();
                }
                ///////////////////////////////////55
                if ((x210 + b1 > q5 + 0) && (x210 + 0 < q5 + 25) && (y210 + b2 > w5 + 0) && (y210 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b10.stop();
                }
                ///////////////////////////////////66
                if ((x210 + b1 > q6 + 0) && (x210 + 0 < q6 + 25) && (y210 + b2 > w6 + 0) && (y210 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b10.stop();
                }

                if ((x210 + b1 > q7 + 0) && (x210 + 0 < q7 + 50) && (y210 + b2 > w7 + 0) && (y210 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b10.stop();

                }

                if ((x210 + b1 > q8 + 0) && (x210 + 0 < q8 + 50) && (y210 + b2 > w8 + 0) && (y210 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b10.stop();
                }

                if ((x210 + b1 > q9 + 0) && (x210 + 0 < q9 + 80) && (y210 + b2 > w9 + 0) && (y210 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b10.stop();
                }
                /////9
                if ((x210 + b1 > q10 + 0) && (x210 + 0 < q10 + 25) && (y210 + b2 > w10 + 0) && (y210 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b10.stop();
                }
                /////11
                if ((x210 + b1 > q11 + 0) && (x210 + 0 < q11 + 25) && (y210 + b2 > w11 + 0) && (y210 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b10.stop();
                }
                ///////////////12
                if ((x210 + b1 > q12 + 0) && (x210 + 0 < q12 + 25) && (y210 + b2 > w12 + 0) && (y210 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b10.stop();
                }

                if ((x210 + b1 > q13 + 0) && (x210 + 0 < q13 + 25) && (y210 + b2 > w13 + 0) && (y210 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b10.stop();
                }

                if ((x210 + b1 > q14 + 0) && (x210 + 0 < q14 + 25) && (y210 + b2 > w14 + 0) && (y210 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b10.stop();
                }

                if ((x210 + b1 > q15 + 0) && (x210 + 0 < q15 + 25) && (y210 + b2 > w15 + 0) && (y210 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x210 = 2000;
                    y210 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b10.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b10.stop();

        b9 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd9++;
                if (aanimacion9 == 0) {
                    bb9 = 0;
                    x29 = x29 + 10;
                    if (asd9 == 100) {
                        asd9 = 0;
                        x29 = -2000;
                        y29 = -2000;
                        b9.stop();
                    }
                }

                if (aanimacion9 == 1) {
                    bb9 = 0;
                    x29 = x29 - 10;
                    if (asd9 == 100) {
                        asd9 = 0;
                        x29 = -2000;
                        y29 = -2000;
                        b9.stop();
                    }
                }

                if (aanimacion9 == 2) {
                    bb9 = 1;
                    y29 = y29 + 10;
                    if (asd9 == 100) {
                        asd9 = 0;
                        x29 = -2000;
                        y29 = -2000;
                        b9.stop();
                    }
                }

                if (aanimacion9 == 3) {
                    bb9 = 1;
                    y29 = y29 - 10;
                    if (asd9 == 100) {
                        asd9 = 0;
                        x29 = -2000;
                        y29 = -2000;
                        b9.stop();
                    }
                }

                ///++++++++++++++++++++++CHOQUE BALA ZOMBIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x29 + b1 > x1 + 0) && (x29 + 0 < x1 + 25) && (y29 + b2 > y1 + 0) && (y29 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b9.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x29 + b1 > xz1 + 0) && (x29 + 0 < xz1 + 25) && (y29 + b2 > yz1 + 0) && (y29 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b9.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x29 + b1 > q3 + 0) && (x29 + 0 < q3 + 25) && (y29 + b2 > w3 + 0) && (y29 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b9.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x29 + b1 > q4 + 0) && (x29 + 0 < q4 + 25) && (y29 + b2 > w4 + 0) && (y29 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b9.stop();
                }
                ///////////////////////////////////55
                if ((x29 + b1 > q5 + 0) && (x29 + 0 < q5 + 25) && (y29 + b2 > w5 + 0) && (y29 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b9.stop();
                }
                ///////////////////////////////////66
                if ((x29 + b1 > q6 + 0) && (x29 + 0 < q6 + 25) && (y29 + b2 > w6 + 0) && (y29 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b9.stop();
                }

                if ((x29 + b1 > q7 + 0) && (x29 + 0 < q7 + 50) && (y29 + b2 > w7 + 0) && (y29 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b9.stop();

                }

                if ((x29 + b1 > q8 + 0) && (x29 + 0 < q8 + 50) && (y29 + b2 > w8 + 0) && (y29 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b9.stop();
                }

                if ((x29 + b1 > q9 + 0) && (x29 + 0 < q9 + 80) && (y29 + b2 > w9 + 0) && (y29 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 3) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b9.stop();
                }
                /////9
                if ((x29 + b1 > q10 + 0) && (x29 + 0 < q10 + 25) && (y29 + b2 > w10 + 0) && (y29 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b9.stop();
                }
                /////11
                if ((x29 + b1 > q11 + 0) && (x29 + 0 < q11 + 25) && (y29 + b2 > w11 + 0) && (y29 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b9.stop();
                }
                ///////////////12
                if ((x29 + b1 > q12 + 0) && (x29 + 0 < q12 + 25) && (y29 + b2 > w12 + 0) && (y29 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b9.stop();
                }

                if ((x29 + b1 > q13 + 0) && (x29 + 0 < q13 + 25) && (y29 + b2 > w13 + 0) && (y29 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b9.stop();
                }

                if ((x29 + b1 > q14 + 0) && (x29 + 0 < q14 + 25) && (y29 + b2 > w14 + 0) && (y29 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b9.stop();
                }

                if ((x29 + b1 > q15 + 0) && (x29 + 0 < q15 + 25) && (y29 + b2 > w15 + 0) && (y29 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x29 = 2000;
                    y29 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b9.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b9.stop();

        b8 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                asd8++;
                if (aanimacion8 == 0) {
                    bb8 = 0;
                    x28 = x28 + 10;
                    if (asd8 == 100) {
                        asd8 = 0;
                        x28 = -2000;
                        y28 = -2000;
                        b8.stop();
                    }
                }

                if (aanimacion8 == 1) {
                    bb8 = 0;
                    x28 = x28 - 10;
                    if (asd8 == 100) {
                        asd8 = 0;
                        x28 = -2000;
                        y28 = -2000;
                        b8.stop();
                    }
                }

                if (aanimacion8 == 2) {
                    bb8 = 1;
                    y28 = y28 + 10;
                    if (asd8 == 100) {
                        asd8 = 0;
                        x28 = -2000;
                        y28 = -2000;
                        b8.stop();
                    }
                }

                if (aanimacion8 == 3) {
                    bb8 = 1;
                    y28 = y28 - 10;
                    if (asd8 == 100) {
                        asd8 = 0;
                        x28 = -2000;
                        y28 = -2000;
                        b8.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x28 + b1 > x1 + 0) && (x28 + 0 < x1 + 25) && (y28 + b2 > y1 + 0) && (y28 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    b8.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x28 + b1 > xz1 + 0) && (x28 + 0 < xz1 + 25) && (y28 + b2 > yz1 + 0) && (y28 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    b8.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x28 + b1 > q3 + 0) && (x28 + 0 < q3 + 25) && (y28 + b2 > w3 + 0) && (y28 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    b8.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x28 + b1 > q4 + 0) && (x28 + 0 < q4 + 25) && (y28 + b2 > w4 + 0) && (y28 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    b8.stop();
                }
                ///////////////////////////////////55
                if ((x28 + b1 > q5 + 0) && (x28 + 0 < q5 + 25) && (y28 + b2 > w5 + 0) && (y28 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    b8.stop();
                }
                ///////////////////////////////////66
                if ((x28 + b1 > q6 + 0) && (x28 + 0 < q6 + 25) && (y28 + b2 > w6 + 0) && (y28 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    b8.stop();
                }

                if ((x28 + b1 > q7 + 0) && (x28 + 0 < q7 + 50) && (y28 + b2 > w7 + 0) && (y28 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    b8.stop();

                }

                if ((x28 + b1 > q8 + 0) && (x28 + 0 < q8 + 50) && (y28 + b2 > w8 + 0) && (y28 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    b8.stop();
                }

                if ((x28 + b1 > q9 + 0) && (x28 + 0 < q9 + 80) && (y28 + b2 > w9 + 0) && (y28 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 8) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    b8.stop();
                }
                /////9
                if ((x28 + b1 > q10 + 0) && (x28 + 0 < q10 + 25) && (y28 + b2 > w10 + 0) && (y28 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    b8.stop();
                }
                /////11
                if ((x28 + b1 > q11 + 0) && (x28 + 0 < q11 + 25) && (y28 + b2 > w11 + 0) && (y28 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    b8.stop();
                }
                ///////////////12
                if ((x28 + b1 > q12 + 0) && (x28 + 0 < q12 + 25) && (y28 + b2 > w12 + 0) && (y28 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    b8.stop();
                }

                if ((x28 + b1 > q13 + 0) && (x28 + 0 < q13 + 25) && (y28 + b2 > w13 + 0) && (y28 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    b8.stop();
                }

                if ((x28 + b1 > q14 + 0) && (x28 + 0 < q14 + 25) && (y28 + b2 > w14 + 0) && (y28 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    b8.stop();
                }

                if ((x28 + b1 > q15 + 0) && (x28 + 0 < q15 + 25) && (y28 + b2 > w15 + 0) && (y28 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x28 = 2000;
                    y28 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    b8.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        b8.stop();

        balatiempo = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tbala++;
                if (aanimacion == 0) {
                    bb = 0;
                    x2 = x2 + 10;
                    if (tbala == 100) {
                        tbala = 0;
                        x2 = -2000;
                        y2 = -2000;
                        balatiempo.stop();
                    }
                }

                if (aanimacion == 1) {
                    bb = 0;
                    x2 = x2 - 10;
                    if (tbala == 100) {
                        tbala = 0;
                        x2 = -2000;
                        y2 = -2000;
                        balatiempo.stop();
                    }
                }

                if (aanimacion == 2) {
                    bb = 1;
                    y2 = y2 + 10;
                    if (tbala == 100) {
                        tbala = 0;
                        x2 = -2000;
                        y2 = -2000;
                        balatiempo.stop();
                    }
                }

                if (aanimacion == 3) {
                    bb = 1;
                    y2 = y2 - 10;
                    if (tbala == 100) {
                        tbala = 0;
                        x2 = -2000;
                        y2 = -2000;
                        balatiempo.stop();
                    }
                }

                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 1 ++++++++++++++++++++++++++++/// 
                //los "2" de bala
                //los "1" de primer zombie
                if ((x2 + b1 > x1 + 0) && (x2 + 0 < x1 + 25) && (y2 + b2 > y1 + 0) && (y2 + 0 < y1 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero = (int) (Math.random() * 4);
                    if (numero == 0) {
                        x1 = 690;
                        y1 = 10;
                    }
                    if (numero == 1) {
                        x1 = 690;;
                        y1 = 640;
                    }
                    if (numero == 2) {
                        x1 = 20;
                        y1 = 345;
                    }
                    if (numero == 3) {
                        x1 = 1340;
                        y1 = 345;
                    }
                    balatiempo.stop();
                }
                ///++++++++++++++++++++++CHOqUE bALA ZoMbIE 2 ++++++++++++++++++++++++++++///    

                if ((x2 + b1 > xz1 + 0) && (x2 + 0 < xz1 + 25) && (y2 + b2 > yz1 + 0) && (y2 + 0 < yz1 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero2 = (int) (Math.random() * 4);
                    if (numero2 == 0) {
                        xz1 = 690;
                        yz1 = 20;
                    }
                    if (numero2 == 1) {
                        xz1 = 690;;
                        yz1 = 640;
                    }
                    if (numero2 == 2) {
                        xz1 = 20;
                        yz1 = 345;
                    }
                    if (numero2 == 3) {
                        xz1 = 1340;
                        yz1 = 345;
                    }
                    balatiempo.stop();
                }
                /////////////////////////////////////////////////////############3333
                //q=x
                // w = y
                if ((x2 + b1 > q3 + 0) && (x2 + 0 < q3 + 25) && (y2 + b2 > w3 + 0) && (y2 + 0 < w3 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero3 = (int) (Math.random() * 4);
                    if (numero3 == 0) {
                        q3 = 690;
                        w3 = 20;
                    }
                    if (numero3 == 1) {
                        q3 = 690;;
                        w3 = 640;
                    }
                    if (numero3 == 2) {
                        q3 = 20;
                        w3 = 345;
                    }
                    if (numero3 == 3) {
                        q3 = 1340;
                        w3 = 345;
                    }
                    balatiempo.stop();
                }
                /////////////////////////////////////////////444444
                //q=x
                // w = y
                if ((x2 + b1 > q4 + 0) && (x2 + 0 < q4 + 25) && (y2 + b2 > w4 + 0) && (y2 + 0 < w4 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero4 = (int) (Math.random() * 4);
                    if (numero4 == 0) {
                        q4 = 690;
                        w4 = 20;
                    }
                    if (numero4 == 1) {
                        q4 = 690;;
                        w4 = 640;
                    }
                    if (numero4 == 2) {
                        q4 = 20;
                        w4 = 345;
                    }
                    if (numero4 == 3) {
                        q4 = 1340;
                        w4 = 345;
                    }
                    balatiempo.stop();
                }
                ///////////////////////////////////55
                if ((x2 + b1 > q5 + 0) && (x2 + 0 < q5 + 25) && (y2 + b2 > w5 + 0) && (y2 + 0 < w5 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero5 = (int) (Math.random() * 4);
                    if (numero5 == 0) {
                        q5 = 690;
                        w5 = 20;
                    }
                    if (numero5 == 1) {
                        q5 = 690;;
                        w5 = 640;
                    }
                    if (numero5 == 2) {
                        q5 = 20;
                        w5 = 345;
                    }
                    if (numero5 == 3) {
                        q5 = 1340;
                        w5 = 345;
                    }
                    balatiempo.stop();
                }
                ///////////////////////////////////66
                if ((x2 + b1 > q6 + 0) && (x2 + 0 < q6 + 25) && (y2 + b2 > w6 + 0) && (y2 + 0 < w6 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero6 = (int) (Math.random() * 4);
                    if (numero6 == 0) {
                        q6 = 690;
                        w6 = 20;
                    }
                    if (numero6 == 1) {
                        q6 = 690;;
                        w6 = 640;
                    }
                    if (numero6 == 2) {
                        q6 = 20;
                        w6 = 345;
                    }
                    if (numero6 == 3) {
                        q6 = 1340;
                        w6 = 345;
                    }
                    balatiempo.stop();
                }

                if ((x2 + b1 > q7 + 0) && (x2 + 0 < q7 + 50) && (y2 + b2 > w7 + 0) && (y2 + 0 < w7 + 50)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    super7 = super7 + 1;
                    if (super7 == 2) {
                        numero7 = (int) (Math.random() * 4);
                        if (numero7 == 0) {
                            q7 = 690;
                            w7 = 20;
                        }
                        if (numero7 == 1) {
                            q7 = 690;;
                            w7 = 640;
                        }
                        if (numero7 == 2) {
                            q7 = 20;
                            w7 = 345;
                        }
                        if (numero7 == 3) {
                            q7 = 1340;
                            w7 = 345;
                            super7 = 0;
                        }
                        super7 = 0;
                    }
                    balatiempo.stop();

                }

                if ((x2 + b1 > q8 + 0) && (x2 + 0 < q8 + 50) && (y2 + b2 > w8 + 0) && (y2 + 0 < w8 + 50)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    super8 = super8 + 1;
                    if (super8 == 2) {
                        numero8 = (int) (Math.random() * 4);
                        if (numero8 == 0) {
                            q8 = 690;
                            w8 = 20;
                        }
                        if (numero8 == 1) {
                            q8 = 690;;
                            w8 = 640;
                        }
                        if (numero8 == 2) {
                            q8 = 20;
                            w8 = 345;
                        }
                        if (numero8 == 3) {
                            q8 = 1340;
                            w8 = 345;
                        }
                        super8 = 0;
                    }
                    balatiempo.stop();
                }

                if ((x2 + b1 > q9 + 0) && (x2 + 0 < q9 + 80) && (y2 + b2 > w9 + 0) && (y2 + 0 < w9 + 80)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    super9 = super9 + 1;
                    if (super9 == 8) {
                        numero9 = (int) (Math.random() * 4);
                        if (numero9 == 0) {
                            q9 = 690;
                            w9 = 20;
                        }
                        if (numero9 == 1) {
                            q9 = 690;;
                            w9 = 640;
                        }
                        if (numero9 == 2) {
                            w9 = 20;
                            w9 = 345;
                        }
                        if (numero9 == 3) {
                            q9 = 1340;
                            w9 = 345;
                        }
                        super9 = 0;
                    }
                    balatiempo.stop();
                }
                /////9
                if ((x2 + b1 > q10 + 0) && (x2 + 0 < q10 + 25) && (y2 + b2 > w10 + 0) && (y2 + 0 < w10 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero10 = (int) (Math.random() * 4);
                    if (numero10 == 0) {
                        q10 = 690;
                        w10 = 20;
                    }
                    if (numero10 == 1) {
                        q10 = 690;;
                        w10 = 640;
                    }
                    if (numero10 == 2) {
                        q10 = 20;
                        w10 = 345;
                    }
                    if (numero10 == 3) {
                        q10 = 1340;
                        w10 = 345;
                    }
                    balatiempo.stop();
                }
                /////11
                if ((x2 + b1 > q11 + 0) && (x2 + 0 < q11 + 25) && (y2 + b2 > w11 + 0) && (y2 + 0 < w11 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero11 = (int) (Math.random() * 4);
                    if (numero11 == 0) {
                        q11 = 690;
                        w11 = 20;
                    }
                    if (numero11 == 1) {
                        q11 = 690;;
                        w11 = 640;
                    }
                    if (numero11 == 2) {
                        w11 = 20;
                        w11 = 345;
                    }
                    if (numero11 == 3) {
                        q11 = 1340;
                        w11 = 345;
                    }
                    balatiempo.stop();
                }
                ///////////////12
                if ((x2 + b1 > q12 + 0) && (x2 + 0 < q12 + 25) && (y2 + b2 > w12 + 0) && (y2 + 0 < w12 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero12 = (int) (Math.random() * 4);
                    if (numero12 == 0) {
                        q12 = 690;
                        w12 = 20;
                    }
                    if (numero12 == 1) {
                        q12 = 690;;
                        w12 = 640;
                    }
                    if (numero12 == 2) {
                        w12 = 20;
                        w12 = 345;
                    }
                    if (numero12 == 3) {
                        q12 = 1340;
                        w12 = 345;
                    }
                    balatiempo.stop();
                }

                if ((x2 + b1 > q13 + 0) && (x2 + 0 < q13 + 25) && (y2 + b2 > w13 + 0) && (y2 + 0 < w13 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero13 = (int) (Math.random() * 4);
                    if (numero13 == 0) {
                        q13 = 690;
                        w13 = 20;
                    }
                    if (numero13 == 1) {
                        q13 = 690;;
                        w13 = 640;
                    }
                    if (numero13 == 2) {
                        w13 = 20;
                        w13 = 345;
                    }
                    if (numero13 == 3) {
                        q13 = 1340;
                        w13 = 345;
                    }
                    balatiempo.stop();
                }

                if ((x2 + b1 > q14 + 0) && (x2 + 0 < q14 + 25) && (y2 + b2 > w14 + 0) && (y2 + 0 < w14 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero14 = (int) (Math.random() * 4);
                    if (numero14 == 0) {
                        q14 = 690;
                        w14 = 20;
                    }
                    if (numero14 == 1) {
                        q14 = 690;;
                        w14 = 640;
                    }
                    if (numero14 == 2) {
                        w14 = 20;
                        w14 = 345;
                    }
                    if (numero14 == 3) {
                        q14 = 1340;
                        w14 = 345;
                    }
                    balatiempo.stop();
                }

                if ((x2 + b1 > q15 + 0) && (x2 + 0 < q15 + 25) && (y2 + b2 > w15 + 0) && (y2 + 0 < w15 + 25)) {
                    masz = masz + 1;
                    x2 = 2000;
                    y2 = 2000;
                    numero15 = (int) (Math.random() * 4);
                    if (numero15 == 0) {
                        q15 = 690;
                        w15 = 20;
                    }
                    if (numero15 == 1) {
                        q15 = 690;;
                        w15 = 640;
                    }
                    if (numero15 == 2) {
                        w15 = 20;
                        w15 = 345;
                    }
                    if (numero15 == 3) {
                        q15 = 1340;
                        w15 = 345;
                    }
                    balatiempo.stop();
                }

                /////////////////////////////////////aparicion zombies//////////////////////////////////////
                ///0-1   
                repaint();
            }
        });
        balatiempo.stop();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (bb == 0) {
            b1 = 25;
            b2 = 5;
        }
        if (bb == 1) {
            b2 = 25;
            b1 = 5;
        }
        if (bb2 == 0) {
            b12 = 25;
            b222 = 5;
        }
        if (bb2 == 1) {
            b222 = 25;
            b12 = 5;
        }
        if (bb3 == 0) {
            b13 = 25;
            b23 = 5;
        }
        if (bb3 == 1) {
            b23 = 25;
            b13 = 5;
        }
        if (bb4 == 0) {
            b14 = 25;
            b24 = 5;
        }
        if (bb4 == 1) {
            b24 = 25;
            b14 = 5;
        }
        if (bb5 == 0) {
            b15 = 25;
            b25 = 5;
        }
        if (bb5 == 1) {
            b15 = 25;
            b15 = 5;
        }
        if (bb6 == 0) {
            b16 = 25;
            b26 = 5;
        }
        if (bb6 == 1) {
            b16 = 25;
            b16 = 5;
        }
        if (bb7 == 0) {
            b17 = 25;
            b27 = 5;
        }
        if (bb7 == 1) {
            b27 = 25;
            b17 = 5;
        }
        if (bb8 == 0) {
            b18 = 25;
            b28 = 5;
        }
        if (bb8 == 1) {
            b28 = 25;
            b18 = 5;
        }
        if (bb9 == 0) {
            b19 = 25;
            b29 = 5;
        }
        if (bb9 == 1) {
            b29 = 25;
            b19 = 5;
        }
        if (bb10 == 0) {
            b110 = 25;
            b210 = 5;
        }
        if (bb10 == 1) {
            b210 = 25;
            b110 = 5;
        }
        fondo = new ImageIcon(getClass().getResource("recursos/foriginal.png"));
        g.drawImage(fondo.getImage(), 1, 1, 1393, 715, this);

        g.drawString("ZOMBIES MATADOS  " + masz, 40, 30);
        repaint();
        ///zombie2//// 
        zom2 = new ImageIcon(getClass().getResource(ss2[ssc2]));
        g.drawImage(zom2.getImage(), xz1, yz1, 25, 25, this);
        ///zombie original/// 
        som = new ImageIcon(getClass().getResource(ss[ssc]));
        g.drawImage(som.getImage(), x1, y1, 25, 25, this);
        ///resto de zombies del 3 al 9//////
        ze3 = new ImageIcon(getClass().getResource(ss3[f3]));
        g.drawImage(ze3.getImage(), q3, w3, 25, 25, this);

        ze4 = new ImageIcon(getClass().getResource(ss4[f4]));
        g.drawImage(ze4.getImage(), q4, w4, 25, 25, this);

        ze5 = new ImageIcon(getClass().getResource(ss5[f5]));
        g.drawImage(ze5.getImage(), q5, w5, 25, 25, this);

        ze6 = new ImageIcon(getClass().getResource(ss6[f6]));
        g.drawImage(ze6.getImage(), q6, w6, 25, 25, this);

        ze7 = new ImageIcon(getClass().getResource(ss7[f7]));
        g.drawImage(ze7.getImage(), q7, w7, 50, 50, this);

        ze8 = new ImageIcon(getClass().getResource(ss8[f8]));
        g.drawImage(ze8.getImage(), q8, w8, 50, 50, this);

        ze9 = new ImageIcon(getClass().getResource(ss9[f9]));
        g.drawImage(ze9.getImage(), q9, w9, 80, 80, this);

        zv10 = new ImageIcon(getClass().getResource(zz10[f10]));
        g.drawImage(zv10.getImage(), q10, w10, 25, 25, this);
        zv11 = new ImageIcon(getClass().getResource(zz11[f11]));
        g.drawImage(zv11.getImage(), q11, w11, 25, 25, this);
        zv12 = new ImageIcon(getClass().getResource(zz12[f12]));
        g.drawImage(zv12.getImage(), q12, w12, 25, 25, this);
        zv13 = new ImageIcon(getClass().getResource(zz13[f13]));
        g.drawImage(zv13.getImage(), q13, w13, 25, 25, this);
        zv14 = new ImageIcon(getClass().getResource(zz14[f14]));
        g.drawImage(zv14.getImage(), q14, w14, 25, 25, this);
        zv15 = new ImageIcon(getClass().getResource(zz15[f15]));
        g.drawImage(zv15.getImage(), q15, w15, 25, 25, this);
        ////BALAs/////
        //1
        blabla = new ImageIcon(getClass().getResource(bal[bb]));
        g.drawImage(blabla.getImage(), x2, y2, b1, b2, this);
        //2
        blabla2 = new ImageIcon(getClass().getResource(bal[bb2]));
        g.drawImage(blabla2.getImage(), x22, y22, b12, b222, this);
        //3
        blabla3 = new ImageIcon(getClass().getResource(bal[bb3]));
        g.drawImage(blabla3.getImage(), x23, y23, b13, b23, this);
        //4
        blabla4 = new ImageIcon(getClass().getResource(bal[bb4]));
        g.drawImage(blabla4.getImage(), x24, y24, b14, b24, this);
        //5
        blabla5 = new ImageIcon(getClass().getResource(bal[bb5]));
        g.drawImage(blabla5.getImage(), x25, y25, b15, b25, this);
        //6
        blabla6 = new ImageIcon(getClass().getResource(bal[bb6]));
        g.drawImage(blabla6.getImage(), x26, y26, b16, b26, this);
        //7
        blabla7 = new ImageIcon(getClass().getResource(bal[bb7]));
        g.drawImage(blabla7.getImage(), x27, y27, b17, b27, this);
        //8
        blabla8 = new ImageIcon(getClass().getResource(bal[bb8]));
        g.drawImage(blabla8.getImage(), x28, y28, b18, b28, this);
        //9
        blabla9 = new ImageIcon(getClass().getResource(bal[bb9]));
        g.drawImage(blabla9.getImage(), x29, y29, b19, b29, this);
        //10
        blabla10 = new ImageIcon(getClass().getResource(bal[bb10]));
        g.drawImage(blabla10.getImage(), x210, y210, b110, b210, this);
        ///AVATAR//// 

        stta = new ImageIcon(getClass().getResource(imagenes[animacion]));
        g.drawImage(stta.getImage(), x, y, a, l, this);
        ////REGLA////
        prueba = new ImageIcon(getClass().getResource("recursos/fondo.jpg"));
        g.drawImage(prueba.getImage(), 1340, 345, 25, 25, this);

        /////municiones/////  
        m1 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m1.getImage(), x - m1x, y - my, 5, 5, this);

        m2 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m2.getImage(), x - m2x, y - my, 5, 5, this);

        m3 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m3.getImage(), x + m3x, y - my, 5, 5, this);

        m4 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m4.getImage(), x + m4x, y - my, 5, 5, this);

        m5 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m5.getImage(), x + m5x, y - my, 5, 5, this);

        m6 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m6.getImage(), x - m6x, y + my + 14, 5, 5, this);

        m7 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m7.getImage(), x - m7x, y + my + 14, 5, 5, this);

        m8 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m8.getImage(), x + m8x, y + my + 14, 5, 5, this);
        m9 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m9.getImage(), x + m9x, y + my + 14, 5, 5, this);

        m10 = new ImageIcon(getClass().getResource("recursos/m1.png"));
        g.drawImage(m10.getImage(), x + m10x, y + my + 14, 5, 5, this);

        ////letras boss////
//  boss = new ImageIcon(getClass().getResource("recursos/m4.png"));
//     g.drawImage(boss.getImage(),box,  boy , 50, 25, this);
        ///granada que se mueve///
        granada = new ImageIcon(getClass().getResource(imag[numg]));
        g.drawImage(granada.getImage(), grax, gy, quinx, quiny, this);
        ///indicador granada///
        granada1 = new ImageIcon(getClass().getResource("recursos/granada.png"));
        g.drawImage(granada1.getImage(), x - igx, y - igy, 10, 10, this);

        ///cuadrado speed///
        mave = new ImageIcon(getClass().getResource("recursos/cco.png"));
        g.drawImage(mave.getImage(), xv, yv, 25, 25, this);
        ///cuadrado cora, salto///
        mascor = new ImageIcon(getClass().getResource("recursos/sls.png"));
        g.drawImage(mascor.getImage(), xv1, yv1, 25, 25, this);

        fbal = new ImageIcon(getClass().getResource("recursos/bd.png"));
        g.drawImage(fbal.getImage(), xv2, yv2, 25, 25, this);

        mejorr = new ImageIcon(getClass().getResource("recursos/reloj.png"));
        g.drawImage(mejorr.getImage(), xv3, yv3, 25, 25, this);

        ///vida indicador// 
        m1c = new ImageIcon(getClass().getResource("recursos/sls.png"));
        g.drawImage(m1c.getImage(), x - xc2, y - yc2, 10, 10, this);

        ////CARTELES DE LVL///
        lvl = new ImageIcon(getClass().getResource(slvl[contacartel]));
        g.drawImage(lvl.getImage(), cartelx, cartely, 300, 200, this);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {

        if ((e.getKeyCode() == KeyEvent.VK_C) && (sal == 2)) {

            salto = salto - 1;
            if (salto <= 0) {

                xc2 = 2000;
            }

            if (salto == 1) {

                xc2 = 2000;

                if (animacion == 0) {
                    x = x + 170;
                }
                if (animacion == 1) {
                    x = x - 170;
                }
                if (animacion == 2) {
                    y = y + 170;
                }
                if (animacion == 3) {
                    y = y - 170;
                }
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            animacion = 3;
            y = y - vmas;

            //  if(l == 50){l= l *1;}
            //   if(l == -50){l = l+ 100;
            //    y = y - 80;}
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            animacion = 2;

            y = y + vmas;

            //    if(l == 50){l = l - 100;
            //    y = y + 80; }
            //    if(l == -50){l = l * 1;}
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            animacion = 1;
            x = x - vmas;
            //    if (a == 50){a = a - 100;
            //   x= x +15;}
            if (a == -50) {
                a = a * 1;
            }

        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            animacion = 0;
            x = x + vmas;

            // if (a == 50){a = a * 1;}
            // if(a == -50){a= a + 100;
            // x = x -15;}
        }

        ////disparo granada///
        if (e.getKeyCode() == KeyEvent.VK_X) {

            mun1 = mun1 - 1;
            if ((mun1 <= 0) && (cr.isRunning() == false)) {
                cr.stop();
            }

            if (mun1 == 1) {

                igx = 2000;

                //////llama bala/////
                //if (x1 ==-170){ numero = (int)(Math.random()*4);}
                if (cr.isRunning() == false) {
                    if (animacion == 0) {
                        canimacion = 0;
                        grax = x;
                        gy = y + 18;
                    }

                    if (animacion == 1) {
                        canimacion = 1;
                        grax = x;
                        gy = y;
                    }

                    if (animacion == 2) {
                        canimacion = 2;
                        grax = x;
                        gy = y + 18;
                    }

                    if (animacion == 3) {
                        canimacion = 3;
                        grax = x + 18;
                        gy = y;
                    }
                    cr.start();
                }
            }
        }

        ////disparo bala//
        if (e.getKeyCode() == KeyEvent.VK_Z) {

            mun = mun - 1;
            if ((mun <= 0) && (balatiempo.isRunning() == false)) {
                balatiempo.stop();
            }

            if ((mun == 4) || (mun == 3) || (mun == 2) || (mun == 1)) {
                if (mun == 4) {
                    m4x = 2000;
                }
                if (mun == 3) {
                    m3x = 2000;
                }
                if (mun == 2) {
                    m2x = 2000;
                }
                if (mun == 1) {
                    m1x = 2000;
                }

                //////llama bala/////
                //if (x1 ==-170){ numero = (int)(Math.random()*4);}
                if ((balatiempo.isRunning() == false) && (mun == 1)) {
                    if (animacion == 0) {
                        aanimacion = 0;
                        x2 = x;
                        y2 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion = 1;
                        x2 = x;
                        y2 = y;
                    }

                    if (animacion == 2) {
                        aanimacion = 2;
                        x2 = x;
                        y2 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion = 3;
                        x2 = x + 18;
                        y2 = y;
                    }
                    balatiempo.start();

                }

                if ((b22.isRunning() == false) && (mun == 2)) {
                    if (animacion == 0) {
                        aanimacion2 = 0;
                        x22 = x;
                        y22 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion2 = 1;
                        x22 = x;
                        y22 = y;
                    }

                    if (animacion == 2) {
                        aanimacion2 = 2;
                        x22 = x;
                        y22 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion2 = 3;
                        x22 = x + 18;
                        y22 = y;
                    }
                    b22.start();
                }

                if ((b3.isRunning() == false) && (mun == 3)) {
                    if (animacion == 0) {
                        aanimacion3 = 0;
                        x23 = x;
                        y23 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion3 = 1;
                        x23 = x;
                        y23 = y;
                    }

                    if (animacion == 2) {
                        aanimacion3 = 2;
                        x23 = x;
                        y23 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion3 = 3;
                        x23 = x + 18;
                        y23 = y;
                    }
                    b3.start();
                }

                if ((b4.isRunning() == false) && (mun == 4)) {
                    if (animacion == 0) {
                        aanimacion4 = 0;
                        x24 = x;
                        y24 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion4 = 1;
                        x24 = x;
                        y24 = y;
                    }

                    if (animacion == 2) {
                        aanimacion4 = 2;
                        x24 = x;
                        y24 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion4 = 3;
                        x24 = x + 18;
                        y24 = y;
                    }
                    b4.start();
                }
            }

            if ((mun == 5) || (mun == 6) || (mun == 7) || (mun == 8) || (mun == 9) || (mun == 10) && (salbal == 2)) {
                if (mun == 5) {
                    m5x = 2000;
                }
                if (mun == 6) {
                    m6x = 2000;
                }
                if (mun == 7) {
                    m7x = 2000;
                }
                if (mun == 8) {
                    m8x = 2000;
                }
                if (mun == 9) {
                    m9x = 2000;
                }
                if (mun == 10) {
                    m10x = 2000;
                }

                if ((b5.isRunning() == false) && (mun == 5)) {
                    if (animacion == 0) {
                        aanimacion5 = 0;
                        x25 = x;
                        y25 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion5 = 1;
                        x25 = x;
                        y25 = y;
                    }

                    if (animacion == 2) {
                        aanimacion5 = 2;
                        x25 = x;
                        y25 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion5 = 3;
                        x25 = x + 18;
                        y25 = y;
                    }
                    b5.start();
                }

                if ((b6.isRunning() == false) && (mun == 6)) {
                    if (animacion == 0) {
                        aanimacion6 = 0;
                        x26 = x;
                        y26 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion6 = 1;
                        x26 = x;
                        y26 = y;
                    }

                    if (animacion == 2) {
                        aanimacion6 = 2;
                        x26 = x;
                        y26 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion6 = 3;
                        x26 = x + 18;
                        y26 = y;
                    }
                    b6.start();
                }

                if ((b7.isRunning() == false) && (mun == 7)) {
                    if (animacion == 0) {
                        aanimacion7 = 0;
                        x27 = x;
                        y27 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion7 = 1;
                        x27 = x;
                        y27 = y;
                    }

                    if (animacion == 2) {
                        aanimacion7 = 2;
                        x27 = x;
                        y27 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion7 = 3;
                        x27 = x + 18;
                        y27 = y;
                    }
                    b7.start();
                }

                if ((b8.isRunning() == false) && (mun == 8)) {
                    if (animacion == 0) {
                        aanimacion8 = 0;
                        x28 = x;
                        y28 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion8 = 1;
                        x28 = x;
                        y28 = y;
                    }

                    if (animacion == 2) {
                        aanimacion8 = 2;
                        x28 = x;
                        y28 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion8 = 3;
                        x28 = x + 18;
                        y28 = y;
                    }
                    b8.start();
                }

                if ((b9.isRunning() == false) && (mun == 9)) {
                    if (animacion == 0) {
                        aanimacion9 = 0;
                        x29 = x;
                        y29 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion9 = 1;
                        x29 = x;
                        y29 = y;
                    }

                    if (animacion == 2) {
                        aanimacion9 = 2;
                        x29 = x;
                        y29 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion9 = 3;
                        x29 = x + 18;
                        y29 = y;
                    }
                    b9.start();
                }

                if ((b10.isRunning() == false) && (mun == 10)) {
                    if (animacion == 0) {
                        aanimacion10 = 0;
                        x210 = x;
                        y210 = y + 18;
                    }

                    if (animacion == 1) {
                        aanimacion10 = 1;
                        x210 = x;
                        y210 = y;
                    }

                    if (animacion == 2) {
                        aanimacion10 = 2;
                        x210 = x;
                        y210 = y + 18;
                    }

                    if (animacion == 3) {
                        aanimacion10 = 3;
                        x210 = x + 18;
                        y210 = y;
                    }
                    b10.start();
                }

            }
        }

        //para que no se salga de pantalla
        //poner en el timer el choque avatar zoombie
        if (x <= 10) {
            x = x + 10;
        }
        if (x >= 1390) {
            x = x - 10;
        }
        if (y <= 10) {
            y = y + 10;
        }
        if (y >= 700) {
            y = y - 10;
        }
        //////////////////////////////////////HORIZONTALES AVATAR//////////////////////////////////////      
        //para choque con paredes
        //izquierda ARRIBA h

        if ((x + a > -10) && (x < 260) && (y + l > 240) && (y < 285)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }
        //izquierda central arriba h
        if ((x + a > 340) && (x < 615) && (y + l > 240) && (y < 285)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }
        //izquierda ABAJO  h    
        if ((x + a > -10) && (x < 260) && (y + l > 440) && (y < 485)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }
        //izquierda central abajo h        
        if ((x + a > 340) && (x < 625) && (y + l > 440) && (y < 485)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha central abajo h        
        if ((x + a > 1125) && (x < 1125 + 500) && (y + l > 440) && (y < 485)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha central arriba h        
        if ((x + a > 1125) && (x < 1125 + 305) && (y + l > 240) && (y < 285)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha  abajo h        
        if ((x + a > 770) && (x < 770 + 299) && (y + l > 440) && (y < 485)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha arriba h        
        if ((x + a > 770) && (x < 770 + 299) && (y + l > 240) && (y < 285)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        ///////////////////////////////////VERTICALES AVATAR////////////////////
        //derecha superior
        if ((x + a > 772) && (x < 772 + 40) && (y + l > 1) && (y < 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }
        //izquierda superior
        if ((x + a > 577) && (x < 577 + 40) && (y + l > 1) && (y < 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }
        //iquierda central sup
        if ((x + a > 577) && (x < 577 + 40) && (y + l > 162) && (y < 168 + 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha central superior
        if ((x + a > 772) && (x < 772 + 40) && (y + l > 162) && (y < 168 + 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha central inferior
        if ((x + a > 772) && (x < 772 + 40) && (y + l > 447) && (y < 447 + 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //izquierda central inferior
        if ((x + a > 577) && (x < 577 + 40) && (y + l > 447) && (y < 447 + 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //izquierda inferior 
        if ((x + a > 577) && (x < 577 + 40) && (y + l > 618) && (y < 615 + 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        //derecha inferior 
        if ((x + a > 772) && (x < 772 + 40) && (y + l > 618) && (y < 615 + 112)) {
            JOptionPane.showMessageDialog(null, "Te Quemaste");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            home Jg = new home();
        }

        /////////////////////////////////////////////////////////////////////////////
        /////////////CHOQUE ZOMBIE 1 - avatar
//x = avatar
//x1 = zombie
//para choque zombie y avatar
        if ((x + a > x1) && (x < x1 + 25) && (y + l > y1) && (y < y1 + 25)) {
            vida = vida + 1;

            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }

            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > xz1) && (x < xz1 + 25) && (y + l > yz1) && (y < yz1 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q3) && (x < q3 + 25) && (y + l > w3) && (y < w3 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q4) && (x < q4 + 25) && (y + l > w4) && (y < w4 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q5) && (x < q5 + 25) && (y + l > w5) && (y < w5 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q6) && (x < q6 + 25) && (y + l > w6) && (y < w6 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q7) && (x < q7 + 50) && (y + l > w7) && (y < w7 + 50)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q8) && (x < q8 + 50) && (y + l > w8) && (y < w8 + 50)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q9) && (x < q9 + 80) && (y + l > w9) && (y < w9 + 80)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q10) && (x < q10 + 25) && (y + l > w10) && (y < w10 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q11) && (x < q11 + 25) && (y + l > w11) && (y < w11 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q12) && (x < q12 + 25) && (y + l > w12) && (y < w12 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q12) && (x < q12 + 25) && (y + l > w12) && (y < w12 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q13) && (x < q13 + 25) && (y + l > w13) && (y < w13 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > q14) && (x < q14 + 25) && (y + l > w14) && (y < w14 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }
        if ((x + a > q15) && (x < q15 + 25) && (y + l > w15) && (y < w15 + 25)) {
            vida = vida + 1;
            if (vida == 0) {
                x = 50;
                y = 500;
                xc2 = 3000;
            }
            if (vida == 1) {
                JOptionPane.showMessageDialog(null, "Mataste:" + masz + " Zombies");

                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
                home Jg = new home();
            }
        }

        if ((x + a > xv) && (x < xv + 15) && (y + l > yv) && (y < yv + 15)) {
            vmas = 7;

            yv = 9000;
        }

        if ((x + a > xv1) && (x < xv1 + 15) && (y + l > yv1) && (y < yv1 + 15)) {

            sal = 2;
            xc2 = 30;
            yv1 = 9000;

        }

        if ((x + a > xv2) && (x < xv2 + 15) && (y + l > yv2) && (y < yv2 + 15)) {

            m5x = 25;
            m6x = 15;
            m7x = 5;
            m8x = 5;
            m9x = 15;
            m10x = 25;

            mun = 11;
            salbal = 2;
            yv2 = 9000;

        }

        if ((x + a > xv3) && (x < xv3 + 15) && (y + l > yv3) && (y < yv3 + 15)) {
            mejor = 2;

            yv3 = 9000;

        }

        repaint();

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
