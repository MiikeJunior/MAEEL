/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina1;

/**
 *
 * @author E201
 */
public class DetalleNomina extends Empleado {
    private float SalarioNeto;
    private float DescSalud;
    private float DescPension;

    public DetalleNomina(float SalarioNeto, float DescSalud, float DescPension, String Nombre, String Apellidos, int Id, double SalarioBase) {
        super(Nombre, Apellidos, Id, SalarioBase);
        this.SalarioNeto = SalarioNeto;
        this.DescSalud = DescSalud;
        this.DescPension = DescPension;
    }
    
    
    
    
    
   
    
}
