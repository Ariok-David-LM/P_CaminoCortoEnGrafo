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
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Los dioses osvaldo y ariok
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
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
                    .addComponent(jTextFieldCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(botonCrearVertice)
                            .addComponent(jPanelVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCrearArista)
                            .addComponent(jButton3)
                            .addComponent(jPanelArista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanelCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        grafo.insertarArista((String)comboBoxInicio.getSelectedItem(),(String)comboBoxFin.getSelectedItem());
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
        pintarArista(jPanel1.getGraphics(), x1, y1, x2, y2,Color.RED);
        enablePanelArista(false);
        comboBox.setSelectedIndex(0);
        comboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_botonNewAristaActionPerformed

    private void botonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalculateActionPerformed
        
        ArrayList<Arista> caminoCorto = algoritmo.caminoMasCorto(grafo, (String) this.comboBoxUbicacionInicial.getSelectedItem(), (String) this.comboBoxUbicacionInicial1.getSelectedItem());
        for (Arista arista : caminoCorto) {
            pintarCaminito(jPanel1.getGraphics(), arista.getVerticeInicial().getEjex(), arista.getVerticeInicial().getEjey(), arista.getVerticeFinal().getEjex(), arista.getVerticeFinal().getEjey(),caminoCorto);
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
        g.fillArc(x, -y+700, 6, 6, 0, 360);
        g.setColor(Color.DARK_GRAY);
        Font fuente = new Font("Arial", Font.BOLD, 14);
        g.setFont(fuente);
        g.drawString(nombre, x, -y+700);
    }

    private void pintarArista(Graphics g, int x1, int y1, int x2, int y2,Color color) {
        g.setColor(color);
        g.drawLine(x1, -y1+700, x2, -y2+700);
    }
    
    private void pintarCaminito(Graphics g, int x1, int y1, int x2, int y2,ArrayList<Arista> x) {
        ArrayList<Vertice> vertices = grafo.getVertices();
        ArrayList<Arista> aristas = grafo.getAristas();
        jPanel1.update(g);
        for (Vertice vertice : vertices) {
            pintaVertice(jPanel1.getGraphics(),vertice.getEjex()*7,vertice.getEjey()*7,vertice.getNombreV());
        }
        for (Arista arista : x) {
            pintarArista(jPanel1.getGraphics(),arista.getVerticeInicial().getEjex()*7,arista.getVerticeInicial().getEjey()*7,arista.getVerticeFinal().getEjex()*7, arista.getVerticeFinal().getEjey()*7,Color.GREEN);
        }
        /*for (Arista arista : aristas) {
            pintarArista(jPanel1.getGraphics(),arista.getVerticeInicial().getEjex()*7,arista.getVerticeInicial().getEjey()*7,arista.getVerticeFinal().getEjex()*7, arista.getVerticeFinal().getEjey()*7,Color.red);
        }*/
        g.setColor(Color.BLACK);
        g.drawLine(x1*7, (-y1+700)*7, x2*7, (-y2+700)*7);
 
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
