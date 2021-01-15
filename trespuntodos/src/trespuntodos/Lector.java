/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trespuntodos;

public class Lector extends Thread {
    private paso paso;
    private double valor;
    private Sensor sensor;
    private String nombre;

    public Lector(Sensor sensor, String nombre, paso paso) {
        this.sensor = sensor;
        this.nombre = nombre;
        this.paso=paso;
    }


    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                sleep(100 + (int) (200 * Math.random()));
                valor = sensor.leer();
                System.out.println("La temperatura ha sido leida por " + nombre +" y tiene valor: "+valor);  
            } catch (InterruptedException e) {
                paso.mirar();
            }
        }
    }

}
