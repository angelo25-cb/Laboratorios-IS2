/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01;

/**
 *
 * @author hp
 */
public abstract class VehiculoElectrico extends Vehiculo {
    protected double capacidadBateria;
    protected double autonomia;

    public VehiculoElectrico(String marca, String modelo, int año, double precio, double capacidadBateria, double autonomia) {
        super(marca, modelo, año, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public void cargarBateria() {
        System.out.println("La batería está cargando...");
    }

    public abstract void activarModoEco();
    
    public abstract void mostrarInfo();
}