/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01;

/**
 *
 * @author hp
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio: " + precio);
    }

    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
}