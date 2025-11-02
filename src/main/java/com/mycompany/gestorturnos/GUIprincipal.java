/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorturnos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ayaxFE
 */
public class GUIprincipal extends javax.swing.JFrame {

    private static ConstruPaciente getPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public javax.swing.JTable getTabla() {
    return Tabla;
}

    ArrayList<Turno> listaTurnos = new ArrayList<>();
    DefaultTableModel modelo;
    


    public GUIprincipal() {
        initComponents();
        setLocationRelativeTo(null);
        modelo = (DefaultTableModel) Tabla.getModel(); // tu tabla
        modelo.setRowCount(0);
    }

    public void agregarTurno(Turno turno) {
        listaTurnos.add(turno);
        
        ConstruPaciente paciente = GUIprincipal.getPaciente();
        
        modelo.addRow(new Object[]{
            paciente.getNombreApellido(), 
            paciente.getDni(),            
            paciente.getObraSocial(),
            paciente.getHoraTurno(),     
            paciente.getDiaMes(), 
            paciente.getMotivoConsulta(),
    });
    }
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Ingreseturno = new javax.swing.JButton();
        CancelarTurno = new javax.swing.JButton();
        ModificarTurno = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre y Apellido", "DNI", "Obra social", "Dia/mes ", "Hora de turno ", "Motivo de consulta "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla);

        Ingreseturno.setText("Ingrese Turno");
        Ingreseturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseturnoActionPerformed(evt);
            }
        });

        CancelarTurno.setText("Cancelar turno");
        CancelarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarTurnoActionPerformed(evt);
            }
        });

        ModificarTurno.setText("Modificar Turno");
        ModificarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTurnoActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label1.setName("Gestor de Turnos Amado"); // NOI18N
        label1.setText("Gestor de Turnos Amado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(164, 164, 164))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Ingreseturno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(CancelarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(ModificarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)))
                            .addGap(4, 4, 4)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingreseturno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngreseturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseturnoActionPerformed
        GUIIngresarTurno ventana = new GUIIngresarTurno(this); // Pasamos referencia de la ventana actual
        ventana.setVisible(true);
    }//GEN-LAST:event_IngreseturnoActionPerformed

    private void CancelarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarTurnoActionPerformed
        int filaSeleccionada = Tabla.getSelectedRow();
        
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this, 
                    "Debe seleccionar un turno de la tabla para cancelar.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        } else {

            CancelarTurno ventanaConfirmar = new CancelarTurno(this, filaSeleccionada);
            ventanaConfirmar.setVisible(true);
        }
    }//GEN-LAST:event_CancelarTurnoActionPerformed
    // sera un metodo que borre la fila que seleccionamos de la tabla 
    public void borrarTurnoSeleccionado(int filaABorrar) {
        
        // Verifica que la fila sea válida (por si acaso)
        if (filaABorrar >= 0 && filaABorrar < modelo.getRowCount()) {
            
            // Borra la fila del modelo de la tabla (la parte visual)
            modelo.removeRow(filaABorrar);
            
            // ¡IMPORTANTE! Borra también el turno de tu lista interna
            // Si no haces esto, tus datos estarán desincronizados.
            if (filaABorrar < listaTurnos.size()) {
                listaTurnos.remove(filaABorrar);
            }
            
            JOptionPane.showMessageDialog(this, "Turno cancelado correctamente.");
        }
    }
    
    private void ModificarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTurnoActionPerformed
        //sirve para abrir pagina sobre pagina
        ModificarTurno mp = new ModificarTurno();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ModificarTurnoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


/**
 * Método para agregar un nuevo paciente a la JTable (jTable2)
 * @param paciente El objeto ConstruPaciente con los datos del turno a ingresar.
 */
public void agregarPacienteATabla(ConstruPaciente paciente) {
     DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
    modelo.addRow(new Object[]{
        paciente.getNombreApellido(),
        paciente.getDni(),
        paciente.getObraSocial(),
        paciente.getDiaMes(),
        paciente.getHoraTurno(),
        paciente.getMotivoConsulta(),
    });
   
}

// Además, debes modificar el método IngreseturnoActionPerformed para que se vea así:



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarTurno;
    private javax.swing.JButton Ingreseturno;
    private javax.swing.JButton ModificarTurno;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
