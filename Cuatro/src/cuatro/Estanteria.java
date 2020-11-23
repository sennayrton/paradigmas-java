/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Estanteria {

    private List<String> est;
    private Semaphore estanteriaLlena; //Me indica el número de huecos que tengo
    private Semaphore exclusionMutua = new Semaphore(1); //Semaforo para garantizar la exclusion mutua
    private Semaphore estanteriaVacia = new Semaphore(0); //Me indica el numero de elementos que tengo dentro del array

    public Estanteria(int max) { //20
        est = new ArrayList<String>();
        estanteriaLlena = new Semaphore(max); //Valor inicial 20

    }

    public void dejarComanda(String comanda) {
        try {
            estanteriaLlena.acquire();
            exclusionMutua.acquire();

            est.add(comanda);
        } catch (InterruptedException ie) {
        } finally {
            exclusionMutua.release();
            estanteriaVacia.release();
        }

    }

    public String cogerComanda() throws InterruptedException {
        try {
            estanteriaVacia.acquire();
            exclusionMutua.acquire();

            String comanda = est.get(0);
            est.remove(0);
            return comanda;
        } finally {
            exclusionMutua.release();
            estanteriaLlena.release();

        }
    }

}
