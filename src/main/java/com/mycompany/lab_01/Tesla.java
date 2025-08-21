/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01;

/**
 *
 * @author hp
 */
public class Tesla extends VehiculoElectrico {
    private boolean autopilot;

    public Tesla(String marca, String modelo, int año, double precio, double capacidadBateria, double autonomia, boolean autopilot) {
        super(marca, modelo, año, precio, capacidadBateria, autonomia);
        this.autopilot = autopilot;
    }

    public void activarModoEco() {
        System.out.println("Modo Eco activado en el Tesla.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio: " + precio);
        System.out.println("Capacidad batería: " + capacidadBateria + " kWh, Autonomía: " + autonomia + " km, Autopilot: " + (autopilot ? "Sí" : "No"));
    }

    public void activarAutopilot() {
        if (autopilot) {
            System.out.println("Autopilot activado.");
        } else {
            System.out.println("Este Tesla no tiene Autopilot.");
        }
    }
}
