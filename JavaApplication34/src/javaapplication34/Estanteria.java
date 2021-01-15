/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Estanteria {

    private ArrayList<String> est;
    private int max;
    Lock lock = new ReentrantLock();
    private Condition llena = lock.newCondition();
    private Condition vacia = lock.newCondition();

    public Estanteria(int max) {
        this.max = max;
        est = new ArrayList<String>(max);

    }

    public void dejarComanda(String comanda) throws InterruptedException {
        lock.lock();
        while (est.size() == max) {
            llena.await();
        }
        try {

            est.add(comanda);
            vacia.signal();
        } finally {
            lock.unlock();
        }
    }

    public String cogerComanda() throws InterruptedException {
        lock.lock();
        while (est.isEmpty()) {
            vacia.await();
        }
        String comanda;
        try {
            comanda = est.get(0);
            est.remove(0);
            llena.signal();
            return (comanda);
        } finally {
            lock.unlock();
        }
    }
}
