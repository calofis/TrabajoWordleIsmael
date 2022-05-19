/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.daw1.ismael.gui;

/**
 *
 * @author ismac
 */
public class ModificarMotor extends javax.swing.JDialog {

    /**
     * Creates new form ModificarMotor
     */
    public ModificarMotor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJPanel = new javax.swing.JPanel();
        cuerpoJPanel = new javax.swing.JPanel();
        anadirJPanel = new javax.swing.JPanel();
        insertarJPanel = new javax.swing.JPanel();
        anadirTextField = new javax.swing.JTextField();
        anadirButtom = new javax.swing.JButton();
        estadoInsertarJPanel = new javax.swing.JPanel();
        estadoInsertarJLabel = new javax.swing.JLabel();
        borrarJPanel = new javax.swing.JPanel();
        borradoJPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        estadoJPanel = new javax.swing.JPanel();
        estadoJLabel = new javax.swing.JLabel();
        tituloJPanel = new javax.swing.JPanel();
        tituloJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainJPanel.setLayout(new java.awt.BorderLayout());

        cuerpoJPanel.setLayout(new java.awt.GridLayout(2, 1));

        anadirJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        anadirJPanel.setLayout(new java.awt.GridLayout(2, 1));

        anadirTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        anadirTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        insertarJPanel.add(anadirTextField);

        anadirButtom.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        anadirButtom.setText("Añadir");
        insertarJPanel.add(anadirButtom);

        anadirJPanel.add(insertarJPanel);

        estadoInsertarJPanel.setLayout(new java.awt.GridBagLayout());
        estadoInsertarJPanel.add(estadoInsertarJLabel, new java.awt.GridBagConstraints());

        anadirJPanel.add(estadoInsertarJPanel);

        cuerpoJPanel.add(anadirJPanel);

        borrarJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        borrarJPanel.setLayout(new java.awt.GridLayout(2, 1));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(160, 23));
        borradoJPanel.add(jTextField1);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Borrar");
        borradoJPanel.add(jButton1);

        borrarJPanel.add(borradoJPanel);

        estadoJPanel.setLayout(new java.awt.GridBagLayout());
        estadoJPanel.add(estadoJLabel, new java.awt.GridBagConstraints());

        borrarJPanel.add(estadoJPanel);

        cuerpoJPanel.add(borrarJPanel);

        mainJPanel.add(cuerpoJPanel, java.awt.BorderLayout.CENTER);

        tituloJPanel.setLayout(new java.awt.GridBagLayout());

        tituloJLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tituloJLabel.setText("Titulo");
        tituloJPanel.add(tituloJLabel, new java.awt.GridBagConstraints());

        mainJPanel.add(tituloJPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ModificarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarMotor dialog = new ModificarMotor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadirButtom;
    private javax.swing.JPanel anadirJPanel;
    private javax.swing.JTextField anadirTextField;
    private javax.swing.JPanel borradoJPanel;
    private javax.swing.JPanel borrarJPanel;
    private javax.swing.JPanel cuerpoJPanel;
    private javax.swing.JLabel estadoInsertarJLabel;
    private javax.swing.JPanel estadoInsertarJPanel;
    private javax.swing.JLabel estadoJLabel;
    private javax.swing.JPanel estadoJPanel;
    private javax.swing.JPanel insertarJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JLabel tituloJLabel;
    private javax.swing.JPanel tituloJPanel;
    // End of variables declaration//GEN-END:variables
}