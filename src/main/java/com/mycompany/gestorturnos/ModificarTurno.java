/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorturnos;

import javax.swing.JOptionPane;

/**
 *
 * @author ayaxFE
 */
public class ModificarTurno extends javax.swing.JFrame {
    private GUIprincipal ventanaPrincipal;
    private int filaModificar;
    private ConstruPaciente turnoSeleccionado;
    
    public ModificarTurno(GUIprincipal principal, int fila, ConstruPaciente turno) {
        initComponents();
        setLocationRelativeTo(null);
        this.ventanaPrincipal = principal;
        this.filaModificar = fila;
        this.turnoSeleccionado = turno;
    }
    private void cargarHorarios() {
        ComboSelector.removeAllItems();
        int hora = 8;
        int minuto = 0;
        while (hora < 19 || (hora == 19 && minuto == 0)) {
            String h = String.format("%02d:%02d", hora, minuto);
            ComboSelector.addItem(h);

            minuto += 40;
            if (minuto >= 60) {
                minuto -= 60;
                hora++;
            }
        }
    }
    
    // 🔽 CÓDIGO NUEVO: Precargar los valores actuales del turno
    private void cargarDatosIniciales() {
        // Cargar los valores actuales del objeto en los campos de la ventana:
        TextoDia.setText(turnoSeleccionado.getDiaMes());
        TextoMotivo.setText(turnoSeleccionado.getMotiConsulta());
        
        // Seleccionar la hora actual en el JComboBox
        ComboSelector.setSelectedItem(turnoSeleccionado.getHoraTurno());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextoInicial = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        TextoMotivo = new javax.swing.JLabel();
        ComboSelector = new javax.swing.JComboBox<>();
        TextoDia = new javax.swing.JTextField();
        TextoConsulta = new javax.swing.JTextField();
        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoInicial.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextoInicial.setText("Modificar datos del paciente");

        Texto1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Texto1.setText("Ingresar el nuevo horario del turno");

        Texto2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Texto2.setText("Ingresar el nuevo dia del turno");

        TextoMotivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoMotivo.setText("Ingresar el nuevo motivo de la consulta del turno");

        ComboSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSelectorActionPerformed(evt);
            }
        });

        TextoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDiaActionPerformed(evt);
            }
        });

        TextoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoConsultaActionPerformed(evt);
            }
        });

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TextoInicial)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonCancelar)
                        .addGap(49, 49, 49)
                        .addComponent(BotonAceptar)
                        .addGap(46, 46, 46))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Texto1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Texto2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(ComboSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(TextoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(TextoMotivo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(TextoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TextoInicial)
                .addGap(40, 40, 40)
                .addComponent(Texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Texto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoMotivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(BotonCancelar))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDiaActionPerformed

    private void TextoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoConsultaActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        try {
        String nuevaHora = (String) ComboSelector.getSelectedItem();
        String nuevoDia = TextoDia.getText().trim();
        String nuevoMotivo = TextoConsulta.getText().trim();

        // 1. Validaciones
        if (nuevoDia.isEmpty() || nuevoMotivo.isEmpty() || nuevaHora == null) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de confirmar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 1.1. Validar formato de fecha (DD/MM) y si es fin de semana (Copiado de GUIIngresarTurno)
        if (!nuevoDia.matches("\\d{1,2}/\\d{1,2}")) {
             JOptionPane.showMessageDialog(this, "Ingrese el día con formato DD/MM (por ejemplo: 15/11).", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
             return;
        }
        try {
            java.time.LocalDate hoy = java.time.LocalDate.now();
            int dia = Integer.parseInt(nuevoDia.split("/")[0]);
            int mes = Integer.parseInt(nuevoDia.split("/")[1]);
            int anio = hoy.getYear(); 
            java.time.LocalDate fechaIngresada = java.time.LocalDate.of(anio, mes, dia);
            java.time.DayOfWeek diaSemana = fechaIngresada.getDayOfWeek();
            
            if (diaSemana == java.time.DayOfWeek.SATURDAY || diaSemana == java.time.DayOfWeek.SUNDAY) {
                JOptionPane.showMessageDialog(this, "No se pueden asignar turnos los fines de semana.", "Turno inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida.", "Error de fecha", JOptionPane.ERROR_MESSAGE);
             return;
        }

        // Solo verifica si la fecha/hora es distinta a la original
        if (!nuevoDia.equals(turnoSeleccionado.getDiaMes()) || !nuevaHora.equals(turnoSeleccionado.getHoraTurno())) {
             javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) ventanaPrincipal.getTabla().getModel();
             for (int i = 0; i < modelo.getRowCount(); i++) {
                 // **IMPORTANTE**: Saltamos la fila que estamos modificando para no chocar consigo misma
                 if (i == filaModificar) continue; 
                 
                 String fechaExistente = (String) modelo.getValueAt(i, 3);
                 String horaExistente = (String) modelo.getValueAt(i, 4);
                 
                 if (nuevoDia.equals(fechaExistente) && nuevaHora.equals(horaExistente)) {
                     JOptionPane.showMessageDialog(this, "Ya hay un turno reservado para esa fecha y hora.", "Turno duplicado", JOptionPane.WARNING_MESSAGE);
                     return;
                 }
             }
        }
        
        // 3. ACTUALIZAR EL OBJETO ConstruPaciente (usa los setters)
        // Esto automáticamente actualiza el objeto en la lista interna de GUIprincipal
        turnoSeleccionado.setDiaMes(nuevoDia);
        turnoSeleccionado.setHoraTurno(nuevaHora);
        turnoSeleccionado.setMotivoConsulta(nuevoMotivo);
        
        // 4. Notificar a la ventana principal para que actualice la vista (JTable)
        ventanaPrincipal.actualizarTurnoEnTabla(filaModificar, turnoSeleccionado);
        
        JOptionPane.showMessageDialog(this, "Turno modificado correctamente.");
        this.dispose();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void ComboSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSelectorActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JComboBox<String> ComboSelector;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JTextField TextoConsulta;
    private javax.swing.JTextField TextoDia;
    private javax.swing.JLabel TextoInicial;
    private javax.swing.JLabel TextoMotivo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
