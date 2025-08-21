/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_01;

/**
 *
 * @author hp
 */
public class Lab_01 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2021, 18000, 4, "Automática");
        Motocicleta moto1 = new Motocicleta("Honda", "CBR", 2020, 12000, 650, false);
        Tesla tesla1 = new Tesla("Tesla", "Model 3", 2022, 45000, 75, 500, true);

        auto1.encender();
        auto1.mostrarInfo();
        auto1.activarAireAcondicionado();

        System.out.println();

        moto1.encender();
        moto1.mostrarInfo();
        moto1.hacerCaballito();

        System.out.println();

        tesla1.encender();
        tesla1.mostrarInfo();
        tesla1.cargarBateria();
        tesla1.activarModoEco();
        tesla1.activarAutopilot();
    }
}
