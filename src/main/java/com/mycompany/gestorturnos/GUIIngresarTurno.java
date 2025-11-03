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
    private GUIprincipal ventanaPrincipal; //Pestaña en la pantalla inicial

public GUIIngresarTurno(GUIprincipal principal) { //constructor para la pestaña de ingresar turnos
    initComponents();
    this.ventanaPrincipal = principal;
    setLocationRelativeTo(null); // Centrar ventana en pantalla

    //Cargar los horarios de 08:00 a 19:00 hs (cada 40 minutos)
    jComboBox1.removeAllItems();

    int hora = 8;
    int minuto = 0;
    
    //Condiciones para las hs
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        SeccionEscribaNombre = new javax.swing.JTextField();
        javax.swing.JLabel LabelIngreseNombrePaciente = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        javax.swing.JLabel LabelIngreseApellidoPaciente = new javax.swing.JLabel();
        SeccionIngreseApellido = new javax.swing.JTextField();
        javax.swing.JLabel TituloIngresarTurnos = new javax.swing.JLabel();
        javax.swing.JLabel LabelIngreseDNIPaciente = new javax.swing.JLabel();
        javax.swing.JLabel LabelMotivoConsulta = new javax.swing.JLabel();
        javax.swing.JLabel LabelIngreseOBRASOPaciente = new javax.swing.JLabel();
        SeccionEscribaDNI = new javax.swing.JTextField();
        SeccionEscribaObraSo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SeccionMotivoConsulta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel Fecha = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        SeccionTelefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTextField3.setText("jTextField3");

        jScrollPane2.setViewportView(jTree1);

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
        TituloIngresarTurnos.setText("INGRESE DATOS DEL PACIENTE");

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

        Fecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fecha.setText("Ingrese la fecha de turno (dd/mm/yyyy):");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el horario: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese el numero de telefono:");

        SeccionTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox1, 0, 319, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeccionTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelIngreseOBRASOPaciente)
                                .addComponent(LabelIngreseDNIPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelIngreseApellidoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelIngreseNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SeccionEscribaNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeccionIngreseApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeccionEscribaDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeccionEscribaObraSo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)))
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(LabelMotivoConsulta)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(TituloIngresarTurnos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(TituloIngresarTurnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelIngreseNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelMotivoConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SeccionEscribaObraSo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SeccionTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fecha)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(23, Short.MAX_VALUE))
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
        // Tomamos los valores para los campos 
        String nombre = SeccionEscribaNombre.getText().trim();
        String apellido = SeccionIngreseApellido.getText().trim();
        String dniTexto = SeccionEscribaDNI.getText().trim();
        String obraSocial = SeccionEscribaObraSo.getText().trim();
        String motivoConsulta = SeccionMotivoConsulta.getText().trim();
        String fechaTurno = jTextField1.getText().trim();
        String horaTurno = (String) jComboBox1.getSelectedItem();
        String telefono = SeccionTelefono.getText().trim();

        //Valida que todos los campos esten vacios
        if (nombre.isEmpty() || apellido.isEmpty() || dniTexto.isEmpty() ||
            obraSocial.isEmpty()|| telefono.isEmpty() || motivoConsulta.isEmpty() || fechaTurno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de confirmar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //validamos que dni tengo los 8 espacios de un dni convencional
        if (!dniTexto.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe contener exactamente 8 números.", "DNI inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar formato de fecha (ej: 15/11/2025)
        if (!fechaTurno.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) { // si lo que se escribe es distinto a eso ( los d y corchetes indican numeros que abarca el segmento, ej 2025 = 4 espacios/numeros ) 
            JOptionPane.showMessageDialog(this, "Ingrese la fecha con formato DD/MM/YYYY (por ejemplo: 15/11/2025).", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
            return;                                               
        }
        
        //Variables de la fecha actual
        try {
            java.time.LocalDate hoy = java.time.LocalDate.now();
            int dia = Integer.parseInt(fechaTurno.split("/")[0]);
            int mes = Integer.parseInt(fechaTurno.split("/")[1]);
            int anio = Integer.parseInt(fechaTurno.split("/")[2]);
          
            //Toma los valores del dia actual    
            java.time.LocalDate fechaIngresada = java.time.LocalDate.of(anio, mes, dia);
            java.time.DayOfWeek diaSemana = fechaIngresada.getDayOfWeek();

            //Consulta si el turno cae en fin de semana
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

        int dni = Integer.parseInt(dniTexto);
        String nombreCompleto = nombre + " " + apellido; //Pone el nombre y apellido en el mismo campo

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
        ConstruPaciente paciente = new ConstruPaciente(nombreCompleto, dni, obraSocial, horaTurno, fechaTurno, motivoConsulta,telefono);

        // Enviar a la tabla principal
        if (ventanaPrincipal != null) {
            ventanaPrincipal.agregarPacienteATabla(paciente);
        }

        //Crea el turno
        JOptionPane.showMessageDialog(this, "Turno agregado correctamente.");
        this.dispose();
        
    } catch (NumberFormatException e) { //Valida que el dni sea un numero correcto
        JOptionPane.showMessageDialog(this, "El DNI debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    
    }

    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose(); //cierra la ventana
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

    private void SeccionTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccionTelefonoActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField SeccionEscribaDNI;
    private javax.swing.JTextField SeccionEscribaNombre;
    private javax.swing.JTextField SeccionEscribaObraSo;
    private javax.swing.JTextField SeccionIngreseApellido;
    private javax.swing.JTextArea SeccionMotivoConsulta;
    private javax.swing.JTextField SeccionTelefono;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}


