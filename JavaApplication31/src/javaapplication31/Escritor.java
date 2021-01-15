/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

public class Escritor extends Thread {

    private double val;
    private Sensor sen;
    private String nom;

    public Escritor(Sensor sensor, String nombre) {
        this.sen = sensor;
        this.nom = nombre;
    }

    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                val = Math.random() * 50;
                sleep(100 + (int) (200 * Math.random()));
                sen.write(val);
                System.out.println("La temperatura escrita por " + nom + " es: " + val);
            } catch (InterruptedException e) {
            }
        }
    }

    public double getVal() {
        val = Math.random() * 50;
        return val;
    }

}
