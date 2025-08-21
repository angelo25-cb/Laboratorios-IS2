/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01;

/**
 *
 * @author hp
 */
public class Auto extends Vehiculo {
    private int numeroPuertas;
    private String tipoTransmision;

    public Auto(String marca, String modelo, int año, double precio, int numeroPuertas, String tipoTransmision) {
        super(marca, modelo, año, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + numeroPuertas + ", Transmisión: " + tipoTransmision);
    }

    public void activarAireAcondicionado() {
        System.out.println("Aire acondicionado activado.");
    }
}
