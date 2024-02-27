/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina1;

/**
 *
 * @author E201
 */
public class Nomina {
    private int AuxTransporte;
    private float PorcentajeSalud;
    private float PorcentajePension;
    private String Periodo;
    private String Estado;

    public Nomina(int AuxTransporte, float PorcentajeSalud, float PorcentajePension, String Periodo, String Estado) {
        this.AuxTransporte = AuxTransporte;
        this.PorcentajeSalud = PorcentajeSalud;
        this.PorcentajePension = PorcentajePension;
        this.Periodo = Periodo;
        this.Estado = Estado;
    }

    public int getAuxTransporte() {
        return AuxTransporte;
    }

    public void setAuxTransporte(int AuxTransporte) {
        this.AuxTransporte = AuxTransporte;
    }

    public float getPorcentajeSalud() {
        return PorcentajeSalud;
    }

    public void setPorcentajeSalud(float PorcentajeSalud) {
        this.PorcentajeSalud = PorcentajeSalud;
    }

    public float getPorcentajePension() {
        return PorcentajePension;
    }

    public void setPorcentajePension(float PorcentajePension) {
        this.PorcentajePension = PorcentajePension;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
