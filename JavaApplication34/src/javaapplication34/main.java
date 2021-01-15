/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estanteria est = new Estanteria(20);
        Camarero cam1 = new Camarero("Camarero 1", est);
        Camarero cam2 = new Camarero("Camarero 2", est);
        Cocinero coc1 = new Cocinero("Cocinero 1", est);
        Cocinero coc2 = new Cocinero("Cocinero 2", est);
        cam1.start();
        cam2.start();
        coc1.start();
        coc2.start();
    }

}
