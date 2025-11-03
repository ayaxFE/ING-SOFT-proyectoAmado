/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorturnos;

/**
 *
 * @author ayaxFE
 */
public class ConstruPaciente {
    //inicializadores de variables 
    private String nombreApellido;
    private int dni;
    private String obraSocial;
    private String horaTurno;
    private String diaMes;
    private String MotivoConsulta; 
    private String telefono;
    
    

    // Constructor
    public ConstruPaciente(String nombreApellido, int dni, String obraSocial, String horaTurno, String diaMes, String MotivoConsulta,String telefono) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.obraSocial = obraSocial;
        this.horaTurno = horaTurno;
        this.diaMes = diaMes;
        this.MotivoConsulta = MotivoConsulta; 
        this.telefono = telefono;
    }

    // sector de getter y setter
    public String getNombreApellido() {
        return nombreApellido; 
    }
    
    public int getDni() { 
        return dni; 
    }
    
    public String getObraSocial() {
        return obraSocial; 
    }
    public String getHoraTurno() {
        return horaTurno; 
    }
    
    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }
   
    public String getDiaMes() {
        return diaMes; 
    }
    
public void setDiaMes(String diaMes) {
    this.diaMes = diaMes;
}

public String getMotiConsulta(){
    return MotivoConsulta;
}

public void setMotivoConsulta(String MotivoConsulta) {
    this.MotivoConsulta = MotivoConsulta;
}  
public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}
       
}
