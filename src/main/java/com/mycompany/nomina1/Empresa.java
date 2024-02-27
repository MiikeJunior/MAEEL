/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina1;

/**
 *
 * @author E201
 */
public class Empresa {
    private String RazonSocial;
    private int Nit;
    private String Direccion;
    private int Telefono;

    public Empresa(String RazonSocial, int Nit, String Direccion, int Telefono) {
        this.RazonSocial = RazonSocial;
        this.Nit = Nit;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
}
