/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trespuntodos;

public class Escritor extends Thread {
    private paso paso;
    private double valor;
    private Sensor sensor;
    private String nombre;
    
    public Escritor(Sensor sensor, String nombre, paso paso){
        this.sensor=sensor;
        this.nombre=nombre;
        this.paso=paso;
    }

    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                valor = Math.random() * 50;
                sleep(100 +(int) (200 *Math.random()));
                sensor.escribir(valor);
                System.out.println("La temperatura escrita por " + nombre +" es: "+valor); 
            } catch (InterruptedException e) {
            paso.mirar();
            }
        }
    }

    public double getValor() {
        valor = Math.random() * 50;
        return valor;
    }

}
