/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.ismael.gui;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.daw1.ismael.clases.*;


/**
 *
 * @author ismac
 */
public class MainGUI extends javax.swing.JFrame {

    private static final java.awt.Color COLOR_ROJO = new java.awt.Color(255,51,51);
    private static final java.awt.Color COLOR_AMARILLO = new java.awt.Color(239,208,60);
    private static final java.awt.Color COLOR_VERDE = new java.awt.Color(0,204,51);
    private static final java.awt.Color COLOR_DEFAULT = new java.awt.Color(187,187,187);
   
    private Motor tipoMotor = new Motor_Test();
    private int numIntentos = 0;
    private Set<Character> amarillo = new TreeSet<>();
    private Set<Character> rojo = new TreeSet<>();
    private Set<Character> verde = new TreeSet<>();
    private String palabra;
    
    private static final int MAX_INTENTOS = 6;
    private static final int TAMANHO_PALABRA = 5;
    
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMANHO_PALABRA];
    
    
    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        try {
         initComponents();
        inicializarLabels();
        Objects.requireNonNull(tipoMotor);
        this.tipoMotor = tipoMotor;
        this.palabra = this.tipoMotor.randomWord().toUpperCase();
        this.ExitoJPanel.setVisible(false);
        this.amarillo.clear();
        this.rojo.clear();
        this.verde.clear();
        this.JRadioNuevaPartida.setSelected(false);
        this.JRadioBaseDatosEs.setSelected(false);
        this.JRadioFichero.setSelected(false);
        this.JRadioTest.setSelected(true);
        this.JRadioEditarMotor.setSelected(false);
        this.JRadioTest.setEnabled(false);
        this.JRadioBaseDatosGl.setSelected(false);
         } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
    

    public final void inicializarLabels() {
        for (int i = 1; i <= MAX_INTENTOS; i++) {
            for (int j = 1; j <= TAMANHO_PALABRA; j++) {
                String nombreLabel = "JLabel" + i + "_" + j;
                try {
                    javax.swing.JLabel aux = (javax.swing.JLabel)this.getClass().getDeclaredField(nombreLabel).get(this);
                    labels[i-1][j-1] = aux;
                } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
    }
    
    private void resetarJuego(){
        try {
            for (int i = 1; i <= MAX_INTENTOS; i++) {
                for (int j = 1; j <= TAMANHO_PALABRA; j++) {
                    labels[i-1][j-1].setText("");
                }
            }
            this.palabra = this.tipoMotor.randomWord().toUpperCase();
            this.ExitoJPanel.setVisible(false);
            amarillo.clear();
            this.ExisteJLabel.setText("");
            rojo.clear();
            this.MalJLabel.setText("");
            verde.clear();
            this.BienJLabel.setText("");
            this.EnviarButtom.setEnabled(true);
            this.PalabraTextField.setEnabled(true);
            this.PalabraTextField.setText("");
            this.numIntentos = 0;
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
    
    private void procesosInterfaz(final String insertada, final int intento) {
        for (int i = 0; i < 5; ++i) {
            final char c = insertada.charAt(i);
            labels[intento][i].setText(String.valueOf(c));
            if (this.palabra.charAt(i) == c) {
                labels[intento][i].setForeground(COLOR_VERDE);
                this.amarillo.remove(c);
                this.verde.add(c);
                this.ExisteJLabel.setText(this.amarillo.toString());
                this.BienJLabel.setText(this.verde.toString());
            }
            else if (this.palabra.contains(String.valueOf(c))) {
                if (!this.verde.contains(c)) {
                     labels[intento][i].setForeground(COLOR_AMARILLO);
                    this.amarillo.add(c);
                    this.ExisteJLabel.setText(this.amarillo.toString());
                }else{
                    labels[intento][i].setForeground(COLOR_AMARILLO);
                }
            }
            else {
                labels[intento][i].setForeground(COLOR_ROJO);
                this.rojo.add(c);
                this.MalJLabel.setText(this.rojo.toString());
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainJPanel = new javax.swing.JPanel();
        LetrasJPanel = new javax.swing.JPanel();
        JLabel1_1 = new javax.swing.JLabel();
        JLabel1_2 = new javax.swing.JLabel();
        JLabel1_3 = new javax.swing.JLabel();
        JLabel1_4 = new javax.swing.JLabel();
        JLabel1_5 = new javax.swing.JLabel();
        JLabel2_1 = new javax.swing.JLabel();
        JLabel2_2 = new javax.swing.JLabel();
        JLabel2_3 = new javax.swing.JLabel();
        JLabel2_4 = new javax.swing.JLabel();
        JLabel2_5 = new javax.swing.JLabel();
        JLabel3_1 = new javax.swing.JLabel();
        JLabel3_2 = new javax.swing.JLabel();
        JLabel3_3 = new javax.swing.JLabel();
        JLabel3_4 = new javax.swing.JLabel();
        JLabel3_5 = new javax.swing.JLabel();
        JLabel4_1 = new javax.swing.JLabel();
        JLabel4_2 = new javax.swing.JLabel();
        JLabel4_3 = new javax.swing.JLabel();
        JLabel4_4 = new javax.swing.JLabel();
        JLabel4_5 = new javax.swing.JLabel();
        JLabel5_1 = new javax.swing.JLabel();
        JLabel5_2 = new javax.swing.JLabel();
        JLabel5_3 = new javax.swing.JLabel();
        JLabel5_4 = new javax.swing.JLabel();
        JLabel5_5 = new javax.swing.JLabel();
        JLabel6_1 = new javax.swing.JLabel();
        JLabel6_2 = new javax.swing.JLabel();
        JLabel6_3 = new javax.swing.JLabel();
        JLabel6_4 = new javax.swing.JLabel();
        JLabel6_5 = new javax.swing.JLabel();
        BottomJPanel = new javax.swing.JPanel();
        EstadoJPanel = new javax.swing.JPanel();
        MalJPanel = new javax.swing.JPanel();
        MalJLabel = new javax.swing.JLabel();
        ExistenJPanel = new javax.swing.JPanel();
        ExisteJLabel = new javax.swing.JLabel();
        BienJPanel = new javax.swing.JPanel();
        BienJLabel = new javax.swing.JLabel();
        InputJPanel = new javax.swing.JPanel();
        PalabraTextField = new javax.swing.JTextField();
        EnviarButtom = new javax.swing.JButton();
        ExitoJPanel = new javax.swing.JPanel();
        FinalJLabel = new javax.swing.JLabel();
        ErrorJPanel = new javax.swing.JPanel();
        ErrorJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JRadioNuevaPartida = new javax.swing.JRadioButtonMenuItem();
        JMenuMotores = new javax.swing.JMenu();
        JRadioTest = new javax.swing.JRadioButtonMenuItem();
        JRadioFichero = new javax.swing.JRadioButtonMenuItem();
        JRadioBaseDatosEs = new javax.swing.JRadioButtonMenuItem();
        JRadioBaseDatosGl = new javax.swing.JRadioButtonMenuItem();
        JRadioEditarMotor = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAW1 WORDLE ISMAEL");

        MainJPanel.setLayout(new java.awt.BorderLayout());

        LetrasJPanel.setLayout(new java.awt.GridLayout(6, 5));

        JLabel1_1.setBackground(new java.awt.Color(255, 255, 255));
        JLabel1_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel1_1);

        JLabel1_2.setBackground(new java.awt.Color(255, 255, 255));
        JLabel1_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel1_2);

        JLabel1_3.setBackground(new java.awt.Color(255, 255, 255));
        JLabel1_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel1_3);

        JLabel1_4.setBackground(new java.awt.Color(255, 255, 255));
        JLabel1_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel1_4);

        JLabel1_5.setBackground(new java.awt.Color(255, 255, 255));
        JLabel1_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel1_5);

        JLabel2_1.setBackground(new java.awt.Color(255, 255, 255));
        JLabel2_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel2_1);

        JLabel2_2.setBackground(new java.awt.Color(255, 255, 255));
        JLabel2_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel2_2);

        JLabel2_3.setBackground(new java.awt.Color(255, 255, 255));
        JLabel2_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel2_3);

        JLabel2_4.setBackground(new java.awt.Color(255, 255, 255));
        JLabel2_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel2_4);

        JLabel2_5.setBackground(new java.awt.Color(255, 255, 255));
        JLabel2_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel2_5);

        JLabel3_1.setBackground(new java.awt.Color(255, 255, 255));
        JLabel3_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel3_1);

        JLabel3_2.setBackground(new java.awt.Color(255, 255, 255));
        JLabel3_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel3_2);

        JLabel3_3.setBackground(new java.awt.Color(255, 255, 255));
        JLabel3_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel3_3);

        JLabel3_4.setBackground(new java.awt.Color(255, 255, 255));
        JLabel3_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel3_4);

        JLabel3_5.setBackground(new java.awt.Color(255, 255, 255));
        JLabel3_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel3_5);

        JLabel4_1.setBackground(new java.awt.Color(255, 255, 255));
        JLabel4_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel4_1);

        JLabel4_2.setBackground(new java.awt.Color(255, 255, 255));
        JLabel4_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel4_2);

        JLabel4_3.setBackground(new java.awt.Color(255, 255, 255));
        JLabel4_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel4_3);

        JLabel4_4.setBackground(new java.awt.Color(255, 255, 255));
        JLabel4_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel4_4);

        JLabel4_5.setBackground(new java.awt.Color(255, 255, 255));
        JLabel4_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel4_5);

        JLabel5_1.setBackground(new java.awt.Color(255, 255, 255));
        JLabel5_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel5_1);

        JLabel5_2.setBackground(new java.awt.Color(255, 255, 255));
        JLabel5_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel5_2);

        JLabel5_3.setBackground(new java.awt.Color(255, 255, 255));
        JLabel5_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel5_3);

        JLabel5_4.setBackground(new java.awt.Color(255, 255, 255));
        JLabel5_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel5_4);

        JLabel5_5.setBackground(new java.awt.Color(255, 255, 255));
        JLabel5_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel5_5);

        JLabel6_1.setBackground(new java.awt.Color(255, 255, 255));
        JLabel6_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel6_1);

        JLabel6_2.setBackground(new java.awt.Color(255, 255, 255));
        JLabel6_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel6_2);

        JLabel6_3.setBackground(new java.awt.Color(255, 255, 255));
        JLabel6_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel6_3);

        JLabel6_4.setBackground(new java.awt.Color(255, 255, 255));
        JLabel6_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel6_4);

        JLabel6_5.setBackground(new java.awt.Color(255, 255, 255));
        JLabel6_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        JLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasJPanel.add(JLabel6_5);

        MainJPanel.add(LetrasJPanel, java.awt.BorderLayout.CENTER);

        BottomJPanel.setPreferredSize(new java.awt.Dimension(200, 112));
        BottomJPanel.setLayout(new java.awt.GridLayout(2, 2));

        EstadoJPanel.setLayout(new java.awt.GridLayout(3, 0));

        MalJPanel.setLayout(new java.awt.GridLayout(1, 0));

        MalJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MalJLabel.setForeground(new java.awt.Color(255, 51, 51));
        MalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MalJLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MalJPanel.add(MalJLabel);

        EstadoJPanel.add(MalJPanel);

        ExistenJPanel.setLayout(new java.awt.GridLayout(1, 0));

        ExisteJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ExisteJLabel.setForeground(new java.awt.Color(239, 208, 60));
        ExistenJPanel.add(ExisteJLabel);

        EstadoJPanel.add(ExistenJPanel);

        BienJPanel.setLayout(new java.awt.GridLayout(1, 0));

        BienJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BienJLabel.setForeground(new java.awt.Color(0, 204, 51));
        BienJPanel.add(BienJLabel);

        EstadoJPanel.add(BienJPanel);

        BottomJPanel.add(EstadoJPanel);

        PalabraTextField.setPreferredSize(new java.awt.Dimension(120, 22));
        InputJPanel.add(PalabraTextField);

        EnviarButtom.setText("Enviar");
        EnviarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButtomActionPerformed(evt);
            }
        });
        InputJPanel.add(EnviarButtom);

        BottomJPanel.add(InputJPanel);

        ExitoJPanel.setLayout(new java.awt.GridBagLayout());

        FinalJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FinalJLabel.setForeground(new java.awt.Color(102, 204, 0));
        ExitoJPanel.add(FinalJLabel, new java.awt.GridBagConstraints());

        BottomJPanel.add(ExitoJPanel);

        ErrorJPanel.setLayout(new java.awt.GridBagLayout());

        ErrorJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ErrorJLabel.setForeground(new java.awt.Color(204, 0, 0));
        ErrorJPanel.add(ErrorJLabel, new java.awt.GridBagConstraints());

        BottomJPanel.add(ErrorJPanel);

        MainJPanel.add(BottomJPanel, java.awt.BorderLayout.PAGE_END);

        JMenuArchivo.setText("Archivo");

        JRadioNuevaPartida.setSelected(true);
        JRadioNuevaPartida.setText("NuevaPartida");
        JRadioNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioNuevaPartidaActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JRadioNuevaPartida);

        jMenuBar1.add(JMenuArchivo);

        JMenuMotores.setText("Motores");

        JRadioTest.setSelected(true);
        JRadioTest.setText("Test");
        JRadioTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioTestActionPerformed(evt);
            }
        });
        JMenuMotores.add(JRadioTest);

        JRadioFichero.setSelected(true);
        JRadioFichero.setText("Fichero");
        JRadioFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioFicheroActionPerformed(evt);
            }
        });
        JMenuMotores.add(JRadioFichero);

        JRadioBaseDatosEs.setSelected(true);
        JRadioBaseDatosEs.setText("BaseDatos_es");
        JRadioBaseDatosEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioBaseDatosEsActionPerformed(evt);
            }
        });
        JMenuMotores.add(JRadioBaseDatosEs);

        JRadioBaseDatosGl.setSelected(true);
        JRadioBaseDatosGl.setText("BaseDatos_gl");
        JRadioBaseDatosGl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioBaseDatosGlActionPerformed(evt);
            }
        });
        JMenuMotores.add(JRadioBaseDatosGl);

        JRadioEditarMotor.setSelected(true);
        JRadioEditarMotor.setText("EditarMotor");
        JRadioEditarMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioEditarMotorActionPerformed(evt);
            }
        });
        JMenuMotores.add(JRadioEditarMotor);

        jMenuBar1.add(JMenuMotores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtomActionPerformed
       this.ErrorJLabel.setText("");
        final String insertada = this.PalabraTextField.getText().toUpperCase();
        if (insertada.length() != 5) {
            this.ErrorJLabel.setText("Inserte una palabra de 5 letras");
        }
        else if (this.tipoMotor.existsWord(insertada)) {
            procesosInterfaz(insertada, numIntentos);
            this.numIntentos++;
            if (insertada.equals(this.palabra)) {
                this.ExitoJPanel.setVisible(true);
                this.FinalJLabel.setVisible(true);
                this.FinalJLabel.setText("Has ganado en: " + numIntentos + " intentos");
                this.EnviarButtom.setEnabled(false);
                this.PalabraTextField.setEnabled(false);
            }
            else {
                this.PalabraTextField.setText("");
                if (this.numIntentos == 6) {
                    this.ExitoJPanel.setVisible(true);
                    this.FinalJLabel.setVisible(true);
                    this.FinalJLabel.setText("??Has perdido!" + " La palabra era: " + this.palabra);
                    this.FinalJLabel.setForeground(MainGUI.COLOR_ROJO);
                    this.EnviarButtom.setEnabled(false);
                    this.PalabraTextField.setEnabled(false);
                }
                else {
                    this.PalabraTextField.requestFocus();
                    
                }
            }
        }
        else {
            this.ErrorJLabel.setText("La palabra insertada no existe");
        }
        
       
    }//GEN-LAST:event_EnviarButtomActionPerformed

    private void JRadioTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioTestActionPerformed
        if(this.JRadioTest.isSelected()){
            this.tipoMotor = new Motor_Test();
            this.JRadioBaseDatosEs.setSelected(false);
            this.JRadioBaseDatosGl.setSelected(false);
            this.JRadioFichero.setSelected(false);
            this.JRadioBaseDatosEs.setEnabled(true);
            this.JRadioTest.setEnabled(false);
            this.JRadioFichero.setEnabled(true);
             this.JRadioBaseDatosGl.setEnabled(true);
            resetarJuego();
        }
        
    }//GEN-LAST:event_JRadioTestActionPerformed

    private void JRadioNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioNuevaPartidaActionPerformed
       if(this.JRadioNuevaPartida.isSelected()){
           this.JRadioNuevaPartida.setSelected(false);
           resetarJuego();
       }
    }//GEN-LAST:event_JRadioNuevaPartidaActionPerformed

    private void JRadioFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioFicheroActionPerformed
         if(this.JRadioFichero.isSelected()){
            this.tipoMotor = new Motor_Fichero();
            this.JRadioBaseDatosEs.setSelected(false);
            this.JRadioBaseDatosGl.setSelected(false);
            this.JRadioTest.setSelected(false);
            this.JRadioTest.setEnabled(true);
            this.JRadioBaseDatosEs.setEnabled(true);
            this.JRadioFichero.setEnabled(false);
             this.JRadioBaseDatosGl.setEnabled(true);
            resetarJuego();
        }
    }//GEN-LAST:event_JRadioFicheroActionPerformed

    private void JRadioBaseDatosEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioBaseDatosEsActionPerformed
         if(this.JRadioBaseDatosEs.isSelected()){
            this.tipoMotor = new Motor_BD("es");
            this.JRadioFichero.setSelected(false);
            this.JRadioTest.setSelected(false);
            this.JRadioBaseDatosGl.setSelected(false);
            this.JRadioBaseDatosEs.setEnabled(false);
            this.JRadioTest.setEnabled(true);
            this.JRadioFichero.setEnabled(true);
             this.JRadioBaseDatosGl.setEnabled(true);
            
            resetarJuego();
        }
    }//GEN-LAST:event_JRadioBaseDatosEsActionPerformed

    private void JRadioEditarMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioEditarMotorActionPerformed
       if(this.JRadioEditarMotor.isSelected()){
           this.JRadioEditarMotor.setSelected(false);
           org.daw1.ismael.gui.ModificarMotor panel = new org.daw1.ismael.gui.ModificarMotor(this, rootPaneCheckingEnabled, this.tipoMotor);
           panel.setModal(true);
           panel.setLocationRelativeTo(this);
           while(panel.isModal()){
               panel.setVisible(true);
           }
           panel.setVisible(false);
           resetarJuego();
       }
    }//GEN-LAST:event_JRadioEditarMotorActionPerformed

    private void JRadioBaseDatosGlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioBaseDatosGlActionPerformed
        if(this.JRadioBaseDatosGl.isSelected()){
            this.tipoMotor = new Motor_BD("gl");
            this.JRadioFichero.setSelected(false);
            this.JRadioTest.setSelected(false);
            this.JRadioBaseDatosEs.setSelected(false);
            this.JRadioBaseDatosEs.setEnabled(true);
            this.JRadioTest.setEnabled(true);
            this.JRadioFichero.setEnabled(true);
            this.JRadioBaseDatosGl.setEnabled(false);
            
            resetarJuego();
        }
    }//GEN-LAST:event_JRadioBaseDatosGlActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BienJLabel;
    private javax.swing.JPanel BienJPanel;
    private javax.swing.JPanel BottomJPanel;
    private javax.swing.JButton EnviarButtom;
    private javax.swing.JLabel ErrorJLabel;
    private javax.swing.JPanel ErrorJPanel;
    private javax.swing.JPanel EstadoJPanel;
    private javax.swing.JLabel ExisteJLabel;
    private javax.swing.JPanel ExistenJPanel;
    private javax.swing.JPanel ExitoJPanel;
    private javax.swing.JLabel FinalJLabel;
    private javax.swing.JPanel InputJPanel;
    private javax.swing.JLabel JLabel1_1;
    private javax.swing.JLabel JLabel1_2;
    private javax.swing.JLabel JLabel1_3;
    private javax.swing.JLabel JLabel1_4;
    private javax.swing.JLabel JLabel1_5;
    private javax.swing.JLabel JLabel2_1;
    private javax.swing.JLabel JLabel2_2;
    private javax.swing.JLabel JLabel2_3;
    private javax.swing.JLabel JLabel2_4;
    private javax.swing.JLabel JLabel2_5;
    private javax.swing.JLabel JLabel3_1;
    private javax.swing.JLabel JLabel3_2;
    private javax.swing.JLabel JLabel3_3;
    private javax.swing.JLabel JLabel3_4;
    private javax.swing.JLabel JLabel3_5;
    private javax.swing.JLabel JLabel4_1;
    private javax.swing.JLabel JLabel4_2;
    private javax.swing.JLabel JLabel4_3;
    private javax.swing.JLabel JLabel4_4;
    private javax.swing.JLabel JLabel4_5;
    private javax.swing.JLabel JLabel5_1;
    private javax.swing.JLabel JLabel5_2;
    private javax.swing.JLabel JLabel5_3;
    private javax.swing.JLabel JLabel5_4;
    private javax.swing.JLabel JLabel5_5;
    private javax.swing.JLabel JLabel6_1;
    private javax.swing.JLabel JLabel6_2;
    private javax.swing.JLabel JLabel6_3;
    private javax.swing.JLabel JLabel6_4;
    private javax.swing.JLabel JLabel6_5;
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenu JMenuMotores;
    private javax.swing.JRadioButtonMenuItem JRadioBaseDatosEs;
    private javax.swing.JRadioButtonMenuItem JRadioBaseDatosGl;
    private javax.swing.JRadioButtonMenuItem JRadioEditarMotor;
    private javax.swing.JRadioButtonMenuItem JRadioFichero;
    private javax.swing.JRadioButtonMenuItem JRadioNuevaPartida;
    private javax.swing.JRadioButtonMenuItem JRadioTest;
    private javax.swing.JPanel LetrasJPanel;
    private javax.swing.JPanel MainJPanel;
    private javax.swing.JLabel MalJLabel;
    private javax.swing.JPanel MalJPanel;
    private javax.swing.JTextField PalabraTextField;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
