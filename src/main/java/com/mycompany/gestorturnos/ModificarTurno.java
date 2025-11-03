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
    private GUIprincipal ventanaPrincipal; //Pestaña en la pantalla inicial
    private int filaModificar;
    private ConstruPaciente turnoSeleccionado;
    
    //
    public ModificarTurno(GUIprincipal principal, int fila, ConstruPaciente turno) {
        initComponents();
        setLocationRelativeTo(null);
        this.ventanaPrincipal = principal;
        this.filaModificar = fila;
        this.turnoSeleccionado = turno;
    

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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
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
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoInicial.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoInicial.setText("Modificar datos del paciente");

        Texto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Texto1.setText("Ingresar el nuevo horario del turno:");

        Texto2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Texto2.setText("Ingresar el nuevo dia del turno:");

        TextoMotivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextoMotivo.setText("Ingresar el nuevo motivo de la consulta del turno:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(TextoInicial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(ComboSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Texto1)
                                .addComponent(TextoMotivo)
                                .addComponent(Texto2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Texto2)
                .addGap(12, 12, 12)
                .addComponent(TextoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoMotivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        try {
            String nuevaHora = (String) ComboSelector.getSelectedItem();
            String nuevoDia = TextoDia.getText().trim();
            String nuevoMotivo = TextoConsulta.getText().trim();

            // Validamos que los espacios estan vacios
            if (nuevoDia.isEmpty()|| nuevaHora == null) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos antes de confirmar.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Valida el ingreso de la fecha del turno
            if (!nuevoDia.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) { // si lo que se escribe es distinto a eso ( los d y corchetes indican numeros que abarca el segmento, ej 2025 = 4 espacios/numeros ) 
                JOptionPane.showMessageDialog(this, "Ingrese la fecha con formato DD/MM/YYYY (por ejemplo: 15/11/2025).", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
                return; 
            }
            
            //Variables de la fecha actual
            try {
                java.time.LocalDate hoy = java.time.LocalDate.now();
                int dia = Integer.parseInt(nuevoDia.split("/")[0]);
                int mes = Integer.parseInt(nuevoDia.split("/")[1]);
                int anio = hoy.getYear(); 
                
                java.time.LocalDate fechaIngresada = java.time.LocalDate.of(anio, mes, dia);
                java.time.DayOfWeek diaSemana = fechaIngresada.getDayOfWeek();
            
                // Validamos que el formato de la fecha (DD/MM) este dentro de la semana y no sea fin de semana
                if (diaSemana == java.time.DayOfWeek.SATURDAY || diaSemana == java.time.DayOfWeek.SUNDAY) {
                    JOptionPane.showMessageDialog(this, "No se pueden asignar turnos los fines de semana.", "Turno inválido", JOptionPane.WARNING_MESSAGE);
                    return;
                }
           
                //Verifica que la fecha no se ingrese el dia anterior (ayer)
                if (fechaIngresada.isBefore(hoy)) {
                    JOptionPane.showMessageDialog(this, "La fecha ingresada ya pasó. Ingrese una fecha actual o futura.", "Fecha inválida", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
            } catch (Exception e) {//avisa que la fecha ingresada no es valida
                JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida.", "Error de fecha", JOptionPane.ERROR_MESSAGE);
                return;
                }

                // Solo verifica si la fecha/hora es distinta a la original
            if (nuevoDia.equals(turnoSeleccionado.getDiaMes()) || nuevaHora.equals(turnoSeleccionado.getHoraTurno())) {
                javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) ventanaPrincipal.getTabla().getModel();
                for (int i = 0; i < modelo.getRowCount(); i++) {
                     if (i == filaModificar) continue; 
                 
                    String fechaExistente = (String) modelo.getValueAt(i, 3);
                    String horaExistente = (String) modelo.getValueAt(i, 4);
                 
                    //Valida que hay un turno con la misma fehcs y hora que otro turno 
                    if (nuevoDia.equals(fechaExistente) && nuevaHora.equals(horaExistente)) {
                        JOptionPane.showMessageDialog(this, "Ya hay un turno reservado para esa fecha y hora.", "Turno duplicado", JOptionPane.WARNING_MESSAGE);
                        return;
                        }
                }
            
            }
            // Esto automáticamente actualiza el objeto en la lista interna de GUIprincipal
            turnoSeleccionado.setDiaMes(nuevoDia);
            turnoSeleccionado.setHoraTurno(nuevaHora);
            turnoSeleccionado.setMotivoConsulta(nuevoMotivo);
        
            // Notificar a la ventana principal para que actualice la vista 
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
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
