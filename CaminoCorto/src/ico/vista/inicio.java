/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.vista;

import ico.algoritmos.Dijkstra;
import ico.elementos.Arista;
import ico.elementos.Grafo;
import ico.elementos.Vertice;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Osvaldo, Julio y Ariok
 */
public class inicio extends javax.swing.JFrame {

    private DefaultComboBoxModel comboBoxInicio = new DefaultComboBoxModel();
    private DefaultComboBoxModel comboBoxFin = new DefaultComboBoxModel();
    private Grafo grafo = new Grafo();
    private Dijkstra algoritmo = new Dijkstra();

    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        enablePanelVertice(false);
        enablePanelArista(false);
        enablePanelCalcular(false);

    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.drawLine(355, 40, 355, 740);
        g.drawLine(355, 740, 1045, 740);
        g.setColor(Color.RED);
        int punto = 40;
        for (int i = 1; i <= 10; i++) {  
            g.drawLine(350, punto, 360, punto);
            punto = punto + 70;
        }
        punto = 415;
        for (int i = 1; i <= 10; i++) {
            g.drawLine(punto, 735, punto, 745);
            punto = punto + 70;
        }
        g.setColor(Color.BLACK);
        Font fuente = new Font("Arial", Font.BOLD, 11);
        g.setFont(fuente);
        punto = 43;
        int num = 100;
        for (int i = 1; i <= 10; i++) {
            g.drawString(""+num,330,punto);
            punto = punto + 70;
            num = num - 10;
        }
        num = 10;
        punto = 410;
        for (int i = 1; i <= 10; i++) {
            g.drawString(num+"", punto, 760);
            num = num + 10;
            punto = punto + 70;
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonCrearVertice = new javax.swing.JButton();
        jPanelVertice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreVertice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCoordenadaX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCoordenadaY = new javax.swing.JTextField();
        botonNewVertice = new javax.swing.JButton();
        jPanelArista = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        botonNewArista = new javax.swing.JButton();
        botonCrearArista = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelCalcular = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxUbicacionInicial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        botonCalculate = new javax.swing.JButton();
        comboBoxUbicacionInicial1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        botonCrearVertice.setText("Crear vertice");
        botonCrearVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearVerticeActionPerformed(evt);
            }
        });

        jPanelVertice.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear vertice"));
        jPanelVertice.setToolTipText("");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Coordenada x:");

        jLabel3.setText("Coordenada y:");

        botonNewVertice.setText("Nuevo");
        botonNewVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNewVerticeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVerticeLayout = new javax.swing.GroupLayout(jPanelVertice);
        jPanelVertice.setLayout(jPanelVerticeLayout);
        jPanelVerticeLayout.setHorizontalGroup(
            jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerticeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(botonNewVertice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCoordenadaX)
                    .addComponent(jTextFieldCoordenadaY)
                    .addComponent(jTextFieldNombreVertice))
                .addGap(19, 19, 19))
        );
        jPanelVerticeLayout.setVerticalGroup(
            jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerticeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombreVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonNewVertice)
                .addContainerGap())
        );

        jPanelArista.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear arista"));

        jLabel4.setText("Vertice inicial:");

        comboBox.setModel(this.comboBoxInicio);

        jLabel5.setText("Vertice final:");

        comboBox1.setModel(this.comboBoxFin);

        botonNewArista.setText("Nuevo");
        botonNewArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNewAristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAristaLayout = new javax.swing.GroupLayout(jPanelArista);
        jPanelArista.setLayout(jPanelAristaLayout);
        jPanelAristaLayout.setHorizontalGroup(
            jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAristaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonNewArista)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanelAristaLayout.setVerticalGroup(
            jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAristaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonNewArista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonCrearArista.setText("Crear arista");
        botonCrearArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearAristaActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular mejor ruta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanelCalcular.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular mejor ruta"));

        jLabel6.setText("Vertice inicial:");

        comboBoxUbicacionInicial.setModel(this.comboBoxInicio);

        jLabel7.setText("Vertice final:");

        botonCalculate.setText("Calcular");
        botonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalculateActionPerformed(evt);
            }
        });

        comboBoxUbicacionInicial1.setModel(this.comboBoxFin);

        javax.swing.GroupLayout jPanelCalcularLayout = new javax.swing.GroupLayout(jPanelCalcular);
        jPanelCalcular.setLayout(jPanelCalcularLayout);
        jPanelCalcularLayout.setHorizontalGroup(
            jPanelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalcularLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(botonCalculate)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxUbicacionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUbicacionInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanelCalcularLayout.setVerticalGroup(
            jPanelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalcularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxUbicacionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxUbicacionInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCalculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonCrearArista, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanelArista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelVertice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(botonCrearVertice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botonCrearVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(botonCrearArista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enablePanelVertice(boolean act) {
        for (Component componente : jPanelVertice.getComponents()) {
            componente.setEnabled(act);
        }
        jTextFieldNombreVertice.setText("");
        jTextFieldCoordenadaX.setText("");
        jTextFieldCoordenadaY.setText("");
    }

    private void enablePanelArista(boolean act) {
        for (Component componente : jPanelArista.getComponents()) {
            componente.setEnabled(act);
        }
    }

    private void enablePanelCalcular(boolean act) {
        for (Component componente : jPanelCalcular.getComponents()) {
            componente.setEnabled(act);
        }
    }

    private void botonCrearVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearVerticeActionPerformed
        enablePanelVertice(true);
    }//GEN-LAST:event_botonCrearVerticeActionPerformed

    private void botonNewVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNewVerticeActionPerformed
        int x = Integer.parseInt(jTextFieldCoordenadaX.getText());
        int y = Integer.parseInt(jTextFieldCoordenadaY.getText());
        String nombre = jTextFieldNombreVertice.getText();
        if ((x >= 0 && x <= 100) && (y >= 0 && y <= 100) && !nombre.isEmpty()) {
            grafo.insertarVertice(x, y, nombre);
            comboBoxInicio.addElement(nombre);
            comboBoxFin.addElement(nombre);
            pintaVertice(jPanel1.getGraphics(), x * 7, y * 7, nombre);
            enablePanelVertice(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingresa bien los datos :)");
        }
    }//GEN-LAST:event_botonNewVerticeActionPerformed

    private void botonCrearAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearAristaActionPerformed
        enablePanelArista(true);
    }//GEN-LAST:event_botonCrearAristaActionPerformed

    private void botonNewAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNewAristaActionPerformed
        grafo.insertarArista((String) comboBoxInicio.getSelectedItem(), (String) comboBoxFin.getSelectedItem());
        ArrayList<Vertice> vertices = grafo.getVertices();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        for (Vertice vertice : vertices) {
            if (comboBoxInicio.getSelectedItem().equals(vertice.getNombreV())) {
                x1 = vertice.getEjex() * 7;
                y1 = vertice.getEjey() * 7;
            }
            if (comboBoxFin.getSelectedItem().equals(vertice.getNombreV())) {
                x2 = vertice.getEjex() * 7;
                y2 = vertice.getEjey() * 7;
            }
        }
        pintarArista(jPanel1.getGraphics(), x1, y1, x2, y2, Color.blue);
        enablePanelArista(false);
        comboBox.setSelectedIndex(0);
        comboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_botonNewAristaActionPerformed

    private void botonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalculateActionPerformed
        ArrayList<Arista> caminoCorto = algoritmo.caminoMasCorto(grafo, (String) this.comboBoxUbicacionInicial.getSelectedItem(), (String) this.comboBoxUbicacionInicial1.getSelectedItem());
        for (Arista arista : caminoCorto) {
            pintarCaminito(jPanel1.getGraphics(), arista.getVerticeInicial().getEjex(), arista.getVerticeInicial().getEjey(), arista.getVerticeFinal().getEjex(), arista.getVerticeFinal().getEjey());
        }
        enablePanelCalcular(false);
    }//GEN-LAST:event_botonCalculateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        enablePanelCalcular(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);

            }
        });
    }

    private void pintaVertice(Graphics g, int x, int y, String nombre) {
        g.setColor(Color.RED);
        g.fillArc(x, -y + 700, 6, 6, 0, 360);
        g.setColor(Color.DARK_GRAY);
        Font fuente = new Font("Arial", Font.BOLD, 14);
        g.setFont(fuente);
        g.drawString(nombre, x, -y + 700);
    }

    private void pintarArista(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        g.setColor(color);
        g.drawLine(x1, -y1 + 700, x2, -y2 + 700);
    }

    private void pintarCaminito(Graphics g, int x1, int y1, int x2, int y2) {
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        pintarArista(g, x1 * 7, y1 * 7, x2 * 7, y2 * 7, Color.GREEN);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalculate;
    private javax.swing.JButton botonCrearArista;
    private javax.swing.JButton botonCrearVertice;
    private javax.swing.JButton botonNewArista;
    private javax.swing.JButton botonNewVertice;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JComboBox<String> comboBoxUbicacionInicial;
    private javax.swing.JComboBox<String> comboBoxUbicacionInicial1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelArista;
    private javax.swing.JPanel jPanelCalcular;
    private javax.swing.JPanel jPanelVertice;
    private javax.swing.JTextField jTextFieldCoordenadaX;
    private javax.swing.JTextField jTextFieldCoordenadaY;
    private javax.swing.JTextField jTextFieldNombreVertice;
    // End of variables declaration//GEN-END:variables
}
