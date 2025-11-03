/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorturnos;

/**
 *
 * @author ayaxFE
 */
import javax.swing.JOptionPane;
public class GUIIngresarTurno extends javax.swing.JFrame {
    

    private GUIprincipal ventanaPrincipal;

public GUIIngresarTurno(GUIprincipal principal) {
    initComponents();
    this.ventanaPrincipal = principal;
    setLocationRelativeTo(null); // Centrar ventana en pantalla

    // 🔽 Cargar horarios de 08:00 a 19:00 cada 40 minutos
    jComboBox1.removeAllItems();

    int hora = 8;
    int minuto = 0;

    while (hora < 19 || (hora == 19 && minuto == 0)) {
        String h = String.format("%02d:%02d", hora, minuto);
        jComboBox1.addItem(h);

        minuto += 40;
        if (minuto >= 60) {
            minuto -= 60;
            hora++;
        }
    }
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SeccionEscribaNombre = new javax.swing.JTextField();
        LabelIngreseNombrePaciente = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        LabelIngreseApellidoPaciente = new javax.swing.JLabel();
        SeccionIngreseApellido = new javax.swing.JTextField();
        TituloIngresarTurnos = new javax.swing.JLabel();
        LabelIngreseDNIPaciente = new javax.swing.JLabel();
        LabelMotivoConsulta = new javax.swing.JLabel();
        LabelIngreseOBRASOPaciente = new javax.swing.JLabel();
        SeccionEscribaDNI = new javax.swing.JTextField();
        SeccionEscribaObraSo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SeccionMotivoConsulta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SeccionEscribaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionEscribaNombreActionPerformed(evt);
            }
        });

        LabelIngreseNombrePaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelIngreseNombrePaciente.setText("Ingrese el nombre del paciente : ");
        LabelIngreseNombrePaciente.setMaximumSize(new java.awt.Dimension(90, 16));
        LabelIngreseNombrePaciente.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Confirmar.setText("Confirmar ");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        LabelIngreseApellidoPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelIngreseApellidoPaciente.setText("Ingrese el Apellido del paciente:");

        SeccionIngreseApellido.setToolTipText("");
        SeccionIngreseApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionIngreseApellidoActionPerformed(evt);
            }
        });

        TituloIngresarTurnos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TituloIngresarTurnos.setText("Ingrese datos del paciente");

        LabelIngreseDNIPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelIngreseDNIPaciente.setText("Ingrese el Dni del paciente:");

        LabelMotivoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelMotivoConsulta.setText("Ingrese motivo de consulta:");

        LabelIngreseOBRASOPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelIngreseOBRASOPaciente.setText("Ingrese obra social: ");

        SeccionEscribaObraSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionEscribaObraSoActionPerformed(evt);
            }
        });

        SeccionMotivoConsulta.setColumns(20);
        SeccionMotivoConsulta.setRows(5);
        jScrollPane1.setViewportView(SeccionMotivoConsulta);

        Fecha.setText("INGRESE LA FECHA DEL TURNO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("INGRESE EL HORARIO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(TituloIngresarTurnos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fecha)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SeccionEscribaDNI)
                                    .addComponent(SeccionEscribaNombre)
                                    .addComponent(SeccionIngreseApellido)
                                    .addComponent(SeccionEscribaObraSo, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(LabelIngreseOBRASOPaciente)
                                    .addComponent(LabelIngreseDNIPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelIngreseApellidoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelIngreseNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelMotivoConsulta)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TituloIngresarTurnos)
                        .addGap(26, 26, 26)
                        .addComponent(LabelIngreseNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelMotivoConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SeccionEscribaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelIngreseApellidoPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SeccionIngreseApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelIngreseDNIPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeccionEscribaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelIngreseOBRASOPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(SeccionEscribaObraSo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeccionEscribaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionEscribaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccionEscribaNombreActionPerformed
   
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed

   try {
        // Tomamos los valores de los campos
        String nombre = SeccionEscribaNombre.getText().trim();
        String apellido = SeccionIngreseApellido.getText().trim();
        String dniTexto = SeccionEscribaDNI.getText().trim();
        String obraSocial = SeccionEscribaObraSo.getText().trim();
        String motivoConsulta = SeccionMotivoConsulta.getText().trim();
        String fechaTurno = jTextField1.getText().trim();
        String horaTurno = (String) jComboBox1.getSelectedItem();

        // Validaciones básicas
        if (nombre.isEmpty() || apellido.isEmpty() || dniTexto.isEmpty() ||
            obraSocial.isEmpty() || motivoConsulta.isEmpty() || fechaTurno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de confirmar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar formato de fecha (ej: 15/11/2025)
        if (!fechaTurno.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) { // si lo que se escribe es distinto a eso ( los d y corchetes indican numeros que abarca el segmento, ej 2025 = 4 espacios/numeros ) 
            JOptionPane.showMessageDialog(this, "Ingrese la fecha con formato DD/MM/YYYY (por ejemplo: 15/11/2025).", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
            return;
        }
         try {
            java.time.LocalDate hoy = java.time.LocalDate.now();
            int dia = Integer.parseInt(fechaTurno.split("/")[0]);
            int mes = Integer.parseInt(fechaTurno.split("/")[1]);
            int anio = Integer.parseInt(fechaTurno.split("/")[2]);
          

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

        int dni = Integer.parseInt(dniTexto);
        String nombreCompleto = nombre + " " + apellido;

        // Validar si ya existe un turno en la misma fecha y hora
        if (ventanaPrincipal != null) {
            javax.swing.table.DefaultTableModel modelo = 
                (javax.swing.table.DefaultTableModel) ventanaPrincipal.getTabla().getModel();

            for (int i = 0; i < modelo.getRowCount(); i++) {
                String fechaExistente = (String) modelo.getValueAt(i, 3); // Columna 3 = Dia/Mes
                String horaExistente = (String) modelo.getValueAt(i, 4);  // Columna 4 = Hora turno

                if (fechaTurno.equals(fechaExistente) && horaTurno.equals(horaExistente)) {
                    JOptionPane.showMessageDialog(this, "Ya hay un turno reservado para esa fecha y hora.", "Turno duplicado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        // Crear el paciente
        ConstruPaciente paciente = new ConstruPaciente(nombreCompleto, dni, obraSocial, horaTurno, fechaTurno, motivoConsulta);

        // Enviar a la tabla principal
        if (ventanaPrincipal != null) {
            ventanaPrincipal.agregarPacienteATabla(paciente);
        }

        JOptionPane.showMessageDialog(this, "Turno agregado correctamente.");
        this.dispose();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El DNI debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    
    }

    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void SeccionIngreseApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionIngreseApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccionIngreseApellidoActionPerformed

    private void SeccionEscribaObraSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionEscribaObraSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccionEscribaObraSoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel LabelIngreseApellidoPaciente;
    private javax.swing.JLabel LabelIngreseDNIPaciente;
    private javax.swing.JLabel LabelIngreseNombrePaciente;
    private javax.swing.JLabel LabelIngreseOBRASOPaciente;
    private javax.swing.JLabel LabelMotivoConsulta;
    private javax.swing.JTextField SeccionEscribaDNI;
    private javax.swing.JTextField SeccionEscribaNombre;
    private javax.swing.JTextField SeccionEscribaObraSo;
    private javax.swing.JTextField SeccionIngreseApellido;
    private javax.swing.JTextArea SeccionMotivoConsulta;
    private javax.swing.JLabel TituloIngresarTurnos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}


