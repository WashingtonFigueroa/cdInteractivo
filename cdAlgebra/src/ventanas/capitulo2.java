/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.applet.AudioClip;

/**
 *
 * @author pc
 */
public class capitulo2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form capitulo1
     */
    public capitulo2() {
        initComponents();

    }
    AudioClip sonido;
    boolean s = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        btnplay = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("CAPITULO I");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("______________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\tINTRODUCCIÓN\nLos sistemas de ecuaciones lineales son: “el problema central del álgebra lineal”. En efecto, los conceptos formales del álgebra lineal, como independencia y dependencia lineal, requieren de laformulación y resolución de sistemas de ecuaciones lineales.\nEstos últimos, además, tienen aplicación en distintas áreas de conocimiento, como la ingeniería o la computación. (Gonzalez, 2009).\n\n\tCONCEPTO\nUn sistema de ecuaciones lineales, también conocido como sistema lineal de ecuaciones o simplemente sistema lineal, es un conjunto de ecuaciones lineales (es decir, un sistema de ecuaciones en donde cada ecuación es de primer grado), definidas sobre un cuerpo o un anillo \nconmutativo. \n\nEl problema consiste en encontrar los valores desconocidos de las variables x1, x2 y x3 que \nsatisfacen las tres ecuaciones.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 830, 430));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/video.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, -1, 90));

        btnplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/voicerecorder.png"))); // NOI18N
        btnplay.setBorderPainted(false);
        btnplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnplay.setOpaque(false);
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_facebook.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, -1, 100));

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/voicenow.png"))); // NOI18N
        btnStop.setBorderPainted(false);
        btnStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop.setOpaque(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jPanel1.add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, -1));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dere.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.setOpaque(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 60, 60));

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png"))); // NOI18N
        btnUltimo.setBorderPainted(false);
        btnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUltimo.setOpaque(false);
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 60, 60));

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ECUACIONES LINEALES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        if (s == true) {
            sonido.stop();
            s = false;
        }
    }//GEN-LAST:event_btnStopActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (s == true) {
            sonido.stop();
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        if (s == false) {
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("../audios/Ecuaciones lineales.wav"));
            sonido.play();
            s = true;
        }
    }//GEN-LAST:event_btnplayActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (s == true) {
            sonido.stop();
        }
        this.setVisible(false);
        capitulo11 c11 = new capitulo11();
        principal.escritorio.add(c11);
        c11.show();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (s == true) {
            sonido.stop();
        }
        this.setVisible(false);
        capitulo1111 c1111 = new capitulo1111();
        principal.escritorio.add(c1111);
        c1111.show();
    }//GEN-LAST:event_btnUltimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnplay;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
