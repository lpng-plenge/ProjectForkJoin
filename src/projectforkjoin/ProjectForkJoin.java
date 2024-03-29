/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectforkjoin;

import AlgoritmoConcurrencia.MatrixAddForkJoin;
import AlgoritmoConcurrencia.MatrixAddForkJoin2;
import AlgoritmoConcurrencia.MatrixMultiForkJoin;
import AlgoritmosSecuenciales.MatrixAdd;
import AlgoritmosSecuenciales.MatrixMulti;
import java.util.Arrays;

public class ProjectForkJoin extends javax.swing.JFrame {

    public ProjectForkJoin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelDatosGral = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spnMatrixValue = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chkMulti = new javax.swing.JCheckBox();
        chkSuma = new javax.swing.JCheckBox();
        jCombTipo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        PanelPrincipalPanel = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JLabel();
        lblSecuAnsSuma = new javax.swing.JLabel();
        lblConcuAnsSuma = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSecuAnsMulti = new javax.swing.JLabel();
        lblConcuAnsMulti = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMultiCon = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaMultiSec = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaSumaCon = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaSumaSec = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaMatrizA = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaMatrizB = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Tiempo de ejecucion en ms");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Concurrencia Suma");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Tiempo de ejecucion en ms:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Secuencial Suma");

        PanelDatosGral.setBackground(new java.awt.Color(0, 143, 255));
        PanelDatosGral.setForeground(new java.awt.Color(250, 250, 250));
        PanelDatosGral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelDatosGral.setMinimumSize(new java.awt.Dimension(400, 230));
        PanelDatosGral.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tamaño de las Matrices:");

        spnMatrixValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnMatrixValue.setModel(new javax.swing.SpinnerNumberModel(3, 1, 10000, 1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Multiplicacion:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Suma:");

        chkMulti.setBackground(new java.awt.Color(0, 143, 255));
        chkMulti.setSelected(true);

        chkSuma.setBackground(new java.awt.Color(0, 143, 255));

        jCombTipo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCombTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambos", "Secuencial", "Concurrencia" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Elige el Metodo:");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout PanelDatosGralLayout = new javax.swing.GroupLayout(PanelDatosGral);
        PanelDatosGral.setLayout(PanelDatosGralLayout);
        PanelDatosGralLayout.setHorizontalGroup(
            PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosGralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkMulti)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkSuma)
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnMatrixValue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosGralLayout.setVerticalGroup(
            PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosGralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnMatrixValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jCombTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGroup(PanelDatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(chkMulti)
                        .addComponent(chkSuma)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipalPanel.setBackground(new java.awt.Color(34, 34, 34));

        PanelPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PanelPrincipal.setForeground(new java.awt.Color(242, 242, 242));
        PanelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.setText("Solucion de Multiplicacion de Matrices  Cuadradas (Secuencial vs Concurrencia)");
        PanelPrincipal.setFocusable(false);
        PanelPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.setInheritsPopupMenu(false);
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(210, 64));

        javax.swing.GroupLayout PanelPrincipalPanelLayout = new javax.swing.GroupLayout(PanelPrincipalPanel);
        PanelPrincipalPanel.setLayout(PanelPrincipalPanelLayout);
        PanelPrincipalPanelLayout.setHorizontalGroup(
            PanelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalPanelLayout.setVerticalGroup(
            PanelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSecuAnsSuma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSecuAnsSuma.setForeground(new java.awt.Color(0, 0, 153));
        lblSecuAnsSuma.setText("0");

        lblConcuAnsSuma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConcuAnsSuma.setForeground(new java.awt.Color(0, 102, 102));
        lblConcuAnsSuma.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Concurrencia Multiplicacion");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Tiempo de ejecucion en ms:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Secuencial Multiplicacion");

        lblSecuAnsMulti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSecuAnsMulti.setForeground(new java.awt.Color(0, 0, 153));
        lblSecuAnsMulti.setText("0");

        lblConcuAnsMulti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConcuAnsMulti.setForeground(new java.awt.Color(0, 102, 102));
        lblConcuAnsMulti.setText("0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Tiempo de ejecucion en ms");

        txtAreaMultiCon.setColumns(20);
        txtAreaMultiCon.setRows(5);
        jScrollPane1.setViewportView(txtAreaMultiCon);

        txtAreaMultiSec.setColumns(20);
        txtAreaMultiSec.setRows(5);
        jScrollPane3.setViewportView(txtAreaMultiSec);

        txtAreaSumaCon.setColumns(20);
        txtAreaSumaCon.setRows(5);
        jScrollPane4.setViewportView(txtAreaSumaCon);

        txtAreaSumaSec.setColumns(20);
        txtAreaSumaSec.setRows(5);
        jScrollPane5.setViewportView(txtAreaSumaSec);

        txtAreaMatrizA.setColumns(20);
        txtAreaMatrizA.setRows(5);
        jScrollPane6.setViewportView(txtAreaMatrizA);

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Matriz A");

        txtAreaMatrizB.setColumns(20);
        txtAreaMatrizB.setRows(5);
        jScrollPane7.setViewportView(txtAreaMatrizB);

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Matriz B");

        btnIniciar.setBackground(new java.awt.Color(255, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Calcular");
        btnIniciar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnIniciar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnIniciar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1688, Short.MAX_VALUE)
            .addComponent(PanelDatosGral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1688, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel13))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel14))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblSecuAnsSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConcuAnsSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSecuAnsMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblConcuAnsMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosGral, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(lblConcuAnsSuma)
                            .addComponent(jLabel5)
                            .addComponent(lblSecuAnsSuma))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(lblSecuAnsMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(lblConcuAnsMulti))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.btnIniciar.setEnabled(false);
        clearTxt();
        CreateMatrix matrix = new CreateMatrix((int) spnMatrixValue.getValue());

        for (double[] matrixA : matrix.getMatrixA()) {
            txtAreaMatrizA.append(Arrays.toString(matrixA) + "\r\n");
        }
        for (double[] matrixB : matrix.getMatrixB()) {
            txtAreaMatrizB.append(Arrays.toString(matrixB) + "\r\n");
        }
        switch (jCombTipo.getSelectedIndex()) {
            case 0:
                if (this.chkMulti.isSelected() && this.chkSuma.isSelected()) {
                    operacionMatrizConcurrenciaSuma(matrix);
                    operacionMatrizConcurrenciaMulti(matrix);
                    operacionMatricesSecuencialSuma(matrix);
                    operacionMatricesSecuencialMulti(matrix);
                } else if (this.chkMulti.isSelected()) {
                    operacionMatrizConcurrenciaMulti(matrix);
                    operacionMatricesSecuencialMulti(matrix);
                } else if (this.chkSuma.isSelected()) {
                    operacionMatrizConcurrenciaSuma(matrix);
                    operacionMatricesSecuencialSuma(matrix);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Seleciona Una Opcion");
                }
                break;
            case 1:
                if (this.chkMulti.isSelected() && this.chkSuma.isSelected()) {
                    operacionMatricesSecuencialMulti(matrix);
                    operacionMatricesSecuencialSuma(matrix);
                } else if (this.chkMulti.isSelected()) {
                    operacionMatricesSecuencialMulti(matrix);
                } else if (this.chkSuma.isSelected()) {
                    operacionMatricesSecuencialSuma(matrix);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Seleciona Una Opcion");
                }
                break;
            case 2:
                if (this.chkMulti.isSelected() && this.chkSuma.isSelected()) {
                    operacionMatrizConcurrenciaMulti(matrix);
                    operacionMatrizConcurrenciaSuma(matrix);
                } else if (this.chkMulti.isSelected()) {
                    operacionMatrizConcurrenciaMulti(matrix);
                } else if (this.chkSuma.isSelected()) {
                    operacionMatrizConcurrenciaSuma(matrix);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Seleciona Una Opcion");
                }
                break;
        }

        this.btnIniciar.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed
    private void clearTxt() {
        this.txtAreaMatrizB.setText("");
        this.txtAreaMatrizA.setText("");
        this.txtAreaMultiCon.setText("");
        this.txtAreaMultiSec.setText("");
        this.txtAreaSumaCon.setText("");
        this.txtAreaSumaSec.setText("");
        this.lblConcuAnsMulti.setText("0");
        this.lblConcuAnsSuma.setText("0");
        this.lblSecuAnsMulti.setText("0");
        this.lblSecuAnsSuma.setText("0");
    }

    private void operacionMatricesSecuencialSuma(CreateMatrix matrix) {
        long inicio;

        //Secuencial
        inicio = System.currentTimeMillis();
        MatrixAdd matrixAdd = new MatrixAdd(matrix.getMatrixA(), matrix.getMatrixB());
        this.lblSecuAnsSuma.setText(Integer.toString((int) (System.currentTimeMillis() - inicio)));

        for (int i = 0; i < matrixAdd.getResultados().length; i++) {
            txtAreaSumaSec.append(Arrays.toString(matrixAdd.getResultados()[i]) + "\r\n");
        }
    }

    private void operacionMatricesSecuencialMulti(CreateMatrix matrix) {
        long inicio;
        //Secuencial
        inicio = System.currentTimeMillis();
        MatrixMulti matrixMulti = new MatrixMulti(matrix.getMatrixA(), matrix.getMatrixB());
        this.lblSecuAnsMulti.setText(Integer.toString((int) (System.currentTimeMillis() - inicio)));

        for (int i = 0; i < matrixMulti.getResultados().length; i++) {
            txtAreaMultiSec.append(Arrays.toString(matrixMulti.getResultados()[i]) + "\r\n");
        }
    }

    private void operacionMatrizConcurrenciaSuma(CreateMatrix matrix) {
        long inicio;
        //Concurrencia
        MatrixAddForkJoin forkAdd = new MatrixAddForkJoin();
        //MatrixAddForkJoin2 forkAdd = new MatrixAddForkJoin2();
        inicio = System.currentTimeMillis();
        //forkAdd.matrixAdd(matrix.getMatrixA(), matrix.getMatrixB());
        forkAdd.matrixAdd(matrix.getMatrixA(), matrix.getMatrixB(), 100);
        this.lblConcuAnsSuma.setText(Integer.toString((int) (System.currentTimeMillis() - inicio)));
        for (int i = 0; i < forkAdd.getResultados().length; i++) {
            txtAreaSumaCon.append(Arrays.toString(forkAdd.getResultados()[i]) + "\r\n");
        }
    }

    private void operacionMatrizConcurrenciaMulti(CreateMatrix matrix) {
        long inicio;
        //Concurrencia
        MatrixMultiForkJoin forkMulti = new MatrixMultiForkJoin();
        inicio = System.currentTimeMillis();
        forkMulti.matrixMulti(matrix.getMatrixA(), matrix.getMatrixB());
        this.lblConcuAnsMulti.setText(Integer.toString((int) (System.currentTimeMillis() - inicio)));

        for (int i = 0; i < forkMulti.getResultados().length; i++) {
            txtAreaMultiCon.append(Arrays.toString(forkMulti.getResultados()[i]) + "\r\n");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectForkJoin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatosGral;
    private javax.swing.JLabel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipalPanel;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JCheckBox chkMulti;
    private javax.swing.JCheckBox chkSuma;
    private javax.swing.JComboBox<String> jCombTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblConcuAnsMulti;
    private javax.swing.JLabel lblConcuAnsSuma;
    private javax.swing.JLabel lblSecuAnsMulti;
    private javax.swing.JLabel lblSecuAnsSuma;
    private javax.swing.JSpinner spnMatrixValue;
    private javax.swing.JTextArea txtAreaMatrizA;
    private javax.swing.JTextArea txtAreaMatrizB;
    private javax.swing.JTextArea txtAreaMultiCon;
    private javax.swing.JTextArea txtAreaMultiSec;
    private javax.swing.JTextArea txtAreaSumaCon;
    private javax.swing.JTextArea txtAreaSumaSec;
    // End of variables declaration//GEN-END:variables
}
