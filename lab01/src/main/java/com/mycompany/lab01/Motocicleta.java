/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01;

/**
 *
 * @author hp
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int año, double precio, int cilindrada, boolean tieneSidecar) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc, Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }

    public void hacerCaballito() {
        System.out.println("¡Haciendo caballito!");
    }
}
