/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina1;

/**
 *
 * @author E201
 */
public class Empleado {
    private String Nombre;
    private String Apellidos;
    private int Id;
    private double SalarioBase;

    public Empleado(String Nombre, String Apellidos, int Id, double SalarioBase) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Id = Id;
        this.SalarioBase = SalarioBase;
    }

    public Empleado() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.SalarioBase = salarioBase;
    }
    
    
    
    
}
