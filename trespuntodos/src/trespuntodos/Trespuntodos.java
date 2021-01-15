/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trespuntodos;

public class Trespuntodos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sensor sensor = new Sensor();
        paso paso = new paso();
        Escritor P1 = new Escritor(sensor,"P1",paso);
        Lector P2 = new Lector (sensor, "P2",paso);
        P1.start();
        P2.start();
    }
    
}
