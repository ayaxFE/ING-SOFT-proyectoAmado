/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorturnos;
// aca importamos nuestros elementos a trabajar, como por ejemplo java.Swing(interfaces)
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Collections;
import java.util.Comparator; 
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author ayaxFE
 */
public class GUIprincipal extends javax.swing.JFrame {

    private static ConstruPaciente getPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //inicializamos listas 
    private List<ConstruPaciente> listaTurnos = new ArrayList<>();
    private javax.swing.table.DefaultTableModel modelo;
    public javax.swing.JTable getTabla() {
    return Tabla;
}   

    public GUIprincipal() {
        initComponents();
        setLocationRelativeTo(null);
        modelo = (DefaultTableModel) Tabla.getModel(); // tu tabla
        modelo.setRowCount(0);
        
        ListadorFechas.setText("Ordenar por Fecha");
    }

    public void agregarTurno(ConstruPaciente turno) {
        listaTurnos.add(turno);
        
        ConstruPaciente paciente = GUIprincipal.getPaciente();
        
        modelo.addRow(new Object[]{
            paciente.getNombreApellido(), 
            paciente.getDni(),            
            paciente.getObraSocial(),
            paciente.getHoraTurno(),     
            paciente.getDiaMes(), 
            paciente.getTelefono(),
            paciente.getMotiConsulta(),
    });
    }
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Ingreseturno = new javax.swing.JButton();
        CancelarTurno = new javax.swing.JButton();
        ModificarTurno = new javax.swing.JButton();
        ListadorFechas = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre y Apellido", "DNI", "Obra social", "Dia/mes ", "Hora de turno ", "telefono", "Motivo de consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        ListadorFechas.setText("Ordenar por fecha");
        ListadorFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadorFechasActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label1.setName("Gestor de Turnos Amado"); // NOI18N
        label1.setText("Gestor de Turnos Amado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Ingreseturno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(ModificarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(ListadorFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(ListadorFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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
  
    
// boton para cancelar turno o borrarlo de listado 
    private void CancelarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarTurnoActionPerformed
        int filaSeleccionada = Tabla.getSelectedRow();
        
        // evaluamos si la fila esta seleccionada sino es asi se tira un "error" 
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this, 
                    "Debe seleccionar un turno de la tabla para cancelar.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE); //se determina error 
        } else {
            // si se quiere cancelar llamamos a a ventanaConfirmar para evaluar que se quiere eliminar 
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
            // Si no haces esto, tus datos estarán desincronizados y nos puede llegar a 
            // dar errores inesperados.
            if (filaABorrar < listaTurnos.size()) {
                listaTurnos.remove(filaABorrar);
            }
            //se muestra que la cancelacion fue exitosa por un mensaje por pantalla de funciones java
            JOptionPane.showMessageDialog(this, "Turno cancelado correctamente.");
        }
    }

    
    private void ModificarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTurnoActionPerformed
        //sirve para abrir pagina sobre pagina
        int filaSeleccionada = Tabla.getSelectedRow(); // Asumiendo que tu tabla se llama Tabla

    if (filaSeleccionada < 0) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un turno de la tabla para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    ConstruPaciente turnoAModificar = listaTurnos.get(filaSeleccionada); 
    ModificarTurno ventanaModificar = new ModificarTurno(this, filaSeleccionada, turnoAModificar);
    ventanaModificar.setVisible(true);
    }
    
    public void actualizarTurnoEnTabla(int filaModificar, ConstruPaciente turnoActualizado){   
    // Solo actualizamos las columnas que el usuario puede modificar
    if(modelo != null){
    modelo.setValueAt(turnoActualizado.getDiaMes(), filaModificar, 3);
    modelo.setValueAt(turnoActualizado.getHoraTurno(), filaModificar, 4);
    modelo.setValueAt(turnoActualizado.getMotiConsulta(), filaModificar, 6);
    }

    
    }//GEN-LAST:event_ModificarTurnoActionPerformed
    //nuestro boton de ordenar por fecha
    private void ListadorFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadorFechasActionPerformed
    // hace que el texto sea de tipo String en este caso dia y mes 
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    
    //permitira ordenar la lista por fecha con colecciones sort de ordenamiento y comparadores de java
    Collections.sort(listaTurnos, new Comparator<ConstruPaciente>() {
        public int compare(ConstruPaciente p1, ConstruPaciente p2) {
            //try catch evaluara la posibilidad de excepciones 
            try {
                // Primero, comparamos por fecha
                Date fecha1 = dateFormatter.parse(p1.getDiaMes());//obtiene fechas y las tranforma en datos reales 
                Date fecha2 = dateFormatter.parse(p2.getDiaMes());
                
                int comparacionFecha = fecha1.compareTo(fecha2); // compara fechas y las  introduce en una variable entera
                
                // Si las fechas son iguales (es igual a cero), comparamos por hora de turnos
                if (comparacionFecha == 0) {
                    SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
                    Date hora1 = timeFormatter.parse(p1.getHoraTurno());
                    Date hora2 = timeFormatter.parse(p2.getHoraTurno());
                    return hora1.compareTo(hora2);
                } else {
                    return comparacionFecha;
                }
                
            } catch (Exception e) {
                // En caso de error de formato, no los mueve
                return 0;
            }
        }
    });
    
    // Borra lo que se ve en tabla o listado para reacomodar elementos 
    modelo.setRowCount(0);

    //vuelve a llenar la tabla con la lista ya ordenada por fechas 
    for (ConstruPaciente paciente : listaTurnos) {
        modelo.addRow(new Object[]{
            paciente.getNombreApellido(),
            paciente.getDni(),
            paciente.getObraSocial(),
            paciente.getDiaMes(),
            paciente.getHoraTurno(),
            paciente.getTelefono(),
            paciente.getMotiConsulta()
        });

    }//GEN-LAST:event_ListadorFechasActionPerformed
    }
   // aplicamos el metodo y tomamos nuestros valores a utilizar otorgadas por el constructor 
public void agregarPacienteATabla(ConstruPaciente paciente) {
     DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
     
        modelo.addRow(new Object[]{
        paciente.getNombreApellido(),
        paciente.getDni(),
        paciente.getObraSocial(),
        paciente.getDiaMes(),
        paciente.getHoraTurno(),
        paciente.getTelefono(),
        paciente.getMotiConsulta(),
    });
   listaTurnos.add(paciente);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarTurno;
    private javax.swing.JButton Ingreseturno;
    private javax.swing.JButton ListadorFechas;
    private javax.swing.JButton ModificarTurno;
    private javax.swing.JTable Tabla;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
