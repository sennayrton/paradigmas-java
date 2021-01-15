/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

public class Lector extends Thread {

    private double val;
    private Sensor sen;
    private String nom;

    public Lector(Sensor sensor, String nombre) {
        this.sen = sensor;
        this.nom = nombre;
    }

    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                sleep(100 + (int) (200 * Math.random()));
                val = sen.read();
                System.out.println("La temperatura leída por " + nom + " es: " + val);
            } catch (InterruptedException e) {
            }
        }
    }

}
